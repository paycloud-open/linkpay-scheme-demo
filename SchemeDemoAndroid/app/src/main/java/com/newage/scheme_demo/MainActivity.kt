package com.newage.scheme_demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.tv_btn_4

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_btn_4.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("linkpay://newage.com/cashier?merchant_order_no=1122223&trans_type=1&order_amount=1&notify_url=app://payment.com/result")
            )
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        val intent = getIntent()
        val uri = intent.data
        //解析返回的数据
        if (uri != null) {
            val scheme = uri.scheme
            val host = uri.host
            val path = uri.path
            val query = uri.query
            val queryParameter = uri.getQueryParameter("queryParameter")
            val queryParameter2 = uri.getQueryParameter("queryParameter2")
        }
        super.onNewIntent(intent)
    }
}
