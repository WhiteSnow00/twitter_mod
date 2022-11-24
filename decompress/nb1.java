import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nb1 extends b9g
{
    public final long a;
    public final long b;
    public final og4 c;
    public final Integer d;
    public final String e;
    public final List<w8g> f;
    public final vsl g;
    
    public nb1(final long a, final long b, final og4 c, final Integer d, final String e, final List f, final vsl g, final nb1$a nb1$a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final og4 a() {
        return this.c;
    }
    
    public final List<w8g> b() {
        return this.f;
    }
    
    public final Integer c() {
        return this.d;
    }
    
    public final String d() {
        return this.e;
    }
    
    public final vsl e() {
        return this.g;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof b9g) {
            final b9g b9g = (b9g)o;
            if (this.a == b9g.f() && this.b == b9g.g()) {
                final og4 c = this.c;
                if (c == null) {
                    if (b9g.a() != null) {
                        return false;
                    }
                }
                else if (!c.equals(b9g.a())) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (b9g.c() != null) {
                        return false;
                    }
                }
                else if (!d.equals(b9g.c())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (b9g.d() != null) {
                        return false;
                    }
                }
                else if (!e.equals(b9g.d())) {
                    return false;
                }
                final List<w8g> f = this.f;
                if (f == null) {
                    if (b9g.b() != null) {
                        return false;
                    }
                }
                else if (!f.equals(b9g.b())) {
                    return false;
                }
                final vsl g = this.g;
                if (g == null) {
                    if (b9g.e() == null) {
                        return b;
                    }
                }
                else if (g.equals(b9g.e())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final long f() {
        return this.a;
    }
    
    public final long g() {
        return this.b;
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final og4 c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final List<w8g> f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final vsl g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("LogRequest{requestTimeMs=");
        f.append(this.a);
        f.append(", requestUptimeMs=");
        f.append(this.b);
        f.append(", clientInfo=");
        f.append(this.c);
        f.append(", logSource=");
        f.append(this.d);
        f.append(", logSourceName=");
        f.append(this.e);
        f.append(", logEvents=");
        f.append(this.f);
        f.append(", qosTier=");
        f.append(this.g);
        f.append("}");
        return f.toString();
    }
}
