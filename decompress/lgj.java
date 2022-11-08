import android.os.Bundle;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgj extends rn
{
    public final Activity C0;
    public final Bundle D0;
    
    public lgj(final Activity c0, final Bundle d0) {
        zzd.f((Object)c0, "activity");
        zzd.f((Object)d0, "outState");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final Activity a() {
        return this.C0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lgj)) {
            return false;
        }
        final lgj lgj = (lgj)o;
        return zzd.a((Object)this.C0, (Object)lgj.C0) && zzd.a((Object)this.D0, (Object)lgj.D0);
    }
    
    public final int hashCode() {
        return this.D0.hashCode() + this.C0.hashCode() * 31;
    }
    
    public final String toString() {
        final Activity c0 = this.C0;
        final Bundle d0 = this.D0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnActivitySavedInstanceState(activity=");
        sb.append(c0);
        sb.append(", outState=");
        sb.append(d0);
        sb.append(")");
        return sb.toString();
    }
}
