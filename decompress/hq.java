// 
// Decompiled by Procyon v0.6.0
// 

public final class hq extends pue implements stb<xsc<z6$b, zbv>, jq>
{
    public final iq F0;
    
    public hq(final iq f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xsc xsc = (xsc)o;
        e0e.f((Object)xsc, "it");
        jq jq;
        if (!xsc.b) {
            final r9a b = this.F0.b;
            Exception d;
            if ((d = xsc.d) == null) {
                d = new IllegalStateException(rk0.B("AdId consent mutation error: ", xsc.c));
            }
            b.f((Throwable)d);
            jq = jq.G0;
        }
        else {
            jq = jq.F0;
        }
        return jq;
    }
}
