import java.util.concurrent.Future;
import tv.periscope.android.api.RestClient;
import okhttp3.Interceptor;
import java.util.Map;
import retrofit2.Converter$Factory;
import retrofit2.converter.gson.GsonConverterFactory;
import tv.periscope.android.api.RestClient$Builder;
import java.util.HashMap;
import tv.periscope.android.api.service.hydra.JanusService;
import java.util.concurrent.Executor;
import java.io.File;
import java.util.Objects;
import java.util.Iterator;
import android.graphics.Bitmap$Config;
import java.util.concurrent.TimeUnit;
import android.graphics.Bitmap;
import android.content.res.Resources;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvx implements xjy, s5b, e16, fzy
{
    public static volatile Integer D0;
    public static final mo8 E0;
    public static final bvx F0;
    public static final bvx G0;
    public static final bvx H0;
    public static final bvx I0;
    
    static {
        E0 = new mo8(1.0f, 1.0f);
        F0 = new bvx();
        G0 = new bvx();
        H0 = new bvx();
        I0 = new bvx();
    }
    
    public static int d(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        final long totalMem = activityManager$MemoryInfo.totalMem;
        final int n = 2014;
        int n2 = 2013;
        final int n3 = 2011;
        if (totalMem == -1L) {
            final ArrayList list = new ArrayList();
            final int d = jt8.d();
            final int n4 = -1;
            int n5;
            if (d < 1) {
                n5 = -1;
            }
            else if (d == 1) {
                n5 = 2008;
            }
            else if (d <= 3) {
                n5 = 2011;
            }
            else {
                n5 = 2012;
            }
            e(list, n5);
            final long n6 = jt8.b();
            int n7;
            if (n6 == -1L) {
                n7 = -1;
            }
            else if (n6 <= 528000L) {
                n7 = 2008;
            }
            else if (n6 <= 620000L) {
                n7 = 2009;
            }
            else if (n6 <= 1020000L) {
                n7 = 2010;
            }
            else if (n6 <= 1220000L) {
                n7 = 2011;
            }
            else if (n6 <= 1520000L) {
                n7 = 2012;
            }
            else if (n6 <= 2020000L) {
                n7 = 2013;
            }
            else {
                n7 = 2014;
            }
            e(list, n7);
            final ActivityManager$MemoryInfo activityManager$MemoryInfo2 = new ActivityManager$MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo2);
            final long totalMem2 = activityManager$MemoryInfo2.totalMem;
            int n8;
            if (totalMem2 <= 0L) {
                n8 = -1;
            }
            else if (totalMem2 <= 201326592L) {
                n8 = 2008;
            }
            else if (totalMem2 <= 304087040L) {
                n8 = 2009;
            }
            else if (totalMem2 <= 536870912L) {
                n8 = 2010;
            }
            else if (totalMem2 <= 1073741824L) {
                n8 = 2011;
            }
            else if (totalMem2 <= 1610612736L) {
                n8 = 2012;
            }
            else {
                n8 = n;
                if (totalMem2 <= 2147483648L) {
                    n8 = 2013;
                }
            }
            e(list, n8);
            int intValue;
            if (list.isEmpty()) {
                intValue = n4;
            }
            else {
                Collections.sort((List<Comparable>)list);
                if ((list.size() & 0x1) == 0x1) {
                    intValue = list.get(list.size() / 2);
                }
                else {
                    final int n9 = list.size() / 2 - 1;
                    intValue = ((int)list.get(n9 + 1) - (int)list.get(n9)) / 2 + (int)list.get(n9);
                }
            }
            return intValue;
        }
        if (totalMem <= 805306368L) {
            int n10;
            if (jt8.d() <= 1) {
                n10 = 2009;
            }
            else {
                n10 = 2010;
            }
            return n10;
        }
        if (totalMem <= 1073741824L) {
            int n11;
            if (jt8.b() < 1300000) {
                n11 = n3;
            }
            else {
                n11 = 2012;
            }
            return n11;
        }
        if (totalMem <= 1610612736L) {
            if (jt8.b() < 1800000) {
                n2 = 2012;
            }
            return n2;
        }
        if (totalMem <= 2147483648L) {
            return 2013;
        }
        if (totalMem <= 3221225472L) {
            return 2014;
        }
        int n12;
        if (totalMem <= 5368709120L) {
            n12 = 2015;
        }
        else {
            n12 = 2016;
        }
        return n12;
    }
    
    public static void e(final ArrayList list, final int n) {
        if (n != -1) {
            list.add(n);
        }
    }
    
    public static final void f(final gfo gfo, final Context context, final long n) {
        czd.f((Object)gfo, "<this>");
        final Resources resources = context.getResources();
        czd.e((Object)resources, "ctx.resources");
        final String string = context.getString(2131957402, new Object[] { uoz.C(resources, n) });
        czd.e((Object)string, "ctx.getString(\n        R\u2026resources, startMs)\n    )");
        final w5s$a w5s$a = new w5s$a();
        w5s$a.t(string);
        w5s$a.e = (red$c)red$c$b.b;
        w5s$a.r("");
        w5s$a.q(32);
        gfo.f((w5s)((n4j)w5s$a).e());
    }
    
    public static final String h(final ojv ojv) {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("type: ");
        sb2.append(ojv);
        i(sb2.toString(), sb);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("hashCode: ");
        sb3.append(ojv.hashCode());
        i(sb3.toString(), sb);
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("javaClass: ");
        sb4.append(ojv.getClass().getCanonicalName());
        i(sb4.toString(), sb);
        for (Object o = ojv.d(); o != null; o = ((hb8)o).b()) {
            final StringBuilder j = fu8.j("fqName: ");
            j.append(lp8.a.M((hb8)o));
            i(j.toString(), sb);
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("javaClass: ");
            sb5.append(((hb8)o).getClass().getCanonicalName());
            i(sb5.toString(), sb);
        }
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static final StringBuilder i(final String s, final StringBuilder sb) {
        czd.f((Object)s, "<this>");
        sb.append(s);
        sb.append('\n');
        return sb;
    }
    
    public static final rd1 j(final cgv cgv, final Context context) {
        czd.f((Object)cgv, "<this>");
        czd.f((Object)context, "context");
        int n = cgv.I0;
        final Iterator iterator = cgv.r1.iterator();
        float n2 = 0.0f;
        while (iterator.hasNext()) {
            final pq4 pq4 = (pq4)iterator.next();
            final float a = pq4.a;
            if (a > n2) {
                n = pq4.b;
                n2 = a;
            }
        }
        cj1.e();
        final edq a2 = cpb.a;
        final x7d$a a3 = pcw.a(cgv.E0);
        a3.l = a2;
        final x7d x7d = new x7d(a3);
        Bitmap bitmap;
        try {
            bitmap = (Bitmap)((nrm)((Future<b8d>)kwg.e().g.y(x7d)).get(10L, TimeUnit.SECONDS)).b;
        }
        catch (final Exception ex) {
            bitmap = Bitmap.createBitmap(a2.a, a2.b, Bitmap$Config.ARGB_8888);
        }
        czd.c((Object)bitmap);
        final Bitmap g = b12.g(bitmap, context.getResources());
        czd.e((Object)g, "cropCircularBitmap(bitmap!!, context.resources)");
        return new rd1(context, n, g);
    }
    
    public static final xl9 k(final y3 y3) {
        final boolean b = y3 instanceof uzr;
        xl9 d0 = null;
        fm9 b2;
        if (b) {
            final int a = c5j.a;
            czd.e((Object)y3, "cast(avMediaPlaylist)");
            b2 = ((uzr)y3).b();
        }
        else {
            b2 = null;
        }
        if (b2 != null) {
            d0 = b2.D0;
        }
        return d0;
    }
    
    public static gm9 l() {
        final int a = jm9.a;
        Objects.requireNonNull(km9.Companion);
        return ((km9)((b5j)cr0.Companion.a()).B((Class)km9.class)).Z();
    }
    
    public static p6 m() {
        final int a = q6.a;
        Objects.requireNonNull(s6.Companion);
        return ((s6)((b5j)cr0.Companion.a()).B((Class)s6.class)).Z3();
    }
    
    public static final void n(final how how, final tnw tnw) {
        czd.f((Object)how, "validationResponse");
        czd.f((Object)tnw, "editText");
        final int a = how.a;
        if (a != 0) {
            final boolean b = true;
            if (a != 1) {
                if (a != 2) {
                    if (a != 3 && a != 4) {
                        if (a != 5) {
                            tnw.f();
                        }
                        else {
                            final String b2 = how.b;
                            boolean b3 = b;
                            if (!czd.a((Object)"redirect_to_login_primary", (Object)asa.d().k("growth_acquisition_redirect_to_login"))) {
                                b3 = (czd.a((Object)"redirect_to_login_secondary", (Object)asa.d().k("growth_acquisition_redirect_to_login")) && b);
                            }
                            tnw.g(b2, b3);
                        }
                    }
                    else {
                        tnw.g(how.b, false);
                    }
                }
                else {
                    tnw.d();
                }
            }
            else {
                tnw.b();
            }
        }
        else {
            tnw.f();
        }
    }
    
    public static final void o(final gfo gfo) {
        czd.f((Object)gfo, "<this>");
        final w5s$a w5s$a = new w5s$a();
        w5s$a.s(2131957407);
        w5s$a.e = (red$c)red$c$b.b;
        w5s$a.r("");
        w5s$a.q(31);
        gfo.f((w5s)((n4j)w5s$a).e());
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return guz.E0.b().c();
    }
    
    public bse b(final fll fll, final String s, final u9q u9q, final u9q u9q2) {
        czd.f((Object)fll, "proto");
        czd.f((Object)s, "flexibleId");
        czd.f((Object)u9q, "lowerBound");
        czd.f((Object)u9q2, "upperBound");
        if (!czd.a((Object)s, (Object)"kotlin.jvm.PlatformType")) {
            return (bse)g9a.c(f9a.P0, new String[] { s, u9q.toString(), u9q2.toString() });
        }
        if (((dyb$c)fll).m(kme.g)) {
            return (bse)new rxl(u9q, u9q2);
        }
        return (bse)dse.c(u9q, u9q2);
    }
    
    public Object[] c(final Object o, final ArrayList list, final File file, final ArrayList list2) {
        return (Object[])q3j.o0(o, "makePathElements", (Class)List.class, (Object)list, (Class)File.class, (Object)file, (Class)List.class, (Object)list2);
    }
    
    public JanusService g(final Context context, final Executor executor, final String s, final String s2) {
        synchronized (this) {
            czd.f((Object)context, "context");
            czd.f((Object)executor, "executor");
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("Authorization", s2);
            final RestClient$Builder executor2 = new RestClient$Builder().context(context).executor(executor);
            String string = s;
            if (alr.N0((CharSequence)s) != '/') {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("/");
                string = sb.toString();
            }
            final RestClient$Builder extraHeaders = executor2.endpoint(string).converterFactory((Converter$Factory)GsonConverterFactory.create(new v8c().a())).extraHeaders((Map)hashMap);
            b6b.a();
            final RestClient build = extraHeaders.addNetworkInterceptor((Interceptor)null).timeoutSec(Integer.valueOf(32)).build();
            czd.e((Object)build, "Builder()\n            .c\u2026SEC)\n            .build()");
            final Object service = build.getService((Class)JanusService.class);
            czd.e(service, "restClient.getService(JanusService::class.java)");
            return (JanusService)service;
        }
    }
    
    public Object r(final y06 y06) {
        return new hch();
    }
}
