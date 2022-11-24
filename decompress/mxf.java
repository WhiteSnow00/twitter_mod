// 
// Decompiled by Procyon v0.6.0
// 

public final class mxf extends lo1<qxf>
{
    public final nxf G0;
    
    public mxf(final nxf g0) {
        this.G0 = g0;
    }
    
    public final void onError(final Throwable t) {
        r9a.d(t);
        final nxf g0 = this.G0;
        final hxf a = g0.a;
        final zof j = g0.j;
        vmw.g((Object)j);
        final qxf d = a.d(j.a);
        if (d != null) {
            this.G0.i.V0(d.a());
        }
    }
    
    public final void onNext(final Object o) {
        final qxf qxf = (qxf)o;
        final nxf g0 = this.G0;
        final hxf a = g0.a;
        final zof j = g0.j;
        vmw.g((Object)j);
        a.e(j.a, qxf);
        this.G0.i.V0(qxf.a());
    }
}
