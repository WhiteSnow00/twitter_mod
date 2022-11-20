import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4h extends m6a implements Comparable<m6a>
{
    public static final rlp<i4h> L0;
    public static final rlp<y6a<i4h>> M0;
    public final long I0;
    public final String J0;
    public final String K0;
    
    static {
        final b b = i4h.L0 = new b();
        final y6a e0 = y6a.E0;
        i4h.M0 = new y6a$c((rlp)b);
    }
    
    public i4h(final a a) {
        super((m6a$a)a);
        this.I0 = a.d;
        String e;
        if ((e = a.e) == null) {
            e = "";
        }
        this.J0 = e;
        this.K0 = a.f;
    }
    
    public final int compareTo(final Object o) {
        return m6a.H0.compare(this, o);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof i4h)) {
                return b2;
            }
            final i4h i4h = (i4h)o;
            final boolean b3 = this == i4h || (this.f((m6a)i4h) && this.I0 == i4h.I0);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final m6a$a g() {
        return new a(this);
    }
    
    public final int hashCode() {
        return c5j.g((Object)this.I0, (Object)(super.D0 * 31));
    }
    
    public static final class a extends m6a$a<i4h, a>
    {
        public long d;
        public String e;
        public String f;
        
        public a() {
        }
        
        public a(final i4h i4h) {
            super((m6a)i4h);
            this.d = i4h.I0;
            this.e = i4h.J0;
            this.f = i4h.K0;
        }
        
        public final Object i() {
            return new i4h(this);
        }
        
        public final void m() {
            super.m();
            final int b = super.b;
            if (b != -1 && super.c == -1) {
                final String e = this.e;
                if (e != null) {
                    super.c = e.length() + b + 1;
                }
            }
        }
    }
    
    public static final class b extends m6a.b<i4h, a>
    {
        public b() {
            super(4);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final i4h i4h = (i4h)o;
            ((m6a.b<i4h, B>)this).j(wlp, i4h);
            wlp.y(i4h.I0).E(i4h.J0).E(i4h.K0);
        }
        
        public final n4j g() {
            return (n4j)new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            ((m6a.b<E, a>)this).i(vlp, a, n);
            a.d = vlp.y();
            a.e = vlp.A();
            a.f = vlp.G();
            if (n == 3) {
                vlp.s();
            }
        }
    }
}
