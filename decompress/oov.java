import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oov implements qnv
{
    public static final alp<oov> j;
    public final xwm a;
    public final snv b;
    public final int c;
    public final xwm d;
    public final snv e;
    public final List<lnv> f;
    public final vnv g;
    public final eov h;
    public final boolean i;
    
    static {
        oov.j = new oov.oov$b();
    }
    
    public oov(final a a) {
        final xwm a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        final snv b = a.b;
        pf8.r(b);
        this.b = b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        this.i = a.i;
        this.h = a.h;
    }
    
    @Override
    public final snv a() {
        return this.b;
    }
    
    @Override
    public final snv b() {
        return this.e;
    }
    
    public static final class a extends h4j<oov>
    {
        public xwm a;
        public snv b;
        public int c;
        public xwm d;
        public snv e;
        public List<lnv> f;
        public vnv g;
        public eov h;
        public boolean i;
        
        public final Object i() {
            return new oov(this);
        }
        
        public final boolean l() {
            return this.a != null && this.c != 0 && this.b != null;
        }
    }
}
