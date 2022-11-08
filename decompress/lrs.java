import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrs
{
    public static final alp<lrs> k;
    public final ax a;
    public final ww b;
    public final long c;
    public final long d;
    public final long e;
    public final ors f;
    public final krs g;
    public final prs h;
    public final List<hfv> i;
    public final xwm j;
    
    static {
        lrs.k = new b();
    }
    
    public lrs(final ax a, final ww b, final long c, final long d, final long e, final List<hfv> i, final xwm j, final ors f, final krs g, final prs h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final List<String> a() {
        return c6e.k((Iterable)new l5e((Iterable)this.i, (kub)ahr.A));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof lrs)) {
                return b2;
            }
            final lrs lrs = (lrs)o;
            final boolean b3 = this == lrs || (lrs != null && w4j.a((Object)this.a, (Object)lrs.a) && w4j.a((Object)this.b, (Object)lrs.b) && this.c == lrs.c && this.d == lrs.d && this.e == lrs.e && this.i.equals(lrs.i) && this.g.a(lrs.g) && this.f.a(lrs.f) && w4j.a((Object)this.h, (Object)lrs.h));
            final xwm j = this.j;
            boolean b4 = false;
            Label_0244: {
                Label_0241: {
                    Label_0235: {
                        if (j != null) {
                            final xwm i = lrs.j;
                            if (i != null) {
                                if (b3 && j.C0.equals(i.C0)) {
                                    break Label_0235;
                                }
                                break Label_0241;
                            }
                        }
                        if (!b3 || j != lrs.j) {
                            break Label_0241;
                        }
                    }
                    b4 = true;
                    break Label_0244;
                }
                b4 = false;
            }
            b2 = b;
            if (!b4) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.h) + (this.g.hashCode() + (this.f.hashCode() + (w4j.f((Object)this.j) + (w4j.q((List)this.i) + jhd.j(this.e, jhd.j(this.d, jhd.j(this.c, (w4j.f((Object)this.b) + w4j.f((Object)this.a) * 31) * 31, 31), 31), 31)) * 31) * 31) * 31) * 31;
    }
    
    public static final class b extends s4j<lrs>
    {
        public b() {
            super(2);
        }
        
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            final hx6$h a = hx6.a;
            final ix6 ix6 = new ix6((Class)ax.class);
            Objects.requireNonNull(elp);
            final Object a2 = ((s4j)ix6).a(elp);
            pf8.r(a2);
            final ax ax = (ax)a2;
            if (n < 1) {
                elp.C();
            }
            final long a3 = elp.A();
            final long a4 = elp.A();
            final long a5 = elp.A();
            final xwm xwm = (xwm)((s4j)xwm.F0).a(elp);
            final ors ors = (ors)((s4j)ors.d).a(elp);
            final Object a6 = ((s4j)krs.d).a(elp);
            pf8.r(a6);
            final krs krs = (krs)a6;
            List d;
            if (n < 2) {
                d = xq4.d(elp, (alp)hfv.M1);
            }
            else {
                d = (List)((s4j)new xq4$a((alp)hfv.M1)).a(elp);
            }
            final Object a7 = ((s4j)new ix6((Class)ww.class)).a(elp);
            pf8.r(a7);
            final ww ww = (ww)a7;
            final prs prs = (prs)((s4j)prs.b).a(elp);
            pf8.r(d);
            return new lrs(ax, ww, a3, a4, a5, d, xwm, ors, krs, prs);
        }
        
        public final void f(flp a, final Object o) throws IOException {
            final lrs lrs = (lrs)o;
            final ax a2 = lrs.a;
            final hx6$h a3 = hx6.a;
            final ix6 ix6 = new ix6((Class)ax.class);
            Objects.requireNonNull(a);
            ((s4j)ix6).c(a, (Object)a2);
            final int a4 = w4j.a;
            a = a.A(lrs.c).A(lrs.d).A(lrs.e);
            final xwm j = lrs.j;
            final xwm$c f0 = xwm.F0;
            Objects.requireNonNull(a);
            ((s4j)f0).c(a, (Object)j);
            ((s4j)ors.d).c(a, (Object)lrs.f);
            ((s4j)krs.d).c(a, (Object)lrs.g);
            ((s4j)new xq4$a((alp)hfv.M1)).c(a, (Object)lrs.i);
            ((s4j)new ix6((Class)ww.class)).c(a, (Object)lrs.b);
            a.C((Object)lrs.h, (alp)prs.b);
        }
    }
}
