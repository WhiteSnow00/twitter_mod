import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caw
{
    public final MobileAppUrlsByStore a;
    public final boolean b;
    
    public caw(final MobileAppUrlsByStore a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof caw)) {
            return false;
        }
        final caw caw = (caw)o;
        return zzd.a((Object)this.a, (Object)caw.a) && this.b == caw.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final MobileAppUrlsByStore a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserCreateMobileAppModuleParams(mobileAppUrlsByStore=");
        sb.append(a);
        sb.append(", visibleOnCreation=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
