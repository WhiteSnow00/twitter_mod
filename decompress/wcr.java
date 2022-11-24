// 
// Decompiled by Procyon v0.6.0
// 

public final class wcr
{
    public final znl<a> a;
    public final lhm<b> b;
    
    public wcr() {
        this.a = (znl<a>)new znl();
        this.b = (lhm<b>)lhm.Companion.a();
    }
    
    public final void a() {
        this.a.onNext((Object)wcr.a.a.a);
    }
    
    public final void b() {
        this.a.onNext((Object)wcr.a.e.a);
    }
    
    public final void c(final boolean b, final boolean b2) {
        this.a.onNext((Object)new a.g(b, b2));
    }
    
    public abstract static class a
    {
        public static final class a extends wcr.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends wcr.a
        {
            public static final b a;
            
            static {
                a = new b();
            }
        }
        
        public static final class c extends wcr.a
        {
            public final boolean a;
            public final zmk b;
            
            public c(final boolean a, final zmk b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof c)) {
                    return false;
                }
                final c c = (c)o;
                return this.a == c.a && this.b == c.b;
            }
            
            @Override
            public final int hashCode() {
                int a;
                if ((a = (this.a ? 1 : 0)) != 0) {
                    a = 1;
                }
                return this.b.hashCode() + a * 31;
            }
            
            @Override
            public final String toString() {
                final boolean a = this.a;
                final zmk b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("LeaveSpace(hasSpaceEnded=");
                sb.append(a);
                sb.append(", playbackMode=");
                sb.append(b);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class d extends wcr.a
        {
            public final int a;
            
            public d(final int a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof d && this.a == ((d)o).a);
            }
            
            @Override
            public final int hashCode() {
                return this.a;
            }
            
            @Override
            public final String toString() {
                return ffe.m("OpenStation(stationId=", this.a, ")");
            }
        }
        
        public static final class e extends wcr.a
        {
            public static final e a;
            
            static {
                a = new e();
            }
        }
        
        public static final class f extends wcr.a
        {
            public final int a;
            
            public f(final int a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof f && this.a == ((f)o).a);
            }
            
            @Override
            public final int hashCode() {
                return this.a;
            }
            
            @Override
            public final String toString() {
                return ffe.m("PlayTrackAtIndex(index=", this.a, ")");
            }
        }
        
        public static final class g extends wcr.a
        {
            public final boolean a;
            public final boolean b;
            
            public g(final boolean a, final boolean b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof g)) {
                    return false;
                }
                final g g = (g)o;
                return this.a == g.a && this.b == g.b;
            }
            
            @Override
            public final int hashCode() {
                final int a = this.a ? 1 : 0;
                int n = 1;
                int n2 = a;
                if (a != 0) {
                    n2 = 1;
                }
                final int b = this.b ? 1 : 0;
                if (b == 0) {
                    n = b;
                }
                return n2 * 31 + n;
            }
            
            @Override
            public final String toString() {
                return p4l.f("RestartOrTogglePlayback(hasPlaybackFinished=", this.a, ", isPlaying=", this.b, ")");
            }
        }
        
        public static final class h extends wcr.a
        {
            public final int a;
            public final boolean b;
            
            public h(final int a, final boolean b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof h)) {
                    return false;
                }
                final h h = (h)o;
                return this.a == h.a && this.b == h.b;
            }
            
            @Override
            public final int hashCode() {
                final int a = this.a;
                int b;
                if ((b = (this.b ? 1 : 0)) != 0) {
                    b = 1;
                }
                return a * 31 + b;
            }
            
            @Override
            public final String toString() {
                final int a = this.a;
                final boolean b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("TogglePlayback(stationId=");
                sb.append(a);
                sb.append(", isPlaying=");
                sb.append(b);
                sb.append(")");
                return sb.toString();
            }
        }
        
        public static final class i extends wcr.a
        {
        }
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
            return e0e.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && this.d == b.d;
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
            final StringBuilder h = fd.H("PlaybackState(stationId=", a, ", isPlaying=", b, ", currentPlaybackTimeMs=");
            h.append(c);
            return go9.q(h, ", totalDurationMs=", d, ")");
        }
    }
}
