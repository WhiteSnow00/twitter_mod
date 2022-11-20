import com.twitter.model.timeline.IllegalTileStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vps extends sps
{
    public zxo b;
    
    public vps(final a a) {
        this.b = a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && vps.class == o.getClass()) {
            final int a = c5j.a;
            return c5j.a((Object)this.b, (Object)((vps)o).b);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b);
    }
    
    public static final class a extends n4j<vps>
    {
        public zxo a;
        
        public final Object i() {
            return new vps(this);
        }
        
        public final boolean l() {
            final boolean b = this.a != null;
            if (!b) {
                m8a.d((Throwable)new IllegalTileStateException("Illegal Tile state: TileContentScoreCard missing mScoreEventSummary"));
            }
            return b;
        }
    }
}
