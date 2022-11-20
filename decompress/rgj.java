import android.os.Bundle;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgj extends rn
{
    public final Activity D0;
    public final Bundle E0;
    
    public rgj(final Activity d0, final Bundle e0) {
        czd.f((Object)d0, "activity");
        czd.f((Object)e0, "outState");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Activity a() {
        return this.D0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rgj)) {
            return false;
        }
        final rgj rgj = (rgj)o;
        return czd.a((Object)this.D0, (Object)rgj.D0) && czd.a((Object)this.E0, (Object)rgj.E0);
    }
    
    @Override
    public final int hashCode() {
        return this.E0.hashCode() + this.D0.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final Activity d0 = this.D0;
        final Bundle e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnActivitySavedInstanceState(activity=");
        sb.append(d0);
        sb.append(", outState=");
        sb.append(e0);
        sb.append(")");
        return sb.toString();
    }
}
