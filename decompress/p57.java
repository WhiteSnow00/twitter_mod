import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p57
{
    public final tuk a;
    
    public p57(final tuk a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && p57.class == o.getClass() && Objects.equals(this.a, ((p57)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
