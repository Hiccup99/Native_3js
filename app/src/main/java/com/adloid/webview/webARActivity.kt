package com.adloid.webview

import android.os.Bundle
import android.webkit.PermissionRequest
import android.webkit.WebChromeClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.webaractivity.*

class webARActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.webaractivity)
        supportActionBar?.hide()
        webAR.settings.javaScriptEnabled = true
        webAR.settings.allowContentAccess = true
        webAR.settings.domStorageEnabled = true
        webAR.settings.useWideViewPort = true
        webAR.webChromeClient = object : WebChromeClient() {
            override fun onPermissionRequest(request: PermissionRequest) {
                request.grant(request.resources)
            }
        }
        webAR.loadUrl("https://webcamtoy.com/")
    }
}