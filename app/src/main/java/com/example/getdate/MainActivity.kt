package com.example.getdate

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.tvstudent).setOnClickListener {
            val myDialogFragment = StudentFormDialog()
            myDialogFragment.show(supportFragmentManager, "dialog")
        }
        findViewById<View>(R.id.tvremainder).setOnClickListener {
            val myDialogFragment = RemainderDialog()
            myDialogFragment.show(supportFragmentManager, "dialog")
        }
        findViewById<View>(R.id.tvpass).setOnClickListener {
            val myDialogFragment = PassDialog()
            myDialogFragment.show(supportFragmentManager, "dialog")
        }
        findViewById<View>(R.id.tvescalate).setOnClickListener {
            val myDialogFragment = EscalateDialog()
            myDialogFragment.show(supportFragmentManager, "dialog")
        }
    }
}