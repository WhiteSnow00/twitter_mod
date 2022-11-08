// 
// Decompiled by Procyon v0.6.0
// 

public final class la1 extends d17$e$d$a$b
{
    public final bed<d17$e$d$a$b$d> a;
    public final d17$e$d$a$b$b b;
    public final d17$a c;
    public final d17$e$d$a$b$c d;
    public final bed<d17$e$d$a$b$a> e;
    
    public la1(final bed a, final d17$e$d$a$b$b b, final d17$a c, final d17$e$d$a$b$c d, final bed e, final la1$a la1$a) {
        this.a = (bed<d17$e$d$a$b$d>)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (bed<d17$e$d$a$b$a>)e;
    }
    
    public final d17$a a() {
        return this.c;
    }
    
    public final bed<d17$e$d$a$b$a> b() {
        return this.e;
    }
    
    public final d17$e$d$a$b$b c() {
        return this.b;
    }
    
    public final d17$e$d$a$b$c d() {
        return this.d;
    }
    
    public final bed<d17$e$d$a$b$d> e() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d17$e$d$a$b) {
            final d17$e$d$a$b d17$e$d$a$b = (d17$e$d$a$b)o;
            final bed<d17$e$d$a$b$d> a = this.a;
            if (a == null) {
                if (d17$e$d$a$b.e() != null) {
                    return false;
                }
            }
            else if (!a.equals((Object)d17$e$d$a$b.e())) {
                return false;
            }
            final d17$e$d$a$b$b b2 = this.b;
            if (b2 == null) {
                if (d17$e$d$a$b.c() != null) {
                    return false;
                }
            }
            else if (!b2.equals(d17$e$d$a$b.c())) {
                return false;
            }
            final d17$a c = this.c;
            if (c == null) {
                if (d17$e$d$a$b.a() != null) {
                    return false;
                }
            }
            else if (!c.equals(d17$e$d$a$b.a())) {
                return false;
            }
            if (this.d.equals(d17$e$d$a$b.d()) && this.e.equals((Object)d17$e$d$a$b.b())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final bed<d17$e$d$a$b$d> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final d17$e$d$a$b$b b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final d17$a c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Execution{threads=");
        g.append(this.a);
        g.append(", exception=");
        g.append(this.b);
        g.append(", appExitInfo=");
        g.append(this.c);
        g.append(", signal=");
        g.append(this.d);
        g.append(", binaries=");
        g.append(this.e);
        g.append("}");
        return g.toString();
    }
}
