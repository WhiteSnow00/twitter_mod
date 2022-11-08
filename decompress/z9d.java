// 
// Decompiled by Procyon v0.6.0
// 

public final class z9d extends k1t
{
    public final String b;
    
    public z9d(final String b) {
        zzd.f((Object)b, "key");
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof z9d && zzd.a((Object)this.b, (Object)((z9d)o).b));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("ImmediateTimelineReaction(key=", this.b, ")");
    }
    
    public static final class a extends s4j<z9d>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final elp elp, final int n) {
            zzd.f((Object)elp, "input");
            final String c = elp.C();
            zzd.e((Object)c, "input.readNotNullString()");
            return new z9d(c);
        }
        
        public final void f(final flp flp, final Object o) {
            final z9d z9d = (z9d)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)z9d, "object");
            ((bow)hx6.f).c(flp, (Object)z9d.b);
            final int a = w4j.a;
        }
    }
}
