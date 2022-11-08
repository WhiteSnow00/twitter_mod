import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lij extends rob
{
    public final Fragment C0;
    public final Bundle D0;
    
    public lij(final Fragment c0, final Bundle d0) {
        zzd.f((Object)c0, "fragment");
        zzd.f((Object)d0, "outState");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final Fragment a() {
        return this.C0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lij)) {
            return false;
        }
        final lij lij = (lij)o;
        return zzd.a((Object)this.C0, (Object)lij.C0) && zzd.a((Object)this.D0, (Object)lij.D0);
    }
    
    public final int hashCode() {
        return this.D0.hashCode() + this.C0.hashCode() * 31;
    }
    
    public final String toString() {
        final Fragment c0 = this.C0;
        final Bundle d0 = this.D0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnFragmentSavedInstanceState(fragment=");
        sb.append(c0);
        sb.append(", outState=");
        sb.append(d0);
        sb.append(")");
        return sb.toString();
    }
}
