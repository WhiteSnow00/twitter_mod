import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d23
{
    public final omj a;
    public final List<f23> b;
    
    public d23(final omj a, final List<f23> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d23)) {
            return false;
        }
        final d23 d23 = (d23)o;
        return this.a == d23.a && zzd.a((Object)this.b, (Object)d23.b);
    }
    
    @Override
    public final int hashCode() {
        final omj a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<f23> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final omj a = this.a;
        final List<f23> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("BusinessOpenTimesInput(openTimesType=");
        sb.append(a);
        sb.append(", regular=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
