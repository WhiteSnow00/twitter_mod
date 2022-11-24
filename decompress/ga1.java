// 
// Decompiled by Procyon v0.6.0
// 

public final class ga1 extends o17$e$a
{
    public final String a;
    public final String b;
    public final String c;
    public final o17$e$a$a d;
    public final String e;
    public final String f;
    public final String g;
    
    public ga1(final String a, final String b, final String c, final String e, final String f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final String a() {
        return this.f;
    }
    
    public final String b() {
        return this.g;
    }
    
    public final String c() {
        return this.c;
    }
    
    public final String d() {
        return this.a;
    }
    
    public final String e() {
        return this.e;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$a) {
            final o17$e$a o17$e$a = (o17$e$a)o;
            if (this.a.equals(o17$e$a.d()) && this.b.equals(o17$e$a.g())) {
                final String c = this.c;
                if (c == null) {
                    if (o17$e$a.c() != null) {
                        return false;
                    }
                }
                else if (!c.equals(o17$e$a.c())) {
                    return false;
                }
                final o17$e$a$a d = this.d;
                if (d == null) {
                    if (o17$e$a.f() != null) {
                        return false;
                    }
                }
                else if (!d.equals(o17$e$a.f())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (o17$e$a.e() != null) {
                        return false;
                    }
                }
                else if (!e.equals(o17$e$a.e())) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (o17$e$a.a() != null) {
                        return false;
                    }
                }
                else if (!f.equals(o17$e$a.a())) {
                    return false;
                }
                final String g = this.g;
                if (g == null) {
                    if (o17$e$a.b() == null) {
                        return b;
                    }
                }
                else if (g.equals(o17$e$a.b())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final o17$e$a$a f() {
        return this.d;
    }
    
    public final String g() {
        return this.b;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final o17$e$a$a d = this.d;
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
        if (g != null) {
            hashCode3 = g.hashCode();
        }
        return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode3;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Application{identifier=");
        f.append(this.a);
        f.append(", version=");
        f.append(this.b);
        f.append(", displayVersion=");
        f.append(this.c);
        f.append(", organization=");
        f.append(this.d);
        f.append(", installationUuid=");
        f.append(this.e);
        f.append(", developmentPlatform=");
        f.append(this.f);
        f.append(", developmentPlatformVersion=");
        return m51.y(f, this.g, "}");
    }
}
