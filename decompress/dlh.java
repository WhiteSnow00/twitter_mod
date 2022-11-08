import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlh
{
    public static final b e;
    public final String a;
    public final q7t b;
    public final boolean c;
    public int d;
    
    static {
        e = new b();
    }
    
    public dlh(final dlh$a dlh$a) {
        this.a = dlh$a.a;
        this.b = dlh$a.b;
        this.c = dlh$a.c;
        this.d = dlh$a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof dlh)) {
                return b2;
            }
            final dlh dlh = (dlh)o;
            final boolean b3 = this == dlh || (dlh != null && w4j.a((Object)this.a, (Object)dlh.a) && w4j.a((Object)this.b, (Object)dlh.b) && this.c == dlh.c && this.d == dlh.d);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return w4j.i((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class b extends js2<dlh, dlh$a>
    {
        public b() {
            super(1);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final dlh dlh = (dlh)o;
            final flp g = flp.G(dlh.a);
            final q7t b = dlh.b;
            final jx6 a = q7t.a;
            Objects.requireNonNull(g);
            ((s4j)a).c(g, (Object)b);
            final int a2 = w4j.a;
            g.t(dlh.c).z(dlh.d);
        }
        
        public final h4j g() {
            return (h4j)new dlh$a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final dlh$a dlh$a = (dlh$a)h4j;
            dlh$a.a = elp.C();
            if (n == 0) {
                final zdf.a a = new zdf.a();
                a.a = elp.C();
                dlh$a.b = (q7t)a.e();
            }
            else {
                dlh$a.b = (q7t)elp.B((alp)q7t.a);
            }
            dlh$a.c = elp.u();
            dlh$a.d = elp.z();
        }
    }
}
