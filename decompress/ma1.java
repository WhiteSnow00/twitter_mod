// 
// Decompiled by Procyon v0.6.0
// 

public final class ma1 extends d17$e$d$a$b$a
{
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    
    public ma1(final long a, final long b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final long a() {
        return this.a;
    }
    
    public final String b() {
        return this.c;
    }
    
    public final long c() {
        return this.b;
    }
    
    public final String d() {
        return this.d;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d17$e$d$a$b$a) {
            final d17$e$d$a$b$a d17$e$d$a$b$a = (d17$e$d$a$b$a)o;
            if (this.a == d17$e$d$a$b$a.a() && this.b == d17$e$d$a$b$a.c() && this.c.equals(d17$e$d$a$b$a.b())) {
                final String d = this.d;
                if (d == null) {
                    if (d17$e$d$a$b$a.d() == null) {
                        return b;
                    }
                }
                else if (d.equals(d17$e$d$a$b$a.d())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final int hashCode = this.c.hashCode();
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        return hashCode2 ^ (((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode) * 1000003;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("BinaryImage{baseAddress=");
        g.append(this.a);
        g.append(", size=");
        g.append(this.b);
        g.append(", name=");
        g.append(this.c);
        g.append(", uuid=");
        return hi.I(g, this.d, "}");
    }
    
    public static final class a extends d17$e$d$a$b$a$a
    {
        public Long a;
        public Long b;
        public String c;
        public String d;
        
        public final d17$e$d$a$b$a a() {
            String s;
            if (this.a == null) {
                s = " baseAddress";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.b == null) {
                c = l7k.c(s, " size");
            }
            String c2 = c;
            if (this.c == null) {
                c2 = l7k.c(c, " name");
            }
            if (c2.isEmpty()) {
                return new ma1(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c2));
        }
    }
}
