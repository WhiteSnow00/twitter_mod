import com.twitter.business.features.mobileappmodule.model.MobileAppUrlsByStore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlw
{
    public final String a;
    public final MobileAppUrlsByStore b;
    
    public dlw(final String a, final MobileAppUrlsByStore b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dlw)) {
            return false;
        }
        final dlw dlw = (dlw)o;
        return e0e.a((Object)this.a, (Object)dlw.a) && e0e.a((Object)this.b, (Object)dlw.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final MobileAppUrlsByStore b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserUpdateMobileAppModuleParams(moduleId=");
        sb.append(a);
        sb.append(", mobileAppUrlsByStore=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
