import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncl implements vxp<ocl>
{
    public final List<xxp> C0;
    public final ocw D0;
    
    public ncl(final List<xxp> c0, final ocw d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final void b0(final yxp yxp) {
        final ocl ocl = (ocl)yxp;
        for (final xxp xxp : this.C0) {
            final int b = xxp.b();
            Object o;
            if (b != 1) {
                if (b != 2) {
                    throw new IllegalArgumentException("Binding for argument does not exist.");
                }
                o = new y0g(ocl.a, this.D0);
            }
            else {
                o = new cjb(ocl.a, this.D0);
            }
            xxp.a((wxp)o);
        }
    }
}
