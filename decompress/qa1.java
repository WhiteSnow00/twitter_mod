// 
// Decompiled by Procyon v0.6.0
// 

public final class qa1 extends o17$e$d$a$b$d$b
{
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    
    public qa1(final long a, final String b, final String c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final String a() {
        return this.c;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final long c() {
        return this.d;
    }
    
    public final long d() {
        return this.a;
    }
    
    public final String e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$d$a$b$d$b) {
            final o17$e$d$a$b$d$b o17$e$d$a$b$d$b = (o17$e$d$a$b$d$b)o;
            if (this.a == o17$e$d$a$b$d$b.d() && this.b.equals(o17$e$d$a$b$d$b.e())) {
                final String c = this.c;
                if (c == null) {
                    if (o17$e$d$a$b$d$b.a() != null) {
                        return false;
                    }
                }
                else if (!c.equals(o17$e$d$a$b$d$b.a())) {
                    return false;
                }
                if (this.d == o17$e$d$a$b$d$b.c() && this.e == o17$e$d$a$b$d$b.b()) {
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
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final long d = this.d;
        return this.e ^ ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Frame{pc=");
        f.append(this.a);
        f.append(", symbol=");
        f.append(this.b);
        f.append(", file=");
        f.append(this.c);
        f.append(", offset=");
        f.append(this.d);
        f.append(", importance=");
        return ad.y(f, this.e, "}");
    }
    
    public static final class a extends o17$e$d$a$b$d$b$a
    {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;
        
        public final o17$e$d$a$b$d$b a() {
            String s;
            if (this.a == null) {
                s = " pc";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = mqb.l(s, " symbol");
            }
            String i = l;
            if (this.d == null) {
                i = mqb.l(l, " offset");
            }
            String j = i;
            if (this.e == null) {
                j = mqb.l(i, " importance");
            }
            if (j.isEmpty()) {
                return new qa1(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", j));
        }
    }
}
