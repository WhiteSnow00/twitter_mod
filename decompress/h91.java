// 
// Decompiled by Procyon v0.6.0
// 

public final class h91 extends h20
{
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    
    public h91(final Integer a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final String a() {
        return this.l;
    }
    
    public final String b() {
        return this.j;
    }
    
    public final String c() {
        return this.d;
    }
    
    public final String d() {
        return this.h;
    }
    
    public final String e() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof h20) {
            final h20 h20 = (h20)o;
            final Integer a = this.a;
            if (a == null) {
                if (h20.l() != null) {
                    return false;
                }
            }
            else if (!a.equals(h20.l())) {
                return false;
            }
            final String b2 = this.b;
            if (b2 == null) {
                if (h20.i() != null) {
                    return false;
                }
            }
            else if (!b2.equals(h20.i())) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (h20.e() != null) {
                    return false;
                }
            }
            else if (!c.equals(h20.e())) {
                return false;
            }
            final String d = this.d;
            if (d == null) {
                if (h20.c() != null) {
                    return false;
                }
            }
            else if (!d.equals(h20.c())) {
                return false;
            }
            final String e = this.e;
            if (e == null) {
                if (h20.k() != null) {
                    return false;
                }
            }
            else if (!e.equals(h20.k())) {
                return false;
            }
            final String f = this.f;
            if (f == null) {
                if (h20.j() != null) {
                    return false;
                }
            }
            else if (!f.equals(h20.j())) {
                return false;
            }
            final String g = this.g;
            if (g == null) {
                if (h20.g() != null) {
                    return false;
                }
            }
            else if (!g.equals(h20.g())) {
                return false;
            }
            final String h21 = this.h;
            if (h21 == null) {
                if (h20.d() != null) {
                    return false;
                }
            }
            else if (!h21.equals(h20.d())) {
                return false;
            }
            final String i = this.i;
            if (i == null) {
                if (h20.f() != null) {
                    return false;
                }
            }
            else if (!i.equals(h20.f())) {
                return false;
            }
            final String j = this.j;
            if (j == null) {
                if (h20.b() != null) {
                    return false;
                }
            }
            else if (!j.equals(h20.b())) {
                return false;
            }
            final String k = this.k;
            if (k == null) {
                if (h20.h() != null) {
                    return false;
                }
            }
            else if (!k.equals(h20.h())) {
                return false;
            }
            final String l = this.l;
            if (l == null) {
                if (h20.a() == null) {
                    return b;
                }
            }
            else if (l.equals(h20.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final String f() {
        return this.i;
    }
    
    public final String g() {
        return this.g;
    }
    
    public final String h() {
        return this.k;
    }
    
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return (((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode;
    }
    
    public final String i() {
        return this.b;
    }
    
    public final String j() {
        return this.f;
    }
    
    public final String k() {
        return this.e;
    }
    
    public final Integer l() {
        return this.a;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("AndroidClientInfo{sdkVersion=");
        f.append(this.a);
        f.append(", model=");
        f.append(this.b);
        f.append(", hardware=");
        f.append(this.c);
        f.append(", device=");
        f.append(this.d);
        f.append(", product=");
        f.append(this.e);
        f.append(", osBuild=");
        f.append(this.f);
        f.append(", manufacturer=");
        f.append(this.g);
        f.append(", fingerprint=");
        f.append(this.h);
        f.append(", locale=");
        f.append(this.i);
        f.append(", country=");
        f.append(this.j);
        f.append(", mccMnc=");
        f.append(this.k);
        f.append(", applicationBuild=");
        return m51.y(f, this.l, "}");
    }
}
