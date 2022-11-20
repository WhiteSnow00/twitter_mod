import java.io.IOException;
import java.util.Objects;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qo7
{
    public static final zr2<qo7, a> w;
    public final String a;
    public final String b;
    public final String c;
    public final soj d;
    public final boolean e;
    public final long f;
    public final boolean g;
    public final List<exj> h;
    public final boolean i;
    public final boolean j;
    public final qs6 k;
    public final boolean l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final long p;
    public final long q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final List<kt6> u;
    public final fq6 v;
    
    static {
        qo7.w = new b();
    }
    
    public qo7(final a a) {
        this.a = a.d;
        this.b = a.f;
        this.c = a.e;
        this.d = a.c;
        this.e = a.m;
        this.f = a.o;
        this.g = a.h;
        Object h;
        if ((h = a.b) == null) {
            h = f2a.D0;
        }
        this.h = (List<exj>)h;
        this.i = a.g;
        this.j = a.k;
        this.k = a.a;
        this.l = a.l;
        this.m = a.n;
        this.n = a.j;
        this.o = a.i;
        this.p = a.p;
        this.q = a.q;
        this.r = a.r;
        this.u = a.s;
        this.s = a.t;
        this.t = a.u;
        this.v = a.v;
    }
    
    public final List<cgv> a() {
        return fq4.c((List)this.h, (jtb)qcv.v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof qo7)) {
                return b2;
            }
            final qo7 qo7 = (qo7)o;
            final boolean b3 = c5j.a((Object)this.a, (Object)qo7.a) && c5j.a((Object)this.b, (Object)qo7.b) && c5j.a((Object)this.c, (Object)qo7.c) && c5j.a((Object)this.d, (Object)qo7.d) && this.e == qo7.e && this.f == qo7.f && this.g == qo7.g && c5j.a((Object)this.h, (Object)qo7.h) && this.i == qo7.i && this.j == qo7.j && c5j.a((Object)this.k, (Object)qo7.k) && this.l == qo7.l && this.m == qo7.m && this.n == qo7.n && this.o == qo7.o && this.p == qo7.p && this.q == qo7.q && this.r == qo7.r && c5j.a((Object)this.u, (Object)qo7.u) && this.s == qo7.s && this.t == qo7.t && this.v == qo7.v;
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return c5j.p((Object)this.a, new Object[] { this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.u, this.s, this.t, this.v });
    }
    
    public static final class a extends n4j<qo7>
    {
        public qs6 a;
        public List<exj> b;
        public soj c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public long n;
        public long o;
        public long p;
        public long q;
        public int r;
        public List<kt6> s;
        public boolean t;
        public boolean u;
        public fq6 v;
        
        public a() {
        }
        
        public a(final qo7 qo7) {
            this.c = qo7.d;
            this.d = qo7.a;
            this.a = qo7.k;
            this.g = qo7.i;
            this.h = qo7.g;
            this.j = qo7.n;
            this.k = qo7.j;
            this.l = qo7.l;
            this.m = qo7.e;
            this.i = qo7.o;
            this.n = qo7.m;
            this.b = qo7.h;
            this.e = qo7.c;
            this.o = qo7.f;
            this.f = qo7.b;
            this.p = qo7.p;
            this.q = qo7.q;
            this.r = qo7.r;
            this.s = qo7.u;
            this.t = qo7.s;
            this.u = qo7.t;
            this.v = qo7.v;
        }
        
        public final Object i() {
            return new qo7(this);
        }
        
        public final boolean l() {
            return this.d != null && this.b != null;
        }
        
        public final void m() {
            final boolean h = this.h;
            final String s = null;
            String k0 = null;
            String l = s;
            if (!h) {
                l = s;
                if (!fq4.t((Collection)this.b)) {
                    if (this.b.size() != 2) {
                        l = s;
                    }
                    else {
                        final exj exj = this.b.get(0);
                        cgv i0;
                        if (exj != null) {
                            i0 = exj.I0;
                        }
                        else {
                            i0 = null;
                        }
                        if (i0 != null) {
                            k0 = i0.K0;
                        }
                        l = ikr.l(k0);
                    }
                }
            }
            this.e = l;
            if (this.s == null) {
                final gdd$b e0 = gdd.E0;
                final int a = c5j.a;
                this.s = (List<kt6>)e0;
            }
        }
    }
    
    public static final class b extends zr2<qo7, a>
    {
        public b() {
            super(9);
        }
        
        public final void f(wlp x, final Object o) throws IOException {
            final qo7 qo7 = (qo7)o;
            final wlp r = x.E(qo7.a).E(qo7.c).r(qo7.e).y(qo7.f).r(qo7.g);
            final List<exj> h = qo7.h;
            final vp4$a vp4$a = new vp4$a((rlp)exj.M0);
            Objects.requireNonNull(r);
            ((y4j)vp4$a).c(r, (Object)h);
            final int a = c5j.a;
            final wlp r2 = r.r(qo7.i).r(qo7.j);
            final qs6 k = qo7.k;
            final qs6$b i = qs6.i;
            Objects.requireNonNull(r2);
            ((y4j)i).c(r2, (Object)k);
            final wlp y = r2.E(qo7.b).r(qo7.l).y(qo7.m);
            final soj d = qo7.d;
            final soj.b d2 = soj.d;
            Objects.requireNonNull(y);
            ((y4j)d2).c(y, (Object)d);
            x = y.r(qo7.n).r(qo7.o).y(qo7.p).y(qo7.q).x(qo7.r);
            final List<kt6> u = qo7.u;
            final vp4$a vp4$a2 = new vp4$a((rlp)kt6.a);
            Objects.requireNonNull(x);
            ((y4j)vp4$a2).c(x, (Object)u);
            x.r(qo7.s).r(qo7.t).A((Object)qo7.v, (rlp)gq6.b);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            a.d = vlp.A();
            a.e = vlp.G();
            a.m = vlp.s();
            a.o = vlp.y();
            a.h = vlp.s();
            Object d0;
            if ((d0 = ((y4j)new vp4$a((rlp)exj.M0)).a(vlp)) == null) {
                d0 = f2a.D0;
            }
            a.b = (List<exj>)d0;
            a.g = vlp.s();
            a.k = vlp.s();
            a.a = (qs6)((y4j)qs6.i).a(vlp);
            if (n < 8) {
                vlp.G();
                vlp.G();
            }
            a.f = vlp.G();
            a.l = vlp.s();
            a.n = vlp.y();
            a.c = (soj)((y4j)soj.d).a(vlp);
            a.j = vlp.s();
            if (n < 1) {
                a.i = false;
            }
            else {
                a.i = vlp.s();
            }
            if (n < 2) {
                a.p = -1L;
            }
            else {
                a.p = vlp.y();
            }
            if (n < 9) {
                a.q = -1L;
            }
            else {
                a.q = vlp.y();
            }
            if (n < 3) {
                a.r = 0;
            }
            else {
                a.r = vlp.x();
            }
            if (n < 4) {
                a.s = null;
            }
            else {
                a.s = (List)((y4j)new vp4$a((rlp)kt6.a)).a(vlp);
            }
            if (n < 5) {
                a.t = false;
            }
            else {
                a.t = vlp.s();
            }
            if (n < 6) {
                a.u = false;
            }
            else {
                a.u = vlp.s();
            }
            if (n < 7) {
                a.v = null;
            }
            else {
                a.v = (fq6)gq6.b.a(vlp);
            }
        }
    }
}
