import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g57
{
    public final utk a;
    
    public g57(final utk a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && g57.class == o.getClass() && Objects.equals(this.a, ((g57)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
    
    public static final class a extends h4j<g57>
    {
        public utk a;
        
        public final Object i() {
            return new g57(this.a);
        }
    }
}
