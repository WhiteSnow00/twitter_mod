import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q0p extends ikg
{
    public static final rlp<q0p> b;
    
    static {
        q0p.b = new b();
    }
    
    public q0p() {
        super(1);
    }
    
    public q0p(final q0p$a q0p$a) {
        super(1);
        final n0p a = q0p$a.a;
        if (a != null) {
            this.d(0, (Object)a);
        }
    }
    
    public final String c(final int n) {
        return "media_details";
    }
    
    public static final class b extends zr2<q0p, q0p$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            wlp.A(((q0p)o).a.get(0), (rlp)n0p.b);
        }
        
        public final n4j g() {
            return (n4j)new q0p$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final q0p$a q0p$a = (q0p$a)n4j;
            final n0p$b b = n0p.b;
            Objects.requireNonNull(vlp);
            q0p$a.a = (n0p)((y4j)b).a(vlp);
        }
    }
}
