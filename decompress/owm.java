import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owm implements nwm
{
    public final long b;
    public final hfv c;
    
    public owm(final a a) {
        this.b = a.b;
        this.c = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && owm.class == o.getClass()) {
            if (this.b != ((owm)o).b) {
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
    
    public static final class a extends h4j<owm>
    {
        public hfv a;
        public long b;
        
        public final Object i() {
            return new owm(this);
        }
        
        public final boolean l() {
            return this.b > 0L;
        }
    }
}
