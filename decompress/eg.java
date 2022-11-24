// 
// Decompiled by Procyon v0.6.0
// 

public final class eg extends cg
{
    public static final eg.eg$a Companion;
    public static eg d;
    public qjs c;
    
    static {
        Companion = new eg.eg$a();
    }
    
    public eg(final wg8 wg8) {
    }
    
    public final int[] a(int f) {
        final frm g0 = frm.G0;
        if (this.d().length() <= 0) {
            return null;
        }
        if (f >= this.d().length()) {
            return null;
        }
        if (f < 0) {
            final qjs c = this.c;
            if (c == null) {
                e0e.m("layoutResult");
                throw null;
            }
            f = c.f(0);
        }
        else {
            final qjs c2 = this.c;
            if (c2 == null) {
                e0e.m("layoutResult");
                throw null;
            }
            final int f2 = c2.f(f);
            if (this.f(f2, g0) == f) {
                f = f2;
            }
            else {
                f = f2 + 1;
            }
        }
        final qjs c3 = this.c;
        if (c3 == null) {
            e0e.m("layoutResult");
            throw null;
        }
        if (f >= c3.b.f) {
            return null;
        }
        return this.c(this.f(f, g0), this.f(f, frm.F0) + 1);
    }
    
    public final int[] b(int f) {
        final frm f2 = frm.F0;
        if (this.d().length() <= 0) {
            return null;
        }
        if (f <= 0) {
            return null;
        }
        if (f > this.d().length()) {
            final qjs c = this.c;
            if (c == null) {
                e0e.m("layoutResult");
                throw null;
            }
            f = c.f(this.d().length());
        }
        else {
            final qjs c2 = this.c;
            if (c2 == null) {
                e0e.m("layoutResult");
                throw null;
            }
            final int f3 = c2.f(f);
            if (this.f(f3, f2) + 1 == f) {
                f = f3;
            }
            else {
                f = f3 - 1;
            }
        }
        if (f < 0) {
            return null;
        }
        return this.c(this.f(f, frm.G0), this.f(f, f2) + 1);
    }
    
    public final int f(int j, final frm frm) {
        final qjs c = this.c;
        if (c == null) {
            e0e.m("layoutResult");
            throw null;
        }
        final int i = c.j(j);
        final qjs c2 = this.c;
        if (c2 != null) {
            if (frm != c2.m(i)) {
                final qjs c3 = this.c;
                if (c3 == null) {
                    e0e.m("layoutResult");
                    throw null;
                }
                j = c3.j(j);
            }
            else {
                final qjs c4 = this.c;
                if (c4 == null) {
                    e0e.m("layoutResult");
                    throw null;
                }
                j = c4.e(j, false) - 1;
            }
            return j;
        }
        e0e.m("layoutResult");
        throw null;
    }
}
