package com.mvvmcleanarchitecture.currencyconverter.core.extensions

import org.json.JSONObject


fun JSONObject.toObjectMap(): Map<String, *> = keys().asSequence().associateWith {
    when (val value = this[it]) {
        is JSONObject -> value.toObjectMap()
        JSONObject.NULL -> null
        else -> throw Exception("Expected JSONObject but not found")
    }
}