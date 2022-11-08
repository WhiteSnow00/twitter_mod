import com.twitter.model.timeline.IllegalTileStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cps extends bps
{
    public final wg1 b;
    public final long c;
    public hfv d;
    
    public cps(final a a) {
        this.c = a.a;
        this.b = a.b;
        this.d = a.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && cps.class == o.getClass()) {
            final int a = w4j.a;
            final cps cps = (cps)o;
            if (!w4j.a((Object)this.d, (Object)cps.d) || !w4j.a((Object)this.b, (Object)cps.b) || !w4j.a((Object)this.c, (Object)cps.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return w4j.g((Object)this.d, (Object)this.b);
    }
    
    public static final class a extends h4j<cps>
    {
        public long a;
        public wg1 b;
        public hfv c;
        
        public final Object i() {
            return new cps(this);
        }
        
        public final boolean l() {
            final boolean b = this.a > 0L;
            if (!b) {
                final StringBuilder g = w48.g("Illegal Tile state: TileContentBroadcast userId: ");
                g.append(this.a);
                g.append(" and mUser: ");
                g.append(this.c);
                e9a.d((Throwable)new IllegalTileStateException(g.toString()));
            }
            return b;
        }
    }
}
