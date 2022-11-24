import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Set;
import android.net.Uri;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qvg
{
    public static final List<wtg$c> a;
    public static final List<wtg$c> b;
    public static final List<wtg$c> c;
    public static final nuk<wtg> d;
    public static final nuk<wtg> e;
    public static final nuk<wtg> f;
    public static final nuk<wtg> g;
    public static final nuk<wtg> h;
    
    static {
        final wtg$c j0 = wtg$c.J0;
        final wtg$c i0 = wtg$c.I0;
        a = ojf.w((Object)j0, (Object[])new wtg$c[] { i0 });
        qvg.b = (ged)ojf.v((Object)j0);
        qvg.c = (ged)ojf.v((Object)i0);
        final ivm ivm = qvg.d = ivm.g;
        final y1p y1p = qvg.e = y1p.f;
        final x1p x1p = qvg.f = x1p.h;
        qvg.g = new c5e(new nuk[] { (nuk)ivm, (nuk)y1p }, 3);
        qvg.h = new c5e(new nuk[] { (nuk)ivm, (nuk)y1p, (nuk)x1p }, 3);
    }
    
    public static uww a(String k, final wtg wtg, final hp6 hp6) {
        boolean j;
        final boolean b = j = (wtg.V0 == wtg$c.I0 || t(wtg, 60.0f));
        if (ita.b().b("android_audio_tweets_consumption_enabled", false)) {
            j = b;
            if (hp6 != null) {
                j = b;
                if (hp6.e0()) {
                    j = false;
                }
            }
        }
        String string = k;
        if (wtg.V0 == wtg$c.J0) {
            final Uri parse = Uri.parse(k);
            final rmv b2 = ita.b();
            Uri build = parse;
            if (b2.b("android_hls_url_additional_query_parameter_enabled", false)) {
                k = b2.k("android_hls_url_additional_query_parameter_parameter_name");
                final String i = b2.k("android_hls_url_additional_query_parameter_parameter_value");
                final Set b3 = p6w.b;
                final Uri$Builder clearQuery = parse.buildUpon().clearQuery();
                clearQuery.appendQueryParameter(k, i);
                for (final String s : parse.getQueryParameterNames()) {
                    clearQuery.appendQueryParameter(s, parse.getQueryParameter(s));
                }
                build = clearQuery.build();
            }
            string = build.toString();
        }
        final uww$b uww$b = new uww$b();
        uww$b.a = y3.a(String.valueOf(wtg.P0));
        uww$b.b = "video";
        uww$b.g = string;
        uww$b.h = true;
        uww$b.j = j;
        uww$b.i = wtg.a1;
        uww$b.c = (c3)new cev(l(hp6, wtg));
        return (uww)((z4j)uww$b).e();
    }
    
    public static List<wtg> b(final Iterable<wtg> iterable, final nuk<wtg> nuk) {
        final ojf h = ojf.H();
        final Iterator<wtg> iterator = iterable.iterator();
        long q0 = 0L;
        while (iterator.hasNext()) {
            final wtg wtg = iterator.next();
            if (nuk.apply((Object)wtg)) {
                if (wtg.Q0 != 0L && !ita.b().b("mixed_media_enabled_for_pasted_media", false)) {
                    if (q0 != 0L) {
                        continue;
                    }
                    q0 = wtg.Q0;
                }
                else {
                    h.p((Object)wtg);
                }
            }
        }
        if (h.isEmpty() && q0 != 0L) {
            for (final wtg wtg2 : iterable) {
                if (nuk.apply((Object)wtg2) && wtg2.Q0 == q0) {
                    h.p((Object)wtg2);
                }
            }
        }
        return (List)((z4j)h).e();
    }
    
    public static wtg c(final Iterable<wtg> iterable) {
        return g(iterable, (List<wtg$c>)qvg.c);
    }
    
    public static jx9 d(final Iterable<jx9> iterable, final e2h... array) {
        for (final jx9 jx9 : iterable) {
            final e2h c = jx9.F0.c;
            for (int length = array.length, i = 0; i < length; ++i) {
                if (c == array[i]) {
                    return jx9;
                }
            }
        }
        return null;
    }
    
    public static wtg e(final Iterable<wtg> iterable) {
        final Iterator<wtg> iterator = iterable.iterator();
        wtg wtg = null;
        while (iterator.hasNext()) {
            final wtg wtg2 = iterator.next();
            if (wtg2.Q0 == 0L) {
                return wtg2;
            }
            if (wtg != null) {
                continue;
            }
            wtg = wtg2;
        }
        return wtg;
    }
    
    public static wtg f(final Iterable<wtg> iterable) {
        final Iterator<wtg> iterator = iterable.iterator();
        wtg wtg = null;
        while (iterator.hasNext()) {
            final wtg wtg2 = iterator.next();
            if (!u(wtg2)) {
                continue;
            }
            if (wtg2.Q0 == 0L) {
                return wtg2;
            }
            if (wtg != null) {
                continue;
            }
            wtg = wtg2;
        }
        return wtg;
    }
    
    public static wtg g(final Iterable<wtg> iterable, final List<wtg$c> list) {
        final Iterator<wtg> iterator = iterable.iterator();
        wtg wtg = null;
        while (iterator.hasNext()) {
            final wtg wtg2 = iterator.next();
            if (v(wtg2) && list.contains(wtg2.V0)) {
                if (wtg2.Q0 == 0L) {
                    return wtg2;
                }
                if (wtg != null) {
                    continue;
                }
                wtg = wtg2;
            }
        }
        return wtg;
    }
    
    public static wtg h(final Iterable<wtg> iterable) {
        return g(iterable, (List<wtg$c>)qvg.b);
    }
    
    public static wtg i(final Iterable<wtg> iterable) {
        return g(iterable, qvg.a);
    }
    
    public static String j(final wtg wtg) {
        final boolean t = t(wtg, 60.0f);
        final String s = null;
        final String s2 = null;
        String b = s;
        if (t) {
            final z2h x0 = wtg.X0;
            if (x0 == null) {
                b = s;
            }
            else {
                final Iterator iterator = x0.c.iterator();
                int n = 0;
                String s3 = s2;
                while (true) {
                    b = s3;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final a3h a3h = (a3h)iterator.next();
                    if (!"video/mp4".equals(a3h.c)) {
                        continue;
                    }
                    boolean b2 = true;
                    Label_0141: {
                        if (n <= 1000000) {
                            final int a = a3h.a;
                            if (a > n && a <= 1000000) {
                                break Label_0141;
                            }
                        }
                        else if (a3h.a < n) {
                            break Label_0141;
                        }
                        b2 = false;
                    }
                    int a2 = 0;
                    Label_0167: {
                        if (n != 0) {
                            b = s3;
                            a2 = n;
                            if (!b2) {
                                break Label_0167;
                            }
                        }
                        a2 = a3h.a;
                        b = a3h.b;
                    }
                    s3 = b;
                    if ((n = a2) == 1000000) {
                        break;
                    }
                }
            }
        }
        return b;
    }
    
    public static List<wtg> k(final Iterable<wtg> iterable) {
        return b(iterable, (nuk<wtg>)qvg.d);
    }
    
    public static long l(final hp6 hp6, final wtg wtg) {
        if (wtg != null) {
            final long r0 = wtg.R0;
            if (r0 > 0L) {
                return r0;
            }
        }
        if (hp6 != null) {
            return hp6.w();
        }
        return -1L;
    }
    
    public static List<wtg> m(final Iterable<wtg> iterable) {
        if (fr0.J()) {
            return b(iterable, (nuk<wtg>)qvg.h);
        }
        final wtg e = e(iterable);
        if (e != null && v(e)) {
            return ojf.v((Object)e);
        }
        return k(iterable);
    }
    
    public static boolean n(final List<x99> list) {
        if (list.size() > 1) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final int ordinal = ((Enum)((x99)iterator.next()).J0).ordinal();
                if (ordinal != 2 && ordinal != 3) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean o(final Iterable<wtg> iterable) {
        final Iterator<wtg> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (u(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean p(final Iterable<wtg> iterable) {
        final Iterator<wtg> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (v(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean q(final hp6 hp6) {
        final List<wtg> b = b(hp6.f(), (nuk<wtg>)qvg.h);
        if (b.size() > 1) {
            final Iterator<wtg> iterator = b.iterator();
            while (iterator.hasNext()) {
                final int ordinal = ((Enum)iterator.next().V0).ordinal();
                if (ordinal != 2 && ordinal != 3) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean r(final wtg wtg) {
        return v(wtg) && wtg.V0 == wtg$c.I0;
    }
    
    public static boolean s(final wtg wtg) {
        return t(wtg, 60.0f);
    }
    
    public static boolean t(final wtg wtg, final float n) {
        if (v(wtg)) {
            final z2h x0 = wtg.X0;
            if (x0 != null && x0.b <= n && !wtg.j1) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean u(final wtg wtg) {
        return wtg.V0 == wtg$c.H0 && flr.g((CharSequence)wtg.T0);
    }
    
    public static boolean v(final wtg wtg) {
        final z2h x0 = wtg.X0;
        if (x0 != null) {
            final wtg$c v0 = wtg.V0;
            if (v0 == wtg$c.J0 || v0 == wtg$c.I0) {
                final Iterator iterator = x0.c.iterator();
                while (iterator.hasNext()) {
                    if (a3h.e.contains(((a3h)iterator.next()).c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
