import tv.periscope.model.b;
import java.util.Iterator;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwf extends ste implements qsb<ztf, zvf$b$a>
{
    public final zvf D0;
    public final w4 E0;
    
    public cwf(final zvf d0, final w4 e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(Object b) {
        final ztf ztf = (ztf)b;
        czd.f((Object)ztf, "it");
        final zvf d0 = this.D0;
        final w4 e0 = this.E0;
        Objects.requireNonNull(d0);
        final String z0 = nza.Z0(e0.b.c1);
        czd.e((Object)z0, "getMediaIdFromDataSource(attachment.avDataSource)");
        for (final ll3 ll3 : ztf.a.d) {
            final int j = ll3.j;
            final Object o = null;
            Object a = null;
            if (j != 1) {
                if (j != 3) {
                    continue;
                }
                final lnu g = ll3.g;
                if (g != null) {
                    a = g.a;
                }
                if (!czd.a((Object)z0, a)) {
                    continue;
                }
                b = new ynj((Object)ll3);
            }
            else {
                final b b2 = ll3.b;
                Object w = o;
                if (b2 != null) {
                    w = b2.w();
                }
                if (!czd.a((Object)z0, w)) {
                    continue;
                }
                b = new ynj((Object)ll3);
            }
            return new zvf$b$a(ztf, (ynj)b);
        }
        b = ynj.b;
        final int a2 = c5j.a;
        return new zvf$b$a(ztf, (ynj)b);
    }
}
