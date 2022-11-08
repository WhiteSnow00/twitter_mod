import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzo extends kkg
{
    public static final alp<yzo> b;
    public static final String[] c;
    
    static {
        yzo.b = new b();
        c = new String[] { "type", "source", "provider" };
    }
    
    public yzo(final ww9 ww9) {
        super(yzo.c.length);
        this.d(0, (Object)ww9.C0.c.D0);
        final uzg e0 = ww9.E0;
        this.d(1, (Object)e0.D0);
        final tnb f0 = e0.F0;
        if (f0 != null) {
            this.d(2, (Object)f0.C0);
        }
    }
    
    public yzo(final a a) {
        super(yzo.c.length);
        this.d(0, (Object)a.a);
        this.d(1, (Object)a.b);
        final String c = a.c;
        if (c != null) {
            this.d(2, (Object)c);
        }
    }
    
    public final String c(final int n) {
        return yzo.c[n];
    }
    
    public static final class a extends h4j<yzo>
    {
        public String a;
        public String b;
        public String c;
        
        public final Object i() {
            return new yzo(this);
        }
    }
    
    public static final class b extends js2<yzo, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final yzo yzo = (yzo)o;
            flp.G((String)yzo.a.get(0));
            flp.G((String)yzo.a.get(1));
            flp.G((String)yzo.a.get(2));
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            a.a = elp.I();
            a.b = elp.I();
            a.c = elp.I();
        }
    }
}
