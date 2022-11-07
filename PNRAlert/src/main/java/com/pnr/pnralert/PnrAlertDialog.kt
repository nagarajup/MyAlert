package com.pnr.pnralert

import android.content.Context
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog

class PnrAlertDialog {
    fun alert(context:Context){
        val alert_dialog_pay =
            BottomSheetDialog(context, R.style.CloseBottomSheetDialogTheme)
        alert_dialog_pay.setContentView(R.layout.bt_dialog_alert)
        alert_dialog_pay.behavior.isDraggable = false
        alert_dialog_pay.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        val close = alert_dialog_pay.findViewById<ImageView>(R.id.close)
        close!!.setOnClickListener {
            alert_dialog_pay.dismiss()
        }
        alert_dialog_pay.show()
    }
}