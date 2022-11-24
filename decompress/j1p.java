// 
// Decompiled by Procyon v0.6.0
// 

public final class j1p extends blg
{
    public static final nmp<j1p> b;
    public static final String[] c;
    
    static {
        j1p.b = new j1p.j1p$b();
        c = new String[] { "type", "source", "provider" };
    }
    
    public j1p(final j1p.j1p$a j1p$a) {
        super(j1p.c.length);
        this.d(0, (Object)j1p$a.a);
        this.d(1, (Object)j1p$a.b);
        final String c = j1p$a.c;
        if (c != null) {
            this.d(2, (Object)c);
        }
    }
    
    public j1p(final jx9 jx9) {
        super(j1p.c.length);
        this.d(0, (Object)jx9.F0.c.G0);
        final n0h h0 = jx9.H0;
        this.d(1, (Object)h0.G0);
        final rnb i0 = h0.I0;
        if (i0 != null) {
            this.d(2, (Object)i0.F0);
        }
    }
    
    public final String c(final int n) {
        return j1p.c[n];
    }
}
