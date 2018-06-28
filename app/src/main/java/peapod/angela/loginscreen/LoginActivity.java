package peapod.angela.loginscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class LoginActivity extends AppCompatActivity {

    @JavascriptInterface
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @JavascriptInterface
    void onClick(View view){
        String url = (String) view.getContentDescription();
        WebView webView = findViewById(R.id.webview);
        visible(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.loadUrl(url);

    }

    @JavascriptInterface
    void visible(WebView webView){
        webView.setVisibility(View.VISIBLE);
    }
}
