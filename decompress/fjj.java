import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjj extends oob
{
    public final Fragment F0;
    public final Bundle G0;
    
    public fjj(final Fragment f0, final Bundle g0) {
        e0e.f((Object)f0, "fragment");
        e0e.f((Object)g0, "outState");
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
        if (!(o instanceof fjj)) {
            return false;
        }
        final fjj fjj = (fjj)o;
        return e0e.a((Object)this.F0, (Object)fjj.F0) && e0e.a((Object)this.G0, (Object)fjj.G0);
    }
    
    public final int hashCode() {
        return this.G0.hashCode() + this.F0.hashCode() * 31;
    }
    
    public final String toString() {
        final Fragment f0 = this.F0;
        final Bundle g0 = this.G0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnFragmentSavedInstanceState(fragment=");
        sb.append(f0);
        sb.append(", outState=");
        sb.append(g0);
        sb.append(")");
        return sb.toString();
    }
}
