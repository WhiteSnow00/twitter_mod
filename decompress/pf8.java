import java.util.Map;
import android.net.Uri;
import com.facebook.imagepipeline.request.a;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Set;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.OkHttpClient;
import java.io.File;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.content.res.Resources;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public class pf8 implements u73, jwt, bsl, fjy, pyy, dij
{
    public static pf8 C0;
    public static final pf8 D0;
    public static final pf8 E0;
    public static final int[] F0;
    public static final int[] G0;
    
    public static final float A(final long n, final long n2) {
        return mcq.d(n2) / mcq.d(n);
    }
    
    public static final int B(final kow kow) {
        final int ordinal = ((Enum)kow).ordinal();
        int n = 2;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            else {
                n = 1;
            }
        }
        else {
            n = 3;
        }
        return n;
    }
    
    public static final dud C(final int n, final int n2) {
        Objects.requireNonNull(dud.Companion);
        return new dud(n, n2, -1);
    }
    
    public static final long D(long n, final long n2, final long n3, final m76 m76) {
        final ea6$b a = ea6.a;
        final int ordinal = ((Enum)((aqc)m76.m((re6)fqc.a)).l()).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n = n3;
            }
            else {
                n = n2;
            }
        }
        return n;
    }
    
    public static final w7b E(final m76 m76) {
        m76.x(380403812);
        final float n = 6;
        final float n2 = 12;
        final float n3 = 8;
        final float n4 = 8;
        final ea6$b a = ea6.a;
        final e99 e99 = new e99(n);
        int i = 0;
        final e99 e100 = new e99(n2);
        final e99 e101 = new e99(n3);
        final e99 e102 = new e99(n4);
        m76.x(-568225417);
        boolean b = false;
        while (i < 4) {
            b |= m76.P((new Object[] { e99, e100, e101, e102 })[i]);
            ++i;
        }
        final Object y = m76.y();
        oh8 oh8 = null;
        Label_0189: {
            if (!b) {
                Objects.requireNonNull(m76.Companion);
                if ((oh8 = (oh8)y) != m76$a.b) {
                    break Label_0189;
                }
            }
            oh8 = new oh8(n, n2, n3, n4);
            m76.p((Object)oh8);
        }
        m76.O();
        final oh8 oh9 = oh8;
        final ea6$b a2 = ea6.a;
        m76.O();
        return (w7b)oh9;
    }
    
    public static String F(final Resources resources, final List list, final boolean b, final boolean b2, final String s) {
        final int size = list.size();
        ij1.b(size > 0);
        int size2;
        if ((size2 = list.size()) > 3) {
            size2 = 2;
        }
        final String[] array = new String[size2];
        for (int i = 0; i < size2; ++i) {
            final h4h h4h = list.get(i);
            Objects.requireNonNull(h4h);
            final StringBuilder sb = new StringBuilder();
            sb.append("\u200e@");
            sb.append(h4h.I0);
            array[i] = sb.toString();
        }
        final int n = size - size2;
        ij1.b(n != 1);
        ij1.b(size2 > 0);
        if (n > 0) {
            if (size2 == 1) {
                String s2;
                if (s != null) {
                    s2 = resources.getQuantityString(2131820656, n, new Object[] { array[0], n, s });
                }
                else {
                    int n2;
                    if (b) {
                        n2 = 2131820655;
                    }
                    else {
                        n2 = 2131820654;
                    }
                    s2 = resources.getQuantityString(n2, n, new Object[] { array[0], n });
                }
                return s2;
            }
            if (size2 == 2) {
                String s3;
                if (s != null) {
                    s3 = resources.getQuantityString(2131820659, n, new Object[] { array[0], array[1], n, s });
                }
                else {
                    int n3;
                    if (b) {
                        n3 = 2131820658;
                    }
                    else {
                        n3 = 2131820657;
                    }
                    s3 = resources.getQuantityString(n3, n, new Object[] { array[0], array[1], n });
                }
                return s3;
            }
            throw new IllegalStateException("Not expecting so many names + others for the reply context.");
        }
        else if (size2 == 1) {
            if (s != null) {
                return resources.getString(2131957025, new Object[] { s });
            }
            if (b) {
                int n4;
                if (b2) {
                    n4 = 2131957017;
                }
                else {
                    n4 = 2131957021;
                }
                return resources.getString(n4, new Object[] { array[0] });
            }
            return resources.getString(2131957016, new Object[] { array[0] });
        }
        else {
            if (size2 == 2) {
                String s4;
                if (s != null) {
                    s4 = resources.getString(2131957020, new Object[] { array[0], array[1], s });
                }
                else {
                    int n5;
                    if (b) {
                        n5 = 2131957019;
                    }
                    else {
                        n5 = 2131957018;
                    }
                    s4 = resources.getString(n5, new Object[] { array[0], array[1] });
                }
                return s4;
            }
            if (size2 == 3) {
                String s5;
                if (s != null) {
                    s5 = resources.getString(2131957024, new Object[] { array[0], array[1], array[2], s });
                }
                else {
                    int n6;
                    if (b) {
                        n6 = 2131957023;
                    }
                    else {
                        n6 = 2131957022;
                    }
                    s5 = resources.getString(n6, new Object[] { array[0], array[1], array[2] });
                }
                return s5;
            }
            throw new IllegalStateException("Not expecting so many names for the reply context.");
        }
    }
    
    public static final v7d G(final List list) {
        zzd.f((Object)list, "imageVariants");
        final boolean empty = list.isEmpty();
        final v7d v7d = null;
        if (empty) {
            return null;
        }
        while (true) {
            for (final Object next : list) {
                final String c0 = ((v7d)next).C0;
                final int n = 1;
                int n2;
                if (c0 != null && c0.length() != 0 && sbv.b(sbv.a(c0))) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    v7d v7d2;
                    if ((v7d2 = (v7d)next) == null) {
                        final Iterator iterator2 = list.iterator();
                        Object next2;
                        if (!iterator2.hasNext()) {
                            next2 = v7d;
                        }
                        else {
                            next2 = iterator2.next();
                            if (iterator2.hasNext()) {
                                final ncq d0 = ((v7d)next2).D0;
                                int n3 = d0.a * d0.b;
                                v7d v7d3 = (v7d)next2;
                                do {
                                    final Object next3 = iterator2.next();
                                    final ncq d2 = ((v7d)next3).D0;
                                    final int n4 = d2.a * d2.b;
                                    next2 = v7d3;
                                    int n5;
                                    if ((n5 = n3) < n4) {
                                        next2 = next3;
                                        n5 = n4;
                                    }
                                    v7d3 = (v7d)next2;
                                    n3 = n5;
                                } while (iterator2.hasNext());
                            }
                        }
                        v7d2 = (v7d)next2;
                    }
                    return v7d2;
                }
            }
            Object next = null;
            continue;
        }
    }
    
    public static final abm J(final ncq ncq, final mdq mdq, final dtg dtg, final boolean b) {
        zzd.f((Object)ncq, "imageViewSize");
        zzd.f((Object)mdq, "slate");
        final List e = mdq.e;
        zzd.e((Object)e, "slate.variants");
        final v7d g = G(e);
        final abm abm = null;
        if (g != null) {
            final List g2 = mdq.g;
            zzd.e((Object)g2, "slate.focusRects");
            Object o;
            if (ncq.a > 0 && ncq.b > 0) {
                final ArrayList list = new ArrayList();
                final Iterator iterator = g2.iterator();
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    final boolean b2 = false;
                    if (!hasNext) {
                        break;
                    }
                    final Object next = iterator.next();
                    final qfb qfb = (qfb)next;
                    zzd.f((Object)qfb, "rect");
                    int n = b2 ? 1 : 0;
                    if (qfb.a >= 0) {
                        n = (b2 ? 1 : 0);
                        if (qfb.b >= 0) {
                            n = (b2 ? 1 : 0);
                            if (qfb.c > 0) {
                                n = (b2 ? 1 : 0);
                                if (qfb.d > 0) {
                                    n = 1;
                                }
                            }
                        }
                    }
                    if (n == 0) {
                        continue;
                    }
                    list.add(next);
                }
                final ArrayList<qfb> list2 = new ArrayList<qfb>();
                for (final Object next2 : list) {
                    final qfb qfb2 = (qfb)next2;
                    zzd.f((Object)qfb2, "rect");
                    final int c = qfb2.c;
                    float n2 = 0.0f;
                    Label_0286: {
                        if (c > 0) {
                            final int d = qfb2.d;
                            if (d > 0) {
                                n2 = c / (float)d;
                                break Label_0286;
                            }
                        }
                        n2 = 0.0f;
                    }
                    Objects.requireNonNull(cn1.Companion);
                    if (Math.abs(n2 - 1.7777778f) <= Math.abs(0.1f)) {
                        list2.add((qfb)next2);
                    }
                }
                o = or4.m2((Iterable)list2);
            }
            else {
                o = v2a.C0;
            }
            final ArrayList list3 = new ArrayList(kr4.h1((Iterable)o, 10));
            for (final qfb qfb3 : o) {
                final ncq d2 = g.D0;
                zzd.e((Object)d2, "bestImageModelVariant.size");
                zzd.f((Object)qfb3, "rect");
                final float n3 = 1.0f / d2.a;
                final float n4 = 1.0f / d2.b;
                final float min = Math.min(qfb3.a * n3, 1.0f);
                final float min2 = Math.min(qfb3.b * n4, 1.0f);
                final float min3 = Math.min((qfb3.a + qfb3.c) * n3, 1.0f);
                final float min4 = Math.min((qfb3.b + qfb3.d) * n4, 1.0f);
                Object o2;
                if (min < min3 && min2 < min4) {
                    o2 = new abm(min, min2, min3, min4);
                }
                else {
                    o2 = null;
                }
                list3.add(o2);
            }
            final List e2 = or4.E1((Iterable)list3);
            final ncq d3 = g.D0;
            zzd.e((Object)d3, "bestImageModelVariant.size");
            abm a;
            if (!((ArrayList)e2).isEmpty()) {
                a = oyz.A(ncq, d3, e2);
            }
            else {
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        abm abm2 = abm;
        if (b) {
            final float h = ncq.h();
            if (dtg == null) {
                abm2 = abm;
            }
            else {
                if (!dtg.R0.c.isEmpty()) {
                    final moj r0 = dtg.R0;
                    zzd.e((Object)r0, "mediaEntity.originalInfo");
                    abm2 = oyz.A(ncq, r0.b, r0.c);
                    if (abm2 != null) {
                        return abm2;
                    }
                }
                final List<umu> w0 = dtg.W0;
                zzd.e((Object)w0, "mediaEntity.faces");
                abm2 = abm;
                if (w0.isEmpty() ^ true) {
                    abm2 = oyz.z(h, dtg.T0.h(), w0);
                }
            }
        }
        return abm2;
    }
    
    public static ai1 K() {
        final int a = r2.a;
        Objects.requireNonNull(s2.Companion);
        return ((s2)((v4j)jr0.Companion.a()).B((Class)s2.class)).N0();
    }
    
    public static String M(final Resources resources, final String s) {
        return resources.getString(2131956782, new Object[] { s });
    }
    
    public static fdx N(final int n) {
        final fdx c0 = fdx.C0;
        if (!n7t.b(n)) {
            return c0;
        }
        if (dta.b().b("home_timeline_hoisting_viewport_aware", false)) {
            return fdx.D0;
        }
        if (dta.b().b("home_timeline_hoisting_ghost_injections", false)) {
            return fdx.E0;
        }
        return c0;
    }
    
    public static pf8 O() {
        synchronized (pf8.class) {
            if (pf8.C0 == null) {
                pf8.C0 = new pf8();
            }
            return pf8.C0;
        }
    }
    
    public static File P(final Context context, final UserIdentifier userIdentifier) {
        final int a = p40.a;
        final File cacheDir = context.getCacheDir();
        File file;
        if (cacheDir != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(userIdentifier);
            sb.append("_header.jpg");
            file = new File(cacheDir, sb.toString());
        }
        else {
            file = null;
        }
        return file;
    }
    
    public static OkHttpClient Q() {
        final int a = o5.a;
        Objects.requireNonNull(p5.Companion);
        return ((p5)((v4j)jr0.Companion.a()).B((Class)p5.class)).P7();
    }
    
    public static final CharSequence R(final CharSequence charSequence) {
        String string;
        if (charSequence != null) {
            string = charSequence.toString();
        }
        else {
            string = null;
        }
        String s = string;
        if (string == null) {
            s = "";
        }
        return s;
    }
    
    public static final String T(final Resources resources, final long n) {
        zzd.f((Object)resources, "res");
        final String u = hqs.u(resources, n);
        zzd.e((Object)u, "getTimeOfDayString(res, scheduledTime)");
        String s;
        if (mq1.g(n, 0)) {
            s = resources.getString(2131958944, new Object[] { u });
            zzd.e((Object)s, "{\n                res.ge\u2026y_at, time)\n            }");
        }
        else if (mq1.g(n, 1)) {
            s = resources.getString(2131958953, new Object[] { u });
            zzd.e((Object)s, "{\n                res.ge\u2026w_at, time)\n            }");
        }
        else {
            s = resources.getString(2131958204, new Object[] { hqs.s(resources, n), u });
            zzd.e((Object)s, "{\n                res.ge\u2026          )\n            }");
        }
        return s;
    }
    
    public static String U(final d3 d3) {
        String g;
        final String s = g = "";
        if (d3 != null) {
            if (!(d3 instanceof bwp)) {
                g = s;
            }
            else {
                g = ((bwp)d3).g();
                if (g == null) {
                    g = s;
                }
            }
        }
        return g;
    }
    
    public static long V(final d3 d3) {
        if (d3 instanceof tec) {
            return ((tec)d3).d();
        }
        return 0L;
    }
    
    public static boolean W() {
        return dta.c().b("alt_text_for_gifs_enabled", false);
    }
    
    public static final boolean X(final tse tse) {
        zzd.f((Object)tse, "type");
        final xnb p = xle.p;
        zzd.e((Object)p, "ENHANCED_NULLABILITY_ANNOTATION");
        return fc4$a.D(tse, p);
    }
    
    public static final boolean Y() {
        return zzd.a((Object)dta.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"all_actions") || zzd.a((Object)dta.b().k("tweet_detail_inline_reply_bar_full_composer_type"), (Object)"multi_media");
    }
    
    public static boolean Z() {
        return dta.b().b("composer_android_hide_keyboard_less_enabled", false);
    }
    
    public static final boolean a0() {
        final Class clazz = null;
        Class<?> forName;
        try {
            forName = Class.forName("org.junit.runners.ParentRunner");
        }
        catch (final ClassNotFoundException ex) {
            forName = null;
        }
        final boolean b = true;
        final boolean b2 = forName != null;
        boolean b3 = b;
        if (!b2) {
            Class<?> forName2;
            try {
                forName2 = Class.forName("org.junit.jupiter.api.AssertionUtils");
            }
            catch (final ClassNotFoundException ex2) {
                forName2 = clazz;
            }
            b3 = (forName2 != null && b);
        }
        return b3;
    }
    
    public static final boolean b0(final s01 s01) {
        zzd.f((Object)s01, "<this>");
        return zzd.a((Object)s01.l, (Object)"RUNNING") || s01.o == null;
    }
    
    public static boolean c0() {
        return dta.b().b("self_thread_composer_reply_threads", false);
    }
    
    public static boolean d0(final vo6 vo6) {
        final hil d0 = vo6.D0;
        boolean b = true;
        if (d0 == null || !vo6.O2() || vo6.n0() || vo6.C0.E0 || (!pjr.g((CharSequence)d0.c()) || !pjr.g((CharSequence)d0.m.get("wysta_context_type")) || !pjr.g((CharSequence)d0.b()))) {
            b = false;
        }
        return b;
    }
    
    public static final Iterator e0(final gub gub) {
        zzd.f((Object)gub, "block");
        final ijp ijp = new ijp();
        ijp.F0 = asy.w(gub, (Object)ijp, (ap6)ijp);
        return (Iterator)ijp;
    }
    
    public static final boolean f0(final Object... array) {
        final int length = array.length;
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= length) {
                break;
            }
            if (array[n2] == null) {
                n3 = 1;
                break;
            }
            ++n2;
        }
        return (n3 ^ 0x1) != 0x0;
    }
    
    public static kkb g(final int n, final rlb rlb) {
        Objects.requireNonNull(nlb.Companion);
        Objects.requireNonNull(zkb.Companion);
        zzd.f((Object)rlb, "weight");
        return (kkb)new lqm(n, rlb, 0, new qlb(new plb[0]), 0);
    }
    
    public static final Object g0(Object o, final Object o2) {
        if (o == null) {
            o = o2;
        }
        else if (o instanceof ArrayList) {
            ((ArrayList)o).add(o2);
        }
        else {
            final ArrayList list = new ArrayList(4);
            list.add(o);
            list.add(o2);
            o = list;
        }
        return o;
    }
    
    public static final int h(long n) {
        int n2 = 32;
        if ((0xFFFFFFFFL & n) == 0x0L) {
            n >>= 32;
        }
        else {
            n2 = 0;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFL & n) == 0x0L) {
            n3 = n2 + 16;
            n4 = n >> 16;
        }
        int n5 = n3;
        n = n4;
        if ((0xFFL & n4) == 0x0L) {
            n5 = n3 + 8;
            n = n4 >> 8;
        }
        int n6 = n5;
        long n7 = n;
        if ((0xFL & n) == 0x0L) {
            n6 = n5 + 4;
            n7 = n >> 4;
        }
        int n8;
        if ((0x1L & n7) != 0x0L) {
            n8 = n6;
        }
        else if ((0x2L & n7) != 0x0L) {
            n8 = n6 + 1;
        }
        else if ((0x4L & n7) != 0x0L) {
            n8 = n6 + 2;
        }
        else if ((n7 & 0x8L) != 0x0L) {
            n8 = n6 + 3;
        }
        else {
            n8 = -1;
        }
        return n8;
    }
    
    public static long h0(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            pmo.c((Throwable)new IllegalStateException(o1a.h("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static long i(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, k(value, n)));
        return value;
    }
    
    public static long i0(final AtomicLong atomicLong, final long n) {
        long value;
        long n2;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            final long n3 = n2 = value - n;
            if (n3 >= 0L) {
                continue;
            }
            pmo.c((Throwable)new IllegalStateException(o1a.h("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static long j(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, k(value, n)));
        return value;
    }
    
    public static boolean j0(final Context context, final UserIdentifier userIdentifier) {
        final File p2 = P(context, userIdentifier);
        return p2 != null && p2.exists() && p2.delete();
    }
    
    public static long k(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static final String k0(final f6i f6i) {
        zzd.f((Object)f6i, "<this>");
        final String e = f6i.e();
        zzd.e((Object)e, "asString()");
        final boolean contains = xre.a.contains(e);
        final int n = 0;
        int n2 = 0;
        Label_0108: {
            Label_0105: {
                if (!contains) {
                    int i = 0;
                    while (true) {
                        while (i < e.length()) {
                            final char char1 = e.charAt(i);
                            if (!Character.isLetterOrDigit(char1) && char1 != '_') {
                                final boolean b = true;
                                n2 = n;
                                if (b) {
                                    break Label_0105;
                                }
                                break Label_0108;
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
            n2 = 1;
        }
        String s;
        if (n2 != 0) {
            final StringBuilder sb = new StringBuilder();
            final String e2 = f6i.e();
            zzd.e((Object)e2, "asString()");
            final StringBuilder sb2 = new StringBuilder();
            sb2.append('`');
            sb2.append(e2);
            sb.append(sb2.toString());
            sb.append('`');
            s = sb.toString();
        }
        else {
            s = f6i.e();
            zzd.e((Object)s, "asString()");
        }
        return s;
    }
    
    public static final String l0(final List list) {
        final StringBuilder sb = new StringBuilder();
        for (final f6i f6i : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(k0(f6i));
        }
        final String string = sb.toString();
        zzd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static boolean m(final ocw ocw) {
        final hfv user = ocw.getUser();
        final boolean g = ocw.g();
        final boolean b = true;
        if ((!g || !lcs.b()) && dta.a(user.f()).b("ads_companion_enabled", false)) {
            final xv i1 = user.i1;
            boolean b2 = b;
            if (i1 == xv.E0) {
                return b2;
            }
            if (i1 == xv.F0) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public static void m0(final Class clazz) {
        final String name = clazz.getName();
        pmo.c((Throwable)new ProtocolViolationException(yqh.k("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
    
    public static boolean n() {
        return dta.c().b("alt_text_on_by_default_enabled", false);
    }
    
    public static final dud n0(final dud dud) {
        final dud$a companion = dud.Companion;
        final int d0 = dud.D0;
        final int c0 = dud.C0;
        final int n = -dud.E0;
        Objects.requireNonNull(companion);
        return new dud(d0, c0, n);
    }
    
    public static final Object o0(final Set set, Object o, final Object o2, final Object o3, final boolean b) {
        if (b) {
            Object o4;
            if (set.contains(o)) {
                o4 = o;
            }
            else if (set.contains(o2)) {
                o4 = o2;
            }
            else {
                o4 = null;
            }
            if (zzd.a(o4, o) && zzd.a(o3, o2)) {
                o = null;
            }
            else if ((o = o3) == null) {
                o = o4;
            }
            return o;
        }
        Set r2 = set;
        if (o3 != null) {
            r2 = or4.r2((Iterable)ymp.b0(set, o3));
        }
        return or4.c2((Iterable)r2);
    }
    
    public static final int p(final int[] array, final int n) {
        int n2 = array.length - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int n4 = array[n3];
            if (n > n4) {
                i = n3 + 1;
            }
            else {
                if (n >= n4) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final gjp p0(final gub gub) {
        return (gjp)new ljp(gub);
    }
    
    public static final String q(final String s) {
        ij1.b(pjr.g((CharSequence)s));
        zzd.c((Object)s);
        return s;
    }
    
    public static boolean q0(final AtomicReference atomicReference, final j29 j29, final Class clazz) {
        Objects.requireNonNull(j29, "next is null");
        if (!atomicReference.compareAndSet(null, j29)) {
            j29.dispose();
            if (atomicReference.get() != r29.C0) {
                m0(clazz);
            }
            return false;
        }
        return true;
    }
    
    public static final Object r(final Object o) {
        ij1.b(o != null);
        return o;
    }
    
    public static boolean r0(final ocw ocw, final hfv hfv, final tu tu) {
        boolean b2;
        final boolean b = b2 = false;
        if (hfv != null) {
            if (tu == null) {
                b2 = b;
            }
            else {
                b2 = b;
                if (m(ocw)) {
                    final long c0 = hfv.C0;
                    boolean b3 = false;
                    Label_0108: {
                        if (tu.a.containsKey(c0)) {
                            final Iterator iterator = tu.a.get(c0).iterator();
                            while (iterator.hasNext()) {
                                if (((su)iterator.next()).e) {
                                    b3 = true;
                                    break Label_0108;
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
        }
        return b2;
    }
    
    public static final void s(final Closeable closeable, final Throwable t) {
        if (closeable != null) {
            if (t == null) {
                closeable.close();
            }
            else {
                try {
                    closeable.close();
                }
                finally {
                    final Throwable t2;
                    tdy.t(t, t2);
                }
            }
        }
    }
    
    public static boolean s0(final ocw ocw, final hfv hfv, final tu tu, final boolean b) {
        final boolean r0 = r0(ocw, hfv, tu);
        boolean b3;
        final boolean b2 = b3 = false;
        if (r0) {
            b3 = b2;
            if (dta.b().b("ads_companion_profile_button_enabled", false)) {
                b3 = b2;
                if (b) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public static final double t(final double n, final double n2, final double n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final dud t0(final dud dud, int n) {
        zzd.f((Object)dud, "<this>");
        final boolean b = n > 0;
        final Integer value = n;
        zzd.f((Object)value, "step");
        if (b) {
            final dud$a companion = dud.Companion;
            final int c0 = dud.C0;
            final int d0 = dud.D0;
            if (dud.E0 <= 0) {
                n = -n;
            }
            Objects.requireNonNull(companion);
            return new dud(c0, d0, n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(value);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final float u(final float n, final float n2, final float n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final int v(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final fud v0(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            Objects.requireNonNull(fud.Companion);
            return fud.F0;
        }
        return new fud(n, n2 - 1);
    }
    
    public static final int w(final int n, final kk4 kk4) {
        if (kk4 instanceof jk4) {
            return ((Number)y(n, (jk4)kk4)).intValue();
        }
        final fud fud = (fud)kk4;
        if (!fud.isEmpty()) {
            int n2;
            if (n < fud.o().intValue()) {
                n2 = fud.o().intValue();
            }
            else if ((n2 = n) > fud.m().intValue()) {
                n2 = fud.m().intValue();
            }
            return n2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(kk4);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String w0(final String s, final String s2) {
        return xa0.B(new StringBuilder(s.length() + 1 + String.valueOf(s2).length()), s, ":", s2);
    }
    
    public static final long x(final long n, final long n2, final long n3) {
        if (n2 > n3) {
            final StringBuilder d = c0.D("Cannot coerce value to an empty range: maximum ", n3, " is less than minimum ");
            d.append(n2);
            d.append('.');
            throw new IllegalArgumentException(d.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static String x0(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder(yk.c(s.length(), 2, String.valueOf(s2).length(), String.valueOf(s3).length()));
        mag.m(sb, s, ":", s2, ":");
        sb.append(s3);
        return sb.toString();
    }
    
    public static final Comparable y(final Comparable comparable, final jk4 jk4) {
        zzd.f((Object)comparable, "<this>");
        zzd.f((Object)jk4, "range");
        if (!jk4.isEmpty()) {
            Comparable comparable2;
            if (jk4.e(comparable, ((kk4)jk4).g()) && !jk4.e(((kk4)jk4).g(), comparable)) {
                comparable2 = ((kk4)jk4).g();
            }
            else {
                comparable2 = comparable;
                if (jk4.e(((kk4)jk4).i(), comparable)) {
                    comparable2 = comparable;
                    if (!jk4.e(comparable, ((kk4)jk4).i())) {
                        comparable2 = ((kk4)jk4).i();
                    }
                }
            }
            return comparable2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(jk4);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final float z(final long n, final long n2) {
        return mcq.b(n2) / mcq.b(n);
    }
    
    public q73 H(final a a, final Object o) {
        return (q73)new r02(this.I(a.b).toString(), a.h, a.g, (q73)null, (String)null, o);
    }
    
    public Uri I(final Uri uri) {
        return uri;
    }
    
    public q73 L(final a a) {
        return (q73)new r7q(this.I(a.b).toString());
    }
    
    public q73 S(final a a, final Object o) {
        final msk o2 = a.o;
        Object c;
        String name;
        if (o2 != null) {
            c = o2.c();
            name = o2.getClass().getName();
        }
        else {
            c = (name = null);
        }
        return (q73)new r02(this.I(a.b).toString(), a.h, a.g, (q73)c, name, o);
    }
    
    public Object a() {
        final azy c = fzy.c;
        return (int)fsz.D0.b().h();
    }
    
    public long b() {
        return 0L;
    }
    
    public void c(final Exception ex) {
        qmz.e.o(String.format("Could not sync active asset packs. %s", ex), new Object[0]);
    }
    
    public Map d() {
        final ged$b c0 = ged.C0;
        final int a = w4j.a;
        return (Map)c0;
    }
    
    public boolean e() {
        return false;
    }
    
    public boolean f() {
        return true;
    }
    
    public boolean isValid() {
        return false;
    }
    
    public zrl$a l(final Object o) {
        final List list = (List)o;
        zzd.f((Object)list, "args");
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).s(tsl.g("conversation_participants_conversation_id", (Iterable)list));
        return zrl$a;
    }
    
    public int o(final int n) {
        return n;
    }
    
    public void u0() {
        throw null;
    }
}
