// 
// Decompiled by Procyon v0.6.0
// 

public final class ahx extends lsr
{
    public final int j;
    public final int k;
    public final int l;
    public final ahx.ahx$b m;
    public final xrv n;
    public final xdj o;
    public final dsr p;
    public final xdj q;
    public final String r;
    public final xrv s;
    
    public ahx(final ahx.ahx$a ahx$a) {
        super((lsr.lsr$a)ahx$a);
        this.j = ahx$a.k;
        this.k = ahx$a.l;
        final xdj n = ahx$a.n;
        final xdj k0 = xdj.K0;
        xdj o = n;
        if (n == null) {
            o = k0;
        }
        this.o = o;
        this.p = ahx$a.o;
        this.n = ahx$a.p;
        this.q = ahx$a.q;
        this.m = ahx$a.r;
        this.r = ahx$a.s;
        this.l = ahx$a.m;
        this.s = ahx$a.t;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new chx(s, this);
    }
}
