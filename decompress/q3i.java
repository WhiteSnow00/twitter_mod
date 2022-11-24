import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q3i implements ccx
{
    public final List<u4i> a;
    
    public q3i() {
        final h3a f0 = h3a.F0;
        this.a = (List<u4i>)f0;
    }
    
    public q3i(final List<u4i> a) {
        this.a = a;
    }
    
    public q3i(final List list, final int n, final wg8 wg8) {
        final h3a f0 = h3a.F0;
        this.a = (List<u4i>)f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof q3i && e0e.a((Object)this.a, (Object)((q3i)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("NFTGalleryFragmentViewState(nfts=", (List)this.a, ")");
    }
}
