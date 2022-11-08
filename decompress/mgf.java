import com.twitter.business.features.linkmodule.model.CallToActionDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgf
{
    public final CallToActionDisplay a;
    public final String b;
    public final String c;
    
    public mgf() {
        final CallToActionDisplay a = new CallToActionDisplay(null, null, 3, null);
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    public mgf(final CallToActionDisplay a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mgf)) {
            return false;
        }
        final mgf mgf = (mgf)o;
        return zzd.a((Object)this.a, (Object)mgf.a) && zzd.a((Object)this.b, (Object)mgf.b) && zzd.a((Object)this.c, (Object)mgf.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final CallToActionDisplay a = this.a;
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("LinkModuleDomainData(callToActionDisplay=");
        sb.append(a);
        sb.append(", domain=");
        sb.append(b);
        sb.append(", destUrl=");
        return hi.I(sb, c, ")");
    }
}
