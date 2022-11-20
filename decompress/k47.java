import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k47
{
    public final duk a;
    
    public k47(final duk a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && k47.class == o.getClass() && Objects.equals(this.a, ((k47)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
