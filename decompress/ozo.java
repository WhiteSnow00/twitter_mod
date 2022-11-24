import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozo
{
    public final File a;
    public final long b;
    
    public ozo(final File a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ozo)) {
            return false;
        }
        final ozo ozo = (ozo)o;
        return e0e.a((Object)this.a, (Object)ozo.a) && this.b == ozo.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final File a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("Screenshot(file=");
        sb.append(a);
        sb.append(", takenTimestamp=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
