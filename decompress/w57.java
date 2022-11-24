import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w57
{
    public final boolean a;
    
    public w57() {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && w57.class == o.getClass() && Objects.equals(this.a, ((w57)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a);
    }
    
    public static final class a extends z4j<w57>
    {
        public final Object i() {
            return new w57();
        }
    }
}
