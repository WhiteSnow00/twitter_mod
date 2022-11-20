import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class riq
{
    public final qsb<nsb<fzv>, fzv> a;
    public final ftb<Set<?>, thq, fzv> b;
    public final qsb<Object, fzv> c;
    public final suh<a> d;
    public thq$a$a e;
    public boolean f;
    public a g;
    
    public riq(final qsb<? super nsb<fzv>, fzv> a) {
        this.a = (qsb<nsb<fzv>, fzv>)a;
        this.b = new riq$b(this);
        this.c = new riq$d(this);
        this.d = (suh<a>)new suh((Object[])new a[16]);
    }
    
    public final void a() {
        synchronized (this.d) {
            final suh<a> d = this.d;
            final int f0 = d.F0;
            if (f0 > 0) {
                final Object[] d2 = d.D0;
                czd.d((Object)d2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n = 0;
                do {
                    final a a = (a)d2[n];
                    a.e.c();
                    final v4d<Object, u4d> f2 = a.f;
                    f2.c = 0;
                    bt0.F0(f2.a, (Object)null);
                    bt0.F0(f2.b, (Object)null);
                    a.k.c();
                    a.l.clear();
                } while (++n < f0);
            }
        }
    }
    
    public final <T> a b(final qsb<? super T, fzv> qsb) {
        final suh<a> d = this.d;
        final int f0 = d.F0;
        Object o = null;
        Label_0081: {
            if (f0 > 0) {
                final Object[] d2 = d.D0;
                czd.d((Object)d2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n = 0;
                do {
                    o = d2[n];
                    if (((a)o).a == qsb) {
                        break Label_0081;
                    }
                } while (++n < f0);
            }
            o = null;
        }
        final a a = (a)o;
        if (a == null) {
            czd.d((Object)qsb, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ckv.e((Object)qsb, 1);
            final a a2 = new a((qsb<Object, fzv>)qsb);
            this.d.b((Object)a2);
            return a2;
        }
        return a;
    }
    
    public final <T> void c(final T b, final qsb<? super T, fzv> qsb, final nsb<fzv> nsb) {
        czd.f((Object)b, "scope");
        czd.f((Object)qsb, "onValueChangedForScope");
        czd.f((Object)nsb, "block");
        Object g = this.d;
        synchronized (g) {
            final a b2 = this.b((qsb<? super Object, fzv>)qsb);
            monitorexit(g);
            final boolean f = this.f;
            g = this.g;
            try {
                this.f = false;
                this.g = b2;
                final Object b3 = b2.b;
                final u4d c = b2.c;
                final int d = b2.d;
                b2.b = b;
                b2.c = (u4d)b2.f.b((Object)b);
                if (b2.d == -1) {
                    b2.d = yhq.j().d();
                }
                blz.R((qsb)b2.h, (qsb)b2.i, (nsb)new riq$c(this, (nsb)nsb));
                final Object b4 = b2.b;
                czd.c(b4);
                riq.a.a(b2, b4);
                b2.b = b3;
                b2.c = c;
                b2.d = d;
            }
            finally {
                this.g = (a)g;
                this.f = f;
            }
        }
    }
    
    public static final class a
    {
        public final qsb<Object, fzv> a;
        public Object b;
        public u4d c;
        public int d;
        public final z4d e;
        public final v4d<Object, u4d> f;
        public final w4d<Object> g;
        public final qsb<m8r<?>, fzv> h;
        public final qsb<m8r<?>, fzv> i;
        public int j;
        public final z4d k;
        public final HashMap<ap8<?>, Object> l;
        
        public a(final qsb<Object, fzv> a) {
            czd.f((Object)a, "onChanged");
            this.a = a;
            this.d = -1;
            this.e = new z4d();
            this.f = (v4d<Object, u4d>)new v4d();
            this.g = new w4d<Object>();
            this.h = new riq$a$a(this);
            this.i = new riq$a$b(this);
            this.k = new z4d();
            this.l = new HashMap<ap8<?>, Object>();
        }
        
        public static final void a(final a a, final Object o) {
            final u4d c = a.c;
            if (c != null) {
                final int a2 = c.a;
                int i = 0;
                int a3 = 0;
                while (i < a2) {
                    final Object o2 = c.b[i];
                    czd.d(o2, "null cannot be cast to non-null type kotlin.Any");
                    final int n = c.c[i];
                    final boolean b = n != a.d;
                    if (b) {
                        a.d(o, o2);
                    }
                    int n2 = a3;
                    if (!b) {
                        if (a3 != i) {
                            c.b[a3] = o2;
                            c.c[a3] = n;
                        }
                        n2 = a3 + 1;
                    }
                    ++i;
                    a3 = n2;
                }
                for (int a4 = c.a, j = a3; j < a4; ++j) {
                    c.b[j] = null;
                }
                c.a = a3;
            }
        }
        
        public final boolean b(final Set<?> set) {
            czd.f((Object)set, "changes");
            final Iterator<?> iterator = set.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                boolean b2 = b;
                if (this.k.d(next)) {
                    final z4d k = this.k;
                    final int e = k.e(next);
                    b2 = b;
                    if (e >= 0) {
                        final w4d a = z4d.a(k, e);
                        final int d0 = a.D0;
                        int n = 0;
                        while (true) {
                            b2 = b;
                            if (n >= d0) {
                                break;
                            }
                            final ap8 ap8 = a.get(n);
                            final Object value = this.l.get(ap8);
                            Object o;
                            if ((o = ap8.a()) == null) {
                                o = mlr.a;
                            }
                            boolean b3 = b;
                            if (!((hiq)o).b(ap8.c(), value)) {
                                final z4d e2 = this.e;
                                final int e3 = e2.e((Object)ap8);
                                b3 = b;
                                if (e3 >= 0) {
                                    final w4d a2 = z4d.a(e2, e3);
                                    final int d2 = a2.D0;
                                    int n2 = 0;
                                    while (true) {
                                        b3 = b;
                                        if (n2 >= d2) {
                                            break;
                                        }
                                        this.g.add(a2.get(n2));
                                        ++n2;
                                        b = true;
                                    }
                                }
                            }
                            ++n;
                            b = b3;
                        }
                    }
                }
                final z4d e4 = this.e;
                final int e5 = e4.e(next);
                b = b2;
                if (e5 >= 0) {
                    final w4d a3 = z4d.a(e4, e5);
                    final int d3 = a3.D0;
                    int i = 0;
                    b = b2;
                    while (i < d3) {
                        this.g.add(a3.get(i));
                        ++i;
                        b = true;
                    }
                }
            }
            return b;
        }
        
        public final void c(final Object o) {
            czd.f(o, "value");
            if (this.j > 0) {
                return;
            }
            final Object b = this.b;
            czd.c(b);
            u4d c;
            if ((c = this.c) == null) {
                c = new u4d();
                this.c = c;
                this.f.c(b, (Object)c);
            }
            final int a = c.a(o, this.d);
            if (o instanceof ap8 && a != this.d) {
                final ap8 ap8 = (ap8)o;
                final Object[] f = ap8.f();
                for (int i = 0; i < f.length; ++i) {
                    final Object o2 = f[i];
                    if (o2 == null) {
                        break;
                    }
                    this.k.b(o2, o);
                }
                this.l.put((ap8<?>)o, ap8.c());
            }
            if (a == -1) {
                this.e.b(o, b);
            }
        }
        
        public final void d(final Object o, final Object o2) {
            this.e.f(o2, o);
            if (o2 instanceof ap8 && !this.e.d(o2)) {
                this.k.g(o2);
                this.l.remove(o2);
            }
        }
        
        public final void e(final qsb<Object, Boolean> qsb) {
            final v4d<Object, u4d> f = this.f;
            final int c = f.c;
            int i = 0;
            int c2 = 0;
            while (i < c) {
                final Object o = f.a[i];
                czd.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                final u4d u4d = (u4d)f.b[i];
                final Boolean b = (Boolean)((brj)qsb).invoke(o);
                if (b) {
                    for (int a = u4d.a, j = 0; j < a; ++j) {
                        final Object o2 = u4d.b[j];
                        czd.d(o2, "null cannot be cast to non-null type kotlin.Any");
                        final int n = u4d.c[j];
                        this.d(o, o2);
                    }
                }
                int n2 = c2;
                if (!b) {
                    if (c2 != i) {
                        f.a[c2] = o;
                        final Object[] b2 = f.b;
                        b2[c2] = b2[i];
                    }
                    n2 = c2 + 1;
                }
                ++i;
                c2 = n2;
            }
            final int c3 = f.c;
            if (c3 > c2) {
                for (int k = c2; k < c3; ++k) {
                    f.a[k] = null;
                    f.b[k] = null;
                }
                f.c = c2;
            }
        }
    }
}
