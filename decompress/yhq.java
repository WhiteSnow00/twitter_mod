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

public final class yhq
{
    public static final qsb<whq, fzv> a;
    public static final i99 b;
    public static final Object c;
    public static whq d;
    public static int e;
    public static final vhq f;
    public static final List<ftb<Set<?>, thq, fzv>> g;
    public static final List<qsb<Object, fzv>> h;
    public static final AtomicReference<b4c> i;
    public static final thq j;
    
    static {
        yhq.a = yhq$a.D0;
        b = new i99(1);
        c = new Object();
        Objects.requireNonNull(whq.Companion);
        final whq whq = yhq.d = whq.H0;
        yhq.e = 1;
        f = new vhq();
        yhq.g = new ArrayList();
        yhq.h = new ArrayList();
        final int e = yhq.e;
        yhq.e = e + 1;
        final b4c b4c = new b4c(e, whq);
        yhq.d = yhq.d.l(((thq)b4c).b);
        final b4c value = (i = new AtomicReference<b4c>(b4c)).get();
        czd.e((Object)value, "currentGlobalSnapshot.get()");
        j = (thq)value;
    }
    
    public static final void a() {
        f((qsb<? super whq, ?>)xhq.D0);
    }
    
    public static final qsb b(final qsb qsb, final qsb qsb2) {
        Object o;
        if (qsb != null && qsb2 != null && !czd.a((Object)qsb, (Object)qsb2)) {
            o = new zhq((qsb<Object, fzv>)qsb, (qsb<Object, fzv>)qsb2);
        }
        else if ((o = qsb) == null) {
            o = qsb2;
        }
        return (qsb)o;
    }
    
