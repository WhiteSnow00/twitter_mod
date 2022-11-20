import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pij extends nnb
{
    public final Fragment D0;
    
    public pij(final Fragment d0) {
        czd.f((Object)d0, "fragment");
        this.D0 = d0;
    }
    
    @Override
    public final Fragment a() {
        return this.D0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pij && czd.a((Object)this.D0, (Object)((pij)o).D0));
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    @Override
    public final String toString() {
        return sk0.C("OnFragmentPaused(fragment=", this.D0, ")");
    }
}
