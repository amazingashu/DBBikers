package com.acronymslutions.dbbikers

import com.google.gson.annotations.SerializedName

data class DefaultResponse(val error:Boolean,val message:String)
/*

class DefaultResponse {
    @SerializedName("error")
    private var err = false

    @SerializedName("message")
    private var msg: String? = null

    fun DefaultResponse(err: Boolean, msg: String?) {
        this.err = err
        this.msg = msg
    }

    fun isErr(): Boolean {
        return err
    }

    fun getMsg(): String? {
        return msg
    }
}*/