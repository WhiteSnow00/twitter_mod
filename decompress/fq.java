// 
// Decompiled by Procyon v0.6.0
// 

public final class fq extends ste implements qsb<xrc<a7$b, kbv>, hq>
{
    public final gq D0;
    
    public fq(final gq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xrc xrc = (xrc)o;
        czd.f((Object)xrc, "it");
        hq hq;
        if (!xrc.b) {
            final m8a b = this.D0.b;
            Exception d;
            if ((d = xrc.d) == null) {
                d = new IllegalStateException(udu.z("AdId consent mutation error: ", xrc.c));
            }
            b.f((Throwable)d);
            hq = hq.E0;
        }
        else {
            hq = hq.D0;
        }
        return hq;
    }
}