    public static final Map c(final ouh ouh, final ouh ouh2, final whq whq) {
        final Set v = ouh2.v();
        final int d = ((thq)ouh).d();
        final Map map = null;
        Map map2;
        if (v == null) {
            map2 = map;
        }
        else {
            final whq j = ((thq)ouh2).e().l(((thq)ouh2).d()).j(ouh2.h);
            final Iterator iterator = v.iterator();
            Map map3 = null;
            while (iterator.hasNext()) {
                final f9r f9r = (f9r)iterator.next();
                final h9r l = f9r.l();
                final h9r q = q(l, d, whq);
                if (q == null) {
                    continue;
                }
                final h9r q2 = q(l, d, j);
                if (q2 == null) {
                    continue;
                }
                if (czd.a((Object)q, (Object)q2)) {
                    continue;
                }
                final h9r q3 = q(l, ((thq)ouh2).d(), ((thq)ouh2).e());
                if (q3 == null) {
                    p();
                    throw null;
                }
                final h9r o = f9r.o(q2, q, q3);
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
    
    public static final void d(final thq thq) {
        if (yhq.d.i(thq.d())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }
    
    public static final whq e(whq l, int i, final int n) {
        czd.f((Object)l, "<this>");
        while (i < n) {
            l = l.l(i);
            ++i;
        }
        return l;
    }
    
    public static final <T> T f(final qsb<? super whq, ? extends T> qsb) {
        final thq j = yhq.j;
        czd.d((Object)j, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        final b4c b4c = (b4c)j;
        Object c = yhq.c;
        synchronized (c) {
            final b4c value = yhq.i.get();
            czd.e((Object)value, "currentGlobalSnapshot.get()");
            final Object t = t((thq)value, (qsb<? super whq, ?>)qsb);
            monitorexit(c);
            final Set g = value.g;
            if (g != null) {
                synchronized (c) {
                    final List p = mq4.P0((Collection)yhq.g);
                    monitorexit(c);
                    int i;
                    for (i = 0, c = p; i < ((ArrayList)c).size(); ++i) {
                        ((ftb)((ArrayList)c).get(i)).invoke((Object)g, (Object)value);
                    }
                }
            }
            return (T)t;
        }
    }
    
    public static final thq g(final thq thq, final qsb<Object, fzv> qsb, final boolean b) {
        final boolean b2 = thq instanceof ouh;
        Object o;
        if (!b2 && thq != null) {
            o = new d1u(thq, (qsb)qsb, b);
        }
        else {
            ouh ouh;
            if (b2) {
                ouh = (ouh)thq;
            }
            else {
                ouh = null;
            }
            o = new c1u(ouh, (qsb)qsb, (qsb)null, false, b);
        }
        return (thq)o;
    }
    
    public static final <T extends h9r> T h(final T t) {
        czd.f((Object)t, "r");
        final thq$a companion = thq.Companion;
        Objects.requireNonNull(companion);
        final thq j = j();
        Object o;
        if ((o = q(t, j.d(), j.e())) == null) {
            synchronized (yhq.c) {
                Objects.requireNonNull(companion);
                o = j();
                o = q(t, ((thq)o).d(), ((thq)o).e());
                monitorexit(yhq.c);
                if (o == null) {
                    p();
                    throw null;
                }
            }
        }
        return (T)o;
    }
    
    public static final <T extends h9r> T i(final T t, final thq thq) {
        czd.f((Object)t, "r");
        final h9r q = q(t, thq.d(), thq.e());
        if (q != null) {
            return (T)q;
        }
        p();
        throw null;
    }
    
    public static final thq j() {
        thq thq;
        if ((thq = (thq)yhq.b.g()) == null) {
            final b4c value = yhq.i.get();
            czd.e((Object)value, "currentGlobalSnapshot.get()");
            thq = (thq)value;
        }
        return thq;
    }
    
    public static final qsb<Object, fzv> k(final qsb<Object, fzv> qsb, qsb<Object, fzv> qsb2, final boolean b) {
        if (!b) {
            qsb2 = null;
        }
        Object o;
        if (qsb != null && qsb2 != null && !czd.a((Object)qsb, (Object)qsb2)) {
            o = new qsb<Object, fzv>(qsb, qsb2) {
                public final qsb<Object, fzv> D0;
                public final qsb<Object, fzv> E0;
                
                public final Object invoke(final Object o) {
                    czd.f(o, "state");
                    this.D0.invoke(o);
                    this.E0.invoke(o);
                    return fzv.a;
                }
            };
        }
        else if ((o = qsb) == null) {
            o = qsb2;
        }
        return (qsb<Object, fzv>)o;
    }
    
    public static final <T extends h9r> T l(final T t, final f9r f9r) {
        czd.f((Object)t, "<this>");
        czd.f((Object)f9r, "state");
        h9r h9r = f9r.l();
        final vhq f = yhq.f;
        int e = yhq.e;
        if (f.a > 0) {
            e = f.b[0];
        }
        Objects.requireNonNull(whq.Companion);
        final h9r h9r2 = null;
        h9r h9r3 = null;
        h9r b;
        while (true) {
            b = h9r2;
            if (h9r != null) {
                final int a = h9r.a;
                Label_0198: {
                    if (a != 0) {
                        boolean b2 = false;
                        Label_0168: {
                            if (a != 0 && a <= e - 1) {
                                final int n = a + 0;
                                if (!((n >= 0 && n < 64) ? ((1L << n & 0x0L) != 0x0L) : (n >= 64 && n < 128 && (1L << n - 64 & 0x0L) != 0x0L))) {
                                    b2 = true;
                                    break Label_0168;
                                }
                            }
                            b2 = false;
                        }
                        h9r h9r4 = h9r3;
                        if (b2) {
                            if (h9r3 == null) {
                                h9r4 = h9r;
                            }
                            else {
                                if (a < h9r3.a) {
                                    break Label_0198;
                                }
                                b = h9r3;
                                break;
                            }
                        }
                        h9r = h9r.b;
                        h9r3 = h9r4;
                        continue;
                    }
                }
                b = h9r;
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
            b.b = f9r.l();
            f9r.g(b);
        }
        return (T)b;
    }
    
    public static final <T extends h9r> T m(final T t, final f9r f9r, final thq thq) {
        czd.f((Object)t, "<this>");
        czd.f((Object)f9r, "state");
        final h9r l = l(t, f9r);
        l.a(t);
        l.a = thq.d();
        return (T)l;
    }
    
    public static final void n(final thq thq, final f9r f9r) {
        czd.f((Object)f9r, "state");
        final qsb h = thq.h();
        if (h != null) {
            h.invoke((Object)f9r);
        }
    }
    
    public static final <T extends h9r> T o(final T t, final f9r f9r, final thq thq, final T t2) {
        czd.f((Object)t, "<this>");
        czd.f((Object)f9r, "state");
        if (thq.g()) {
            thq.m(f9r);
        }
        final int d = thq.d();
        if (t2.a == d) {
            return t2;
        }
        final h9r l = l(t, f9r);
        l.a = d;
        thq.m(f9r);
        return (T)l;
    }
    
    public static final Void p() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }
    
    public static final <T extends h9r> T q(T b, final int n, final whq whq) {
        h9r h9r = null;
        while (b != null) {
            final int a = b.a;
            final boolean b2 = a != 0 && a <= n && !whq.i(a);
            h9r h9r2 = h9r;
            Label_0071: {
                if (b2) {
                    if (h9r != null) {
                        h9r2 = h9r;
                        if (h9r.a >= b.a) {
                            break Label_0071;
                        }
                    }
                    h9r2 = b;
                }
            }
            b = (T)b.b;
            h9r = h9r2;
        }
        if (h9r != null) {
            return (T)h9r;
        }
        return null;
    }
    
    public static final <T extends h9r> T r(final T t, f9r f9r) {
        czd.f((Object)t, "<this>");
        czd.f((Object)f9r, "state");
        final thq$a companion = thq.Companion;
        Objects.requireNonNull(companion);
        final thq j = j();
        final qsb f = j.f();
        if (f != null) {
            f.invoke((Object)f9r);
        }
        if ((f9r = (f9r)q(t, j.d(), j.e())) == null) {
            synchronized (yhq.c) {
                Objects.requireNonNull(companion);
                f9r = (f9r)j();
                f9r = (f9r)q(t, ((thq)f9r).d(), ((thq)f9r).e());
                monitorexit(yhq.c);
                if (f9r == null) {
                    p();
                    throw null;
                }
            }
        }
        return (T)f9r;
    }
    
    public static final void s(final int e) {
        final vhq f = yhq.f;
        int i = f.d[e];
        f.c(i, f.a - 1);
        --f.a;
        f.b(i);
        final int[] b = f.b;
        while (i < f.a >> 1) {
            final int n = i + 1 << 1;
            final int n2 = n - 1;
            if (n < f.a && b[n] < b[n2]) {
                if (b[n] >= b[i]) {
                    break;
                }
                f.c(n, i);
                i = n;
            }
            else {
                if (b[n2] >= b[i]) {
                    break;
                }
                f.c(n2, i);
                i = n2;
            }
        }
        f.d[e] = f.e;
        f.e = e;
    }
    
    public static final <T> T t(final thq thq, final qsb<? super whq, ? extends T> qsb) {
        final Object invoke = qsb.invoke((Object)yhq.d.g(thq.d()));
        synchronized (yhq.c) {
            final int e = yhq.e;
            yhq.e = e + 1;
            yhq.i.set(new b4c(e, yhq.d = yhq.d.g(thq.d())));
            thq.c();
            yhq.d = yhq.d.l(e);
            return (T)invoke;
        }
    }
    
    public static final <T extends h9r> T u(final T t, final f9r f9r, final thq thq) {
        czd.f((Object)f9r, "state");
        if (thq.g()) {
            thq.m(f9r);
        }
        final h9r q = q(t, thq.d(), thq.e());
        if (q == null) {
            p();
            throw null;
        }
        if (q.a == thq.d()) {
            return (T)q;
        }
        final h9r m = m(q, f9r, thq);
        thq.m(f9r);
        return (T)m;
    }
}
