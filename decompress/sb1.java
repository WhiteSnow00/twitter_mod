// 
// Decompiled by Procyon v0.6.0
// 

public final class sb1 extends i8k
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
        if (o instanceof i8k) {
            final i8k i8k = (i8k)o;
            final String b2 = this.b;
            if (b2 == null) {
                if (i8k.c() != null) {
                    return false;
                }
            }
            else if (!b2.equals(i8k.c())) {
                return false;
            }
            if (lb0.g(this.c, i8k.f())) {
                final String d = this.d;
                if (d == null) {
                    if (i8k.a() != null) {
                        return false;
                    }
                }
                else if (!d.equals(i8k.a())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (i8k.e() != null) {
                        return false;
                    }
                }
                else if (!e.equals(i8k.e())) {
                    return false;
                }
                if (this.f == i8k.b() && this.g == i8k.g()) {
                    final String h = this.h;
                    if (h == null) {
                        if (i8k.d() == null) {
                            return b;
                        }
                    }
                    else if (h.equals(i8k.d())) {
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
        final int g = lb0.G(this.c);
        final String d = this.d;
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
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g2 = this.g;
        final int n2 = (int)(g2 ^ g2 >>> 32);
        final String h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((hashCode2 ^ 0xF4243) * 1000003 ^ g) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("PersistedInstallationEntry{firebaseInstallationId=");
        f.append(this.b);
        f.append(", registrationStatus=");
        f.append(mw.D(this.c));
        f.append(", authToken=");
        f.append(this.d);
        f.append(", refreshToken=");
        f.append(this.e);
        f.append(", expiresInSecs=");
        f.append(this.f);
        f.append(", tokenCreationEpochInSecs=");
        f.append(this.g);
        f.append(", fisError=");
        return m51.y(f, this.h, "}");
    }
    
    public static final class a extends i8k$a
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
        
        public a(final i8k i8k) {
            this.a = i8k.c();
            this.b = i8k.f();
            this.c = i8k.a();
            this.d = i8k.e();
            this.e = i8k.b();
            this.f = i8k.g();
            this.g = i8k.d();
        }
        
        public final i8k a() {
            String s;
            if (this.b == 0) {
                s = " registrationStatus";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.e == null) {
                l = mqb.l(s, " expiresInSecs");
            }
            String i = l;
            if (this.f == null) {
                i = mqb.l(l, " tokenCreationEpochInSecs");
            }
            if (i.isEmpty()) {
                return new sb1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(mqb.l("Missing required properties:", i));
        }
        
        public final i8k$a b(final long n) {
            this.e = n;
            return this;
        }
        
        public final i8k$a c(final int b) {
            if (b != 0) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
        
        public final i8k$a d(final long n) {
            this.f = n;
            return this;
        }
    }
}
