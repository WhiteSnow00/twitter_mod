import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oeg<V>
{
    public final V a;
    public final Throwable b;
    
    public oeg(final V a) {
        this.a = a;
        this.b = null;
    }
    
    public oeg(final Throwable b) {
        this.b = b;
        this.a = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof oeg)) {
            return false;
        }
        final oeg oeg = (oeg)o;
        final V a = this.a;
        if (a != null && a.equals(oeg.a)) {
            return true;
        }
        final Throwable b = this.b;
        return b != null && oeg.b != null && b.toString().equals(this.b.toString());
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
