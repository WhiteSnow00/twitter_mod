// 
// Decompiled by Procyon v0.6.0
// 

public final class wem implements rxs<vem, nxs, p0t>
{
    public final wem.wem$a F0;
    
    public wem(final wem.wem$a f0) {
        this.F0 = f0;
    }
    
    public final xtd c(final mxs mxs, final Object o, final Object o2) {
        final vem vem = (vem)mxs;
        final nxs nxs = (nxs)o;
        final p0t p0t = (p0t)o2;
        e0e.f((Object)vem, "instruction");
        e0e.f((Object)nxs, "requestContext");
        final exs b0 = nxs.b0();
        final int b2 = this.F0.b(b0, (Iterable)vem.a);
        if (b2 > 0) {
            this.F0.a(b0);
        }
        return (xtd)new vem$a(b2);
    }
}
