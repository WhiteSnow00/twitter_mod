import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.os.Build$VERSION;
import android.webkit.WebResourceError;
import android.webkit.WebView;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ukk extends WebViewClient
{
    public final rbm<a> a;
    
    public ukk(final rbm<a> a) {
        this.a = a;
    }
    
    public final Uri a(final WebResourceRequest webResourceRequest) {
        boolean b = true;
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            b = false;
        }
        Uri url;
        if (b) {
            url = webResourceRequest.getUrl();
        }
        else {
            url = null;
        }
        return url;
    }
    
    public final void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String y;
        if (Build$VERSION.SDK_INT >= 23) {
            final String s = null;
            String string;
            if (webResourceError != null) {
                string = Integer.valueOf(webResourceError.getErrorCode()).toString();
            }
            else {
                string = null;
            }
            String string2 = s;
            if (webResourceError != null) {
                final CharSequence description = webResourceError.getDescription();
                string2 = s;
                if (description != null) {
                    string2 = description.toString();
                }
            }
            y = mw.y("WebError = ", string, " , msg = ", string2);
        }
        else {
            y = "WebError";
        }
        this.a.accept((a)new a.ukk$a$c(this.a(webResourceRequest), y));
    }
    
    public final void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        final String s = null;
        String string;
        if (webResourceResponse != null) {
            string = Integer.valueOf(webResourceResponse.getStatusCode()).toString();
        }
        else {
            string = null;
        }
        String s2 = s;
        if (webResourceResponse != null) {
            final String reasonPhrase = webResourceResponse.getReasonPhrase();
            s2 = s;
            if (reasonPhrase != null) {
                s2 = reasonPhrase;
            }
        }
        this.a.accept((a)new a.ukk$a$a(this.a(webResourceRequest), mw.y("HttpError = ", string, " , msg = ", s2)));
    }
    
    public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        final Uri uri = null;
        Integer value;
        if (sslError != null) {
            value = sslError.getPrimaryError();
        }
        else {
            value = null;
        }
        String string;
        if (sslError != null) {
            string = sslError.toString();
        }
        else {
            string = null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("SslError = ");
        sb.append(value);
        sb.append(" , msg = ");
        sb.append(string);
        final String string2 = sb.toString();
        final rbm<a> a = this.a;
        Uri parse = uri;
        if (sslError != null) {
            final String url = sslError.getUrl();
            parse = uri;
            if (url != null) {
                parse = Uri.parse(url);
                czd.e((Object)parse, "parse(this)");
            }
        }
        a.accept((a)new a.ukk$a$b(parse, string2));
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        czd.f((Object)webView, "view");
        czd.f((Object)webResourceRequest, "request");
        return true;
    }
    
    public abstract static class a
    {
        public final Uri a;
        public final String b;
        
        public a(final Uri a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        public String a() {
            return this.b;
        }
        
        public Uri b() {
            return this.a;
        }
    }
}
