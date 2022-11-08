import android.os.IInterface;
import android.os.IBinder;
import java.util.Collection;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.util.List;
import android.animation.AnimatorSet;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import android.os.Looper;
import java.util.Objects;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m8y implements bsl, jws, uyz, sdy
{
    public static o3z C0;
    public static final m8y D0;
    public static final m8y E0;
    public static final int[] F0;
    public static final int[] G0;
    public static final int[] H0;
    public static final m8y I0;
    
    public static final int A(final int n) {
        return 1 << n % 10 * 3 + 1;
    }
    
    public static jkh B(final jkh jkh, final b2s b2s, final Map map, boolean b, boolean b2, oth oth, gub c0, float c2, final int n) {
        if ((n & 0x8) != 0x0) {
            b = true;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        final rpm rpm = null;
        if ((n & 0x20) != 0x0) {
            oth = null;
        }
        if ((n & 0x40) != 0x0) {
            c0 = (gub)o1s.C0;
        }
        rpm rpm2 = rpm;
        if ((n & 0x80) != 0x0) {
            final j1s a = j1s.a;
            final Set keySet = map.keySet();
            zzd.f((Object)keySet, "anchors");
            if (keySet.size() <= 1) {
                rpm2 = rpm;
            }
            else {
                final Float q1 = or4.Q1((Iterable)keySet);
                zzd.c((Object)q1);
                final float floatValue = q1;
                final Float s1 = or4.S1((Iterable)keySet);
                zzd.c((Object)s1);
                rpm2 = new rpm(floatValue - s1, 10.0f, 10.0f);
            }
        }
        if ((n & 0x100) != 0x0) {
            final j1s a2 = j1s.a;
            c2 = j1s.c;
        }
        zzd.f((Object)jkh, "$this$swipeable");
        zzd.f((Object)b2s, "state");
        zzd.f((Object)c0, "thresholds");
        final ssd$a a3 = ssd.a;
        return l76.a(jkh, (rtb)ssd.a, (jub)new r1s(map, b2s, b, oth, b2, rpm2, c0, c2));
    }
    
    public static final tox C(final tox tox, final tox tox2) {
        zzd.f((Object)tox2, "insets");
        return new lyv(tox, tox2);
    }
    
    public static String D(@NullableDecl final String s, @NullableDecl final Object... array) {
        final int n = 0;
        for (int i = 0; i < array.length; ++i) {
            final Object o = array[i];
            String s2;
            if (o == null) {
                s2 = "null";
            }
            else {
                try {
                    s2 = o.toString();
                }
                catch (final Exception ex) {
                    final String name = o.getClass().getName();
                    final String hexString = Integer.toHexString(System.identityHashCode(o));
                    final StringBuilder sb = new StringBuilder(dia.o(hexString, name.length() + 1));
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    final String string = sb.toString();
                    final Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    final Level warning = Level.WARNING;
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Exception during lenientFormat for ".concat(value);
                    }
                    else {
                        concat = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(warning, "com.google.common.base.Strings", "lenientToString", concat, ex);
                    final String name2 = ex.getClass().getName();
                    final StringBuilder n2 = xpa.n(name2.length() + dia.o(string, 9), "<", string, " threw ", name2);
                    n2.append(">");
                    s2 = n2.toString();
                }
            }
            array[i] = s2;
        }
        final StringBuilder sb2 = new StringBuilder(array.length * 16 + s.length());
        int n3 = 0;
        int j;
        for (j = n; j < array.length; ++j) {
            final int index = s.indexOf("%s", n3);
            if (index == -1) {
                break;
            }
            sb2.append(s, n3, index);
            sb2.append(array[j]);
            n3 = index + 2;
        }
        sb2.append(s, n3, s.length());
        if (j < array.length) {
            sb2.append(" [");
            final int n4 = j + 1;
            sb2.append(array[j]);
            for (int k = n4; k < array.length; ++k) {
                sb2.append(", ");
                sb2.append(array[k]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
    
    public static final n5m a(final long n, final long n2) {
        return new n5m(qfj.d(n), qfj.e(n), mcq.d(n2) + qfj.d(n), mcq.b(n2) + qfj.e(n));
    }
    
    public static final Float c(final Map map, final Object o) {
        final Iterator iterator = map.entrySet().iterator();
        while (true) {
            Object next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Float n = null;
                if (!hasNext) {
                    next = null;
                    final Map.Entry<Float, V> entry = (Map.Entry<Float, V>)next;
                    Float n2 = n;
                    if (entry != null) {
                        n2 = entry.getKey();
                    }
                    return n2;
                }
                next = iterator.next();
            } while (!zzd.a(((Map.Entry<K, Object>)next).getValue(), o));
            continue;
        }
    }
    
    public static final n5m d(final sve sve) {
        zzd.f((Object)sve, "<this>");
        final vmi vmi = (vmi)sve;
        final sve x = vmi.X();
        n5m w;
        if (x != null) {
            w = ((vmi)x).w(sve, true);
        }
        else {
            final long e0 = ((qgk)vmi).E0;
            w = new n5m(0.0f, 0.0f, (float)(int)(e0 >> 32), (float)iud.b(e0));
        }
        return w;
    }
    
    public static final n5m e(final sve sve) {
        zzd.f((Object)sve, "<this>");
        return p88.i(o(sve), sve, false, 2, (Object)null);
    }
    
    public static final n5m f(final sve sve) {
        zzd.f((Object)sve, "<this>");
        final sve o = o(sve);
        final n5m e = e(sve);
        final float n = (float)(int)(o.a() >> 32);
        final float n2 = (float)iud.b(o.a());
        final float u = pf8.u(e.a, 0.0f, n);
        final float u2 = pf8.u(e.b, 0.0f, n2);
        final float u3 = pf8.u(e.c, 0.0f, n);
        final float u4 = pf8.u(e.d, 0.0f, n2);
        final int n3 = 0;
        if (u != u3 && u2 != u4) {
            final long a = o.A(ukg.m(u, u2));
            final long a2 = o.A(ukg.m(u3, u2));
            final long a3 = o.A(ukg.m(u3, u4));
            final long a4 = o.A(ukg.m(u, u4));
            float n4 = qfj.d(a);
            final float d = qfj.d(a2);
            final float d2 = qfj.d(a4);
            final float d3 = qfj.d(a3);
            for (int i = 0; i < 3; ++i) {
                n4 = Math.min(n4, (new float[] { d, d2, d3 })[i]);
            }
            float n5 = qfj.e(a);
            final float e2 = qfj.e(a2);
            final float e3 = qfj.e(a4);
            final float e4 = qfj.e(a3);
            for (int j = 0; j < 3; ++j) {
                n5 = Math.min(n5, (new float[] { e2, e3, e4 })[j]);
            }
            float n6 = qfj.d(a);
            final float d4 = qfj.d(a2);
            final float d5 = qfj.d(a4);
            final float d6 = qfj.d(a3);
            for (int k = 0; k < 3; ++k) {
                n6 = Math.max(n6, (new float[] { d4, d5, d6 })[k]);
            }
            float n7 = qfj.e(a);
            final float e5 = qfj.e(a2);
            final float e6 = qfj.e(a4);
            final float e7 = qfj.e(a3);
            for (int l = n3; l < 3; ++l) {
                n7 = Math.max(n7, (new float[] { e5, e6, e7 })[l]);
            }
            return new n5m(n4, n5, n6, n7);
        }
        Objects.requireNonNull(n5m.Companion);
        return n5m.e;
    }
    
    public static final int h(final jkh.b b) {
        zzd.f((Object)b, "element");
        int n;
        if (b instanceof dwe) {
            n = 3;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (b instanceof zxd) {
            n2 = (n | 0x200);
        }
        int n3 = n2;
        if (b instanceof fd9) {
            n3 = (n2 | 0x4);
        }
        int n4 = n3;
        if (b instanceof zfp) {
            n4 = (n3 | 0x8);
        }
        int n5 = n4;
        if (b instanceof fpk) {
            n5 = (n4 | 0x10);
        }
        int n6 = 0;
        Label_0105: {
            if (!(b instanceof lkh) && !(b instanceof okh)) {
                n6 = n5;
                if (!(b instanceof ifb)) {
                    break Label_0105;
                }
            }
            n6 = (n5 | 0x20);
        }
        int n7 = n6;
        if (b instanceof rij) {
            n7 = (n6 | 0x100);
        }
        int n8 = n7;
        if (b instanceof fwj) {
            n8 = (n7 | 0x40);
        }
        if (!(b instanceof cjj) && !(b instanceof kjj)) {
            final int n9 = n8;
            if (!(b instanceof vcg)) {
                return n9;
            }
        }
        return n8 | 0x80;
    }
    
    public static final boolean i(final wbj wbj) {
        zzd.g((Object)wbj, "observer");
        if (zzd.a((Object)Looper.myLooper(), (Object)Looper.getMainLooper()) ^ true) {
            wbj.onSubscribe(dcs.h());
            final StringBuilder g = w48.g("Expected to be called on the main thread but was ");
            final Thread currentThread = Thread.currentThread();
            zzd.b((Object)currentThread, "Thread.currentThread()");
            g.append(currentThread.getName());
            wbj.onError((Throwable)new IllegalStateException(g.toString()));
            return false;
        }
        return true;
    }
    
    public static final i36 j(final m76 m76, final int n, final Object o) {
        zzd.f((Object)m76, "composer");
        m76.x(n);
        final Object y = m76.y();
        Objects.requireNonNull(m76.Companion);
        j36 j36;
        if (y == m76$a.b) {
            j36 = new j36(n, true);
            m76.p((Object)j36);
        }
        else {
            zzd.d(y, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            j36 = (j36)y;
        }
        j36.i(o);
        m76.O();
        return (i36)j36;
    }
    
    public static final i36 k(final int n, final boolean b, final Object o) {
        zzd.f(o, "block");
        final j36 j36 = new j36(n, b);
        j36.i(o);
        return (i36)j36;
    }
    
    public static final jsi m(final String d, final String b, final long a, final ocw ocw) {
        zzd.f((Object)b, "displayedUserName");
        zzd.f((Object)ocw, "currentUserInfo");
        final String b2 = ocw.b();
        if (b2 != null) {
            final kvi.a a2 = new kvi.a();
            a2.a = ocw.k().getId();
            a2.b = b2;
            final kvi a3 = (kvi)a2.e();
            final kvi.a a4 = new kvi.a();
            a4.a = a;
            a4.d = d;
            a4.b = b;
            final kvi b3 = (kvi)a4.e();
            final jsi$a jsi$a = new jsi$a();
            final lvi$a lvi$a = new lvi$a();
            lvi$a.b = b3;
            lvi$a.a = a3;
            jsi$a.t = (lvi)((h4j)lvi$a).e();
            final UserIdentifier k = ocw.k();
            zzd.e((Object)k, "currentUserInfo.userIdentifier");
            jsi$a.A = k;
            return (jsi)((h4j)jsi$a).e();
        }
        return null;
    }
    
    public static final int n(final int n) {
        return 2 << n % 10 * 3 + 1;
    }
    
    public static final sve o(sve x) {
        zzd.f((Object)x, "<this>");
        final sve x2 = x.X();
        sve sve = x;
        x = x2;
        vmi vmi;
        while (true) {
            vmi = (vmi)sve;
            sve = x;
            if (sve == null) {
                break;
            }
            x = sve.X();
        }
        vmi vmi2;
        if (vmi instanceof vmi) {
            vmi2 = vmi;
        }
        else {
            vmi2 = null;
        }
        if (vmi2 == null) {
            return (sve)vmi;
        }
        final vmi k0 = vmi2.K0;
        Object o = vmi2;
        vmi k2 = k0;
        Object o2;
        while (true) {
            o2 = o;
            o = k2;
            if (o == null) {
                break;
            }
            k2 = ((vmi)o).K0;
        }
        return (sve)o2;
    }
    
    public static final boolean p(final int n) {
        return (n & 0x80) != 0x0;
    }
    
    public static int q(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static final boolean r() {
        return dta.c().b("creatorsde_collab_api_enabled", false);
    }
    
    public static final boolean s(final ocw ocw) {
        zzd.f((Object)ocw, "currentUser");
        final hfv user = ocw.getUser();
        zzd.e((Object)user, "currentUser.user");
        final boolean a = zzd.a((Object)user, (Object)hfv.O1);
        final boolean b = false;
        if (a) {
            return false;
        }
        if (user.L0) {
            return false;
        }
        final int f = dta.e(ocw.k()).f("creatorsde_collab_compose_enabled", 0);
        int n = 0;
        Label_0099: {
            if (f != 0) {
                if (f == 1) {
                    n = 2;
                    break Label_0099;
                }
                if (f == 2) {
                    n = 3;
                    break Label_0099;
                }
            }
            n = 1;
        }
        final int d = nb0.D(n);
        boolean b2 = b;
        if (d != 0) {
            if (d != 1) {
                if (d != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            else {
                final xau$b companion = xau.Companion;
                final UserIdentifier k = ocw.k();
                zzd.e((Object)k, "currentUser.userIdentifier");
                final xau b3 = companion.b(k);
                if (!b3.e("co_tweet_composer_accessed", false)) {
                    b2 = b;
                    if (ocw.getUser().K1 < 5000) {
                        return b2;
                    }
                    lwe.k(b3, "co_tweet_composer_accessed", true);
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public static final boolean t() {
        return dta.c().b("creatorsde_collab_consume_enabled", false);
    }
    
    public static String u(final String s, final String s2) {
        final int n = s.length() - s2.length();
        if (n >= 0 && n <= 1) {
            final StringBuilder sb = new StringBuilder(s2.length() + s.length());
            for (int i = 0; i < s.length(); ++i) {
                sb.append(s.charAt(i));
                if (s2.length() > i) {
                    sb.append(s2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
    
    public static void w(final AnimatorSet set, final List list) {
        final int size = list.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final Animator animator = list.get(i);
            max = Math.max(max, animator.getDuration() + animator.getStartDelay());
        }
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 0, 0 });
        ((Animator)ofInt).setDuration(max);
        list.add(0, ofInt);
        set.playTogether((Collection)list);
    }
    
    public static final long x(final sve sve) {
        zzd.f((Object)sve, "<this>");
        Objects.requireNonNull(qfj.Companion);
        return sve.l0(qfj.b);
    }
    
    public static final long y(final sve sve) {
        zzd.f((Object)sve, "<this>");
        Objects.requireNonNull(qfj.Companion);
        return sve.A(qfj.b);
    }
    
    public static final boolean z(final m4m m4m, final m4m m4m2) {
        boolean b2;
        final boolean b = b2 = true;
        if (m4m != null) {
            if (m4m instanceof o4m && m4m2 instanceof o4m) {
                final o4m o4m = (o4m)m4m;
                boolean b3 = false;
                Label_0072: {
                    if (o4m.b != null) {
                        final i10 c = o4m.c;
                        if (c != null && c.a()) {
                            b3 = true;
                            break Label_0072;
                        }
                    }
                    b3 = false;
                }
                b2 = b;
                if (!b3) {
                    return b2;
                }
                b2 = b;
                if (zzd.a((Object)m4m, (Object)m4m2)) {
                    return b2;
                }
                if (zzd.a((Object)o4m.c, (Object)((o4m)m4m2).c)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public Object b(final IBinder binder) {
        final int a = ayz.a;
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
            if (queryLocalInterface instanceof nyz) {
                o = queryLocalInterface;
            }
            else {
                o = new kxz(binder);
            }
        }
        return o;
    }
    
    public Object g(final Object o) {
        return new pds.a((gpz)o);
    }
    
    public zrl$a l(final Object o) {
        final gid gid = (gid)o;
        zzd.f((Object)gid, "args");
        final zrl$a zrl$a = new zrl$a();
        final String b = tsl.b("type", (Object)0);
        final int ordinal = gid.ordinal();
        int n;
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n = 18;
        }
        else {
            n = 14;
        }
        final String a = tsl.a(new String[] { b, tsl.b("kind", (Object)n) });
        zzd.e((Object)a, "and(\n            QueryUt\u2026oxFilterState))\n        )");
        ((jp1$a)zrl$a).s(a);
        ((jp1$a)zrl$a).r("ref_id DESC");
        return zrl$a;
    }
    
    public std v(final ews ews, final Object o, final Object o2) {
        final tai tai = (tai)ews;
        final fws fws = (fws)o;
        final gzs gzs = (gzs)o2;
        zzd.f((Object)tai, "instruction");
        zzd.f((Object)fws, "requestContext");
        return (std)new tai$a(tai.a);
    }
}
