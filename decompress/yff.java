import com.twitter.business.features.linkmodule.model.CallToActionDisplay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yff
{
    public final CallToActionDisplay a;
    public final String b;
    public final String c;
    
    public yff() {
        final CallToActionDisplay a = new CallToActionDisplay((d93)null, (String)null, 3, (rf8)null);
        this.a = a;
        this.b = null;
        this.c = null;
    }
    
    public yff(final CallToActionDisplay a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yff)) {
            return false;
        }
        final yff yff = (yff)o;
        return czd.a((Object)this.a, (Object)yff.a) && czd.a((Object)this.b, (Object)yff.b) && czd.a((Object)this.c, (Object)yff.c);
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
        return ed.B(sb, c, ")");
    }
}
