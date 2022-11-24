import java.io.IOException;
import java.util.LinkedHashMap;
import android.app.AppOpsManager;
import android.os.Binder;
import android.os.Process;
import android.content.Context;
import java.util.Iterator;
import android.os.Build$VERSION;
import java.util.Map;
import androidx.work.b$a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.LinkedHashSet;
import android.content.res.Resources;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public class jty implements kpw, k26, c0z
{
    public static qpy F0;
    public static final jty G0;
    public static final jty H0;
    public static final jty I0;
    public static final String[] J0;
    public static final String[] K0;
    public static final String[] L0;
    public static final String[] M0;
    
    static {
        G0 = new jty();
        H0 = new jty();
        I0 = new jty();
        J0 = new String[] { "ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id" };
        K0 = new String[] { "_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid" };
        L0 = new String[] { "items" };
        M0 = new String[] { "affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id" };
    }
    
    public static final int A(final q0f q0f, final Object o, final int n) {
        e0e.f((Object)q0f, "<this>");
        if (o == null) {
            return n;
        }
        if (n < q0f.a() && e0e.a(o, q0f.g(n))) {
            return n;
        }
        final Integer n2 = q0f.f().get(o);
        if (n2 != null) {
            return n2;
        }
        return n;
    }
    
    public static final p6m B(final dfb dfb) {
        e0e.f((Object)dfb, "<this>");
        final qni r0 = dfb.R0;
        p6m p6m;
        if (r0 == null || (p6m = w9y.m((bwe)r0).w((bwe)r0, false)) == null) {
            Objects.requireNonNull(p6m.Companion);
            p6m = p6m.e;
        }
        return p6m;
    }
    
    public static final long C(final long n) {
        return kqe.e(aeq.d(n) / 2.0f, aeq.b(n) / 2.0f);
    }
    
    public static String D(final Resources resources, final String s) {
        return resources.getString(2131956782, new Object[] { s });
    }
    
    public static final xc0 E(final sis sis) {
        e0e.f((Object)sis, "<this>");
        final xc0 a = sis.a;
        final long b = sis.b;
        Objects.requireNonNull(a);
        return a.d(zjs.g(b), zjs.f(b));
    }
    
    public static final xc0 F(final sis sis, final int n) {
        e0e.f((Object)sis, "<this>");
        return sis.a.d(zjs.f(sis.b), Math.min(zjs.f(sis.b) + n, sis.a.F0.length()));
    }
    
    public static final xc0 G(final sis sis, final int n) {
        e0e.f((Object)sis, "<this>");
        return sis.a.d(Math.max(0, zjs.g(sis.b) - n), zjs.g(sis.b));
    }
    
    public static final boolean H(final yse yse) {
        e0e.f((Object)yse, "<this>");
        return yse.P0() instanceof mp9;
    }
    
    public static final boolean I(final dfb dfb) {
        e0e.f((Object)dfb, "<this>");
        final qni r0 = dfb.R0;
        boolean b = true;
        boolean b2 = false;
        Label_0042: {
            if (r0 != null) {
                final swe l0 = r0.L0;
                if (l0 != null && l0.X0) {
                    b2 = true;
                    break Label_0042;
                }
            }
            b2 = false;
        }
        if (b2) {
            boolean b3 = false;
            Label_0074: {
                if (r0 != null) {
                    final swe l2 = r0.L0;
                    if (l2 != null && l2.H()) {
                        b3 = true;
                        break Label_0074;
                    }
                }
                b3 = false;
            }
            if (b3) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public static final boolean J() {
        return ita.b().b("reply_voting_android_enabled", false);
    }
    
    public static final boolean K(final wb4 wb4) {
        final oz5 a = oz5.a;
        if (dr8.n((kc8)wb4)) {
            final LinkedHashSet b = oz5.b;
            final bc4 f = er8.f((oc4)wb4);
            bc4 g;
            if (f != null) {
                g = f.g();
            }
            else {
                g = null;
            }
            if (rr4.u1((Iterable)b, (Object)g)) {
                return true;
            }
        }
        return false;
    }
    
    public static final dlh L(final dlh dlh, final kub kub) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)kub, "measure");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new nwe(kub));
    }
    
    public static final nxe M(int n, final ptb ptb) {
        mqb.n(n, "mode");
        e0e.f((Object)ptb, "initializer");
        if (n != 0) {
            Object o;
            if (--n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o = new c2w(ptb);
                }
                else {
                    o = new hqo(ptb);
                }
            }
            else {
                o = new h5s(ptb);
            }
            return (nxe)o;
        }
        throw null;
    }
    
    public static final nxe N(final ptb ptb) {
        e0e.f((Object)ptb, "initializer");
        return (nxe)new h5s(ptb);
    }
    
    public static final dlh O(final dlh dlh, final stb stb) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "offset");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new pgj(stb));
    }
    
    public static dlh P(final dlh dlh, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 0;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0;
        }
        e0e.f((Object)dlh, "$this$offset");
        final ysd$a a = ysd.a;
        final ysd$a a2 = ysd.a;
        return dlh.E((dlh)new ogj(n, n2));
    }
    
    public static final wqk Q(final List list, final List list2) {
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (!list.isEmpty()) {
            final int size = list.size();
            int n = 2;
            if (2 >= size) {
                n = list.size() - 1;
            }
            final ArrayList<Float> list3 = new ArrayList<Float>(3);
            int n2 = 0;
            float n3;
            while (true) {
                n3 = 0.0f;
                if (n2 >= 3) {
                    break;
                }
                list3.add(0.0f);
                ++n2;
            }
            final int size2 = list.size();
            final int n4 = n + 1;
            final sog sog = new sog(n4, size2);
            int n5 = 0;
            float n6;
            while (true) {
                n6 = 1.0f;
                if (n5 >= size2) {
                    break;
                }
                sog.l(0, n5, 1.0f);
                for (int i = 1; i < n4; ++i) {
                    sog.l(i, n5, list.get(n5).floatValue() * sog.j(i - 1, n5));
                }
                ++n5;
            }
            final sog sog2 = new sog(n4, size2);
            final sog sog3 = new sog(n4, n4);
            for (int j = 0; j < n4; ++j) {
                for (int k = 0; k < size2; ++k) {
                    sog2.l(j, k, sog.j(j, k));
                }
                for (int l = 0; l < j; ++l) {
                    final float m = sog2.k(j).m(sog2.k(l));
                    for (int n7 = 0; n7 < size2; ++n7) {
                        sog2.l(j, n7, sog2.j(j, n7) - sog2.j(l, n7) * m);
                    }
                }
                final xpw k2 = sog2.k(j);
                final float n8 = (float)Math.sqrt(k2.m(k2));
                if (n8 < 1.0E-6) {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
                final float n9 = 1.0f / n8;
                for (int n10 = 0; n10 < size2; ++n10) {
                    sog2.l(j, n10, sog2.j(j, n10) * n9);
                }
                for (int n11 = 0; n11 < n4; ++n11) {
                    float m2;
                    if (n11 < j) {
                        m2 = 0.0f;
                    }
                    else {
                        m2 = sog2.k(j).m(sog.k(n11));
                    }
                    sog3.l(j, n11, m2);
                }
            }
            final xpw xpw = new xpw(size2, 0);
            for (int n12 = 0; n12 < size2; ++n12) {
                ((Float[])xpw.c)[n12] = ((Number)list2.get(n12)).floatValue() * 1.0f;
            }
            int n14;
            for (int n13 = n14 = n4 - 1; -1 < n14; --n14) {
                list3.set(n14, sog2.k(n14).m(xpw));
                final int n15 = n14 + 1;
                if (n15 <= n13) {
                    int n16 = n13;
                    while (true) {
                        list3.set(n14, list3.get(n14).floatValue() - list3.get(n16).floatValue() * sog3.j(n14, n16));
                        if (n16 == n15) {
                            break;
                        }
                        --n16;
                    }
                }
                list3.set(n14, list3.get(n14).floatValue() / sog3.j(n14, n14));
            }
            int n17 = 0;
            float n18 = 0.0f;
            while (n17 < size2) {
                n18 += list2.get(n17).floatValue();
                ++n17;
            }
            final float n19 = n18 / size2;
            final float n20 = 0.0f;
            int n21 = 0;
            float n22 = n3;
            float n23 = n20;
            while (n21 < size2) {
                float n24 = list2.get(n21).floatValue() - list3.get(0).floatValue();
                int n25 = 1;
                float n26 = 1.0f;
                while (n25 < n4) {
                    n26 *= list.get(n21).floatValue();
                    n24 -= list3.get(n25).floatValue() * n26;
                    ++n25;
                }
                n23 += n24 * 1.0f * n24;
                final float n27 = list2.get(n21).floatValue() - n19;
                n22 += n27 * 1.0f * n27;
                ++n21;
            }
            float n28;
            if (n22 <= 1.0E-6f) {
                n28 = n6;
            }
            else {
                n28 = 1.0f - n23 / n22;
            }
            return new wqk((List)list3, n28);
        }
        throw new IllegalArgumentException("At least one point must be provided");
    }
    
    public static long R(final AtomicLong atomicLong, final long n) {
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
            yno.c((Throwable)new IllegalStateException(va.z("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static long S(final AtomicLong atomicLong, final long n) {
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
            yno.c((Throwable)new IllegalStateException(va.z("More produced than requested: ", n3)));
            n2 = 0L;
        } while (!atomicLong.compareAndSet(value, n2));
        return n2;
    }
    
    public static final void T(final dda dda) {
        e0e.f((Object)dda, "eventNamespace");
        sbw.b((tlm)new fg4(dda));
    }
    
    public static final void U(final dda dda, final long n) {
        e0e.f((Object)dda, "eventNamespace");
        sbw.b((tlm)v(dda, n));
    }
    
    public static final orj V(final swe swe) {
        e0e.f((Object)swe, "<this>");
        final orj m0 = swe.M0;
        if (m0 != null) {
            return m0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
    
    public static final dlh W(final dlh dlh, final boolean b, final stb stb) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "properties");
        final ysd$a a = ysd.a;
        return dlh.E((dlh)new php(b, false, stb, (stb)ysd.a));
    }
    
    public static final void X(final d86 d86, final Object o, final hub hub) {
        e0e.f((Object)hub, "block");
        if (d86.f() || !e0e.a(d86.y(), o)) {
            d86.p(o);
            d86.t(o, hub);
        }
    }
    
    public static final p6m Y(final long n) {
        Objects.requireNonNull(kgj.Companion);
        return w9y.b(kgj.b, n);
    }
    
    public static final ktx Z(final ktx ktx) {
        final wj6 j = ktx.j;
        final String c = ktx.c;
        ktx b = ktx;
        if (!e0e.a((Object)c, (Object)ConstraintTrackingWorker.class.getName())) {
            if (!j.d) {
                b = ktx;
                if (!j.e) {
                    return b;
                }
            }
            final b$a b$a = new b$a();
            b$a.b((Map)ktx.e.a);
            b$a.e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", c);
            b = ktx.b(ktx, (String)null, (hsx$a)null, ConstraintTrackingWorker.class.getName(), b$a.a(), 0, 0L, 0, 1048555);
        }
        return b;
    }
    
    public static final ktx a0(final List list, final ktx ktx) {
        e0e.f((Object)list, "schedulers");
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        ktx ktx2;
        if (23 <= sdk_INT && sdk_INT < 26) {
            ktx2 = Z(ktx);
        }
        else {
            ktx2 = ktx;
            if (sdk_INT <= 22) {
                int n = 0;
                Label_0130: {
                    try {
                        final Class<?> forName = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                        if (list.isEmpty()) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            final Iterator iterator = list.iterator();
                            do {
                                n = (b ? 1 : 0);
                                if (iterator.hasNext()) {
                                    continue;
                                }
                                break Label_0130;
                            } while (!forName.isAssignableFrom(((cxo)iterator.next()).getClass()));
                            n = 1;
                        }
                    }
                    catch (final ClassNotFoundException ex) {
                        n = (b ? 1 : 0);
                    }
                }
                ktx2 = ktx;
                if (n != 0) {
                    ktx2 = Z(ktx);
                }
            }
        }
        return ktx2;
    }
    
    public static bc0 b(final float n, float n2, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        long n4;
        if ((n3 & 0x4) != 0x0) {
            n4 = Long.MIN_VALUE;
        }
        else {
            n4 = 0L;
        }
        long n5;
        if ((n3 & 0x8) != 0x0) {
            n5 = Long.MIN_VALUE;
        }
        else {
            n5 = 0L;
        }
        final miv a = cqw.a;
        return new bc0((liv<Object, lc0>)cqw.a, n, (lc0)new ic0(n2), n4, n5, false);
    }
    
    public static float c(float n) {
        if (n <= 0.04045f) {
            n /= 12.92f;
        }
        else {
            n = (float)Math.pow((n + 0.055f) / 1.055f, 2.4000000953674316);
        }
        return n;
    }
    
    public static final long d(final int n) {
        final long n2 = n;
        final long n3 = 0;
        final ype$a companion = ype.Companion;
        return n2 << 32 | (n3 & 0xFFFFFFFFL);
    }
    
    public static final q0f e(final gzd gzd, final kud kud, final mub mub) {
        e0e.f((Object)gzd, "intervals");
        e0e.f((Object)kud, "nearestItemsRange");
        e0e.f((Object)mub, "itemContent");
        return (q0f)new ij8(mub, gzd, kud);
    }
    
    public static float f(float n) {
        if (n <= 0.0031308f) {
            n *= 12.92f;
        }
        else {
            n = (float)(Math.pow(n, 0.4166666567325592) * 1.0549999475479126 - 0.054999999701976776);
        }
        return n;
    }
    
    public static final long g(final float n, final float n2) {
        final long n3 = Float.floatToIntBits(n);
        final long n4 = Float.floatToIntBits(n2);
        final aeq$a companion = aeq.Companion;
        return (n4 & 0xFFFFFFFFL) | n3 << 32;
    }
    
    public static final long i(final float n, final boolean b) {
        final long n2 = Float.floatToIntBits(n);
        long n3;
        if (b) {
            n3 = 1L;
        }
        else {
            n3 = 0L;
        }
        return (n3 & 0xFFFFFFFFL) | n2 << 32;
    }
    
    public static final boolean j(final lvu lvu) {
        final oh0 r = lvu.r;
        boolean b2;
        final boolean b = b2 = false;
        if (r != null) {
            final qa9 o = lvu.o;
            long f;
            if (o != null) {
                f = o.f;
            }
            else {
                f = 0L;
            }
            b2 = b;
            if (f > 0L) {
                b2 = b;
                if (ita.b().b("spaces_2022_h2_entity_no_impression_enabled", false)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public static final ivh k(final dfb dfb) {
        e0e.f((Object)dfb, "<this>");
        final ivh<dfb> h0 = dfb.H0;
        final int h2 = h0.H0;
        boolean b = false;
        Label_0074: {
            Label_0072: {
                if (h2 > 0) {
                    final Object[] f0 = h0.F0;
                    e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int n = 0;
                    while (!((dfb)f0[n]).I0.e()) {
                        if (++n >= h2) {
                            break Label_0072;
                        }
                    }
                    b = true;
                    break Label_0074;
                }
            }
            b = false;
        }
        if (!b) {
            return dfb.H0;
        }
        final ivh ivh = new ivh((Object[])new dfb[16]);
        final ivh<dfb> h3 = dfb.H0;
        final int h4 = h3.H0;
        if (h4 > 0) {
            final Object[] f2 = h3.F0;
            e0e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n2 = 0;
            do {
                final dfb dfb2 = (dfb)f2[n2];
                if (!dfb2.I0.e()) {
                    ivh.b((Object)dfb2);
                }
                else {
                    final stb<? super seb, qfb> j = dfb2.P0.j;
                    Objects.requireNonNull(seb.Companion);
                    final qfb qfb = (qfb)j.invoke((Object)new seb(7));
                    Objects.requireNonNull(qfb.Companion);
                    if (e0e.a((Object)qfb, (Object)qfb.c)) {
                        return new ivh((Object[])new dfb[16]);
                    }
                    if (e0e.a((Object)qfb, (Object)qfb.b)) {
                        ivh.e(ivh.H0, k(dfb2));
                    }
                    else {
                        final ivh a = qfb.a;
                        final int h5 = a.H0;
                        if (h5 <= 0) {
                            continue;
                        }
                        final Object[] f3 = a.F0;
                        e0e.d((Object)f3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n3 = 0;
                        do {
                            final dfb c = ((tfb)f3[n3]).c();
                            if (c != null) {
                                ivh.b((Object)c);
                            }
                        } while (++n3 < h5);
                    }
                }
            } while (++n2 < h4);
        }
        return ivh;
    }
    
    public static long l(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, o(value, n)));
        return value;
    }
    
    public static long n(final AtomicLong atomicLong, final long n) {
        long value;
        do {
            value = atomicLong.get();
            if (value == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (value == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(value, o(value, n)));
        return value;
    }
    
    public static long o(long n, long n2) {
        n2 = (n += n2);
        if (n2 < 0L) {
            n = Long.MAX_VALUE;
        }
        return n;
    }
    
    public static final void p(final erw erw, final tpk tpk) {
        e0e.f((Object)erw, "<this>");
        e0e.f((Object)tpk, "event");
        if (p4j.n(tpk)) {
            erw.c = tpk.c;
            et0.O0((Object[])erw.a, (Object)null);
        }
        long n = tpk.f;
        final List b = tpk.b();
        for (int i = 0; i < b.size(); ++i) {
            final jlc jlc = b.get(i);
            final long g = kgj.g(jlc.b, n);
            n = jlc.b;
            final long h = kgj.h(erw.c, g);
            erw.c = h;
            erw.a(jlc.a, h);
        }
        final long h2 = kgj.h(erw.c, kgj.g(tpk.c, n));
        erw.c = h2;
        erw.a(tpk.b, h2);
    }
    
    public static int q(final Context context, String d) {
        final int myPid = Process.myPid();
        final int myUid = Process.myUid();
        final String packageName = context.getPackageName();
        final int checkPermission = context.checkPermission(d, myPid, myUid);
        final int n = 0;
        if (checkPermission != -1) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                d = nn0$a.d(d);
            }
            else {
                d = null;
            }
            if (d == null) {
                return n;
            }
            String s;
            if ((s = packageName) == null) {
                final String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null) {
                    return -1;
                }
                if (packagesForUid.length <= 0) {
                    return -1;
                }
                s = packagesForUid[0];
            }
            final int myUid2 = Process.myUid();
            final String packageName2 = context.getPackageName();
            int n3;
            if (myUid2 == myUid && s5j.a((Object)packageName2, (Object)s)) {
                if (sdk_INT >= 29) {
                    final AppOpsManager c = nn0$b.c(context);
                    n3 = nn0$b.a(c, d, Binder.getCallingUid(), s);
                    if (n3 == 0) {
                        n3 = nn0$b.a(c, d, myUid, nn0$b.b(context));
                    }
                }
                else {
                    n3 = nn0.a(context, d, s);
                }
            }
            else {
                n3 = nn0.a(context, d, s);
            }
            if (n3 == 0) {
                return n;
            }
            return -2;
        }
        return -1;
    }
    
    public static final dlh r(final dlh dlh, final stb stb) {
        e0e.f((Object)dlh, "<this>");
        e0e.f((Object)stb, "properties");
        final ysd$a a = ysd.a;
        return dlh.E((dlh)new php(false, true, stb, (stb)ysd.a));
    }
    
    public static final mhp s(final qhp qhp) {
        e0e.f((Object)qhp, "<this>");
        final dlh.c j0 = ((en8)qhp).l().J0;
        final qhp qhp2 = null;
        Object j2 = null;
        Label_0068: {
            if (j0 != null) {
                j2 = j0;
                if ((j0.H0 & 0x8) != 0x0) {
                    while (j2 != null) {
                        if ((((dlh.c)j2).G0 & 0x8) != 0x0) {
                            break Label_0068;
                        }
                        j2 = ((dlh.c)j2).J0;
                    }
                }
            }
            j2 = null;
        }
        if (!(j2 instanceof qhp)) {
            j2 = qhp2;
        }
        final qhp qhp3 = (qhp)j2;
        if (qhp3 != null && !qhp.z().H0) {
            final mhp i = qhp.z().i();
            final mhp s = s(qhp3);
            e0e.f((Object)s, "peer");
            if (s.G0) {
                i.G0 = true;
            }
            if (s.H0) {
                i.H0 = true;
            }
            for (final Map.Entry<bip, V> entry : s.F0.entrySet()) {
                final bip bip = entry.getKey();
                final V value = entry.getValue();
                if (!i.F0.containsKey(bip)) {
                    i.F0.put(bip, value);
                }
                else {
                    if (!(value instanceof qf)) {
                        continue;
                    }
                    final Object value2 = i.F0.get(bip);
                    e0e.d(value2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                    final qf qf = (qf)value2;
                    final LinkedHashMap f0 = i.F0;
                    String s2;
                    if ((s2 = qf.a) == null) {
                        s2 = ((qf)value).a;
                    }
                    utb utb;
                    if ((utb = qf.b) == null) {
                        utb = ((qf)value).b;
                    }
                    f0.put(bip, new qf(s2, utb));
                }
            }
            return i;
        }
        return qhp.z();
    }
    
    public static final long t(final long n, final um9 um9, final um9 um10) {
        e0e.f((Object)um9, "sourceUnit");
        e0e.f((Object)um10, "targetUnit");
        return um10.F0.convert(n, um9.F0);
    }
    
    public static bc0 u(final bc0 bc0) {
        final float a = ((ic0)bc0.H0).a;
        final long i0 = bc0.I0;
        final long j0 = bc0.J0;
        final boolean k0 = bc0.K0;
        e0e.f((Object)bc0, "<this>");
        return new bc0((liv<Object, lc0>)bc0.F0, 0.0f, (lc0)new ic0(a), i0, j0, k0);
    }
    
    public static final fg4 v(final dda dda, final long a) {
        e0e.f((Object)dda, "eventNamespace");
        final fg4 fg4 = new fg4(dda);
        final ufv ufv = new ufv();
        ufv.a = a;
        ufv.c = 11;
        ((o1p)fg4).i((d1p)ufv);
        return fg4;
    }
    
    public static final lc0 w(final liv liv, final Object o) {
        e0e.f((Object)liv, "<this>");
        return kqe.a0((lc0)liv.a().invoke(o));
    }
    
    public static int x(float n, int round, int round2) {
        if (round == round2) {
            return round;
        }
        final float n2 = (round >> 24 & 0xFF) / 255.0f;
        final float n3 = (round >> 16 & 0xFF) / 255.0f;
        final float n4 = (round >> 8 & 0xFF) / 255.0f;
        final float n5 = (round & 0xFF) / 255.0f;
        final float n6 = (round2 >> 24 & 0xFF) / 255.0f;
        final float n7 = (round2 >> 16 & 0xFF) / 255.0f;
        final float n8 = (round2 >> 8 & 0xFF) / 255.0f;
        final float n9 = (round2 & 0xFF) / 255.0f;
        final float c = c(n3);
        final float c2 = c(n4);
        final float c3 = c(n5);
        final float c4 = c(n7);
        final float c5 = c(n8);
        final float c6 = c(n9);
        final float d = va.d(n6, n2, n, n2);
        final float d2 = va.d(c4, c, n, c);
        final float d3 = va.d(c5, c2, n, c2);
        n = va.d(c6, c3, n, c3);
        final float f = f(d2);
        final float f2 = f(d3);
        n = f(n);
        final int round3 = Math.round(d * 255.0f);
        round2 = Math.round(f * 255.0f);
        round = Math.round(f2 * 255.0f);
        return Math.round(n * 255.0f) | (round2 << 16 | round3 << 24 | round << 8);
    }
    
    public static final dfb y(dfb j0) {
        e0e.f((Object)j0, "<this>");
        final int ordinal = ((Enum)j0.I0).ordinal();
        dfb y = j0;
        if (ordinal != 0) {
            Label_0076: {
                if (ordinal != 1) {
                    y = j0;
                    if (ordinal == 2) {
                        return y;
                    }
                    if (ordinal == 3) {
                        break Label_0076;
                    }
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            break Label_0076;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                j0 = j0.J0;
                if (j0 != null) {
                    y = y(j0);
                    return y;
                }
            }
            y = null;
        }
        return y;
    }
    
    public static final dfb z(dfb z) {
        final dfb g0 = z.G0;
        if (g0 != null) {
            final int ordinal = ((Enum)z.I0).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return z;
                }
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            z = z(g0);
        }
        else {
            z = null;
        }
        return z;
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return ywz.G0.b().c();
    }
    
    public Object h(final jie jie, final float n) throws IOException {
        return mle.b(jie, n);
    }
    
    public Object m(final e26 e26) {
        final rch rch = (rch)((xsm)e26).f((Class)rch.class);
        return new iih();
    }
}
