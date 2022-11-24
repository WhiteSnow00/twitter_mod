import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c2i implements ccx
{
    public final List<j1i> a;
    
    public c2i() {
        final h3a f0 = h3a.F0;
        this.a = (List<j1i>)f0;
    }
    
    public c2i(final List<j1i> a) {
        this.a = a;
    }
    
    public c2i(final List list, final int n, final wg8 wg8) {
        final h3a f0 = h3a.F0;
        this.a = (List<j1i>)f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c2i && e0e.a((Object)this.a, (Object)((c2i)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("NFTCollectionsGalleryFragmentViewState(collections=", (List)this.a, ")");
    }
}
