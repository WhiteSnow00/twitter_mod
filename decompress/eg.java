import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eg extends bg
{
    public static final eg.eg$a Companion;
    public static eg e;
    public yis c;
    public wgp d;
    
    static {
        Companion = new eg.eg$a();
    }
    
    public eg() {
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
            final wgp d = this.d;
            if (d == null) {
                czd.m("node");
                throw null;
            }
            final c6m d2 = d.d();
            final int n2 = zyz.n(d2.d - d2.b);
            if (n <= 0) {
                n = 0;
            }
            final yis c = this.c;
            if (c == null) {
                czd.m("layoutResult");
                throw null;
            }
            final int f = c.f(n);
            final yis c2 = this.c;
            if (c2 == null) {
                czd.m("layoutResult");
                throw null;
            }
            final float n3 = c2.k(f) + n2;
            final yis c3 = this.c;
            if (c3 != null) {
                int n4;
                if (n3 < c3.k(c3.b.f - 1)) {
                    final yis c4 = this.c;
                    if (c4 == null) {
                        czd.m("layoutResult");
                        throw null;
                    }
                    n4 = c4.g(n3);
                }
                else {
                    final yis c5 = this.c;
                    if (c5 == null) {
                        czd.m("layoutResult");
                        throw null;
                    }
                    n4 = c5.b.f;
                }
                return this.c(n, this.f(n4 - 1, rqm.D0) + 1);
            }
            czd.m("layoutResult");
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
            final wgp d = this.d;
            if (d == null) {
                czd.m("node");
                throw null;
            }
            final c6m d2 = d.d();
            final int n = zyz.n(d2.d - d2.b);
            int length = this.d().length();
            if (length > g) {
                length = g;
            }
            final yis c = this.c;
            if (c == null) {
                czd.m("layoutResult");
                throw null;
            }
            final int f = c.f(length);
            final yis c2 = this.c;
            if (c2 != null) {
                final float n2 = c2.k(f) - n;
                if (n2 > 0.0f) {
                    final yis c3 = this.c;
                    if (c3 == null) {
                        czd.m("layoutResult");
                        throw null;
                    }
                    g = c3.g(n2);
                }
                else {
                    g = 0;
                }
                int n3 = g;
                if (length == this.d().length() && (n3 = g) < f) {
                    n3 = g + 1;
                }
                return this.c(this.f(n3, rqm.E0), length);
            }
            czd.m("layoutResult");
            throw null;
        }
        catch (final IllegalStateException ex) {
            return null;
        }
    }
    
    public final int f(int j, final rqm rqm) {
        final yis c = this.c;
        if (c == null) {
            czd.m("layoutResult");
            throw null;
        }
        final int i = c.j(j);
        final yis c2 = this.c;
        if (c2 != null) {
            if (rqm != c2.m(i)) {
                final yis c3 = this.c;
                if (c3 == null) {
                    czd.m("layoutResult");
                    throw null;
                }
                j = c3.j(j);
            }
            else {
                final yis c4 = this.c;
                if (c4 == null) {
                    czd.m("layoutResult");
                    throw null;
                }
                j = c4.e(j, false) - 1;
            }
            return j;
        }
        czd.m("layoutResult");
        throw null;
    }
}
