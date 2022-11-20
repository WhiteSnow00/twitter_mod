import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import java.util.Objects;
import android.webkit.WebSettings;
import android.webkit.WebSettings$PluginState;
import android.webkit.WebViewClient;
import android.widget.RatingBar;
import android.widget.TextView;
import android.view.ViewStub;
import androidx.constraintlayout.widget.Group;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.widget.ImageView;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.webkit.WebView;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkk implements ilx<xp2, wp2, vp2>
{
    public final View D0;
    public final Activity E0;
    public final vn F0;
    public final fnx G0;
    public final rbm<ukk.a> H0;
    public final nx9 I0;
    public final xba<of1> J0;
    public final WebView K0;
    public final View L0;
    public final TwitterButton M0;
    public final ImageView N0;
    public final View O0;
    public final FrescoMediaImageView P0;
    public final FrescoMediaImageView Q0;
    public final Group R0;
    public final ViewStub S0;
    public FrescoMediaImageView T0;
    public TextView U0;
    public TextView V0;
    public RatingBar W0;
    public TextView X0;
    public View Y0;
    public final mcq<tmi> Z0;
    public final mnl<tmi> a1;
    public long b1;
    public long c1;
    public boolean d1;
    public final rhh<xp2> e1;
    
    public hkk(View viewById, final Activity e0, final vn f0, final WebViewClient webViewClient, final fnx g0, final rbm<ukk.a> h0, final nx9 i0, final xba<of1> j0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)e0, "activity");
        czd.f((Object)f0, "activityOrientationViewDelegate");
        czd.f((Object)webViewClient, "webViewClient");
        czd.f((Object)g0, "webViewLogger");
        czd.f((Object)h0, "webErrorRelay");
        czd.f((Object)i0, "effectHandler");
        czd.f((Object)j0, "backPressedEvent");
        this.D0 = viewById;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        final View viewById2 = viewById.findViewById(2131432649);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.webview)");
        final WebView k0 = (WebView)viewById2;
        this.K0 = k0;
        final View viewById3 = viewById.findViewById(2131427855);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.bottom_bar_background)");
        this.L0 = viewById3;
        final View viewById4 = viewById.findViewById(2131427856);
        czd.e((Object)viewById4, "rootView.findViewById(R.id.bottom_bar_button)");
        this.M0 = (TwitterButton)viewById4;
        final View viewById5 = viewById.findViewById(2131427941);
        czd.e((Object)viewById5, "rootView.findViewById(R.\u2026browser_bottom_bar_close)");
        this.N0 = (ImageView)viewById5;
        final View viewById6 = viewById.findViewById(2131427946);
        czd.e((Object)viewById6, "rootView.findViewById(R.\u2026.browser_loading_spinner)");
        this.O0 = viewById6;
        this.P0 = (FrescoMediaImageView)viewById.findViewById(2131427870);
        this.Q0 = (FrescoMediaImageView)viewById.findViewById(2131429849);
        final View viewById7 = viewById.findViewById(2131427945);
        czd.e((Object)viewById7, "rootView.findViewById(R.id.browser_error_view)");
        this.R0 = (Group)viewById7;
        viewById = viewById.findViewById(2131427858);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026.bottom_bar_details_stub)");
        this.S0 = (ViewStub)viewById;
        final mcq z0 = new mcq();
        this.Z0 = (mcq<tmi>)z0;
        final mnl a1 = new mnl();
        this.a1 = (mnl<tmi>)a1;
        this.e1 = (rhh<xp2>)q3j.g0((qsb)new hkk$h(this));
        final WebSettings settings = k0.getSettings();
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setPluginState(WebSettings$PluginState.OFF);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setSupportZoom(true);
        settings.setSupportMultipleWindows(true);
        ((View)k0).setVerticalScrollBarEnabled(false);
        ((View)k0).setHorizontalScrollBarEnabled(false);
        k0.setWebViewClient(webViewClient);
        if (asa.b().b("unified_cards_playables_js_bridge_enabled", false)) {
            k0.addJavascriptInterface((Object)new zjk((mnl<tmi>)a1, (mcq<tmi>)z0), "TwitterClient");
        }
    }
    
    public static final long a(final hkk hkk, final long n) {
        Objects.requireNonNull(hkk);
        long n2 = 0L;
        if (n != 0L) {
            n2 = SystemClock.elapsedRealtime() - n;
        }
        return n2;
    }
    
    public final void T(final jbx jbx) {
        final xp2 xp2 = (xp2)jbx;
        czd.f((Object)xp2, "state");
        this.e1.b((Object)xp2);
    }
    
    public final void q(final Object o) {
        final vp2 vp2 = (vp2)o;
        czd.f((Object)vp2, "effect");
        if (vp2 instanceof vp2.c) {
            final nx9 i0 = this.I0;
            final vp2.c c = (vp2.c)vp2;
            i0.b(c.a, c.b);
        }
        else if (czd.a((Object)vp2, (Object)vp2.d.a)) {
            if (!this.d1) {
                final long b1 = this.b1;
                long n = 0L;
                if (b1 != 0L) {
                    n = SystemClock.elapsedRealtime() - b1;
                }
                this.G0.c(n);
                this.G0.b(wil.M1);
                this.d1 = true;
            }
        }
        else if (czd.a((Object)vp2, (Object)vp2.a.a)) {
            this.I0.a();
        }
        else if (czd.a((Object)vp2, (Object)vp2.b.a)) {
            this.F0.a.setRequestedOrientation(-1);
        }
    }
    
    public final h5j<wp2> w() {
        final h5j merge = h5j.merge((Iterable)s9i.s(aoo.f((View)this.M0).map((psb)new lql((qsb)new hkk$a(this), 9)), aoo.f(this.L0).map((psb)new hvl((qsb)new hkk$b(this), 11)), ((eaq)this.Z0).w((psb)new dti((qsb)new hkk$c(this), 10)).P(), ((h5j)this.a1).throttleFirst(500L, TimeUnit.MILLISECONDS).map((psb)new k1i((qsb)new hkk$d(this), 12)), aoo.f((View)this.N0).map((psb)new s4i((qsb)new hkk$e(this), 14)), this.H0.map((psb)new hdm((qsb)new hkk$f(this), 19)), this.J0.v0().map((psb)new ap((qsb)new hkk$g(this), 11))));
        czd.e((Object)merge, "override fun userIntentO\u2026imeMs)) }\n        )\n    )");
        return (h5j<wp2>)merge;
    }
}
