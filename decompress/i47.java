import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i47
{
    public final yzi a;
    public final yzi b;
    
    public i47(final yzi a, final yzi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i47.class == o.getClass()) {
            final i47 i47 = (i47)o;
            if (!Objects.equals(this.a, i47.a) || !Objects.equals(this.b, i47.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
    
    public static final class a extends n4j<i47>
    {
        public yzi a;
        public yzi b;
        
        public final Object i() {
            return new i47(this.a, this.b);
        }
    }
}
