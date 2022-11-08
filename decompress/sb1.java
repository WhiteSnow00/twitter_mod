// 
// Decompiled by Procyon v0.6.0
// 

public final class sb1 extends n7k
{
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    
    public sb1(final String b, final int c, final String d, final String e, final long f, final long g, final String h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final String a() {
        return this.d;
    }
    
    public final long b() {
        return this.f;
    }
    
    public final String c() {
        return this.b;
    }
    
    public final String d() {
        return this.h;
    }
    
    public final String e() {
        return this.e;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof n7k) {
            final n7k n7k = (n7k)o;
            final String b2 = this.b;
            if (b2 == null) {
                if (n7k.c() != null) {
                    return false;
                }
            }
            else if (!b2.equals(n7k.c())) {
                return false;
            }
            if (nb0.e(this.c, n7k.f())) {
                final String d = this.d;
                if (d == null) {
                    if (n7k.a() != null) {
                        return false;
                    }
                }
                else if (!d.equals(n7k.a())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (n7k.e() != null) {
                        return false;
                    }
                }
                else if (!e.equals(n7k.e())) {
                    return false;
                }
                if (this.f == n7k.b() && this.g == n7k.g()) {
                    final String h = this.h;
                    if (h == null) {
                        if (n7k.d() == null) {
                            return b;
                        }
                    }
                    else if (h.equals(n7k.d())) {
                        return b;
                    }
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int f() {
        return this.c;
    }
    
    public final long g() {
        return this.g;
    }
    
    public final int hashCode() {
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int d = nb0.D(this.c);
        final String d2 = this.d;
        int hashCode3;
        if (d2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d2.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n2 = (int)(g ^ g >>> 32);
        final String h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((hashCode2 ^ 0xF4243) * 1000003 ^ d) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("PersistedInstallationEntry{firebaseInstallationId=");
        g.append(this.b);
        g.append(", registrationStatus=");
        g.append(l7k.g(this.c));
        g.append(", authToken=");
        g.append(this.d);
        g.append(", refreshToken=");
        g.append(this.e);
        g.append(", expiresInSecs=");
        g.append(this.f);
        g.append(", tokenCreationEpochInSecs=");
        g.append(this.g);
        g.append(", fisError=");
        return hi.I(g, this.h, "}");
    }
    
    public static final class a extends n7k$a
    {
        public String a;
        public int b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;
        
        public a() {
        }
        
        public a(final n7k n7k) {
            this.a = n7k.c();
            this.b = n7k.f();
            this.c = n7k.a();
            this.d = n7k.e();
            this.e = n7k.b();
            this.f = n7k.g();
            this.g = n7k.d();
        }
        
        public final n7k a() {
            String s;
            if (this.b == 0) {
                s = " registrationStatus";
            }
            else {
                s = "";
            }
            String c = s;
            if (this.e == null) {
                c = l7k.c(s, " expiresInSecs");
            }
            String c2 = c;
            if (this.f == null) {
                c2 = l7k.c(c, " tokenCreationEpochInSecs");
            }
            if (c2.isEmpty()) {
                return new sb1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(l7k.c("Missing required properties:", c2));
        }
        
        public final n7k$a b(final long n) {
            this.e = n;
            return this;
        }
        
        public final n7k$a c(final int b) {
            if (b != 0) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
        
        public final n7k$a d(final long n) {
            this.f = n;
            return this;
        }
    }
}
