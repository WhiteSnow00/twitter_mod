// 
// Decompiled by Procyon v0.6.0
// 

public final class fv7 implements nuk<ngv>
{
    public final boolean a(final ngv ngv) {
        final qgv d = ngv.d;
        boolean b = true;
        if (d != null && fbx.h(d.K1)) {
            final qgv d2 = ngv.d;
            if (d2 != null && !fbx.E(d2.K1) && !fbx.F(d2.K1) && !d2.N0) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final /* bridge */ boolean apply(final Object o) {
        return this.a((ngv)o);
    }
}
