import java.util.Set;
import java.util.concurrent.Executor;
import android.graphics.PointF;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import com.twitter.util.user.UserIdentifier$Companion;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lai implements c0z
{
    public static final lai A1;
    public static mai F0;
    public static lai G0;
    public static final int[] H0;
    public static final int[] I0;
    public static final int[] J0;
    public static final int[] K0;
    public static final int[] L0;
    public static final int[] M0;
    public static final int[] N0;
    public static final int[] O0;
    public static final int[] P0;
    public static final int[] Q0;
    public static final int[] R0;
    public static final int[] S0;
    public static final int[] T0;
    public static final int[] U0;
    public static final int[] V0;
    public static final int[] W0;
    public static final int[] X0;
    public static final int[] Y0;
    public static final int[] Z0;
    public static final int[] a1;
    public static final int[] b1;
    public static final int[] c1;
    public static final int[] d1;
    public static final int[] e1;
    public static final int[] f1;
    public static final int[] g1;
    public static final int[] h1;
    public static final int[] i1;
    public static final int[] j1;
    public static final int[] k1;
    public static final int[] l1;
    public static final int[] m1;
    public static final int[] n1;
    public static final int[] o1;
    public static final int[] p1;
    public static final int[] q1;
    public static final int[] r1;
    public static final int[] s1;
    public static final int[] t1;
    public static final int[] u1;
    public static final int[] v1;
    public static final int[] w1;
    public static final int[] x1;
    public static final int[] y1;
    public static final int[] z1;
    
    static {
        H0 = new int[] { 16842964, 16843919, 16844096, 2130969418, 2130969451, 2130970012, 2130970013, 2130970721 };
        I0 = new int[] { 2130970005, 2130970006, 2130970007 };
        J0 = new int[] { 2130968720, 2130968732, 2130968739, 2130968741, 2130968744, 2130968745, 2130969643, 2130969644, 2130970121, 2130970252, 2130971102, 2130971103 };
        K0 = new int[] { 16843065, 2130969628, 2130969823, 2130970156, 2130970607, 2130970612, 2130971003, 2130971006, 2130971008 };
        L0 = new int[] { 16843039, 16843040, 16843840, 2130968729, 2130968761, 2130968762, 2130968763, 2130968764, 2130968765, 2130968767, 2130968768, 2130968769, 2130969587, 2130970074, 2130970075, 2130970076, 2130970279, 2130970282, 2130970283, 2130970286, 2130970577, 2130970580 };
        M0 = new int[] { 16843071, 16843072, 2130968828, 2130968831, 2130968832, 2130968834, 2130968835, 2130968836, 2130969022, 2130969023, 2130969025, 2130969026, 2130969028 };
        N0 = new int[] { 16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, 2130968873, 2130968875, 2130968879, 2130968880, 2130968884, 2130968885, 2130968886, 2130968888, 2130968889, 2130968890, 2130968891, 2130968892, 2130968893, 2130968894, 2130968899, 2130968900, 2130968901, 2130968903, 2130968928, 2130968929, 2130968930, 2130968931, 2130968932, 2130968933, 2130968934, 2130969434, 2130969631, 2130969688, 2130969771, 2130970492, 2130970577, 2130970580, 2130970627, 2130970866, 2130970887 };
        O0 = new int[] { 2130968872, 2130968895, 2130968896, 2130968897, 2130970562, 2130970652, 2130970655 };
        P0 = new int[] { 2130969563, 2130969824, 2130969826, 2130969827 };
        Q0 = new int[] { 2130968924, 2130968927 };
        R0 = new int[] { 2130968925, 2130970107, 2130970563 };
        S0 = new int[] { 2130968940, 2130968941, 2130968942, 2130969029, 2130969453, 2130969454, 2130969455, 2130969456, 2130969457, 2130969458, 2130969459, 2130969460, 2130969467, 2130969558, 2130970127, 2130970525, 2130970528, 2130970722, 2130970933, 2130970935, 2130970936, 2130970943, 2130970972 };
        T0 = new int[] { 2130969935, 2130969936 };
        U0 = new int[] { 2130968759, 2130968760 };
        V0 = new int[] { 16842766, 2130968729, 2130968730, 2130968779, 2130969418, 2130969434, 2130969473, 2130969475, 2130969631, 2130969647, 2130970125, 2130970357, 2130970492, 2130970577, 2130970580, 2130970627, 2130971070 };
        W0 = new int[] { 2130968759 };
        X0 = new int[] { 2130969889, 2130970016 };
        Y0 = new int[] { 16843017, 16843264, 2130969564 };
        Z0 = new int[] { 2130968722, 2130968723, 2130968724, 2130968725 };
        a1 = new int[] { 16843296, 2130970648, 2130970649 };
        b1 = new int[] { 16842964, 16843191, 16843192, 16843193, 16843194, 16843237, 2130968729, 2130968730, 2130969118, 2130969418, 2130969648, 2130969707, 2130969739, 2130969766, 2130969787, 2130969788, 2130970492, 2130970577, 2130970580, 2130970735, 2130970737 };
        c1 = new int[] { 2130968871, 2130970562, 2130970655 };
        d1 = new int[] { 16843277, 2130969169, 2130969170, 2130969171, 2130969172, 2130970241, 2130970462, 2130971166, 2130971167, 2130971168 };
        e1 = new int[] { 16843191, 16843192, 16843193, 16843194, 2130969870, 2130969882, 2130969883, 2130969890, 2130969891, 2130969895 };
        f1 = new int[] { 16843237, 2130968833, 2130968873, 2130968876, 2130968877, 2130968878, 2130968879, 2130970492, 2130970577, 2130970580, 2130970703, 2130970735, 2130970737 };
        g1 = new int[] { 2130968817, 2130968856, 2130971074 };
        h1 = new int[] { 2130968817, 2130971074 };
        i1 = new int[] { 2130970577, 2130970580 };
        j1 = new int[] { 16843958, 16844159, 2130970015 };
        k1 = new int[] { 16842804, 16844159, 2130970015 };
        l1 = new int[] { 2130968926, 2130969901 };
        m1 = new int[] { 2130970048, 2130970050, 2130970234, 2130970748, 2130970934 };
        n1 = new int[] { 2130970107 };
        o1 = new int[] { 2130968766 };
        p1 = new int[] { 2130969113, 2130969114, 2130969115, 2130969116, 2130969117, 2130969128, 2130969129, 2130969130, 2130969131, 2130969132 };
        q1 = new int[] { 2130969022, 2130969023, 2130969024, 2130969025, 2130969026, 2130969027, 2130969028, 2130970577, 2130970580, 2130970735, 2130970737 };
        r1 = new int[] { 16842766, 16842788, 16843078, 16843486, 16843487, 2130969613, 2130969614, 2130969905, 2130969911, 2130970902, 2130970903, 2130970904, 2130970905, 2130970906, 2130970911, 2130970912, 2130970913, 2130970921, 2130971003, 2130971004, 2130971005, 2130971007 };
        s1 = new int[] { 16843039, 2130968642, 2130968680, 2130968726, 2130968729, 2130968730, 2130969418, 2130970117 };
        t1 = new int[] { 16842754, 16842994, 16843087 };
        u1 = new int[] { 2130970775, 2130970776, 2130970777, 2130970778, 2130970779, 2130970780, 2130970781, 2130970782, 2130970783, 2130970784, 2130970785, 2130970786, 2130970787, 2130970789, 2130970790, 2130970791, 2130970792, 2130970793, 2130970794, 2130970795, 2130970796, 2130970797, 2130970799, 2130970801, 2130970802, 2130970804 };
        v1 = new int[] { 16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, 2130969542, 2130969556, 2130970817, 2130970881 };
        w1 = new int[] { 2130970875 };
        x1 = new int[] { 16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, 2130968790, 2130968791, 2130968792, 2130968793, 2130968794, 2130968795, 2130968796, 2130968797, 2130968798, 2130968799, 2130968800, 2130969133, 2130969134, 2130969135, 2130969136, 2130969137, 2130969138, 2130969426, 2130969427, 2130969428, 2130969429, 2130969430, 2130969431, 2130969438, 2130969440, 2130969441, 2130969442, 2130969443, 2130969444, 2130969445, 2130969452, 2130969623, 2130969624, 2130969625, 2130969626, 2130969637, 2130969638, 2130969639, 2130969640, 2130970292, 2130970293, 2130970294, 2130970295, 2130970296, 2130970309, 2130970310, 2130970311, 2130970352, 2130970353, 2130970354, 2130970577, 2130970580, 2130970690, 2130970691, 2130970692, 2130970693, 2130970694, 2130970753, 2130970754, 2130970755 };
        y1 = new int[] { 16842804, 2130969432, 2130969433 };
        z1 = new int[] { 16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, 2130968729 };
        A1 = new lai();
    }
    
    public lai() {
    }
    
    public lai(final pml pml, final f5j f5j) {
        f5j.a(pml, ita.c().b("android_growth_performance_holdback_perf_optimize_unread_badge_init", false));
    }
    
    public static final Float b(final Map map, final Object o) {
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
            } while (!e0e.a(((Map.Entry<K, Object>)next).getValue(), o));
            continue;
        }
    }
    
    public static final String c(final Method method) {
        final StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        final Class<?>[] parameterTypes = method.getParameterTypes();
        e0e.e((Object)parameterTypes, "parameterTypes");
        sb.append(ft0.d1((Object[])parameterTypes, (CharSequence)"", (CharSequence)"(", (CharSequence)")", (stb)ino.F0, 24));
        final Class<?> returnType = method.getReturnType();
        e0e.e((Object)returnType, "returnType");
        sb.append(v8m.b((Class)returnType));
        return sb.toString();
    }
    
    public static final int d(final Rect rect, final int n, final int n2) {
        final long n3 = rect.width();
        final long n4 = rect.height();
        final long n5 = n * (long)n2;
        if (n5 == 0L) {
            return 0;
        }
        return (int)(n3 * n4 * 100000 / n5);
    }
    
    public static final boolean e() {
        return ita.b().b("profile_foundations_timeline_filters_enabled", false);
    }
    
    public static final sae g(final yh5 yh5) {
        final sae k0 = sae.K0;
        if (yh5 == null) {
            return k0;
        }
        final ai5 m = yh5.m;
        final kt5 a = kt5.Companion.a(yh5.l);
        sae sae = k0;
        if (m != null) {
            if (xli.e(m, a)) {
                sae = sae.H0;
            }
            else if (xli.f(m)) {
                sae = sae.I0;
            }
            else {
                final UserIdentifier$Companion companion = UserIdentifier.Companion;
                final int n = 0;
                if (rh.A(companion, "c9s_enabled", false) && ita.b().b("c9s_request_to_join_enabled", false) && m.a.b(mo5$e.K0)) {
                    sae = sae.J0;
                }
                else {
                    final pp5 b = m.b;
                    Objects.requireNonNull(b);
                    int n2;
                    if (b instanceof pp5.a) {
                        n2 = 1;
                    }
                    else {
                        n2 = 2;
                    }
                    if (n2 != 1) {
                        final boolean b2 = a == kt5.I0 || m.a.b(mo5$e.H0);
                        final boolean b3 = a == kt5.H0;
                        if (!b2 && !b3) {
                            int n3 = n;
                            if (a == kt5.G0) {
                                n3 = 1;
                            }
                            if (n3 == 0) {
                                sae = k0;
                                if (!m.a.a()) {
                                    sae = sae.G0;
                                    return sae;
                                }
                                return sae;
                            }
                        }
                    }
                    sae = sae.F0;
                }
            }
        }
        return sae;
    }
    
    public static final Map h(final List list) {
        e0e.f((Object)list, "itemControllers");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Rect rect = new Rect();
        for (final tj1 tj1 : list) {
            ((sl8)tj1.F0).F0.getGlobalVisibleRect(rect);
            final zwv j0 = tj1.J0;
            vmw.g((Object)j0);
            linkedHashMap.put(j0.getName().F0, d(rect, ((sl8)tj1.F0).F0.getWidth(), ((sl8)tj1.F0).F0.getHeight()));
        }
        return linkedHashMap;
    }
    
    public static void i(final mai f0) {
        synchronized (lai.class) {
            synchronized (lai.class) {
                final boolean b = lai.F0 != null;
                monitorexit(lai.class);
                if (!b) {
                    monitorenter(lai.class);
                    try {
                        if (lai.F0 != null) {
                            throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                        }
                        lai.F0 = f0;
                        monitorexit(lai.class);
                    }
                    finally {}
                }
            }
        }
    }
    
    public static boolean j(final String s) {
        return k(s);
    }
    
    public static boolean k(final String s) {
        synchronized (lai.class) {
            final mai f0 = lai.F0;
            if (f0 != null) {
                monitorexit(lai.class);
                return f0.b(s);
            }
            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
        }
    }
    
    public static List l(final jie jie, final udg udg, final kpw kpw) throws IOException {
        return cse.a(jie, udg, 1.0f, kpw, false);
    }
    
    public static e80 m(final jie jie, final udg udg) throws IOException {
        return new e80(l(jie, udg, (kpw)bs4.F0));
    }
    
    public static f80 n(final jie jie, final udg udg, final boolean b) throws IOException {
        float c;
        if (b) {
            c = wnw.c();
        }
        else {
            c = 1.0f;
        }
        return new f80(cse.a(jie, udg, c, (kpw)o9a.F0, false));
    }
    
    public static h80 o(final jie jie, final udg udg) throws IOException {
        return new h80(l(jie, udg, (kpw)hfe.F0));
    }
    
    public static l80 p(final jie jie, final udg udg) throws IOException {
        return new l80(cse.a(jie, udg, wnw.c(), (kpw)egz.G0, true));
    }
    
    public static final void q(final pnf pnf, final UserIdentifier userIdentifier) {
        ((rd)pnf).e((Runnable)new z2r((Object)pnf, (Object)userIdentifier, 12), (Executor)p4c.a().b(4));
    }
    
    public static final void r(final boolean b, final UserIdentifier userIdentifier) {
        final gcu b2 = gcu.Companion.b(userIdentifier);
        if (b != b2.e("notifications_enabled", false)) {
            String s;
            if (b) {
                s = "enabled_change";
            }
            else {
                s = "disabled_change";
            }
            t(userIdentifier, s);
            b2.i().f("notifications_enabled", b).e();
        }
        String s2;
        if (b) {
            s2 = "enabled";
        }
        else {
            s2 = "disabled";
        }
        t(userIdentifier, s2);
        final boolean b3 = tol.a(userIdentifier).b();
        if (userIdentifier.isRegularUser()) {
            String s3;
            if (b3) {
                s3 = "enabled";
            }
            else {
                s3 = "disabled";
            }
            sbw.b((tlm)new fg4(userIdentifier, dda.Companion.e("app", "notifications", "settings", "master_switch", s3)));
        }
    }
    
    public static final void s(final UserIdentifier userIdentifier, final String s) {
        sbw.b((tlm)new fg4(userIdentifier, dda.Companion.e("app", "notifications", "restriction", "status", s)));
    }
    
    public static final void t(final UserIdentifier userIdentifier, final String s) {
        sbw.b((tlm)new fg4(userIdentifier, dda.Companion.e("notification", "", "", "system_push_setting", s)));
    }
    
    public static dlh u(final dlh dlh, final o3s o3s, final Map map, boolean b, boolean b2, iuh iuh, hub f0, float c, final int n) {
        if ((n & 0x8) != 0x0) {
            b = true;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        final wqm wqm = null;
        if ((n & 0x20) != 0x0) {
            iuh = null;
        }
        if ((n & 0x40) != 0x0) {
            f0 = (hub)b3s.F0;
        }
        wqm wqm2 = wqm;
        if ((n & 0x80) != 0x0) {
            final w2s a = w2s.a;
            final Set keySet = map.keySet();
            e0e.f((Object)keySet, "anchors");
            if (keySet.size() <= 1) {
                wqm2 = wqm;
            }
            else {
                final Float m1 = rr4.M1((Iterable)keySet);
                e0e.c((Object)m1);
                final float floatValue = m1;
                final Float o1 = rr4.O1((Iterable)keySet);
                e0e.c((Object)o1);
                wqm2 = new wqm(floatValue - o1, 10.0f, 10.0f);
            }
        }
        if ((n & 0x100) != 0x0) {
            final w2s a2 = w2s.a;
            c = w2s.c;
        }
        e0e.f((Object)dlh, "$this$swipeable");
        e0e.f((Object)o3s, "state");
        e0e.f((Object)f0, "thresholds");
        final ysd$a a3 = ysd.a;
        return c86.a(dlh, (stb<? super btd, vzv>)ysd.a, (kub<? super dlh, ? super d86, ? super Integer, ? extends dlh>)new e3s(map, o3s, b, iuh, b2, wqm2, f0, c));
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return stz.G0.b().C();
    }
    
    public String f(String z, final String s) {
        String b;
        final String s2 = b = null;
        if (z != null) {
            if (s == null) {
                b = s2;
            }
            else {
                z = bj.z(s, "d6PaPHJeSpyHXeVyWT6ePCcSMSrnD83MnfMgWhtczxpnSMSF7CQcBSQqtBNh6Jym", z, "Activation");
                final byte[] a = pk1.a;
                final byte[] d = pk1.d(z.getBytes());
                if (d == null) {
                    b = s2;
                }
                else {
                    b = pk1.b(d);
                }
            }
        }
        return b;
    }
}
