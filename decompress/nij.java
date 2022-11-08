import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nij extends rob
{
    public final Fragment C0;
    
    public nij(final Fragment c0) {
        zzd.f((Object)c0, "fragment");
        this.C0 = c0;
    }
    
    public final Fragment a() {
        return this.C0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof nij && zzd.a((Object)this.C0, (Object)((nij)o).C0));
    }
    
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public final String toString() {
        return aob.g("OnFragmentStopped(fragment=", this.C0, ")");
    }
}
