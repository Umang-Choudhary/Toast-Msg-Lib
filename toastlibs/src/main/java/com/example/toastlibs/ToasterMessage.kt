package com.example.toastlibs

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }

    }

}