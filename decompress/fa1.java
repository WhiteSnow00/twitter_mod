import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fa1 extends i07$e$d
{
    public final long a;
    public final String b;
    public final i07$e$d$a c;
    public final i07$e$d$c d;
    public final i07$e$d$d e;
    
    public fa1(final long a, final String b, final i07$e$d$a c, final i07$e$d$c d, final i07$e$d$d e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final i07$e$d$a a() {
        return this.c;
    }
    
    public final i07$e$d$c b() {
        return this.d;
    }
    
    public final i07$e$d$d c() {
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
        if (o instanceof i07$e$d) {
            final i07$e$d i07$e$d = (i07$e$d)o;
            if (this.a == i07$e$d.d() && this.b.equals(i07$e$d.e()) && this.c.equals(i07$e$d.a()) && this.d.equals(i07$e$d.b())) {
                final i07$e$d$d e = this.e;
                if (e == null) {
                    if (i07$e$d.c() == null) {
                        return b;
                    }
                }
                else if (e.equals(i07$e$d.c())) {
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
        final i07$e$d$d e = this.e;
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
        final StringBuilder j = fu8.j("Event{timestamp=");
        j.append(this.a);
        j.append(", type=");
        j.append(this.b);
        j.append(", app=");
        j.append(this.c);
        j.append(", device=");
        j.append(this.d);
        j.append(", log=");
        j.append(this.e);
        j.append("}");
        return j.toString();
    }
    
    public static final class a extends i07$e$d$b
    {
        public Long a;
        public String b;
        public i07$e$d$a c;
        public i07$e$d$c d;
        public i07$e$d$d e;
        
        public a() {
        }
        
        public a(final i07$e$d i07$e$d) {
            this.a = i07$e$d.d();
            this.b = i07$e$d.e();
            this.c = i07$e$d.a();
            this.d = i07$e$d.b();
            this.e = i07$e$d.c();
        }
        
        public final i07$e$d a() {
            String s;
            if (this.a == null) {
                s = " timestamp";
            }
            else {
                s = "";
            }
            String h = s;
            if (this.b == null) {
                h = hmg.h(s, " type");
            }
            String h2 = h;
            if (this.c == null) {
                h2 = hmg.h(h, " app");
            }
            String h3 = h2;
            if (this.d == null) {
                h3 = hmg.h(h2, " device");
            }
            if (h3.isEmpty()) {
                return new fa1(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(hmg.h("Missing required properties:", h3));
        }
        
        public final i07$e$d$b b(final long n) {
            this.a = n;
            return this;
        }
        
        public final i07$e$d$b c(final String b) {
            Objects.requireNonNull(b, "Null type");
            this.b = b;
            return this;
        }
    }
}
