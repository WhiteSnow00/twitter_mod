// 
// Decompiled by Procyon v0.6.0
// 

public final class la1 extends o17$e$d$a$b
{
    public final fed<o17$e$d$a$b$d> a;
    public final o17$e$d$a$b$b b;
    public final o17$a c;
    public final o17$e$d$a$b$c d;
    public final fed<o17$e$d$a$b$a> e;
    
    public la1(final fed a, final o17$e$d$a$b$b b, final o17$a c, final o17$e$d$a$b$c d, final fed e, final la1$a la1$a) {
        this.a = (fed<o17$e$d$a$b$d>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (fed<o17$e$d$a$b$a>)e;
    }
    
    public final o17$a a() {
        return this.c;
    }
    
    public final fed<o17$e$d$a$b$a> b() {
        return this.e;
    }
    
    public final o17$e$d$a$b$b c() {
        return this.b;
    }
    
    public final o17$e$d$a$b$c d() {
        return this.d;
    }
    
    public final fed<o17$e$d$a$b$d> e() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o17$e$d$a$b) {
            final o17$e$d$a$b o17$e$d$a$b = (o17$e$d$a$b)o;
            final fed<o17$e$d$a$b$d> a = this.a;
            if (a == null) {
                if (o17$e$d$a$b.e() != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)o17$e$d$a$b.e())) {
                return false;
            }
            final o17$e$d$a$b$b b2 = this.b;
            if (b2 == null) {
                if (o17$e$d$a$b.c() != null) {
                    return false;
                }
            }
            else if (!b2.equals(o17$e$d$a$b.c())) {
                return false;
            }
            final o17$a c = this.c;
            if (c == null) {
                if (o17$e$d$a$b.a() != null) {
                    return false;
                }
            }
            else if (!c.equals(o17$e$d$a$b.a())) {
                return false;
            }
            if (this.d.equals(o17$e$d$a$b.d()) && this.e.equals((Object)o17$e$d$a$b.b())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final fed<o17$e$d$a$b$d> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final o17$e$d$a$b$b b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final o17$a c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Execution{threads=");
        f.append(this.a);
        f.append(", exception=");
        f.append(this.b);
        f.append(", appExitInfo=");
        f.append(this.c);
        f.append(", signal=");
        f.append(this.d);
        f.append(", binaries=");
        f.append(this.e);
        f.append("}");
        return f.toString();
    }
}
