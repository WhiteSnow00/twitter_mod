// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking;

import com.twitter.util.user.UserIdentifier;
import android.content.pm.PackageInfo;
import com.twitter.model.json.tracking.JsonGoogleLicensingInfo;
import com.twitter.model.json.tracking.JsonAndroidInstallReferrer;
import java.util.Iterator;
import android.content.Intent;
import java.util.Objects;
import java.util.HashMap;
import com.twitter.model.json.tracking.JsonAttributionRequestInput;
import android.content.Context;
import java.util.List;
import java.util.Map;

public final class a
{
    public static final Map<String, String> i;
    public static final vba j;
    public static final List<String> k;
    public final Context a;
    public final qbu b;
    public final ep0 c;
    public final adw d;
    public final pfw<uaq<JsonAttributionRequestInput, msm<iy0, kbv>>> e;
    public final xtp f;
    public final gwo g;
    public final uew h;
    
    static {
        final HashMap hashMap = a.i = new HashMap();
        j = vba.g("external", "referred", "", "", "open");
        k = rif.w((Object)"https://twitter.app.link", (Object[])new String[] { "https://twitter-alternate.app.link", "https://twitter.test-app.link", "https://twitter-alternate.test-app.link", "twitter://twtr.sng.link", "twitter://open" });
        hashMap.put("twcamp", "utm_campaign");
        hashMap.put("twcon", "utm_content");
        hashMap.put("twterm", "utm_term");
        hashMap.put("twsrc", "utm_source");
        hashMap.put("twgr", "utm_medium");
    }
    
