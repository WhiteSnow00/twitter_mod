// 
// Decompiled by Procyon v0.6.0
// 

public abstract class r9i
{
    public static final class a extends r9i
    {
        public final String a;
        public final long b;
        public final String c;
        public final int d;
        public final String e;
        
        public a(final String a, final long b, final String c, final int d, final String e) {
            e0e.f((Object)a, "title");
            e0e.f((Object)c, "restId");
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
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && this.b == a.b && e0e.a((Object)this.c, (Object)a.c) && this.d == a.d && e0e.a((Object)this.e, (Object)a.e);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            final int d = brg.d(this.c, (hashCode * 31 + (int)(b ^ b >>> 32)) * 31, 31);
            final int d2 = this.d;
            final String e = this.e;
            int hashCode2;
            if (e == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = e.hashCode();
            }
            return (d + d2) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final long b = this.b;
            final String c = this.c;
            final int d = this.d;
            final String e = this.e;
            final StringBuilder o = a88.o("CommunitiesNarrowcastItem(title=", a, ", memberCount=", b);
            o.append(", restId=");
            o.append(c);
            o.append(", themeColorRes=");
            o.append(d);
            return wa0.y(o, ", imageUrl=", e, ")");
        }
    }
    
    public static final class b extends r9i
    {
        public final int a;
        
        public b() {
            this.a = 0;
        }
        
        public b(final int a) {
            this.a = a;
        }
        
        public b(final int n, final int n2, final wg8 wg8) {
            this.a = 0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && this.a == ((b)o).a);
        }
        
        @Override
        public final int hashCode() {
            return this.a;
        }
        
        @Override
        public final String toString() {
            return ffe.m("Default(titleRes=", this.a, ")");
        }
    }
    
    public static final class c extends r9i
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends r9i
    {
        public final long a;
        public final int b;
        public final String c;
        
        public d() {
            this(0L, 0, null, 7, null);
        }
        
        public d(final long a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public d(final long n, final int n2, final String s, final int n3, final wg8 wg8) {
            this.a = 0L;
            this.b = 0;
            this.c = "";
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
            return this.a == d.a && this.b == d.b && e0e.a((Object)this.c, (Object)d.c);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return this.c.hashCode() + ((int)(a ^ a >>> 32) * 31 + this.b) * 31;
        }
        
        @Override
        public final String toString() {
            final long a = this.a;
            final int b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("TrustedFriendsNarrowcastItem(restId=");
            sb.append(a);
            sb.append(", peopleCount=");
            sb.append(b);
            return wa0.y(sb, ", creatorScreenName=", c, ")");
        }
    }
}
