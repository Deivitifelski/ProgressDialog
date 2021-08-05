package com.documentos.estudos_exemplos

import android.app.Dialog
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.documentos.estudos_exemplos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mLoanding: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        mLoanding = DialogProgress(this).dialog()


    }

    override fun onResume() {
        super.onResume()
        button()
       //Hide dialog on startup ->
        mLoanding.hide()

    }

    private fun button() {
        mBinding.button.setOnClickListener {
            //SIMULATING DIALOG ACTIVATION -->
            mLoanding.show()
            Handler().postDelayed({
                mLoanding.hide()
            }, 5000)
        }
    }

    // THUS GETTING TO 2 OPTIONS, SHOW AND HIDE !
      //mLoanding.hide() ---  mLoanding.show


}


