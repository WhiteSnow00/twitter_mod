import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdw extends gir.b
{
    public static final js2<kdw, a> b;
    public final jdw a;
    
    static {
        kdw.b = new b();
    }
    
    public kdw(final a a) {
        this.a = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kdw && w4j.a((Object)this.a, (Object)((kdw)o).a));
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
    
    public static final class a extends h4j<kdw>
    {
        public jdw a;
        
        public final Object i() {
            return new kdw(this);
        }
    }
    
    public static final class b extends js2<kdw, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            flp.C((Object)((kdw)o).a, (alp)jdw.g);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            final jdw$b g = jdw.g;
            Objects.requireNonNull(elp);
            a.a = (jdw)((s4j)g).a(elp);
        }
    }
}
