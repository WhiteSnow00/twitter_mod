// 
// Decompiled by Procyon v0.6.0
// 

public final class dbr
{
    public final zml<a> a;
    public final ggm<b> b;
    
    public dbr() {
        this.a = (zml<a>)new zml();
        this.b = (ggm<b>)ggm.Companion.a();
    }
    
    public final void a() {
        this.a.onNext((Object)dbr.a.dbr$a$a.a);
    }
    
    public final void b() {
        this.a.onNext((Object)dbr.a.dbr$a$e.a);
    }
    
    public final void c(final boolean b, final boolean b2) {
        this.a.onNext((Object)new a.dbr$a$g(b, b2));
    }
    
    public abstract static class a
    {
    }
    
    public static final class b
    {
        public final String a;
        public final boolean b;
        public final long c;
        public final long d;
        
        public b(final String a, final boolean b, final long c, final long d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return zzd.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && this.d == b.d;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            final long c = this.c;
            final int n = (int)(c ^ c >>> 32);
            final long d = this.d;
            return ((hashCode * 31 + b) * 31 + n) * 31 + (int)(d ^ d >>> 32);
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final boolean b = this.b;
            final long c = this.c;
            final long d = this.d;
            final StringBuilder y = rb0.y("PlaybackState(stationId=", a, ", isPlaying=", b, ", currentPlaybackTimeMs=");
            y.append(c);
            return hvl.c(y, ", totalDurationMs=", d, ")");
        }
    }
}
