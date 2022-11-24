import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cym implements uxm
{
    public final long b;
    public final gdv c;
    
    public cym(final a a) {
        this.b = a.a;
        this.c = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && cym.class == o.getClass()) {
            if (this.b != ((cym)o).b) {
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
    
    public static final class a extends z4j<cym>
    {
        public long a;
        public gdv b;
        
        public final Object i() {
            return new cym(this);
        }
        
        public final boolean k() {
            return this.a > 0L;
        }
    }
}
