import java.net.MalformedURLException;
import java.util.Collection;
import java.util.regex.Pattern;
import java.util.Iterator;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.util.Locale;
import android.net.Uri;
import java.net.URL;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d5c
{
    public static final a Companion;
    public static final Set<String> g;
    public static final Set<String> h;
    public static final Set<String> i;
    public static final Set<String> j;
    public static final Set<z9m> k;
    public final Context a;
    public final xca<okm> b;
    public final xau c;
    public final vb7 d;
    public final List<d5w> e;
    public final String f;
    
    static {
        Companion = new a();
        g = rqu.L((Object[])new String[] { "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome", "com.android.browser", "org.mozilla.firefox", "com.opera.mini.android", "com.opera.browser", "mobi.mgeek.TunnyBrowser", "com.UCMobile.intl" });
        h = rqu.L((Object[])new String[] { "www.periscope.tv", "periscope.tv", "www.pscp.tv", "pscp.tv", "vine.co" });
        i = rqu.L((Object[])new String[] { "help.twitter.com", "business.twitter.com", "developer.twitter.com" });
        j = rqu.K((Object)"https");
        k = rqu.K((Object)new z9m("^/i/notes/([0-9]+)/?"));
    }
    
    public d5c(final Context a, final xca<okm> b, final xau c, final vb7 d) {
        zzd.f((Object)a, "appContext");
        zzd.f((Object)b, "eventReporter");
        zzd.f((Object)c, "preferences");
        zzd.f((Object)d, "customTabsServiceHelper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new ArrayList();
        this.f = "in_app_browser";
    }
    
    public static final boolean d(final String s) {
        return d5c.Companion.b(s);
    }
    
    public static final void f(final yhf yhf, final c0p c0p, final boolean b, final hil hil, final String s, final String s2) {
        Objects.requireNonNull(d5c.Companion);
        zzd.f((Object)yhf, "eventProducer");
        zzd.f((Object)s2, "clickSource");
        yhf.b.onNext((Object)new td4(11, c0p, b, hil, s2, (qp2)null));
        final zf4 zf4 = new zf4(UserIdentifier.Companion.c());
        final nca$a companion = nca.Companion;
        String s3;
        if (b) {
            s3 = "promoted";
        }
        else {
            s3 = "organic";
        }
        zf4.T = companion.e("web_view", "", "", s3, l7k.c("click_", s)).toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
    }
    
    public static final boolean h(final String s) {
        final a companion = d5c.Companion;
        Objects.requireNonNull(companion);
        if (s != null) {
            String s2;
            if (ckr.h1((CharSequence)s) ^ true) {
                s2 = s;
            }
            else {
                s2 = null;
            }
            if (s2 != null) {
                return companion.a(new URL(s));
            }
        }
        return false;
    }
    
    public final boolean a(final String s) {
        final boolean c = er1.c(s);
        final boolean b = false;
        if (!c) {
            return false;
        }
        final Uri parse = Uri.parse(s);
        boolean b2 = b;
        if (this.b()) {
            final a companion = d5c.Companion;
            zzd.e((Object)parse, "uri");
            Objects.requireNonNull(companion);
            final String authority = parse.getAuthority();
            boolean b3 = false;
            Label_0115: {
                if (authority != null) {
                    final List g = dta.b().g("ad_formats_android_in_app_browser_unsupported_domains");
                    final Locale english = Locale.ENGLISH;
                    zzd.e((Object)english, "ENGLISH");
                    final String lowerCase = authority.toLowerCase(english);
                    zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!g.contains(lowerCase)) {
                        b3 = true;
                        break Label_0115;
                    }
                }
                b3 = false;
            }
            b2 = b;
            if (b3) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean b() {
        return this.c.e(this.f, true);
    }
    
    public final boolean c(final Uri uri) {
        final Intent intent = new Intent("android.intent.action.VIEW", uri);
        final PackageManager packageManager = this.a.getPackageManager();
        final boolean b = false;
        final ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        ActivityInfo activityInfo;
        if (resolveActivity != null) {
            activityInfo = resolveActivity.activityInfo;
        }
        else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            return false;
        }
        final String packageName = resolveActivity.activityInfo.packageName;
        zzd.e((Object)packageName, "packageName");
        final boolean b2 = packageName.length() == 0;
        boolean b3 = b;
        if (!b2) {
            if (ckr.n1(packageName, "com.twitter.android", false)) {
                b3 = b;
            }
            else {
                boolean b5;
                final boolean b4 = b5 = (((d5c.g.contains(packageName) ? 1 : 0) ^ 0x1) != 0x0);
                if (b4) {
                    b5 = b4;
                    if (((ArrayList)this.d.b(packageManager, new z8a())).contains(packageName)) {
                        b5 = false;
                    }
                }
                final boolean a = zzd.a((Object)packageName, (Object)"android");
                if (!"market".equals(uri.getScheme()) && (!b5 || a)) {
                    Objects.requireNonNull(d5c.Companion);
                    final String authority = uri.getAuthority();
                    boolean b6 = false;
                    Label_0264: {
                        if (authority != null) {
                            final Set<String> h = d5c.h;
                            final Locale english = Locale.ENGLISH;
                            zzd.e((Object)english, "ENGLISH");
                            final String lowerCase = authority.toLowerCase(english);
                            zzd.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (h.contains(lowerCase)) {
                                b6 = true;
                                break Label_0264;
                            }
                        }
                        b6 = false;
                    }
                    if (!b6 || !a) {
                        final String string = uri.toString();
                        final boolean b7 = string != null && (gkr.o1((CharSequence)string, (CharSequence)"youtube.com/", false) || gkr.o1((CharSequence)string, (CharSequence)"youtu.be/", false));
                        b3 = b;
                        if (!b7) {
                            return b3;
                        }
                    }
                }
                b3 = true;
            }
        }
        return b3;
    }
    
    public final void e(final String s, final String q, final qp2 qp2, final UserIdentifier r) {
        zzd.f((Object)q, "url");
        zzd.f((Object)r, "userIdentifier");
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { s });
        zf4.q = q;
        final int a = w4j.a;
        zf4.r = r;
        final Context a2 = this.a;
        c0p t1;
        if (qp2 != null) {
            t1 = qp2.t1();
        }
        else {
            t1 = null;
        }
        wvz.c(zf4, a2, t1, (String)null);
        this.b.b(r, (okm)zf4);
    }
    
    public final void g(final UserIdentifier userIdentifier, final String s, final qp2 qp2) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)s, "dest");
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((d5w)iterator.next()).a(userIdentifier, s);
        }
    }
    
    public static final class a
    {
        public final boolean a(final URL url) {
            final boolean contains = d5c.j.contains(url.getProtocol());
            boolean b2;
            final boolean b = b2 = false;
            if (contains) {
                final String host = url.getHost();
                zzd.e((Object)host, "parsedUrl.host");
                final Pattern compile = Pattern.compile("^(.*\\.)?twitter\\.com");
                zzd.e((Object)compile, "compile(pattern)");
                b2 = b;
                if (compile.matcher(host).matches()) {
                    final Set<z9m> k = d5c.k;
                    boolean b3 = false;
                    Label_0154: {
                        if (!(k instanceof Collection) || !k.isEmpty()) {
                            for (final z9m z9m : k) {
                                final String path = url.getPath();
                                zzd.e((Object)path, "parsedUrl.path");
                                if (z9m.c((CharSequence)path)) {
                                    b3 = true;
                                    break Label_0154;
                                }
                            }
                        }
                        b3 = false;
                    }
                    b2 = b;
                    if (b3) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        public final boolean b(final String s) {
            zzd.f((Object)s, "url");
            boolean b = false;
            try {
                final URL url = new URL(s);
                if ((d5c.i.contains(url.getHost()) && d5c.j.contains(url.getProtocol())) || (this.a(url) && (dta.b().b("mobile_note_reading_enabled", false) ^ true))) {
                    b = true;
                }
                return b;
            }
            catch (final MalformedURLException ex) {
                return b;
            }
        }
    }
}
