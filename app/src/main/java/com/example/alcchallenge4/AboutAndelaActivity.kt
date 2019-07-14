package com.example.alcchallenge4

import android.graphics.Bitmap
import android.net.http.SslError
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*

class AboutAndelaActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "About ALC"
        }
        val webSettings = webBrowserView.settings
        webBrowserView.settings.setLoadWithOverviewMode(true);
        webBrowserView.settings.setUseWideViewPort(true);
        webBrowserView.settings.setBuiltInZoomControls(true);
        webBrowserView.webViewClient = Client()
        webBrowserView.loadUrl("https://andela.com/alc/")
    }
}


class Client:WebViewClient() {
    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
    }

    override fun shouldOverrideUrlLoading(view: WebView?, request: String): Boolean {
        view?.loadUrl(request)
        return true
    }

    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
        handler?.proceed()
    }
}