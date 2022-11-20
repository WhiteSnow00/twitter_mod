import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e0p
{
    public static final rlp<e0p> l;
    public String a;
    public String b;
    public double c;
    public double d;
    public String e;
    public int f;
    public int g;
    public int h;
    public String i;
    public String j;
    public long k;
    
    static {
        e0p.l = new b();
    }
    
    public e0p() {
        this.c = Double.NaN;
        this.d = Double.NaN;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.k = -1L;
    }
    
    public e0p(final e0p$a e0p$a) {
        this.c = Double.NaN;
        this.d = Double.NaN;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.k = -1L;
        this.a = e0p$a.a;
        this.b = e0p$a.b;
        this.c = e0p$a.c;
        this.d = e0p$a.d;
        this.e = e0p$a.e;
        this.f = e0p$a.f;
        this.g = e0p$a.g;
        this.h = e0p$a.h;
        this.i = e0p$a.i;
        this.j = e0p$a.j;
        this.k = e0p$a.k;
    }
    
    public static final class b extends zr2<e0p, e0p$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final e0p e0p = (e0p)o;
            wlp.E(e0p.a);
            wlp.E(e0p.b);
            wlp.v(e0p.c);
            wlp.v(e0p.d);
            wlp.E(e0p.e);
            wlp.x(e0p.f);
            wlp.x(e0p.g);
            wlp.x(e0p.h);
            wlp.E(e0p.i);
            wlp.E(e0p.j);
            wlp.y(e0p.k);
        }
        
        public final n4j g() {
            return (n4j)new e0p$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final e0p$a e0p$a = (e0p$a)n4j;
            e0p$a.a = vlp.G();
            e0p$a.b = vlp.G();
            e0p$a.c = vlp.v();
            e0p$a.d = vlp.v();
            e0p$a.e = vlp.G();
            e0p$a.f = vlp.x();
            e0p$a.g = vlp.x();
            e0p$a.h = vlp.x();
            e0p$a.i = vlp.G();
            e0p$a.j = vlp.G();
            e0p$a.k = vlp.y();
        }
    }
}
