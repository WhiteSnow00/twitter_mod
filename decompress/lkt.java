import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkt
{
    public static final alp<lkt> d;
    public final String a;
    public final xdj b;
    public final List<mkt> c;
    
    static {
        lkt.d = new lkt.lkt$b();
    }
    
    public lkt(final lkt.lkt$a lkt$a) {
        final String a = lkt$a.a;
        pf8.r(a);
        this.a = a;
        final xdj b = lkt$a.b;
        final xdj k0 = xdj.K0;
        xdj b2 = b;
        if (b == null) {
            b2 = k0;
        }
        this.b = b2;
        Object c;
        if ((c = lkt$a.c) == null) {
            c = v2a.C0;
        }
        this.c = (List<mkt>)c;
    }
}
