import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpf
{
    public static final alp<hpf> b;
    public final String a;
    
    static {
        hpf.b = new b();
    }
    
    public hpf(final hpf$a hpf$a) {
        this.a = hpf$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && hpf.class == o.getClass() && Objects.equals(this.a, ((hpf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
    
    public static final class b extends js2<hpf, hpf$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            flp.G(((hpf)o).a);
        }
        
        public final h4j g() {
            return (h4j)new hpf$a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            ((hpf$a)h4j).a = elp.I();
        }
    }
}
