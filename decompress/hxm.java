import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxm implements exm
{
    public final edk b;
    
    public hxm(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hxm.class == o.getClass()) {
            if (this.b != ((hxm)o).b) {
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
    
    public static final class a extends n4j<hxm>
    {
        public edk a;
        
        public a() {
            this.a = (edk)edk.E0;
        }
        
        public final Object i() {
            return new hxm(this);
        }
    }
}
