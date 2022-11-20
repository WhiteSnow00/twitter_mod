// 
// Decompiled by Procyon v0.6.0
// 

public final class blg implements yws<alg, uws, wzs>
{
    public final a D0;
    
    public blg(final a d0) {
        this.D0 = d0;
    }
    
    public final vsd d(final tws tws, final Object o, final Object o2) {
        final alg alg = (alg)tws;
        final uws uws = (uws)o;
        final wzs wzs = (wzs)o2;
        czd.f((Object)alg, "instruction");
        czd.f((Object)uws, "requestContext");
        final lws b0 = uws.b0();
        final int b2 = this.D0.b(b0, alg.a);
        if (b2 > 0) {
            this.D0.a(b0);
        }
        return (vsd)new alg$a(b2);
    }
    
    public interface a
    {
        void a(final lws p0);
        
        int b(final lws p0, final Iterable<String> p1);
    }
}
