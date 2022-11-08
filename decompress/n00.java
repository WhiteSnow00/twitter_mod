import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n00
{
    public final byte[] a;
    
    public n00(final byte[] a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && n00.class == o.getClass() && Arrays.equals(this.a, ((n00)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
