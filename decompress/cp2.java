import android.os.BaseBundle;
import android.view.ViewGroup;
import android.view.MenuItem;
import java.util.Iterator;
import java.io.Serializable;
import com.twitter.deeplink.api.UrlInterpreterActivityArgs;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import java.util.LinkedList;
import com.twitter.util.user.UserIdentifier;
import android.webkit.URLUtil;
import android.graphics.Bitmap;
import java.util.Map;
import android.os.SystemClock;
import android.webkit.WebViewClient;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebSettings$PluginState;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.view.View;
import android.view.Menu;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import android.view.View$OnTouchListener;
import android.widget.ProgressBar;
import android.webkit.WebView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cp2
{
    public static final a Companion;
    public final Activity a;
    public final kp2 b;
    public final fnx c;
    public final WebView d;
    public final ProgressBar e;
    public final boolean f;
    public final boolean g;
    public String h;
    public String i;
    public String j;
    public final m6f k;
    public final f4c l;
    public sp2 m;
    public final obi<?> n;
    public final zc4 o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public hp2 t;
    public View$OnTouchListener u;
    public List<String> v;
    public final AtomicInteger w;
    public int x;
    public String y;
    public boolean z;
    
    static {
        Companion = new a();
    }
    
    public cp2(final Activity a, final kp2 b, final fnx c, final WebView d, final ProgressBar e, final boolean f, final boolean g, final sp2 m, final m6f k, final obi<?> n, final zc4 o) {
        czd.f((Object)b, "browserDelegate");
        czd.f((Object)d, "webview");
        czd.f((Object)e, "progressBar");
        czd.f((Object)k, "legacyUriNavigator");
        czd.f((Object)n, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        Objects.requireNonNull(f4c.Companion);
        this.l = fdi.Companion.a().T7();
        this.w = new AtomicInteger(0);
        this.m = m;
        this.k = k;
        this.n = n;
        this.o = o;
    }
    
    public final void a() {
        if (this.d.canGoBack()) {
            this.d.goBack();
        }
        else {
            this.d();
        }
    }
    
    public final void b(final hai hai, final Menu menu) {
        czd.f((Object)hai, "navComponent");
        czd.f((Object)menu, "menu");
        if (ikr.g((CharSequence)this.y)) {
            final kp2 b = this.b;
            final String y = this.y;
            czd.c((Object)y);
            b.b(y);
        }
        else {
            final String h = this.h;
            if (h != null) {
                this.b.b(h);
            }
            else {
                this.b.e();
            }
        }
        hai.z(2131689519, menu);
    }
    
    public final void c() {
        final sp2 m = this.m;
        final op2 h0 = op2.H0;
        final up2 e0 = up2.E0;
        m.a(h0, e0, this.t);
        if (this.o != null && !this.z) {
            this.m.a(op2.J0, e0, this.t);
        }
        pcx.q((View)this.d);
        this.d.loadUrl("about:blank");
        ((View)this.d).setOnTouchListener((View$OnTouchListener)null);
        this.d.setWebChromeClient((WebChromeClient)null);
        this.d.stopLoading();
        this.d.onPause();
        ((ViewGroup)this.d).removeAllViews();
        this.d.destroy();
    }
    
    public final void d() {
        this.h();
        if (!this.s) {
            final fnx c = this.c;
            final String i = this.i;
            final af4 a = c.a("load_aborted");
            ((u0p)a).q = i;
            final int a2 = c5j.a;
            fnx.a.a(fnx.Companion, a);
        }
        this.b.d();
    }
    
    public final void e(final Bundle bundle, final Intent intent) {
        czd.f((Object)intent, "intent");
        boolean y;
        if (bundle == null) {
            final Uri data = intent.getData();
            czd.c((Object)data);
            this.h = data.toString();
            y = a6w.y(data);
        }
        else {
            this.h = ((BaseBundle)bundle).getString("state_last_network_url");
            final sp2.b b = (sp2.b)klp.a(bundle.getByteArray("state_logger_data"), (rlp)sp2.b.c);
            final hdi.hdi$b companion = hdi.Companion;
            czd.c((Object)b);
            final UserIdentifier a = b.a;
            Objects.requireNonNull(companion);
            czd.f((Object)a, "userIdentifier");
            final jhf k6 = ((hdi)nfw.Companion.a().e(a, (Class)hdi.class)).k6();
            Objects.requireNonNull(sp2.Companion);
            czd.f((Object)k6, "linkOpeningEventsProducer");
            if (!czd.a((Object)k6.a, (Object)b.a)) {
                throw new IllegalStateException("BrowserSessionEventLogger initialized with invalid data".toString());
            }
            final sp2 m = new sp2(k6);
            m.b = b;
            this.m = m;
            final String h = this.h;
            y = (h != null && a6w.y(Uri.parse(h)));
        }
        this.t = (hp2)intent.getParcelableExtra("browser_data_source");
        this.y = intent.getStringExtra("extra_vanity_url");
        final String h2 = this.h;
        this.j = h2;
        this.i = h2;
        final WebSettings settings = this.d.getSettings();
        czd.e((Object)settings, "webview.settings");
        settings.setSaveFormData(false);
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setPluginState(WebSettings$PluginState.OFF);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        final Activity a2 = this.a;
        czd.f((Object)a2, "context");
        final String defaultUserAgent = WebSettings.getDefaultUserAgent((Context)a2);
        final StringBuilder sb = new StringBuilder();
        sb.append(defaultUserAgent);
        sb.append(" TwitterAndroid");
        settings.setUserAgentString(sb.toString());
        settings.setSupportMultipleWindows(true);
        if (this.b.g()) {
            settings.setDisplayZoomControls(false);
        }
        if (asa.b().b("android_web_view_dark_mode_enabled", false)) {
            this.b.a(settings);
        }
        this.d.setWebChromeClient((WebChromeClient)new cp2$b(this, this.e, (obi)this.n));
        this.d.setWebViewClient((WebViewClient)new WebViewClient(this) {
            public final cp2 a;
            
            public final void onPageFinished(final WebView webView, final String s) {
                final cp2 a = this.a;
                final sp2 m = a.m;
                final op2 f0 = op2.F0;
                final up2 e0 = up2.E0;
                m.a(f0, e0, a.t);
                if (s != null) {
                    final Uri parse = Uri.parse(s);
                    final boolean b = parse != null && czd.a((Object)"data", (Object)parse.getScheme());
                    if (!a.s && !a.a.isFinishing() && !b && !a6w.y(parse)) {
                        a.m.a(op2.G0, e0, a.t);
                        a.s = true;
                        final long p2 = a.p;
                        final long n = 0L;
                        long j;
                        if (p2 != 0L) {
                            j = SystemClock.elapsedRealtime() - a.p;
                        }
                        else {
                            j = 0L;
                        }
                        final long q = a.q;
                        long n2 = n;
                        if (q > 0L) {
                            final long p3 = a.p;
                            n2 = n;
                            if (p3 > 0L) {
                                n2 = q - p3;
                            }
                        }
                        final qjg t = qjg.t();
                        t.w((Object)"redirects", (Object)String.valueOf((long)a.x));
                        t.w((Object)"pre_load_duration", (Object)String.valueOf(n2));
                        t.w((Object)"request_count", (Object)String.valueOf(a.w.get()));
                        t.w((Object)"original_url", (Object)a.j);
                        final Map map = (Map)((n4j)t).e();
                        final fnx c = a.c;
                        if (c.b != null) {
                            final af4 a2 = c.a("load_finished");
                            ((u0p)a2).j = j;
                            final int a3 = c5j.a;
                            ((u0p)a2).c = ikr.t(map);
                            fnx.a.a(fnx.Companion, a2);
                        }
                        a.h();
                    }
                }
                ((View)a.e).setVisibility(8);
            }
            
            public final void onPageStarted(final WebView webView, String h, final Bitmap bitmap) {
                czd.f((Object)webView, "view");
                czd.f((Object)h, "url");
                final cp2 a = this.a;
                Objects.requireNonNull(a);
                a.m.a(op2.E0, up2.E0, a.t);
                final LinkedList v = a.v;
                if (v != null) {
                    v.add(h);
                }
                if (a.p == 0L) {
                    a.p = SystemClock.elapsedRealtime();
                }
                else {
                    ++a.x;
                    a.w.set(0);
                }
                a.q = SystemClock.elapsedRealtime();
                if (!a.s && a.x == 0) {
                    fnx.a.a(fnx.Companion, a.c.a("load_started"));
                }
                a.h = h;
                if (URLUtil.isNetworkUrl(h)) {
                    a.i = h;
                }
                ((View)a.e).setVisibility(0);
                if (a.g) {
                    final m6f k = a.k;
                    final Activity a2 = a.a;
                    final String h2 = a.h;
                    czd.c((Object)h2);
                    if (k.h((Context)a2, h2)) {
                        webView.stopLoading();
                        final f4c l = a.l;
                        h = a.h;
                        czd.c((Object)h);
                        l.e("web_view::::external_app_open", h, a.t, UserIdentifier.Companion.c());
                        a.b.terminate();
                    }
                    else if (!a.l.a(a.h)) {
                        m1f.e().b(2131954675);
                    }
                }
            }
            
            public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
                czd.f((Object)webView, "view");
                czd.f((Object)sslErrorHandler, "handler");
                czd.f((Object)sslError, "error");
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                final cp2 a = this.a;
                if (a.f) {
                    final String h = a.h;
                    czd.c((Object)h);
                    a.k.e((Context)a.a, h);
                    a.a();
                }
            }
            
            public final WebResourceResponse shouldInterceptRequest(final WebView webView, final String s) {
                czd.f((Object)webView, "view");
                czd.f((Object)s, "url");
                final cp2 a = this.a;
                if (!a.s) {
                    a.w.incrementAndGet();
                }
                return null;
            }
            
            public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
                czd.f((Object)webView, "view");
                czd.f((Object)webResourceRequest, "request");
                final Uri url = webResourceRequest.getUrl();
                final boolean b = false;
                final boolean b2 = false;
                if (url == null) {
                    return false;
                }
                final String string = url.toString();
                czd.e((Object)string, "uri.toString()");
                boolean b4;
                if (URLUtil.isNetworkUrl(string)) {
                    this.a.i = string;
                    if (k5w.Companion.a().a(url)) {
                        webView.stopLoading();
                        final String h = this.a.h;
                        final boolean b3 = h != null && a6w.x(Uri.parse(h));
                        final boolean x = a6w.x(Uri.parse(string));
                        int n = b2 ? 1 : 0;
                        if (!b3) {
                            n = (b2 ? 1 : 0);
                            if (x) {
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            final cp2 a = this.a;
                            pps.o(a.a, string, a.t);
                            return true;
                        }
                        this.a.n.d((ym)new UrlInterpreterActivityArgs(url));
                        return true;
                    }
                    else {
                        Label_0340: {
                            if (url.getQueryParameter("twclid") == null && asa.b().b("android_in_app_browser_bridging_append_click_id_enabled", false)) {
                                final String y = this.a.y;
                                if (y != null) {
                                    if (!vkr.T(y, url.getHost(), true)) {
                                        final String host = url.getHost();
                                        czd.c((Object)host);
                                        final String y2 = this.a.y;
                                        czd.c((Object)y2);
                                        if (!zkr.c0((CharSequence)host, (CharSequence)y2, false)) {
                                            break Label_0340;
                                        }
                                    }
                                    if (this.a.w.get() != 0) {
                                        final cp2 a2 = this.a;
                                        final zc4 o = a2.o;
                                        if (o != null) {
                                            a2.z = true;
                                            webView.loadUrl(o.c(string, a2.t));
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                        b4 = b;
                        if (url.getQueryParameter("twclid") != null) {
                            final cp2 a3 = this.a;
                            b4 = b;
                            if (!a3.s) {
                                a3.z = true;
                                b4 = b;
                            }
                        }
                    }
                }
                else {
                    final cp2 a4 = this.a;
                    if (a4.k.h((Context)a4.a, string)) {
                        webView.stopLoading();
                        b4 = true;
                    }
                    else {
                        b4 = b;
                        if (vkr.b0(string, "intent://", false)) {
                            final Intent uri = Intent.parseUri(string, 1);
                            b4 = b;
                            if (uri != null) {
                                webView.stopLoading();
                                final String stringExtra = uri.getStringExtra("browser_fallback_url");
                                b4 = b;
                                if (stringExtra != null) {
                                    webView.loadUrl(stringExtra);
                                    b4 = true;
                                }
                            }
                        }
                    }
                }
                return b4;
            }
        });
        ((View)this.d).setOnTouchListener((View$OnTouchListener)new bp2((Object)this, 0));
        if (y) {
            this.v = new LinkedList();
        }
        final WebView d = this.d;
        final String h3 = this.h;
        czd.c((Object)h3);
        d.loadUrl(h3);
        ((View)this.e).setVisibility(0);
        this.c.d("native_browser_open");
    }
    
    public final void f() {
        if (this.r) {
            return;
        }
        this.m.a(op2.I0, up2.E0, this.t);
        final long p = this.p;
        long j = 0L;
        if (p != 0L) {
            j = SystemClock.elapsedRealtime() - this.p;
        }
        final fnx c = this.c;
        c.c(j);
        c.b(wil.M1);
        final long n = this.w.get();
        if (c.b != null) {
            final af4 a = c.a("dismiss");
            ((u0p)a).j = j;
            final int a2 = c5j.a;
            ((u0p)a).c = String.valueOf(n);
            fnx.a.a(fnx.Companion, a);
        }
        this.r = true;
    }
    
    public final void g(final Bundle bundle) {
        ((BaseBundle)bundle).putString("state_last_network_url", this.i);
        bundle.putSerializable("state_logger_data", (Serializable)klp.e((Object)this.m.b, (rlp)sp2.b.c));
    }
    
    public final void h() {
        final LinkedList v = this.v;
        if (v != null) {
            final fnx c = this.c;
            final String j = this.j;
            Objects.requireNonNull(c);
            final int size = v.size();
            if (j != null && size >= 2 && size <= 15) {
                List subList = v;
                if (czd.a((Object)j, (Object)v.get(0))) {
                    subList = v.subList(1, size);
                }
                if (subList.size() > 1) {
                    final af4 af4 = new af4();
                    ((u0p)af4).q(new String[] { "web_view::::tco_resolution" });
                    ((u0p)af4).q = j;
                    final int a = c5j.a;
                    for (final String t : subList) {
                        final gfv gfv = new gfv();
                        gfv.t = t;
                        ((u0p)af4).i((j0p)gfv);
                    }
                    cbw.b((elm)af4);
                }
            }
        }
        this.v = null;
    }
    
    public final boolean i(final MenuItem menuItem) {
        czd.f((Object)menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId == 2131431404) {
            final bn a = bn.Companion.a();
            final Activity a2 = this.a;
            final z66 z66 = new z66();
            z66.q(false);
            final String h = this.h;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append(h);
            z66.s(sb.toString(), null);
            this.b.f(a.a((Context)a2, z66));
            this.c.d("share_via_tweet");
        }
        else if (itemId == 2131431403) {
            final iq7 a3 = iq7.Companion.a();
            final Activity a4 = this.a;
            final ih7$a ih7$a = new ih7$a();
            final String h2 = this.h;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append(h2);
            ((ek1$a)ih7$a).w(sb2.toString());
            ih7$a.A(true);
            ((ek1$a)ih7$a).x(true);
            this.b.f(a3.f((Context)a4, (ih7)((n4j)ih7$a).e()));
            this.c.d("share_tweet_privately");
        }
        else if (itemId == 2131428481) {
            final Activity a5 = this.a;
            final String h3 = this.h;
            czd.c((Object)h3);
            o70.c((Context)a5, h3);
            m1f.e().c(2131952888, 1);
            this.c.d("copy_link");
        }
        else if (itemId == 2131430459) {
            final String h4 = this.h;
            czd.c((Object)h4);
            this.k.e((Context)this.a, h4);
            this.c.d("open_in_browser");
        }
        else {
            if (itemId != 2131431392) {
                return true;
            }
            final dtp a6 = dtp.Companion.a();
            final Activity a7 = this.a;
            final String h5 = this.h;
            czd.c((Object)h5);
            ctp.b(a6, (Context)a7, (cxp)new rxp(h5), (bba)fnx.g, (btp)null, (List)null, 24, (Object)null);
            this.c.d("share_via");
        }
        return false;
    }
    
    public static final class a
    {
    }
}
