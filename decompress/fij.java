import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fij extends rob
{
    public final Fragment C0;
    public final Bundle D0;
    
    public fij(final Fragment c0, final Bundle d0) {
        zzd.f((Object)c0, "fragment");
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
        if (!(o instanceof fij)) {
            return false;
        }
        final fij fij = (fij)o;
        return zzd.a((Object)this.C0, (Object)fij.C0) && zzd.a((Object)this.D0, (Object)fij.D0);
    }
    
    public final int hashCode() {
        final int hashCode = this.C0.hashCode();
        final Bundle d0 = this.D0;
        int hashCode2;
        if (d0 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d0.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    public final String toString() {
        final Fragment c0 = this.C0;
        final Bundle d0 = this.D0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnFragmentCreated(fragment=");
        sb.append(c0);
        sb.append(", savedInstanceState=");
        sb.append(d0);
        sb.append(")");
        return sb.toString();
    }
}
