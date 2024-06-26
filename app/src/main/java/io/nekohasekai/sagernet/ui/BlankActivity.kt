package io.nekohasekai.sagernet.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.nekohasekai.sagernet.utils.SendLog

class BlankActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // process crash log
        intent?.getStringExtra("sendLog")?.apply {
            SendLog.sendLog(this@BlankActivity, this)
        }

        finish()
    }

}