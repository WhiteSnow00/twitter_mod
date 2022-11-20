import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g1t
{
    public static final rlp<g1t> c;
    public final xus a;
    public final svs b;
    
    static {
        g1t.c = new b();
    }
    
    public g1t(final g1t$a g1t$a) {
        this.a = g1t$a.a;
        this.b = g1t$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof g1t)) {
            return false;
        }
        final g1t g1t = (g1t)o;
        if (!c5j.a((Object)this.a, (Object)g1t.a) || !c5j.a((Object)this.b, (Object)g1t.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return c5j.g((Object)this.a, (Object)this.b);
    }
    
    public static final class b extends zr2<g1t, g1t$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final g1t g1t = (g1t)o;
            wlp.A((Object)g1t.a, (rlp)xus.b);
            wlp.A((Object)g1t.b, (rlp)svs.a);
        }
        
        public final n4j g() {
            return (n4j)new g1t$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final g1t$a g1t$a = (g1t$a)n4j;
            final xus$b b = xus.b;
            Objects.requireNonNull(vlp);
            g1t$a.a = (xus)((y4j)b).a(vlp);
            g1t$a.b = (svs)((y4j)svs.a).a(vlp);
        }
    }
}
