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
public final class zlx implements okx<amx, Object, wlx>
{
    public final View C0;
    public final OcfEventReporter D0;
    public final NavigationHandler E0;
    public final bmx F0;
    public final dg4 G0;
    
    public zlx(final View c0, final mf1 mf1, final jlx jlx, final OcfEventReporter d0, final NavigationHandler e0, final bmx bmx, final dg4 g0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)mf1, "backButtonHandler");
        zzd.f((Object)jlx, "subtaskProperties");
        zzd.f((Object)d0, "ocfEventReporter");
        zzd.f((Object)e0, "navigationHandler");
        zzd.f((Object)bmx, "webViewClient");
        zzd.f((Object)g0, "clientIdentity");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = bmx;
        this.G0 = g0;
        final TwitterSafeDefaultsWebView twitterSafeDefaultsWebView = (TwitterSafeDefaultsWebView)c0.findViewById(2131432643);
        mf1.a(c0, ((lsr)jlx).d, (View$OnClickListener)null);
        ((WebView)twitterSafeDefaultsWebView).setWebViewClient((WebViewClient)bmx);
        ((WebView)twitterSafeDefaultsWebView).getSettings().setJavaScriptEnabled(true);
        final WebSettings settings = ((WebView)twitterSafeDefaultsWebView).getSettings();
        zzd.e((Object)settings, "webView.settings");
        final Resources resources = c0.getContext().getResources();
        zzd.e((Object)resources, "rootView.context.resources");
        rp2.I(settings, resources);
        final String string = Uri.parse(jlx.j).buildUpon().appendQueryParameter("guestId", String.valueOf(g0.a())).build().toString();
        zzd.e((Object)string, "parse(subtaskProperties.\u2026)\n            .toString()");
        twitterSafeDefaultsWebView.loadUrl(string);
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
    }
    
    public final void s(final Object o) {
        final wlx wlx = (wlx)o;
        zzd.f((Object)wlx, "effect");
        if (wlx instanceof wlx$b) {
            this.E0.d(((wlx$b)wlx).a, (String)null);
        }
        else if (wlx instanceof wlx$a) {
            this.D0.c();
        }
    }
    
    public final b5j<Object> x() {
        final b5j merge = b5j.merge((naj)((b5j)this.F0.c).map((qtb)new kla((rtb)zlx$b.C0, 3)), (naj)((b5j)this.F0.d).map((qtb)new yt1((rtb)zlx$c.C0, 6)));
        zzd.e((Object)merge, "merge(\n        webViewCl\u2026Intent.OnNext(it) }\n    )");
        return (b5j<Object>)merge;
    }
    
    public interface a
    {
        zlx a(final View p0);
    }
}
