import com.twitter.model.timeline.IllegalTileStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fps extends bps
{
    public final String b;
    public final String c;
    public final wg1 d;
    
    public fps(final a a) {
        this.b = a.a;
        this.c = a.b;
        this.d = a.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && fps.class == o.getClass()) {
            final int a = w4j.a;
            final fps fps = (fps)o;
            if (!w4j.a((Object)this.b, (Object)fps.b) || !w4j.a((Object)this.c, (Object)fps.c) || !w4j.a((Object)this.d, (Object)fps.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return w4j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends h4j<fps>
    {
        public String a;
        public String b;
        public wg1 c;
        
        public final Object i() {
            return new fps(this);
        }
        
        public final boolean l() {
            final boolean g = pjr.g((CharSequence)this.a);
            if (!g) {
                e9a.d((Throwable)new IllegalTileStateException("Illegal Tile state: TileContentStandard missing a title"));
            }
            return g;
        }
    }
}