    public a(final Context a, final qbu b, final ep0 c, final adw d, final pfw<uaq<JsonAttributionRequestInput, msm<iy0, kbv>>> e, final xtp f, final gwo g, final uew h, final xbm xbm) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        final t19 subscribe = h.f().subscribe((lj6)new kds((Object)this, 1));
        this.h = h;
        Objects.requireNonNull(subscribe);
        xbm.i((oj)new bl0(subscribe, 0));
    }
    
    public static a b() {
        return zc.k().F6();
    }
    
    public static boolean d(final Intent intent) {
        final String stringExtra = intent.getStringExtra("deep_link_uri");
        final String stringExtra2 = intent.getStringExtra("android.intent.extra.REFERRER");
        return stringExtra != null && stringExtra2 != null && !stringExtra2.startsWith("android-app://com.twitter.android");
    }
    
    public static Map<String, String> f(final String s) {
        final qjg t = qjg.t();
        if (s != null) {
            final String[] split = s.split("&|%26|\\||%7C");
            for (int length = split.length, i = 0; i < length; ++i) {
                final String[] split2 = split[i].split("=|%3D|\\^|%5E");
                if (split2.length == 2) {
                    t.w((Object)split2[0], (Object)split2[1]);
                }
            }
        }
        return (Map)((n4j)t).e();
    }
    
    public final void a(final af4 af4) {
        final kvj<String, String> e = this.e();
        final Object a = ((m2j)e).a;
        jee.l(a);
        final String s = (String)a;
        final Object b = ((m2j)e).b;
        jee.l(b);
        final String p = (String)b;
        wk0.b().d();
        if (ikr.g((CharSequence)s)) {
            final Map<String, String> f = f(s);
            final Iterator iterator = com.twitter.analytics.tracking.a.i.keySet().iterator();
            boolean b2 = false;
            while (iterator.hasNext()) {
                if (f.containsKey(iterator.next())) {
                    b2 = true;
                }
            }
            String s2;
            if (b2) {
                s2 = "twsrc";
            }
            else {
                s2 = "utm_source";
            }
            final String s3 = f.get(s2);
            String s4;
            if (b2) {
                s4 = "twgr";
            }
            else {
                s4 = "utm_medium";
            }
            final String s5 = f.get(s4);
            String s6;
            if (b2) {
                s6 = "twcamp";
            }
            else {
                s6 = "utm_campaign";
            }
            final String s7 = f.get(s6);
            String s8;
            if (b2) {
                s8 = "twterm";
            }
            else {
                s8 = "utm_term";
            }
            final String s9 = f.get(s8);
            String s10;
            if (b2) {
                s10 = "twcon";
            }
            else {
                s10 = "utm_content";
            }
            final String s11 = f.get(s10);
            Object o;
            if (b2) {
                o = null;
            }
            else {
                o = "gclid";
            }
            ((u0p)af4).h(s3, s5, s7, s9, s11, (String)f.get(o), (String)null);
        }
        if (ikr.g((CharSequence)p)) {
            ((u0p)af4).p = p;
            final int a2 = c5j.a;
        }
        final lq a3 = np.a();
        if (a3 != null) {
            ((u0p)af4).f("6", a3.a);
        }
    }
    
    public final JsonAttributionRequestInput c(final int n, final b b) {
        final JsonAttributionRequestInput jsonAttributionRequestInput = new JsonAttributionRequestInput();
        final PackageInfo f = o70.f(this.a);
        if (f != null) {
            jsonAttributionRequestInput.f = f.firstInstallTime;
            jsonAttributionRequestInput.g = f.lastUpdateTime;
            jsonAttributionRequestInput.i = f.packageName;
        }
        jsonAttributionRequestInput.h = this.c.a();
        final JsonGoogleLicensingInfo jsonGoogleLicensingInfo = null;
        if (n != 0) {
            final int n2 = n - 1;
            final boolean b2 = true;
            if (n2 != 0 && n2 != 1) {
                if (n2 == 2) {
                    jsonAttributionRequestInput.s(3);
                    return jsonAttributionRequestInput;
                }
                if (n2 == 3) {
                    jsonAttributionRequestInput.s(2);
                    return jsonAttributionRequestInput;
                }
                if (n2 != 4 && n2 != 5) {
                    return jsonAttributionRequestInput;
                }
            }
            jsonAttributionRequestInput.s(1);
            final m40 e = b.e;
            JsonAndroidInstallReferrer d;
            if (e != null) {
                d = new JsonAndroidInstallReferrer();
                d.a = e.a;
                d.b = e.b;
                d.c = e.c;
            }
            else {
                d = null;
            }
            jsonAttributionRequestInput.d = d;
            boolean c = b2;
            if (n != 1) {
                c = (n == 6 && b2);
            }
            jsonAttributionRequestInput.c = c;
            jsonAttributionRequestInput.b = b.c;
            jsonAttributionRequestInput.e = b.b;
            final t4c f2 = b.f;
            JsonGoogleLicensingInfo j = jsonGoogleLicensingInfo;
            if (f2 != null) {
                j = new JsonGoogleLicensingInfo();
                j.a = f2.a;
                j.b = f2.b;
                j.c = f2.c;
            }
            jsonAttributionRequestInput.j = j;
            return jsonAttributionRequestInput;
        }
        throw null;
    }
    
    public final kvj<String, String> e() {
        final m4s a = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final long n = (currentTimeMillis - this.b.d("pref_ref_src_date", 0L)) / 86400000L;
        final long n2 = (currentTimeMillis - this.b.d("pref_ref_url_date", 0L)) / 86400000L;
        String j = "";
        String i;
        if (n <= 30L) {
            i = this.b.j("pref_ref_src", "");
        }
        else {
            i = "";
        }
        if (n2 <= 30L) {
            j = this.b.j("pref_ref_url", "");
        }
        return (kvj<String, String>)new kvj((Object)i, (Object)j);
    }
    
    public final void g(final String s, final String s2) {
        if (ikr.g((CharSequence)s)) {
            final qbu$c b = this.b.i().b("pref_ref_src", s);
            final m4s a = hq1.a;
            b.c("pref_ref_src_date", System.currentTimeMillis()).e();
            wk0.b().d();
        }
        if (ikr.g((CharSequence)s2)) {
            final qbu$c b2 = this.b.i().b("pref_ref_url", s2);
            final m4s a2 = hq1.a;
            b2.c("pref_ref_url_date", System.currentTimeMillis()).e();
        }
    }
    
    public final af4 h(final int n) {
        return this.i(n, (b)((n4j)new b$a()).e());
    }
    
    public final af4 i(final int n, final b b) {
        final String a = b.a;
        if (n != 0) {
            final int n2 = n - 1;
            final String s = "gclid";
            String s2 = "twcon";
            String s3 = "twterm";
            final String s4 = "utm_medium";
            String s5 = "twsrc";
            final boolean b2 = false;
            Object o;
            if (n2 != 0) {
                if (n2 != 1) {
                    o = null;
                }
                else {
                    final Map<String, String> f = f(a);
                    final Iterator iterator = com.twitter.analytics.tracking.a.i.keySet().iterator();
                    boolean b3 = false;
                    while (iterator.hasNext()) {
                        if (f.containsKey(iterator.next())) {
                            b3 = true;
                        }
                    }
                    if (!b3) {
                        s5 = "utm_source";
                    }
                    final String s6 = f.get(s5);
                    String s7 = s4;
                    if (b3) {
                        s7 = "twgr";
                    }
                    final String s8 = f.get(s7);
                    String s9;
                    if (b3) {
                        s9 = "twcamp";
                    }
                    else {
                        s9 = "utm_campaign";
                    }
                    final String s10 = f.get(s9);
                    if (!b3) {
                        s3 = "utm_term";
                    }
                    final String s11 = f.get(s3);
                    if (!b3) {
                        s2 = "utm_content";
                    }
                    final String s12 = f.get(s2);
                    Object o2;
                    if (b3) {
                        o2 = null;
                    }
                    else {
                        o2 = "gclid";
                    }
                    final String s13 = f.get(o2);
                    final String d = b.d;
                    o = new af4();
                    ((u0p)o).r(com.twitter.analytics.tracking.a.j);
                    ((u0p)o).h(s6, s8, s10, s11, s12, s13, a);
                    ((u0p)o).p = d;
                    final int a2 = c5j.a;
                }
            }
            else {
                final Map<String, String> f2 = f(a);
                final Iterator iterator2 = com.twitter.analytics.tracking.a.i.keySet().iterator();
                boolean b4 = false;
                while (iterator2.hasNext()) {
                    if (f2.containsKey(iterator2.next())) {
                        b4 = true;
                    }
                }
                if (!b4) {
                    s5 = "utm_source";
                }
                final String s14 = f2.get(s5);
                String s15;
                if (b4) {
                    s15 = "twgr";
                }
                else {
                    s15 = "utm_medium";
                }
                final String s16 = f2.get(s15);
                String s17;
                if (b4) {
                    s17 = "twcamp";
                }
                else {
                    s17 = "utm_campaign";
                }
                final String s18 = f2.get(s17);
                if (!b4) {
                    s3 = "utm_term";
                }
                final String s19 = f2.get(s3);
                if (!b4) {
                    s2 = "utm_content";
                }
                final String s20 = f2.get(s2);
                String s21 = s;
                if (b4) {
                    s21 = null;
                }
                final String s22 = f2.get(s21);
                wk0.b().d();
                o = new af4();
                ((u0p)o).T = vba.g("external", "referred", "", "", "launch").toString();
                final int a3 = c5j.a;
                ((u0p)o).h(s14, s16, s18, s19, s20, s22, a);
            }
            if (o != null) {
                final lq a4 = np.a();
                if (a4 != null) {
                    ((u0p)o).f("6", a4.a);
                }
                final String c = b.c;
                if (c != null) {
                    ((u0p)o).n(c, ((u0p)o).t);
                }
                cbw.b((elm)o);
            }
            final lq a5 = np.a();
            final String b5 = ta0.B(n);
            if (a5 == null || ikr.e((CharSequence)a5.a)) {
                final af4 af4 = new af4();
                ((u0p)af4).T = vba.g("external", b5, "", "ad_id", "empty").toString();
                final int a6 = c5j.a;
                cbw.b((elm)af4);
            }
            final String c2 = b.c;
            int n3 = b2 ? 1 : 0;
            Label_0824: {
                if (ikr.g((CharSequence)c2)) {
                    final Iterator<String> iterator3 = com.twitter.analytics.tracking.a.k.iterator();
                    while (true) {
                        while (iterator3.hasNext()) {
                            if (c2.startsWith(iterator3.next())) {
                                final boolean b6 = true;
                                n3 = (b2 ? 1 : 0);
                                if (!b6) {
                                    break Label_0824;
                                }
                                n3 = (b2 ? 1 : 0);
                                if (this.d.p()) {
                                    n3 = 1;
                                }
                                break Label_0824;
                            }
                        }
                        final boolean b6 = false;
                        continue;
                    }
                }
            }
            if (n3 == 0) {
                ((uaq)((zyr)this.e).get((Object)this.h.b())).R((Object)this.c(n, b)).I(this.g).G((lj6)new a1p((Object)this, 1), (lj6)jub.e);
            }
            return (af4)o;
        }
        throw null;
    }
    
    public final void j() {
        final m4s a = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final qbu e = pbu.e(UserIdentifier.getCurrent(), "app_open_track");
        if (currentTimeMillis - e.d("last_open_app_ts", 0L) > (long)asa.b().c("app_event_track_open_app_delay", 21600.0) * 1000L) {
            e.i().c("last_open_app_ts", currentTimeMillis).e();
            this.h(5);
        }
    }
}
