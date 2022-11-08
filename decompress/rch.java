import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rch
{
    public final List<qch> a;
    public final List<qch> b;
    
    public rch(final List<qch> a, final List<qch> b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rch)) {
            return false;
        }
        final rch rch = (rch)o;
        return zzd.a((Object)this.a, (Object)rch.a) && zzd.a((Object)this.b, (Object)rch.b);
    }
    
    @Override
    public final int hashCode() {
        final List<qch> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<qch> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<qch> a = this.a;
        final List<qch> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileAppMetadataByStore(appleAppStore=");
        sb.append(a);
        sb.append(", googlePlayStore=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
