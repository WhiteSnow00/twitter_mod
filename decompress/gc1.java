// 
// Decompiled by Procyon v0.6.0
// 

public final class gc1 extends cit
{
    public final String a;
    public final long b;
    public final int c;
    
    public gc1(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final String c() {
        return this.a;
    }
    
    @Override
    public final long d() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof cit) {
            final cit cit = (cit)o;
            final String a = this.a;
            if (a == null) {
                if (cit.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(cit.c())) {
                return false;
            }
            if (this.b == cit.d()) {
                final int c = this.c;
                if (c == 0) {
                    if (cit.b() == 0) {
                        return b;
                    }
                }
                else if (lb0.g(c, cit.b())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int g = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        if (c != 0) {
            g = lb0.G(c);
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ g;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TokenResult{token=");
        f.append(this.a);
        f.append(", tokenExpirationTimestamp=");
        f.append(this.b);
        f.append(", responseCode=");
        f.append(l58.p(this.c));
        f.append("}");
        return f.toString();
    }
    
    public static final class a extends cit.a
    {
        public String a;
        public Long b;
        public int c;
        
        @Override
        public final cit a() {
            String s;
            if (this.b == null) {
                s = " tokenExpirationTimestamp";
            }
            else {
                s = "";
            }
            if (s.isEmpty()) {
                return new gc1(this.a, this.b, this.c);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", s));
        }
        
        @Override
        public final cit.a b(final long n) {
            this.b = n;
            return this;
        }
    }
}
