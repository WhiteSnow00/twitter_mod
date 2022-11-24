import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg extends cg
{
    public static final fg.fg$a Companion;
    public static fg e;
    public qjs c;
    public thp d;
    
    static {
        Companion = new fg.fg$a();
    }
    
    public fg() {
        new Rect();
    }
    
    public final int[] a(int n) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (n >= this.d().length()) {
            return null;
        }
        try {
            final thp d = this.d;
            if (d == null) {
                e0e.m("node");
                throw null;
            }
            final p6m d2 = d.d();
            final int b0 = jb2.B0(d2.d - d2.b);
            if (n <= 0) {
                n = 0;
            }
            final qjs c = this.c;
            if (c == null) {
                e0e.m("layoutResult");
                throw null;
            }
            final int f = c.f(n);
            final qjs c2 = this.c;
            if (c2 == null) {
                e0e.m("layoutResult");
                throw null;
            }
            final float n2 = c2.k(f) + b0;
            final qjs c3 = this.c;
            if (c3 != null) {
                int n3;
                if (n2 < c3.k(c3.b.f - 1)) {
                    final qjs c4 = this.c;
                    if (c4 == null) {
                        e0e.m("layoutResult");
                        throw null;
                    }
                    n3 = c4.g(n2);
                }
                else {
                    final qjs c5 = this.c;
                    if (c5 == null) {
                        e0e.m("layoutResult");
                        throw null;
                    }
                    n3 = c5.b.f;
                }
                return this.c(n, this.f(n3 - 1, frm.F0) + 1);
            }
            e0e.m("layoutResult");
            throw null;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
    }
    
    public final int[] b(int g) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (g <= 0) {
            return null;
        }
        try {
            final thp d = this.d;
            if (d == null) {
                e0e.m("node");
                throw null;
            }
            final p6m d2 = d.d();
            final int b0 = jb2.B0(d2.d - d2.b);
            int length = this.d().length();
            if (length > g) {
                length = g;
            }
            final qjs c = this.c;
            if (c == null) {
                e0e.m("layoutResult");
                throw null;
            }
            final int f = c.f(length);
            final qjs c2 = this.c;
            if (c2 != null) {
                final float n = c2.k(f) - b0;
                if (n > 0.0f) {
                    final qjs c3 = this.c;
                    if (c3 == null) {
                        e0e.m("layoutResult");
                        throw null;
                    }
                    g = c3.g(n);
                }
                else {
                    g = 0;
                }
                int n2 = g;
                if (length == this.d().length() && (n2 = g) < f) {
                    n2 = g + 1;
                }
                return this.c(this.f(n2, frm.G0), length);
            }
            e0e.m("layoutResult");
            throw null;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
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
