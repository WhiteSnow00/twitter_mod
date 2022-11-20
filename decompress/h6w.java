import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public class h6w extends m6a implements Comparable<m6a>
{
    public static final rlp<h6w> L0;
    public static final rlp<y6a<h6w>> M0;
    public final String I0;
    public final String J0;
    public final String K0;
    
    static {
        final h6w.h6w$d h6w$d = h6w.L0 = new h6w.h6w$d();
        final y6a e0 = y6a.E0;
        h6w.M0 = new y6a$c((rlp)h6w$d);
    }
    
    public h6w(final a a) {
        super((m6a$a)a);
        String d;
        if ((d = a.d) == null) {
            d = "";
        }
        this.I0 = d;
        final String e = a.e;
        if (e != null) {
            d = e;
        }
        this.J0 = d;
        final String f = a.f;
        if (f != null) {
            d = f;
        }
        this.K0 = d;
    }
    
    public final int compareTo(final Object o) {
        return m6a.H0.compare(this, o);
    }
    
    public boolean equals(final Object o) {
        return this == o || (o instanceof h6w && this.i((h6w)o));
    }
    
    public /* bridge */ m6a$a g() {
        return this.j();
    }
    
    public int hashCode() {
        return c5j.g((Object)this.I0, (Object)(super.D0 * 31));
    }
    
    public final boolean i(final h6w h6w) {
        return this == h6w || (this.f((m6a)h6w) && c5j.a((Object)this.I0, (Object)h6w.I0));
    }
    
    public a j() {
        return (a)new h6w.h6w$c(this);
    }
    
    public final String toString() {
        return this.K0;
    }
    
    public abstract static class a<E extends h6w, B extends a<E, B>> extends m6a$a<E, B>
    {
        public String d;
        public String e;
        public String f;
        
        public a() {
        }
        
        public a(final h6w h6w) {
            super((m6a)h6w);
            this.d = h6w.I0;
            this.e = h6w.J0;
            this.f = h6w.K0;
        }
        
        public final void m() {
            super.m();
            if (this.d == null) {
                this.d = "";
            }
            if (this.e == null) {
                this.e = this.d;
            }
            if (this.f == null) {
                this.f = this.e;
            }
            final int b = super.b;
            if (b != -1 && super.c == -1) {
                super.c = this.d.length() + b;
            }
        }
    }
    
    public abstract static class b<E extends h6w, B extends a<E, B>> extends m6a.b<E, B>
    {
        public b() {
            super(10);
        }
        
        public /* bridge */ void f(final wlp wlp, final Object o) throws IOException {
            this.l(wlp, (h6w)o);
        }
        
        public /* bridge */ void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            this.k(vlp, (B)n4j, n);
        }
        
        public void k(final vlp vlp, final B b, final int n) throws IOException, ClassNotFoundException {
            this.i(vlp, b, n);
            b.d = vlp.A();
            final int a = c5j.a;
            b.e = vlp.A();
            b.f = vlp.A();
            if (n == 2) {
                vlp.x();
                vlp.x();
            }
        }
        
        public void l(final wlp wlp, final E e) throws IOException {
            this.j(wlp, e);
            wlp.E(e.I0).E(e.J0).E(e.K0);
        }
    }
}
