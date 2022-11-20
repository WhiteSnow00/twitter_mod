// 
// Decompiled by Procyon v0.6.0
// 

public final class bb1 extends ksd
{
    public final String a;
    public final String b;
    public final String c;
    public final jht d;
    public final int e;
    
    public bb1(final String a, final String b, final String c, final jht d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final jht a() {
        return this.d;
    }
    
    @Override
    public final String b() {
        return this.b;
    }
    
    @Override
    public final String c() {
        return this.c;
    }
    
    @Override
    public final int d() {
        return this.e;
    }
    
    @Override
    public final String e() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ksd) {
            final ksd ksd = (ksd)o;
            final String a = this.a;
            if (a == null) {
                if (ksd.e() != null) {
                    return false;
                }
            }
            else if (!a.equals(ksd.e())) {
                return false;
            }
            final String b2 = this.b;
            if (b2 == null) {
                if (ksd.b() != null) {
                    return false;
                }
            }
            else if (!b2.equals(ksd.b())) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (ksd.c() != null) {
                    return false;
                }
            }
            else if (!c.equals(ksd.c())) {
                return false;
            }
            final jht d = this.d;
            if (d == null) {
                if (ksd.a() != null) {
                    return false;
                }
            }
            else if (!d.equals(ksd.a())) {
                return false;
            }
            final int e = this.e;
            if (e == 0) {
                if (ksd.d() == 0) {
                    return b;
                }
            }
            else if (ib0.e(e, ksd.d())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int e = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final String c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final jht d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final int e2 = this.e;
        if (e2 != 0) {
            e = ib0.E(e2);
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("InstallationResponse{uri=");
        j.append(this.a);
        j.append(", fid=");
        j.append(this.b);
        j.append(", refreshToken=");
        j.append(this.c);
        j.append(", authToken=");
        j.append(this.d);
        j.append(", responseCode=");
        j.append(jg9.A(this.e));
        j.append("}");
        return j.toString();
    }
}
