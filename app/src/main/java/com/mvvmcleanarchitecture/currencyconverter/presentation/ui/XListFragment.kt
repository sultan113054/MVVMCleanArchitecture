package com.mvvmcleanarchitecture.currencyconverter.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.mvvmcleanarchitecture.currencyconverter.R
import com.mvvmcleanarchitecture.currencyconverter.core.exception.Failure
import com.mvvmcleanarchitecture.currencyconverter.databinding.FragmentXListBinding
import com.mvvmcleanarchitecture.currencyconverter.presentation.adapter.XAdapter
import com.mvvmcleanarchitecture.currencyconverter.presentation.util.ArticlesFailure
import com.mvvmcleanarchitecture.currencyconverter.presentation.util.UIState
import com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel.XViewModel
import com.mvvmcleanarchitecture.currencyconverter.presentation.viewmodel.XViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class XListFragment : Fragment() {

    private lateinit var binding: FragmentXListBinding
    private lateinit var xViewModel: XViewModel

    @Inject
    lateinit var xAdapter: XAdapter

    @Inject
    lateinit var factory: XViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_x_list, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()

        xViewModel =
            ViewModelProvider(requireActivity(), factory).get(XViewModel::class.java)

        lifecycleScope.launch() {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                xViewModel.uiState.collect {
                    onViewStateChange(it)
                }
            }
        }
    }


    private fun onViewStateChange(uiState: UIState) = when (uiState) {

        is UIState.Loading -> {
            showProgressBar()
            hideRecyclerView()
            hideNoDataText()
        }
        is UIState.Error -> {
            handleFailure(uiState.failure)
        }
        is UIState.Success -> uiState.data.let {
            hideProgressBar()
            hideNoDataText()
            showRecyclerView()
           // xAdapter.differ.submitList(it)

        }
    }


    private fun initRecyclerView() {
        binding.rvProducts.apply {
            layoutManager = LinearLayoutManager(activity)
            this.adapter = xAdapter
        }

    }

    private fun handleFailure(failure: Failure?) {
        hideProgressBar()
        hideRecyclerView()
        showNoDataText()

        when (failure) {
            is Failure.NetworkConnection -> {
                notify(R.string.failure_network_connection)
            }
            is Failure.ServerError -> {
                notify(R.string.failure_server_error)
            }
            is Failure.DBError -> {
                notify(R.string.failure_db_error)
            }
            is ArticlesFailure.NoDataAvailable -> {
                notify(R.string.no_data)
            }
            else -> {
                notify(R.string.failure_server_error)
            }
        }
    }

    private fun showNoDataText() {
        binding.tvEmpty.visibility = View.VISIBLE
    }


    private fun hideNoDataText() {
        binding.tvEmpty.visibility = View.GONE
    }

    private fun showProgressBar() {
        binding.progressbar.visibility = View.VISIBLE
    }

    private fun hideProgressBar() {
        binding.progressbar.visibility = View.GONE
    }

    private fun hideRecyclerView() {
        binding.rvProducts.visibility = View.GONE
    }

    private fun showRecyclerView() {
        binding.rvProducts.visibility = View.VISIBLE
    }

    private fun notify(@StringRes message: Int) =
        Snackbar.make(binding.root, message, Snackbar.LENGTH_SHORT).show()


}