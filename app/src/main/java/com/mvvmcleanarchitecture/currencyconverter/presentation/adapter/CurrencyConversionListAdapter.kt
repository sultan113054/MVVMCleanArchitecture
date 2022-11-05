package com.mvvmcleanarchitecture.currencyconverter.presentation.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CurrencyConversionListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //
//    private val callback = object : DiffUtil.ItemCallback<ArticleModel>() {
//        override fun areItemsTheSame(oldItem: ArticleModel, newItem: ArticleModel): Boolean {
//            return oldItem.id == newItem.id
//        }
//
//        override fun areContentsTheSame(oldItem: ArticleModel, newItem: ArticleModel): Boolean {
//            return oldItem == newItem
//        }
//
//    }
//
//    val differ = AsyncListDiffer(this, callback)
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val binding = CarsListItemBinding
//            .inflate(LayoutInflater.from(parent.context), parent, false)
//        return ArticleItemViewHolder(binding)
//
//    }
//
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val item = differ.currentList[position]
//        (holder as ArticleItemViewHolder).bind(item)
//    }
//
//    override fun getItemCount(): Int {
//        return differ.currentList.size
//    }
//
//    inner class ArticleItemViewHolder(
//        private var binding: CarsListItemBinding
//    ) : RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(item: ArticleModel) {
//            binding.tvTitle.text = item.title
//            binding.tvPublishDate.text = item.dateTime
//            binding.tvIngress.text = item.ingress
//            Glide.with(binding.ivImage.context)
//                .load(item.image)
//                .placeholder(R.drawable.progress_anim)
//                .error(R.drawable.progress_anim)
//                .skipMemoryCache(false)
//                .into(binding.ivImage)
//        }
//    }
//
//
//    private var onItemClickListener: ((ArticleModel) -> Unit)? = null
//
//    fun setOnItemClickListener(listener: (ArticleModel) -> Unit) {
//        onItemClickListener = listener
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}









