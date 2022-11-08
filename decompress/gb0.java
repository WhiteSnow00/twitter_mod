import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gb0
{
    public static final alp<gb0> d;
    public final String a;
    public final String b;
    public final int c;
    
    static {
        gb0.d = new a();
    }
    
    public gb0(final b b) {
        final String a = b.a;
        pf8.r(a);
        this.a = a;
        final String b2 = b.b;
        pf8.r(b2);
        this.b = b2;
        this.c = b.c;
    }
    
    public static final class a extends js2<gb0, b>
    {
        public a() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final gb0 gb0 = (gb0)o;
            flp.G(gb0.a);
            flp.G(gb0.b);
            flp.z(gb0.c);
        }
        
        public final h4j g() {
            return new b();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final b b = (b)h4j;
            b.a = elp.I();
            b.b = elp.I();
            b.c = elp.z();
        }
    }
    
    public static final class b extends h4j<gb0>
    {
        public String a;
        public String b;
        public int c;
        
        public final Object i() {
            return new gb0(this);
        }
        
        public final boolean l() {
            return this.a != null && this.b != null;
        }
    }
}
