import android.view.View;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public class ehv extends WebViewClient
{
    public boolean a(final WebView webView, final String s, final Uri uri) {
        ((View)webView).getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }
    
    public boolean b(final WebView webView, final Uri uri) {
        ((View)webView).getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }
    
    public boolean c(final WebView webView, final String s, final Uri uri) {
        return false;
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        final Uri parse = Uri.parse(s);
        final Context context = ((View)webView).getContext();
        final String string = context.getString(2131959238);
        final String string2 = context.getString(2131954291);
        final String host = parse.getHost();
        boolean b = false;
        Label_0097: {
            Label_0095: {
                if (host != null) {
                    if (!host.equals(string)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(".");
                        sb.append(string);
                        if (!host.endsWith(sb.toString())) {
                            break Label_0095;
                        }
                    }
                    b = true;
                    break Label_0097;
                }
            }
            b = false;
        }
        if ("twitter".equals(parse.getScheme())) {
            return this.b(webView, parse);
        }
        if (string2.equals(host)) {
            return this.a(webView, s, parse);
        }
        if (!b) {
            o70.p(((View)webView).getContext(), parse);
            return true;
        }
        return this.c(webView, s, parse);
    }
}
