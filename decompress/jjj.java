import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjj extends oob
{
    public final Fragment F0;
    public final Bundle G0;
    
    public jjj(final Fragment f0, final Bundle g0) {
        e0e.f((Object)f0, "fragment");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Fragment a() {
        return this.F0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jjj)) {
            return false;
        }
        final jjj jjj = (jjj)o;
        return e0e.a((Object)this.F0, (Object)jjj.F0) && e0e.a((Object)this.G0, (Object)jjj.G0);
    }
    
    public final int hashCode() {
        final int hashCode = this.F0.hashCode();
        final Bundle g0 = this.G0;
        int hashCode2;
        if (g0 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g0.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    public final String toString() {
        final Fragment f0 = this.F0;
        final Bundle g0 = this.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnFragmentViewCreated(fragment=");
        sb.append(f0);
        sb.append(", savedInstanceState=");
        sb.append(g0);
        sb.append(")");
        return sb.toString();
    }
}
