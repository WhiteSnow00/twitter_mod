import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bym implements uxm
{
    public final long b;
    
    public bym(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bym.class == o.getClass()) {
            if (this.b != ((bym)o).b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.b);
    }
    
    public static final class a extends z4j<bym>
    {
        public long a;
        
        public final Object i() {
            return new bym(this);
        }
        
        public final boolean k() {
            return this.a > 0L;
        }
    }
}
