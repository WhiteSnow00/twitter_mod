import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r7n
{
    public final znl<a> a;
    
    public r7n() {
        this.a = (znl<a>)new znl();
    }
    
    public final void a(final a a) {
        this.a.onNext((Object)a);
    }
    
    public abstract static class a
    {
        public static final class a extends r7n.a
        {
            public final String a;
            
            public a(final String a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return c0e.h("Loop(clipId=", this.a, ")");
            }
        }
        
        public static final class b extends r7n.a
        {
            public final String a;
            public final boolean b;
            
            public b(final String a, final boolean b) {
                e0e.f((Object)a, "clipId");
                this.a = a;
                this.b = b;
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
                return e0e.a((Object)this.a, (Object)b.a) && this.b == b.b;
            }
            
            @Override
            public final int hashCode() {
                final int hashCode = this.a.hashCode();
                int b;
                if ((b = (this.b ? 1 : 0)) != 0) {
                    b = 1;
                }
                return hashCode * 31 + b;
            }
            
            @Override
            public final String toString() {
                return utg.d("MuteSpace(clipId=", this.a, ", isMuted=", this.b, ")");
            }
        }
        
        public static final class c extends r7n.a
        {
            public final String a;
            public final String b;
            public final String c;
            public final Set<y21> d;
            public final Set<y21> e;
            
            public c(final String a, final String b, final String c, final Set<y21> d, final Set<y21> e) {
                e0e.f((Object)a, "spaceId");
                e0e.f((Object)b, "clipId");
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
                this.e = e;
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
                return e0e.a((Object)this.a, (Object)c.a) && e0e.a((Object)this.b, (Object)c.b) && e0e.a((Object)this.c, (Object)c.c) && e0e.a((Object)this.d, (Object)c.d) && e0e.a((Object)this.e, (Object)c.e);
            }
            
            @Override
            public final int hashCode() {
                final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
                final String c = this.c;
                int hashCode;
                if (c == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = c.hashCode();
                }
                return this.e.hashCode() + z9a.q((Set)this.d, (d + hashCode) * 31, 31);
            }
            
            @Override
            public final String toString() {
                final String a = this.a;
                final String b = this.b;
                final String c = this.c;
                final Set<y21> d = this.d;
                final Set<y21> e = this.e;
                final StringBuilder k = l58.k("Play(spaceId=", a, ", clipId=", b, ", primaryAdminId=");
                k.append(c);
                k.append(", admins=");
                k.append(d);
                k.append(", speakers=");
                k.append(e);
                k.append(")");
                return k.toString();
            }
        }
        
        public static final class d extends r7n.a
        {
            public final String a;
            public final long b;
            
            public d(final String a, final long b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof d)) {
                    return false;
                }
                final d d = (d)o;
                return e0e.a((Object)this.a, (Object)d.a) && this.b == d.b;
            }
            
            @Override
            public final int hashCode() {
                final int hashCode = this.a.hashCode();
                final long b = this.b;
                return hashCode * 31 + (int)(b ^ b >>> 32);
            }
            
            @Override
            public final String toString() {
                final StringBuilder o = a88.o("PlaybackStarted(clipId=", this.a, ", startPositionMs=", this.b);
                o.append(")");
                return o.toString();
            }
        }
        
        public static final class e extends r7n.a
        {
            public final String a;
            public final long b;
            
            public e(final String a, final long b) {
                this.a = a;
                this.b = b;
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof e)) {
                    return false;
                }
                final e e = (e)o;
                return e0e.a((Object)this.a, (Object)e.a) && this.b == e.b;
            }
            
            @Override
            public final int hashCode() {
                final int hashCode = this.a.hashCode();
                final long b = this.b;
                return hashCode * 31 + (int)(b ^ b >>> 32);
            }
            
            @Override
            public final String toString() {
                final StringBuilder o = a88.o("ProgressEvent(clipId=", this.a, ", currentProgressMs=", this.b);
                o.append(")");
                return o.toString();
            }
        }
        
        public static final class f extends r7n.a
        {
            public final String a;
            
            public f(final String a) {
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof f && e0e.a((Object)this.a, (Object)((f)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return c0e.h("StartPlayback(uuid=", this.a, ")");
            }
        }
        
        public static final class g extends r7n.a
        {
            public final String a;
            
            public g(final String a) {
                e0e.f((Object)a, "clipId");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof g && e0e.a((Object)this.a, (Object)((g)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return c0e.h("StopPlayback(clipId=", this.a, ")");
            }
        }
    }
}
