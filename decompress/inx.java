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
public final class inx implements xlx<jnx, Object, fnx>
{
    public final View F0;
    public final OcfEventReporter G0;
    public final NavigationHandler H0;
    public final knx I0;
    public final jg4 J0;
    
    public inx(final View f0, final lf1 lf1, final smx smx, final OcfEventReporter g0, final NavigationHandler h0, final knx knx, final jg4 j0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)lf1, "backButtonHandler");
        e0e.f((Object)smx, "subtaskProperties");
        e0e.f((Object)g0, "ocfEventReporter");
        e0e.f((Object)h0, "navigationHandler");
        e0e.f((Object)knx, "webViewClient");
        e0e.f((Object)j0, "clientIdentity");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = knx;
        this.J0 = j0;
        final TwitterSafeDefaultsWebView twitterSafeDefaultsWebView = (TwitterSafeDefaultsWebView)f0.findViewById(2131432647);
        lf1.a(f0, ((bur)smx).d, (View$OnClickListener)null);
        ((WebView)twitterSafeDefaultsWebView).setWebViewClient((WebViewClient)knx);
        ((WebView)twitterSafeDefaultsWebView).getSettings().setJavaScriptEnabled(true);
        final WebSettings settings = ((WebView)twitterSafeDefaultsWebView).getSettings();
        e0e.e((Object)settings, "webView.settings");
        final Resources resources = f0.getContext().getResources();
        e0e.e((Object)resources, "rootView.context.resources");
        fbx.n(settings, resources);
        final String string = Uri.parse(smx.j).buildUpon().appendQueryParameter("guestId", String.valueOf(j0.a())).build().toString();
        e0e.e((Object)string, "parse(subtaskProperties.\u2026)\n            .toString()");
        twitterSafeDefaultsWebView.loadUrl(string);
    }
    
    public final void T(final ccx ccx) {
        e0e.f((Object)ccx, "state");
    }
    
    public final void r(final Object o) {
        final fnx fnx = (fnx)o;
        e0e.f((Object)fnx, "effect");
        if (fnx instanceof fnx$b) {
            this.H0.d(((fnx$b)fnx).a, null);
        }
        else if (fnx instanceof fnx$a) {
            this.G0.c();
        }
    }
    
    public final t5j<Object> w() {
        final t5j merge = t5j.merge((fbj)((t5j)this.I0.c).map((rtb)new rla((stb)inx$b.F0, 3)), (fbj)((t5j)this.I0.d).map((rtb)new cu1((stb)inx$c.F0, 6)));
        e0e.e((Object)merge, "merge(\n        webViewCl\u2026Intent.OnNext(it) }\n    )");
        return (t5j<Object>)merge;
    }
}
