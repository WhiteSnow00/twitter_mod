// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aai
{
    public static final b Companion;
    public static final aai.aai$d a;
    
    static {
        Companion = new b();
        a = new aai.aai$d();
    }
    
    public static final class a extends aai
    {
        public final String b;
        public final String c;
        public final Integer d;
        
        public a(final String b, final String c, final Integer d) {
            e0e.f((Object)c, "restId");
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
            return e0e.a((Object)this.b, (Object)a.b) && e0e.a((Object)this.c, (Object)a.c) && e0e.a((Object)this.d, (Object)a.d);
        }
        
        @Override
        public final int hashCode() {
            final String b = this.b;
            final int n = 0;
            int hashCode;
            if (b == null) {
                hashCode = 0;
            }
            else {
                hashCode = b.hashCode();
            }
            final int d = brg.d(this.c, hashCode * 31, 31);
            final Integer d2 = this.d;
            int hashCode2;
            if (d2 == null) {
                hashCode2 = n;
            }
            else {
                hashCode2 = d2.hashCode();
            }
            return d + hashCode2;
        }
        
        @Override
        public final String toString() {
            return mqb.m(l58.k("Communities(communityName=", this.b, ", restId=", this.c, ", themeColorRes="), this.d, ")");
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends aai
    {
        public static final c b;
        
        static {
            b = new c();
        }
    }
    
    public static final class e extends aai
    {
        public static final e b;
        
        static {
            b = new e();
        }
    }
    
    public static final class f extends aai
    {
        public final long b;
        public final Integer c;
        public final String d;
        
        public f(final long b, final Integer c, final String d) {
            e0e.f((Object)d, "creatorScreenName");
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return this.b == f.b && e0e.a((Object)this.c, (Object)f.c) && e0e.a((Object)this.d, (Object)f.d);
        }
        
        @Override
        public final int hashCode() {
            final long b = this.b;
            final int n = (int)(b ^ b >>> 32);
            final Integer c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return this.d.hashCode() + (n * 31 + hashCode) * 31;
        }
        
        @Override
        public final String toString() {
            final long b = this.b;
            final Integer c = this.c;
            final String d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("TrustedFriends(restId=");
            sb.append(b);
            sb.append(", memberCount=");
            sb.append(c);
            return wa0.y(sb, ", creatorScreenName=", d, ")");
        }
    }
}
