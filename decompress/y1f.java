import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y1f
{
    public final mxe a;
    public final yze b;
    public final int c;
    public final kqg d;
    
    public y1f(final mxe a, final yze b, final int c, final kqg d) {
        czd.f((Object)a, "itemProvider");
        czd.f((Object)b, "measureScope");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final w1f a(final int n, final int n2, final long n3) {
        final Object g = ((tze)this.a).g(n);
        final List<wgk> l = this.b.L(n, n3);
        int n4;
        if (pi6.f(n3)) {
            n4 = pi6.j(n3);
        }
        else {
            if (!pi6.e(n3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            n4 = pi6.i(n3);
        }
        return this.d.a(n, g, n4, n2, l);
    }
}
