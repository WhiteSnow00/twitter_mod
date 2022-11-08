// 
// Decompiled by Procyon v0.6.0
// 

public final class g8o extends ggm<a>
{
    public g8o() {
        super((Object)null, 1, (hg8)null);
    }
    
    public abstract static class a
    {
        public static final class a extends g8o.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends g8o.a
        {
            public final String a;
            public final String b;
            public final String c;
            public final long d;
            
            public b(final String a, final String b, final String c, final long d) {
                zzd.f((Object)b, "avatarUrl");
                zzd.f((Object)c, "userName");
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
                return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c) && this.d == b.d;
            }
            
            @Override
            public final int hashCode() {
                final int a = l7k.a(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31);
                final long d = this.d;
                return a + (int)(d ^ d >>> 32);
            }
            
            @Override
            public final String toString() {
                final String a = this.a;
                final String b = this.b;
                final String c = this.c;
                final long d = this.d;
                final StringBuilder y = mb0.y("Speaker(spaceId=", a, ", avatarUrl=", b, ", userName=");
                y.append(c);
                y.append(", userId=");
                y.append(d);
                y.append(")");
                return y.toString();
            }
        }
    }
}
