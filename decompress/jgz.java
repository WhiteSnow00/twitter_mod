import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgz
{
    public final ggz a;
    public final Integer b;
    
    public jgz(final f63 f63) {
        this.a = (ggz)f63.F0;
        this.b = (Integer)f63.G0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof jgz)) {
            return false;
        }
        final jgz jgz = (jgz)o;
        return r5j.a(this.a, jgz.a) && r5j.a(this.b, jgz.b) && r5j.a(null, null) && r5j.a(null, null);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, null, null });
    }
}
