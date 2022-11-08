import android.os.BaseBundle;
import android.content.Intent;
import android.webkit.WebChromeClient$FileChooserParams;
import android.webkit.ValueCallback;
import com.twitter.deeplink.api.UrlInterpreterActivityArgs;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;
import android.webkit.WebChromeClient;

// 
// Decompiled by Procyon v0.6.0
// 

public class hgv extends WebChromeClient
{
    public final eya a;
    public final mbi<?> b;
    
    public hgv(final eya a, final mbi<?> b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onCreateWindow(final WebView webView, final boolean b, final boolean b2, Message obtainMessage) {
        if (b2) {
            obtainMessage = new Handler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            final String string = ((BaseBundle)obtainMessage.getData()).getString("url");
            if (er1.c(string)) {
                final Uri parse = Uri.parse(string);
                if (x4w.a().a(parse)) {
                    this.b.d((zm)new UrlInterpreterActivityArgs(parse));
                }
                else {
                    webView.loadUrl(string);
                }
                return true;
            }
        }
        return false;
    }
    
    public final boolean onShowFileChooser(final WebView webView, final ValueCallback<Uri[]> z0, final WebChromeClient$FileChooserParams webChromeClient$FileChooserParams) {
        final eya a = this.a;
        boolean b = true;
        if (a != null) {
            final kgv kgv = (kgv)((fj4)a).D0;
            final ValueCallback z2 = kgv.Z0;
            if (z2 != null) {
                z2.onReceiveValue((Object)null);
            }
            kgv.Z0 = z0;
            final Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            ((x9)kgv).D0.startActivityForResult(intent, 1);
        }
        else {
            b = false;
        }
        return b;
    }
}
