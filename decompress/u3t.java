import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u3t implements o3t
{
    public final long a;
    
    public u3t(final a a) {
        this.a = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && u3t.class == o.getClass()) {
            if (this.a != ((u3t)o).a) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
    
    public static final class a extends z4j<u3t>
    {
        public long a;
        
        public final Object i() {
            return new u3t(this);
        }
        
        public final boolean k() {
            return this.a > 0L;
        }
    }
}
