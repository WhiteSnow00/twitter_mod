import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lz8
{
    public static final alp<lz8> c;
    public final String a;
    public final List<String> b;
    
    static {
        lz8.c = new a();
    }
    
    public lz8(final String a, final List<String> b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a extends s4j<lz8>
    {
        public a() {
            super(1);
        }
        
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            final String i = elp.I();
            List d;
            if (n < 1) {
                d = xq4.d(elp, (alp)hx6.f);
            }
            else {
                d = (List)t4a.i(hx6.f, elp);
            }
            pf8.r(i);
            pf8.r(d);
            return new lz8(i, d);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final lz8 lz8 = (lz8)o;
            flp.G(lz8.a);
            pn.F(hx6.f, flp, lz8.b);
            final int a = w4j.a;
        }
    }
}
