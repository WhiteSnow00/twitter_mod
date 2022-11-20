// 
// Decompiled by Procyon v0.6.0
// 

public final class hnj
{
    public final w2j a;
    public final long b;
    
    public hnj(final w2j a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hnj)) {
            return false;
        }
        final hnj hnj = (hnj)o;
        return this.a == hnj.a && this.b == hnj.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return hashCode * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final w2j a = this.a;
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
