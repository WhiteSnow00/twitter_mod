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

public final class tp2
{
    public static final a Companion;
    public final Activity a;
    public final bq2 b;
    public final wnx c;
    public final WebView d;
    public final ProgressBar e;
    public final boolean f;
    public final boolean g;
    public String h;
    public String i;
    public String j;
    public final k7f k;
    public final h5c l;
    public jq2 m;
    public final fci<?> n;
    public final ce4 o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public yp2 t;
    public View$OnTouchListener u;
    public List<String> v;
    public final AtomicInteger w;
    public int x;
    public String y;
    public boolean z;
    
    static {
        Companion = new a();
    }
    
    public tp2(final Activity a, final bq2 b, final wnx c, final WebView d, final ProgressBar e, final boolean f, final boolean g, final jq2 m, final k7f k, final fci<?> n, final ce4 o) {
        e0e.f((Object)b, "browserDelegate");
        e0e.f((Object)d, "webview");
        e0e.f((Object)e, "progressBar");
        e0e.f((Object)k, "legacyUriNavigator");
        e0e.f((Object)n, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        Objects.requireNonNull(h5c.Companion);
        this.l = xdi.Companion.a().T7();
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
    
    public final void b(final zai zai, final Menu menu) {
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        if (flr.g((CharSequence)this.y)) {
            final bq2 b = this.b;
            final String y = this.y;
            e0e.c((Object)y);
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
        zai.z(2131689519, menu);
    }
    
    public final void c() {
        final jq2 m = this.m;
        final fq2 j0 = fq2.J0;
        final lq2 g0 = lq2.G0;
        m.a(j0, g0, this.t);
        if (this.o != null && !this.z) {
            this.m.a(fq2.L0, g0, this.t);
        }
        hdx.q((View)this.d);
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
            final wnx c = this.c;
            final String i = this.i;
            final fg4 a = c.a("load_aborted");
            ((o1p)a).q = i;
            final int a2 = o5j.a;
            wnx$a.a(wnx.Companion, a);
        }
        this.b.d();
    }
    
    public final void e(final Bundle bundle, final Intent intent) {
        e0e.f((Object)intent, "intent");
        boolean y;
        if (bundle == null) {
            final Uri data = intent.getData();
            e0e.c((Object)data);
            this.h = data.toString();
            y = p6w.y(data);
        }
        else {
            this.h = ((BaseBundle)bundle).getString("state_last_network_url");
            final jq2$b b = (jq2$b)gmp.a(bundle.getByteArray("state_logger_data"), (nmp)jq2$b.c);
            final zdi$b companion = zdi.Companion;
            e0e.c((Object)b);
            final UserIdentifier a = b.a;
            Objects.requireNonNull(companion);
            e0e.f((Object)a, "userIdentifier");
            final gif k6 = ((zdi)dgw.Companion.a().e(a, (Class)zdi.class)).k6();
            Objects.requireNonNull(jq2.Companion);
            e0e.f((Object)k6, "linkOpeningEventsProducer");
            if (!e0e.a((Object)k6.a, (Object)b.a)) {
                throw new IllegalStateException("BrowserSessionEventLogger initialized with invalid data".toString());
            }
            final jq2 m = new jq2(k6);
            m.b = b;
            this.m = m;
            final String h = this.h;
            y = (h != null && p6w.y(Uri.parse(h)));
        }
        this.t = (yp2)intent.getParcelableExtra("browser_data_source");
        this.y = intent.getStringExtra("extra_vanity_url");
        final String h2 = this.h;
        this.j = h2;
        this.i = h2;
        final WebSettings settings = this.d.getSettings();
        e0e.e((Object)settings, "webview.settings");
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
        e0e.f((Object)a2, "context");
        final String defaultUserAgent = WebSettings.getDefaultUserAgent((Context)a2);
        final StringBuilder sb = new StringBuilder();
        sb.append(defaultUserAgent);
        sb.append(" TwitterAndroid");
        settings.setUserAgentString(sb.toString());
        settings.setSupportMultipleWindows(true);
        if (this.b.g()) {
            settings.setDisplayZoomControls(false);
        }
        if (ita.b().b("android_web_view_dark_mode_enabled", false)) {
            this.b.a(settings);
        }
        this.d.setWebChromeClient((WebChromeClient)new tp2$b(this, this.e, (fci)this.n));
        this.d.setWebViewClient((WebViewClient)new WebViewClient(this) {
            public final tp2 a;
            
            public final void onPageFinished(final WebView webView, final String s) {
                final tp2 a = this.a;
                final jq2 m = a.m;
                final fq2 h0 = fq2.H0;
                final lq2 g0 = lq2.G0;
                m.a(h0, g0, a.t);
                if (s != null) {
                    final Uri parse = Uri.parse(s);
                    final boolean b = parse != null && e0e.a((Object)"data", (Object)parse.getScheme());
                    if (!a.s && !a.a.isFinishing() && !b && !p6w.y(parse)) {
                        a.m.a(fq2.I0, g0, a.t);
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
                        final kkg t = kkg.t();
                        t.w((Object)"redirects", (Object)String.valueOf((long)a.x));
                        t.w((Object)"pre_load_duration", (Object)String.valueOf(n2));
                        t.w((Object)"request_count", (Object)String.valueOf(a.w.get()));
                        t.w((Object)"original_url", (Object)a.j);
                        final Map map = (Map)((z4j)t).e();
                        final wnx c = a.c;
                        if (c.b != null) {
                            final fg4 a2 = c.a("load_finished");
                            ((o1p)a2).j = j;
                            final int a3 = o5j.a;
                            ((o1p)a2).c = flr.t(map);
                            wnx$a.a(wnx.Companion, a2);
                        }
                        a.h();
                    }
                }
                ((View)a.e).setVisibility(8);
            }
            
            public final void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
                e0e.f((Object)webView, "view");
                e0e.f((Object)s, "url");
                final tp2 a = this.a;
                Objects.requireNonNull(a);
                a.m.a(fq2.G0, lq2.G0, a.t);
                final LinkedList v = a.v;
                if (v != null) {
                    v.add(s);
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
                    wnx$a.a(wnx.Companion, a.c.a("load_started"));
                }
                a.h = s;
                if (URLUtil.isNetworkUrl(s)) {
                    a.i = s;
                }
                ((View)a.e).setVisibility(0);
                if (a.g) {
                    final k7f k = a.k;
                    final Activity a2 = a.a;
                    final String h = a.h;
                    e0e.c((Object)h);
                    if (k.h((Context)a2, h)) {
                        webView.stopLoading();
                        final h5c l = a.l;
                        final String h2 = a.h;
                        e0e.c((Object)h2);
                        l.e("web_view::::external_app_open", h2, a.t, UserIdentifier.Companion.c());
                        a.b.terminate();
                    }
                    else if (!a.l.a(a.h)) {
                        ehk.c().b(2131954675);
                    }
                }
            }
            
            public final void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
                e0e.f((Object)webView, "view");
                e0e.f((Object)sslErrorHandler, "handler");
                e0e.f((Object)sslError, "error");
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                final tp2 a = this.a;
                if (a.f) {
                    final String h = a.h;
                    e0e.c((Object)h);
                    a.k.e((Context)a.a, h);
                    a.a();
                }
            }
            
            public final WebResourceResponse shouldInterceptRequest(final WebView webView, final String s) {
                e0e.f((Object)webView, "view");
                e0e.f((Object)s, "url");
                final tp2 a = this.a;
                if (!a.s) {
                    a.w.incrementAndGet();
                }
                return null;
            }
            
            public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
                e0e.f((Object)webView, "view");
                e0e.f((Object)webResourceRequest, "request");
                final Uri url = webResourceRequest.getUrl();
                final boolean b = false;
                final boolean b2 = false;
                if (url == null) {
                    return false;
                }
                final String string = url.toString();
                e0e.e((Object)string, "uri.toString()");
                boolean b4;
                if (URLUtil.isNetworkUrl(string)) {
                    this.a.i = string;
                    if (z5w.Companion.a().a(url)) {
                        webView.stopLoading();
                        final String h = this.a.h;
                        final boolean b3 = h != null && p6w.x(Uri.parse(h));
                        final boolean x = p6w.x(Uri.parse(string));
                        int n = b2 ? 1 : 0;
                        if (!b3) {
                            n = (b2 ? 1 : 0);
                            if (x) {
                                n = 1;
                            }
                        }
                        if (n != 0) {
                            final tp2 a = this.a;
                            fbx.X(a.a, string, a.t);
                            return true;
                        }
                        this.a.n.d((cn)new UrlInterpreterActivityArgs(url));
                        return true;
                    }
                    else {
                        Label_0340: {
                            if (url.getQueryParameter("twclid") == null && ita.b().b("android_in_app_browser_bridging_append_click_id_enabled", false)) {
                                final String y = this.a.y;
                                if (y != null) {
                                    if (!slr.i1(y, url.getHost(), true)) {
                                        final String host = url.getHost();
                                        e0e.c((Object)host);
                                        final String y2 = this.a.y;
                                        e0e.c((Object)y2);
                                        if (!wlr.r1((CharSequence)host, (CharSequence)y2, false)) {
                                            break Label_0340;
                                        }
                                    }
                                    if (this.a.w.get() != 0) {
                                        final tp2 a2 = this.a;
                                        final ce4 o = a2.o;
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
                            final tp2 a3 = this.a;
                            b4 = b;
                            if (!a3.s) {
                                a3.z = true;
                                b4 = b;
                            }
                        }
                    }
                }
                else {
                    final tp2 a4 = this.a;
                    if (a4.k.h((Context)a4.a, string)) {
                        webView.stopLoading();
                        b4 = true;
                    }
                    else {
                        b4 = b;
                        if (slr.q1(string, "intent://", false)) {
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
        ((View)this.d).setOnTouchListener((View$OnTouchListener)new sp2((Object)this, 0));
        if (y) {
            this.v = new LinkedList();
        }
        final WebView d = this.d;
        final String h3 = this.h;
        e0e.c((Object)h3);
        d.loadUrl(h3);
        ((View)this.e).setVisibility(0);
        this.c.d("native_browser_open");
    }
    
    public final void f() {
        if (this.r) {
            return;
        }
        this.m.a(fq2.K0, lq2.G0, this.t);
        final long p = this.p;
        long j = 0L;
        if (p != 0L) {
            j = SystemClock.elapsedRealtime() - this.p;
        }
        final wnx c = this.c;
        c.c(j);
        c.b(ijl.O1);
        final long n = this.w.get();
        if (c.b != null) {
            final fg4 a = c.a("dismiss");
            ((o1p)a).j = j;
            final int a2 = o5j.a;
            ((o1p)a).c = String.valueOf(n);
            wnx$a.a(wnx.Companion, a);
        }
        this.r = true;
    }
    
    public final void g(final Bundle bundle) {
        ((BaseBundle)bundle).putString("state_last_network_url", this.i);
        bundle.putSerializable("state_logger_data", (Serializable)gmp.e((Object)this.m.b, (nmp)jq2$b.c));
    }
    
    public final void h() {
        final LinkedList v = this.v;
        if (v != null) {
            final wnx c = this.c;
            final String j = this.j;
            Objects.requireNonNull(c);
            final int size = v.size();
            if (j != null && size >= 2 && size <= 15) {
                List subList = v;
                if (e0e.a((Object)j, (Object)v.get(0))) {
                    subList = v.subList(1, size);
                }
                if (subList.size() > 1) {
                    final fg4 fg4 = new fg4();
                    ((o1p)fg4).q(new String[] { "web_view::::tco_resolution" });
                    ((o1p)fg4).q = j;
                    final int a = o5j.a;
                    for (final String t : subList) {
                        final ufv ufv = new ufv();
                        ufv.t = t;
                        ((o1p)fg4).i((d1p)ufv);
                    }
                    sbw.b((tlm)fg4);
                }
            }
        }
        this.v = null;
    }
    
    public final boolean i(final MenuItem menuItem) {
        e0e.f((Object)menuItem, "item");
        final int itemId = menuItem.getItemId();
        if (itemId == 2131431405) {
            final gn a = gn.Companion.a();
            final Activity a2 = this.a;
            final f86 f86 = new f86();
            f86.q(false);
            final String h = this.h;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append(h);
            f86.s(sb.toString(), null);
            this.b.f(a.a((Context)a2, (cn)f86));
            this.c.d("share_via_tweet");
        }
        else if (itemId == 2131431404) {
            final kr7 a3 = kr7.Companion.a();
            final Activity a4 = this.a;
            final ki7$a ki7$a = new ki7$a();
            final String h2 = this.h;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append(h2);
            ((ik1$a)ki7$a).w(sb2.toString());
            ki7$a.A(true);
            ((ik1$a)ki7$a).x(true);
            this.b.f(a3.f((Context)a4, (ki7)((z4j)ki7$a).e()));
            this.c.d("share_tweet_privately");
        }
        else if (itemId == 2131428481) {
            final Activity a5 = this.a;
            final String h3 = this.h;
            e0e.c((Object)h3);
            p70.c((Context)a5, h3);
            ehk.c().c(2131952888, 1);
            this.c.d("copy_link");
        }
        else if (itemId == 2131430460) {
            final String h4 = this.h;
            e0e.c((Object)h4);
            this.k.e((Context)this.a, h4);
            this.c.d("open_in_browser");
        }
        else {
            if (itemId != 2131431393) {
                return true;
            }
            final ztp a6 = ztp.Companion.a();
            final Activity a7 = this.a;
            final String h5 = this.h;
            e0e.c((Object)h5);
            ytp.b(a6, (Context)a7, (zxp)new oyp(h5), (ica)wnx.g, null, null, 24, null);
            this.c.d("share_via");
        }
        return false;
    }
    
    public static final class a
    {
    }
}
