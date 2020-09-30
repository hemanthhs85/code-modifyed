package com.example.getdate

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment

class EscalateDialog : DialogFragment() {
    var alertDialog: Dialog? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        alertDialog = Dialog(activity!!)
        alertDialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        alertDialog!!.setContentView(R.layout.dialog_escalate)
        alertDialog!!.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        alertDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return alertDialog as Dialog
    }
}