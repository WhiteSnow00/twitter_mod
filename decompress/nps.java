import android.net.Uri;
import android.annotation.SuppressLint;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nps extends WebViewClient
{
    public final rv1<String> a;
    public WebView b;
    
    public nps(final gax gax) {
        this.a = (rv1<String>)new rv1();
        gax.a((rj)new xak((Object)this, 19));
    }
    
    public final String a() {
        return (String)this.a.f();
    }
    
    @SuppressLint({ "SetJavaScriptEnabled" })
    public final void b(final WebView b, final String s) {
        if (pjr.g((CharSequence)s) && pjr.e((CharSequence)this.a())) {
            b.getSettings().setJavaScriptEnabled(true);
            b.getSettings().setAllowFileAccess(false);
            b.setWebViewClient((WebViewClient)this);
            b.loadUrl(s);
            this.b = b;
        }
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        final Uri parse = Uri.parse(s);
        final String queryParameter = parse.getQueryParameter("result");
        if ("twitter.com".equals(parse.getAuthority()) && queryParameter != null) {
            this.a.onNext((Object)queryParameter);
            webView.stopLoading();
            return true;
        }
        return false;
    }
}
