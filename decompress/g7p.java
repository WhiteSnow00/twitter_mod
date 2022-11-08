import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7p
{
    public static final alp<g7p> c;
    public static final g7p d;
    public final boolean a;
    public final boolean b;
    
    static {
        g7p.c = new b();
        d = (g7p)new a().e();
    }
    
    public g7p(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || g7p.class != o.getClass()) {
            return false;
        }
        final g7p g7p = (g7p)o;
        if (this.a != g7p.a) {
            return false;
        }
        if (this.b != g7p.b) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
    
    public static final class a extends h4j<g7p>
    {
        public boolean a;
        public boolean b;
        
        public a() {
            this.a = true;
            this.b = true;
        }
        
        public a(final g7p g7p) {
            this.a = true;
            this.b = true;
            this.a = g7p.a;
            this.b = g7p.b;
        }
        
        public final Object i() {
            return new g7p(this);
        }
    }
    
    public static final class b extends js2<g7p, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final g7p g7p = (g7p)o;
            flp.t(g7p.a).t(g7p.b);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            a.a = elp.u();
            a.b = elp.u();
        }
    }
}
