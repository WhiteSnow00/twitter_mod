import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aym implements uxm
{
    public final String b;
    
    public aym(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && aym.class == o.getClass() && this.b.equals(((aym)o).b));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.b);
    }
    
    public static final class a extends z4j<aym>
    {
        public String a;
        public lxd b;
        
        public final Object i() {
            return new aym(this);
        }
        
        public final boolean k() {
            return flr.g((CharSequence)this.a);
        }
    }
    
    public static final class b extends ss2<aym, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            smp.G(((aym)o).b);
        }
        
        public final z4j g() {
            return new a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) throws IOException, ClassNotFoundException {
            ((a)z4j).a = rmp.I();
        }
    }
}
