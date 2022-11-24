import android.content.Context;
import android.os.Environment;
import android.webkit.URLUtil;
import android.app.DownloadManager$Request;
import android.app.DownloadManager;
import android.net.Uri$Builder;
import java.util.Set;
import java.util.Map;
import java.net.URI;
import java.util.HashMap;
import android.webkit.WebViewClient;
import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.permissions.PermissionContentViewResult;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.view.View;
import android.widget.ProgressBar;
import android.webkit.WebView;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class thv extends kcv
{
    public static final String[] h1;
    public final WebView Z0;
    public final ProgressBar a1;
    public final View b1;
    public ValueCallback<Uri[]> c1;
    public thv.thv$b d1;
    public boolean e1;
    public final jo6<k7k, PermissionContentViewResult> f1;
    public final glq g1;
    
    static {
        h1 = myg.b;
    }
    
    public thv(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe2, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final iw6 iw6, final fda<fo> fda2, final m9p m9p, final glq g1) {
        super(intent, k9x, resources, cbs, mxe, nn, dob, cbf, cbg, layoutInflater, fda, userIdentifier, mcv, mxe2, a7g, o9p, ibm, fci, c8p, m9p);
        this.g1 = g1;
        final WebView z0 = (WebView)this.C4(2131432650);
        this.Z0 = z0;
        this.X4(z0.getSettings());
        iw6.b();
        final View c4 = this.C4(2131432651);
        this.b1 = c4;
        if (c4 != null) {
            c4.setOnClickListener((View$OnClickListener)new sy((Object)this, 12));
        }
        final ProgressBar a1 = (ProgressBar)this.C4(2131430786);
        this.a1 = a1;
        z0.setWebViewClient(this.Y4());
        final isx isx = new isx((Object)this, 14);
        Object webChromeClient;
        if (a1 != null && this instanceof alm) {
            webChromeClient = new qa0(a1, (eya)isx, (fci)fci);
        }
        else {
            webChromeClient = new qhv((eya)isx, (fci)fci);
        }
        z0.setWebChromeClient((WebChromeClient)webChromeClient);
        final jo6<k7k, PermissionContentViewResult> h = fci.h(PermissionContentViewResult.class, (itm<PermissionContentViewResult>)atp.H0);
        this.f1 = h;
        z0.setDownloadListener((DownloadListener)new shv(this));
        f.i(h.c().filter((ouk)m71.U0), (fa3)new lpa(this, 9));
        vo.a((fda)fda2, 1, (fa3)new pgc(this, 12));
    }
    
    public void N4() {
        CookieManager.getInstance().removeSessionCookie();
    }
    
    public final boolean W4() {
        final WebView z0 = this.Z0;
        return z0 != null && z0.canGoBack();
    }
    
    @SuppressLint({ "SetJavaScriptEnabled" })
    public void X4(final WebSettings webSettings) {
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(false);
        final StringBuilder n = a88.n(webSettings.getUserAgentString(), " ");
        n.append(rgv.a());
        webSettings.setUserAgentString(n.toString());
        fbx.n(webSettings, super.O0);
    }
    
    public WebViewClient Y4() {
        return (WebViewClient)new thv.thv$a(this);
    }
    
    public final void Z4(final String s) {
        if (this.Z0 != null) {
            final vev e = hni.d().e(super.M0);
            final URI e2 = hr1.e(s);
            final Map a = nuh.a(0);
            if (e != null && e2 != null) {
                ((HashMap<String, String>)a).put("Authorization", b4j.N().O(e, asc$b.H0, e2, (vrc)null, 0L));
            }
            if (pdw.d().g()) {
                final String stringId = UserIdentifier.getCurrent().getStringId();
                final HashMap<String, String> hashMap = (HashMap<String, String>)a;
                hashMap.put("X-Act-As-User-Id", stringId);
                if (zzz.U()) {
                    hashMap.put("X-Contributor-Version", "1");
                }
            }
            this.Z0.loadUrl(s, a);
        }
    }
    
    public void a5(final String s) {
        if (this.Z0 != null) {
            final Set b = p6w.b;
            if (flr.g((CharSequence)s) && p6w.r(Uri.parse(s))) {
                if (!this.e1 && !this.g1.a()) {
                    final Uri$Builder buildUpon = Uri.parse("https://twitter.com/account/authenticate_web_view").buildUpon();
                    buildUpon.appendQueryParameter("redirect_url", s);
                    buildUpon.appendQueryParameter("lang", o9a.v(super.O0.getConfiguration().locale));
                    this.Z4(buildUpon.toString());
                }
                else {
                    final Uri$Builder buildUpon2 = Uri.parse(s).buildUpon();
                    po.b().t();
                    buildUpon2.appendQueryParameter("lang", o9a.v(super.O0.getConfiguration().locale));
                    this.Z0.loadUrl(buildUpon2.toString());
                }
            }
        }
    }
    
    public void b5(final WebView webView, final String s) {
    }
    
    public void c5(final WebView webView, final String s) {
    }
    
    public void d5(final WebView webView, final Uri uri) {
        ((View)webView).getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        this.D4();
    }
    
    public boolean e5(final WebView webView, final Uri uri) {
        return false;
    }
    
    public final void f5(final thv.thv$b thv$b) {
        try {
            final DownloadManager downloadManager = (DownloadManager)((Context)super.G0).getSystemService("download");
            if (downloadManager != null) {
                final URI e = hr1.e(thv$b.a);
                if (e != null) {
                    final Uri parse = Uri.parse(thv$b.a);
                    final DownloadManager$Request downloadManager$Request = new DownloadManager$Request(parse);
                    final String guessFileName = URLUtil.guessFileName(thv$b.a, thv$b.b, thv$b.c);
                    downloadManager$Request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName).setTitle((CharSequence)guessFileName).setMimeType(thv$b.c).setNotificationVisibility(1);
                    if (p6w.r(parse)) {
                        downloadManager$Request.addRequestHeader("Authorization", b4j.N().O(hni.d().e(super.M0), asc$b.H0, e, (vrc)null, 0L));
                    }
                    downloadManager.enqueue(downloadManager$Request);
                    ehk.c().c(2131959630, 1);
                }
            }
        }
        catch (final Exception ex) {
            r9a.d((Throwable)ex);
            ehk.c().c(2131959628, 1);
        }
    }
    
    public void g5() {
        final WebView z0 = this.Z0;
        if (z0 != null) {
            z0.goBack();
        }
    }
}
