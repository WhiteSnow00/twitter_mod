import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aho implements oax
{
    public final List<ofo> a;
    
    public aho() {
        final v2a c0 = v2a.C0;
        this.a = (List<ofo>)c0;
    }
    
    public aho(final List<ofo> a) {
        zzd.f((Object)a, "topics");
        this.a = a;
    }
    
    public aho(final List list, final int n, final hg8 hg8) {
        final v2a c0 = v2a.C0;
        this.a = (List<ofo>)c0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof aho && zzd.a((Object)this.a, (Object)((aho)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final aho l(final List<ofo> list) {
        zzd.f((Object)list, "topics");
        return new aho(list);
    }
    
    @Override
    public final String toString() {
        return du1.x("RoomTopicsTaggingViewState(topics=", (List)this.a, ")");
    }
}
