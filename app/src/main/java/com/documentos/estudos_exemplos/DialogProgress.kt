package com.documentos.estudos_exemplos

import android.app.Dialog
import android.content.Context

class DialogProgress(val context: Context) {
    fun dialog(): Dialog {
        val mDialog = Dialog(context)
        mDialog.setContentView(R.layout.layout_loanding_progress)
        mDialog.show()
        return mDialog
    }
}