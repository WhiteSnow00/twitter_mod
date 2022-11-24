import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class piq
{
    public static final a Companion;
    public siq a;
    public int b;
    public boolean c;
    public int d;
    
    static {
        Companion = new a();
    }
    
    public piq(int n, siq e) {
        this.a = e;
        this.b = n;
        Label_0141: {
            if (n != 0) {
                e = this.e();
                final uiq$a a = uiq.a;
                e0e.f((Object)e, "invalid");
                final int[] i0 = e.I0;
                Label_0111: {
                    if (i0 != null) {
                        n = i0[0];
                    }
                    else {
                        final long g0 = e.G0;
                        int n2;
                        if (g0 != 0L) {
                            n = e.H0;
                            n2 = lp7.e(g0);
                        }
                        else {
                            final long f0 = e.F0;
                            if (f0 == 0L) {
                                break Label_0111;
                            }
                            n = e.H0 + 64;
                            n2 = lp7.e(f0);
                        }
                        n += n2;
                    }
                }
                synchronized (uiq.c) {
                    n = uiq.f.a(n);
                    break Label_0141;
                }
            }
            n = -1;
        }
        this.d = n;
    }
    
    public final void a() {
        synchronized (uiq.c) {
            this.b();
            this.o();
        }
    }
    
    public void b() {
        uiq.d = uiq.d.g(this.d());
    }
    
    public void c() {
        this.c = true;
        synchronized (uiq.c) {
            this.n();
        }
    }
    
    public int d() {
        return this.b;
    }
    
    public siq e() {
        return this.a;
    }
    
    public abstract stb<Object, vzv> f();
    
    public abstract boolean g();
    
    public abstract stb<Object, vzv> h();
    
    public final piq i() {
        final gz b = uiq.b;
        final piq piq = (piq)b.f();
        b.h(this);
        return piq;
    }
    
    public abstract void j(final piq p0);
    
    public abstract void k(final piq p0);
    
    public abstract void l();
    
    public abstract void m(final ear p0);
    
    public final void n() {
        final int d = this.d;
        if (d >= 0) {
            uiq.s(d);
            this.d = -1;
        }
    }
    
    public void o() {
        this.n();
    }
    
    public final void p(final piq piq) {
        uiq.b.h(piq);
    }
    
    public void q(final int b) {
        this.b = b;
    }
    
    public void r(final siq a) {
        e0e.f((Object)a, "<set-?>");
        this.a = a;
    }
    
    public abstract piq s(final stb<Object, vzv> p0);
    
    public static final class a
    {
        public final piq a() {
            return uiq.g((piq)uiq.b.f(), (stb)null, false);
        }
        
        public final void b() {
            uiq.j().l();
        }
        
        public final <T> T c(stb<Object, vzv> s, final stb<Object, vzv> stb, ptb<? extends T> i) {
            e0e.f((Object)stb, "block");
            if (s == null) {
                return (T)((ptb)stb).invoke();
            }
            final piq piq = (piq)uiq.b.f();
            if (piq != null && !(piq instanceof evh)) {
                if (s == null) {
                    return (T)((ptb)stb).invoke();
                }
                s = piq.s((stb<Object, vzv>)s);
            }
            else {
                evh evh;
                if (piq instanceof evh) {
                    evh = (evh)piq;
                }
                else {
                    evh = null;
                }
                s = new v1u(evh, (stb)s, (stb)null, true, false);
            }
            try {
                i = ((piq)s).i();
                try {
                    return (T)((ptb)stb).invoke();
                }
                finally {
                    ((piq)s).p(i);
                }
            }
            finally {
                ((piq)s).c();
            }
        }
        
        public final qcj d(final hub<? super Set<?>, ? super piq, vzv> hub) {
            e0e.f((Object)hub, "observer");
            final uiq$a a = uiq.a;
            uiq.f((stb)uiq.a);
            synchronized (uiq.c) {
                uiq.g.add(hub);
                monitorexit(uiq.c);
                return (qcj)new piq$a$a((hub)hub);
            }
        }
        
        public final void e() {
            synchronized (uiq.c) {
                final Set<ear> g = ((evh)uiq.i.get()).g;
                int n = 0;
                if (g != null) {
                    final boolean empty = g.isEmpty();
                    n = n;
                    if (empty ^ true) {
                        n = 1;
                    }
                }
                monitorexit(uiq.c);
                if (n != 0) {
                    uiq.a();
                }
            }
        }
        
        public final evh f(final stb<Object, vzv> stb, final stb<Object, vzv> stb2) {
            final piq j = uiq.j();
            evh evh;
            if (j instanceof evh) {
                evh = (evh)j;
            }
            else {
                evh = null;
            }
            if (evh != null) {
                final evh z = evh.z(stb, stb2);
                if (z != null) {
                    return z;
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
    }
}
