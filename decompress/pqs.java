import com.twitter.model.timeline.IllegalTileStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqs extends lqs
{
    public final String b;
    public final String c;
    public final vg1 d;
    
    public pqs(final a a) {
        this.b = a.a;
        this.c = a.b;
        this.d = a.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && pqs.class == o.getClass()) {
            final int a = o5j.a;
            final pqs pqs = (pqs)o;
            if (!o5j.a((Object)this.b, (Object)pqs.b) || !o5j.a((Object)this.c, (Object)pqs.c) || !o5j.a((Object)this.d, (Object)pqs.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return o5j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends z4j<pqs>
    {
        public String a;
        public String b;
        public vg1 c;
        
        public final Object i() {
            return new pqs(this);
        }
        
        public final boolean k() {
            final boolean g = flr.g((CharSequence)this.a);
            if (!g) {
                r9a.d((Throwable)new IllegalTileStateException("Illegal Tile state: TileContentStandard missing a title"));
            }
            return g;
        }
    }
}
