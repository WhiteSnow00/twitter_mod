import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhq
{
    public static final rtb<dhq, oyv> a;
    public static final aiq b;
    public static final Object c;
    public static dhq d;
    public static int e;
    public static final chq f;
    public static final List<gub<Set<?>, ahq, oyv>> g;
    public static final List<rtb<Object, oyv>> h;
    public static final AtomicReference<z4c> i;
    public static final ahq j;
    
    static {
        fhq.a = fhq$a.C0;
        b = new aiq(0);
        c = new Object();
        Objects.requireNonNull(dhq.Companion);
        final dhq dhq = fhq.d = dhq.G0;
        fhq.e = 1;
        f = new chq();
        fhq.g = new ArrayList();
        fhq.h = new ArrayList();
        final int e = fhq.e;
        fhq.e = e + 1;
        final z4c z4c = new z4c(e, dhq);
        fhq.d = fhq.d.l(((ahq)z4c).b);
        final z4c value = (i = new AtomicReference<z4c>(z4c)).get();
        zzd.e((Object)value, "currentGlobalSnapshot.get()");
        j = (ahq)value;
    }
    
    public static final void a() {
        f((rtb<? super dhq, ?>)ehq.C0);
    }
    
    public static final rtb b(final rtb rtb, final rtb rtb2) {
        Object o;
        if (rtb != null && rtb2 != null && !zzd.a((Object)rtb, (Object)rtb2)) {
            o = new ghq((rtb<Object, oyv>)rtb, (rtb<Object, oyv>)rtb2);
        }
        else if ((o = rtb) == null) {
            o = rtb2;
        }
        return (rtb)o;
    }
    
    public static final Map c(final kuh kuh, final kuh kuh2, final dhq dhq) {
        final Set v = kuh2.v();
        final int d = ((ahq)kuh).d();
        final Map map = null;
        Map map2;
        if (v == null) {
            map2 = map;
        }
        else {
            final dhq j = ((ahq)kuh2).e().l(((ahq)kuh2).d()).j(kuh2.h);
            final Iterator iterator = v.iterator();
            Map map3 = null;
            while (iterator.hasNext()) {
                final j8r j8r = (j8r)iterator.next();
                final l8r l = j8r.l();
                final l8r q = q(l, d, dhq);
                if (q == null) {
                    continue;
                }
                final l8r q2 = q(l, d, j);
                if (q2 == null) {
                    continue;
                }
                if (zzd.a((Object)q, (Object)q2)) {
                    continue;
                }
                final l8r q3 = q(l, ((ahq)kuh2).d(), ((ahq)kuh2).e());
                if (q3 == null) {
                    p();
                    throw null;
                }
                final l8r o = j8r.o(q2, q, q3);
                map2 = map;
                if (o == null) {
                    return map2;
                }
                Map map4;
                if ((map4 = map3) == null) {
                    map4 = new HashMap();
                }
                map4.put(q, o);
                map3 = map4;
            }
            map2 = map3;
        }
        return map2;
    }
    
    public static final void d(final ahq ahq) {
        if (fhq.d.i(ahq.d())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }
    
    public static final dhq e(dhq l, int i, final int n) {
        zzd.f((Object)l, "<this>");
        while (i < n) {
            l = l.l(i);
            ++i;
        }
        return l;
    }
    
    public static final <T> T f(final rtb<? super dhq, ? extends T> rtb) {
        final ahq j = fhq.j;
        zzd.d((Object)j, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        final z4c z4c = (z4c)j;
        Object c = fhq.c;
        synchronized (c) {
            final z4c value = fhq.i.get();
            zzd.e((Object)value, "currentGlobalSnapshot.get()");
            final Object t = t((ahq)value, (rtb<? super dhq, ?>)rtb);
            monitorexit(c);
            final Set g = value.g;
            if (g != null) {
                synchronized (c) {
                    final List p = or4.p2((Collection)fhq.g);
                    monitorexit(c);
                    int i;
                    for (i = 0, c = p; i < ((ArrayList)c).size(); ++i) {
                        ((gub)((ArrayList)c).get(i)).invoke((Object)g, (Object)value);
                    }
                }
            }
            return (T)t;
        }
    }
    
    public static final ahq g(final ahq ahq, final rtb<Object, oyv> rtb, final boolean b) {
        final boolean b2 = ahq instanceof kuh;
        Object o;
        if (!b2 && ahq != null) {
            o = new n0u(ahq, (rtb)rtb, b);
        }
        else {
            kuh kuh;
            if (b2) {
                kuh = (kuh)ahq;
            }
            else {
                kuh = null;
            }
            o = new m0u(kuh, rtb, null, false, b);
        }
        return (ahq)o;
    }
    
    public static final <T extends l8r> T h(final T t) {
        zzd.f((Object)t, "r");
        final ahq$a companion = ahq.Companion;
        Objects.requireNonNull(companion);
        final ahq j = j();
        Object o;
        if ((o = q(t, j.d(), j.e())) == null) {
            synchronized (fhq.c) {
                Objects.requireNonNull(companion);
                o = j();
                o = q(t, ((ahq)o).d(), ((ahq)o).e());
                monitorexit(fhq.c);
                if (o == null) {
                    p();
                    throw null;
                }
            }
        }
        return (T)o;
    }
    
    public static final <T extends l8r> T i(final T t, final ahq ahq) {
        zzd.f((Object)t, "r");
        final l8r q = q(t, ahq.d(), ahq.e());
        if (q != null) {
            return (T)q;
        }
        p();
        throw null;
    }
    
    public static final ahq j() {
        ahq ahq;
        if ((ahq = (ahq)fhq.b.e()) == null) {
            final z4c value = fhq.i.get();
            zzd.e((Object)value, "currentGlobalSnapshot.get()");
            ahq = (ahq)value;
        }
        return ahq;
    }
    
    public static final rtb<Object, oyv> k(final rtb<Object, oyv> rtb, rtb<Object, oyv> o, final boolean b) {
        Object o2;
        if (b) {
            o2 = o;
        }
        else {
            o2 = null;
        }
        if (rtb != null && o2 != null && !zzd.a((Object)rtb, o2)) {
            o = new fhq$b((rtb)rtb, (rtb)o2);
        }
        else if ((o = rtb) == null) {
            o = o2;
        }
        return (rtb<Object, oyv>)o;
    }
    
    public static final <T extends l8r> T l(final T t, final j8r j8r) {
        zzd.f((Object)t, "<this>");
        zzd.f((Object)j8r, "state");
        l8r l8r = j8r.l();
        final chq f = fhq.f;
        int e = fhq.e;
        if (f.a > 0) {
            e = ((int[])f.c)[0];
        }
        Objects.requireNonNull(dhq.Companion);
        final l8r l8r2 = null;
        l8r l8r3 = null;
        l8r b;
        while (true) {
            b = l8r2;
            if (l8r != null) {
                final int a = l8r.a;
                Label_0207: {
                    if (a != 0) {
                        boolean b2 = false;
                        Label_0179: {
                            if (a != 0 && a <= e - 1) {
                                final int n = a + 0;
                                if (!((n >= 0 && n < 64) ? ((1L << n & 0x0L) != 0x0L) : (n >= 64 && n < 128 && (1L << n - 64 & 0x0L) != 0x0L))) {
                                    b2 = true;
                                    break Label_0179;
                                }
                            }
                            b2 = false;
                        }
                        l8r l8r4 = l8r3;
                        if (b2) {
                            if (l8r3 == null) {
                                l8r4 = l8r;
                            }
                            else {
                                if (a < l8r3.a) {
                                    break Label_0207;
                                }
                                b = l8r3;
                                break;
                            }
                        }
                        l8r = l8r.b;
                        l8r3 = l8r4;
                        continue;
                    }
                }
                b = l8r;
                break;
            }
            break;
        }
        if (b != null) {
            b.a = Integer.MAX_VALUE;
        }
        else {
            b = t.b();
            b.a = Integer.MAX_VALUE;
            b.b = j8r.l();
            j8r.g(b);
        }
        return (T)b;
    }
    
    public static final <T extends l8r> T m(final T t, final j8r j8r, final ahq ahq) {
        zzd.f((Object)t, "<this>");
        zzd.f((Object)j8r, "state");
        final l8r l = l(t, j8r);
        l.a((l8r)t);
        l.a = ahq.d();
        return (T)l;
    }
    
    public static final void n(final ahq ahq, final j8r j8r) {
        zzd.f((Object)j8r, "state");
        final rtb h = ahq.h();
        if (h != null) {
            h.invoke((Object)j8r);
        }
    }
    
    public static final <T extends l8r> T o(final T t, final j8r j8r, final ahq ahq, final T t2) {
        zzd.f((Object)t, "<this>");
        zzd.f((Object)j8r, "state");
        if (ahq.g()) {
            ahq.m(j8r);
        }
        final int d = ahq.d();
        if (t2.a == d) {
            return t2;
        }
        final l8r l = l(t, j8r);
        l.a = d;
        ahq.m(j8r);
        return (T)l;
    }
    
    public static final Void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }
    
    public static final <T extends l8r> T q(T b, final int n, final dhq dhq) {
        l8r l8r = null;
        while (b != null) {
            final int a = b.a;
            final boolean b2 = a != 0 && a <= n && !dhq.i(a);
            l8r l8r2 = l8r;
            Label_0073: {
                if (b2) {
                    if (l8r != null) {
                        l8r2 = l8r;
                        if (l8r.a >= b.a) {
                            break Label_0073;
                        }
                    }
                    l8r2 = b;
                }
            }
            b = (T)b.b;
            l8r = l8r2;
        }
        if (l8r != null) {
            return (T)l8r;
        }
        return null;
    }
    
    public static final <T extends l8r> T r(final T t, j8r j8r) {
        zzd.f((Object)t, "<this>");
        zzd.f((Object)j8r, "state");
        final ahq$a companion = ahq.Companion;
        Objects.requireNonNull(companion);
        final ahq j = j();
        final rtb f = j.f();
        if (f != null) {
            f.invoke((Object)j8r);
        }
        if ((j8r = (j8r)q(t, j.d(), j.e())) == null) {
            synchronized (fhq.c) {
                Objects.requireNonNull(companion);
                j8r = (j8r)j();
                j8r = (j8r)q(t, ((ahq)j8r).d(), ((ahq)j8r).e());
                monitorexit(fhq.c);
                if (j8r == null) {
                    p();
                    throw null;
                }
            }
        }
        return (T)j8r;
    }
    
    public static final void s(final int b) {
        final chq f = fhq.f;
        int i = ((int[])f.e)[b];
        f.d(i, f.a - 1);
        --f.a;
        f.c(i);
        final int[] array = (int[])f.c;
        while (i < f.a >> 1) {
            final int n = i + 1 << 1;
            final int n2 = n - 1;
            if (n < f.a && array[n] < array[n2]) {
                if (array[n] >= array[i]) {
                    break;
                }
                f.d(n, i);
                i = n;
            }
            else {
                if (array[n2] >= array[i]) {
                    break;
                }
                f.d(n2, i);
                i = n2;
            }
        }
        ((int[])f.e)[b] = f.b;
        f.b = b;
    }
    
    public static final <T> T t(final ahq ahq, final rtb<? super dhq, ? extends T> rtb) {
        final Object invoke = rtb.invoke((Object)fhq.d.g(ahq.d()));
        synchronized (fhq.c) {
            final int e = fhq.e;
            fhq.e = e + 1;
            fhq.i.set(new z4c(e, fhq.d = fhq.d.g(ahq.d())));
            ahq.c();
            fhq.d = fhq.d.l(e);
            return (T)invoke;
        }
    }
    
    public static final <T extends l8r> T u(final T t, final j8r j8r, final ahq ahq) {
        zzd.f((Object)j8r, "state");
        if (ahq.g()) {
            ahq.m(j8r);
        }
        final l8r q = q(t, ahq.d(), ahq.e());
        if (q == null) {
            p();
            throw null;
        }
        if (q.a == ahq.d()) {
            return (T)q;
        }
        final l8r m = m(q, j8r, ahq);
        ahq.m(j8r);
        return (T)m;
    }
}
