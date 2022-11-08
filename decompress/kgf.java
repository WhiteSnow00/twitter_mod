import com.twitter.business.features.linkmodule.model.CallToActionDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgf
{
    public final w5w a;
    public final CallToActionDisplay b;
    
    public kgf(final w5w a, final CallToActionDisplay b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kgf)) {
            return false;
        }
        final kgf kgf = (kgf)o;
        return zzd.a((Object)this.a, (Object)kgf.a) && zzd.a((Object)this.b, (Object)kgf.b);
    }
    
    @Override
    public final int hashCode() {
        final w5w a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final CallToActionDisplay b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final w5w a = this.a;
        final CallToActionDisplay b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("LinkModuleData(apiShortenedUrl=");
        sb.append(a);
        sb.append(", callToActionDisplay=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
