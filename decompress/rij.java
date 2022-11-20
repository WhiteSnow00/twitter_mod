import android.os.Bundle;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rij extends nnb
{
    public final Fragment D0;
    public final Bundle E0;
    
    public rij(final Fragment d0, final Bundle e0) {
        czd.f((Object)d0, "fragment");
        czd.f((Object)e0, "outState");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Fragment a() {
        return this.D0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rij)) {
            return false;
        }
        final rij rij = (rij)o;
        return czd.a((Object)this.D0, (Object)rij.D0) && czd.a((Object)this.E0, (Object)rij.E0);
    }
    
    @Override
    public final int hashCode() {
        return this.E0.hashCode() + this.D0.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final Fragment d0 = this.D0;
        final Bundle e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnFragmentSavedInstanceState(fragment=");
        sb.append(d0);
        sb.append(", outState=");
        sb.append(e0);
        sb.append(")");
        return sb.toString();
    }
}
