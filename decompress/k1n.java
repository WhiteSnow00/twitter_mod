// 
// Decompiled by Procyon v0.6.0
// 

public final class k1n
{
    public final znl<a> a;
    
    public k1n() {
        this.a = (znl<a>)new znl();
    }
    
    public final void a(final String s, final String s2, final String s3, final boolean b) {
        e0e.f((Object)s2, "twitterUserId");
        e0e.f((Object)s3, "emoji");
        this.a.onNext((Object)new a(s, s2, s3, b));
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        
        public a(final String a, final String b, final String c, final boolean d) {
            e0e.f((Object)b, "twitterUserId");
            e0e.f((Object)c, "emoji");
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
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b) && e0e.a((Object)this.c, (Object)a.c) && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            final int d = brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31);
            int d2;
            if ((d2 = (this.d ? 1 : 0)) != 0) {
                d2 = 1;
            }
            return d + d2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final String c = this.c;
            final boolean d = this.d;
            final StringBuilder k = l58.k("EmojiReceived(periscopeUserId=", a, ", twitterUserId=", b, ", emoji=");
            k.append(c);
            k.append(", isPrivate=");
            k.append(d);
            k.append(")");
            return k.toString();
        }
    }
}
