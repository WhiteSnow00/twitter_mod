import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ja1 extends d17$e$d
{
    public final long a;
    public final String b;
    public final d17$e$d$a c;
    public final d17$e$d$c d;
    public final d17$e$d$d e;
    
    public ja1(final long a, final String b, final d17$e$d$a c, final d17$e$d$c d, final d17$e$d$d e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final d17$e$d$a a() {
        return this.c;
    }
    
    public final d17$e$d$c b() {
        return this.d;
    }
    
    public final d17$e$d$d c() {
        return this.e;
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
        if (o instanceof d17$e$d) {
            final d17$e$d d17$e$d = (d17$e$d)o;
            if (this.a == d17$e$d.d() && this.b.equals(d17$e$d.e()) && this.c.equals(d17$e$d.a()) && this.d.equals(d17$e$d.b())) {
                final d17$e$d$d e = this.e;
                if (e == null) {
                    if (d17$e$d.c() == null) {
                        return b;
                    }
                }
                else if (e.equals(d17$e$d.c())) {
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
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final d17$e$d$d e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        return hashCode4 ^ ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Event{timestamp=");
        g.append(this.a);
        g.append(", type=");
        g.append(this.b);
        g.append(", app=");
        g.append(this.c);
        g.append(", device=");
        g.append(this.d);
        g.append(", log=");
        g.append(this.e);
        g.append("}");
        return g.toString();
    }
    
    public static final class a extends d17$e$d$b
    {
        public Long a;
        public String b;
        public d17$e$d$a c;
        public d17$e$d$c d;
        public d17$e$d$d e;
        
        public a() {
        }
        
        public a(final d17$e$d d17$e$d) {
            this.a = d17$e$d.d();
            this.b = d17$e$d.e();
            this.c = d17$e$d.a();
            this.d = d17$e$d.b();
            this.e = d17$e$d.c();
        }
        
        public final d17$e$d a() {
            String s;
            if (this.a == null) {
                s = " timestamp";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.b == null) {
                c = l7k.c(s, " type");
            }
            String c2 = c;
            if (this.c == null) {
                c2 = l7k.c(c, " app");
            }
            String c3 = c2;
            if (this.d == null) {
                c3 = l7k.c(c2, " device");
            }
            if (c3.isEmpty()) {
                return new ja1(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c3));
        }
        
        public final d17$e$d$b b(final long n) {
            this.a = n;
            return this;
        }
        
        public final d17$e$d$b c(final String b) {
            Objects.requireNonNull(b, "Null type");
            this.b = b;
            return this;
        }
    }
}
