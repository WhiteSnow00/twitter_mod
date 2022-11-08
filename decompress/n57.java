import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n57
{
    public final boolean a;
    
    public n57() {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && n57.class == o.getClass() && Objects.equals(this.a, ((n57)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
