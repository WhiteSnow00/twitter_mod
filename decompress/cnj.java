// 
// Decompiled by Procyon v0.6.0
// 

public final class cnj
{
    public final q2j a;
    public final long b;
    
    public cnj(final q2j a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cnj)) {
            return false;
        }
        final cnj cnj = (cnj)o;
        return this.a == cnj.a && this.b == cnj.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final q2j a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("OpenbackRingerVolumeSignal(operator=");
        sb.append(a);
        sb.append(", volume=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
