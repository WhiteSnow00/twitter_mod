import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hio implements ccx
{
    public final List<vgo> a;
    
    public hio() {
        final h3a f0 = h3a.F0;
        this.a = (List<vgo>)f0;
    }
    
    public hio(final List<vgo> a) {
        e0e.f((Object)a, "topics");
        this.a = a;
    }
    
    public hio(final List list, final int n, final wg8 wg8) {
        final h3a f0 = h3a.F0;
        this.a = (List<vgo>)f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hio && e0e.a((Object)this.a, (Object)((hio)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final hio l(final List<vgo> list) {
        e0e.f((Object)list, "topics");
        return new hio(list);
    }
    
    @Override
    public final String toString() {
        return rh.x("RoomTopicsTaggingViewState(topics=", (List)this.a, ")");
    }
}
