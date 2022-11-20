import android.webkit.WebView;
import android.content.res.Resources;
import android.webkit.WebSettings;
import android.net.Uri;
import android.webkit.WebViewClient;
import android.view.View$OnClickListener;
import com.twitter.ui.view.TwitterSafeDefaultsWebView;
import com.twitter.onboarding.ocf.NavigationHandler;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import android.view.View;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "SetJavaScriptEnabled" })
public final class rmx implements ilx<smx, Object, omx>
{
    public final View D0;
    public final OcfEventReporter E0;
    public final NavigationHandler F0;
    public final tmx G0;
    public final ef4 H0;
    
    public rmx(final View d0, final if1 if1, final cmx cmx, final OcfEventReporter e0, final NavigationHandler f0, final tmx tmx, final ef4 h0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)if1, "backButtonHandler");
        czd.f((Object)cmx, "subtaskProperties");
        czd.f((Object)e0, "ocfEventReporter");
        czd.f((Object)f0, "navigationHandler");
        czd.f((Object)tmx, "webViewClient");
        czd.f((Object)h0, "clientIdentity");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = tmx;
        this.H0 = h0;
        final TwitterSafeDefaultsWebView twitterSafeDefaultsWebView = (TwitterSafeDefaultsWebView)d0.findViewById(2131432646);
        if1.a(d0, ((dtr)cmx).d, (View$OnClickListener)null);
        ((WebView)twitterSafeDefaultsWebView).setWebViewClient((WebViewClient)tmx);
        ((WebView)twitterSafeDefaultsWebView).getSettings().setJavaScriptEnabled(true);
        final WebSettings settings = ((WebView)twitterSafeDefaultsWebView).getSettings();
        czd.e((Object)settings, "webView.settings");
        final Resources resources = d0.getContext().getResources();
        czd.e((Object)resources, "rootView.context.resources");
        pps.e(settings, resources);
        final String string = Uri.parse(cmx.j).buildUpon().appendQueryParameter("guestId", String.valueOf(h0.a())).build().toString();
        czd.e((Object)string, "parse(subtaskProperties.\u2026)\n            .toString()");
        twitterSafeDefaultsWebView.loadUrl(string);
    }
    
    public final void T(final jbx jbx) {
        czd.f((Object)jbx, "state");
    }
    
    public final void q(final Object o) {
        final omx omx = (omx)o;
        czd.f((Object)omx, "effect");
        if (omx instanceof omx$b) {
            this.F0.d(((omx$b)omx).a, (String)null);
        }
        else if (omx instanceof omx$a) {
            this.E0.c();
        }
    }
    
    public final h5j<Object> w() {
        final h5j merge = h5j.merge((taj)((h5j)this.G0.c).map((psb)new lka((qsb)rmx$b.D0, 3)), (taj)((h5j)this.G0.d).map((psb)new ut1((qsb)rmx$c.D0, 6)));
        czd.e((Object)merge, "merge(\n        webViewCl\u2026Intent.OnNext(it) }\n    )");
        return (h5j<Object>)merge;
    }
    
    public interface a
    {
        rmx a(final View p0);
    }
}
