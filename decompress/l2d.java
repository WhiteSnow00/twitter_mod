import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l2d<GETTERS, MODEL> implements x6j<zsl, List<MODEL>>
{
    public final xmq<GETTERS> F0;
    public final m2d<? super GETTERS, MODEL> G0;
    public final lh6<ha8> H0;
    public final b39 I0;
    
    public l2d(final xmq<GETTERS> f0, final m2d<? super GETTERS, MODEL> g0) {
        e0e.f((Object)f0, "sourceReader");
        e0e.f((Object)g0, "hydrator");
        this.F0 = f0;
        this.G0 = g0;
        final lh6 publish = f0.a().publish();
        this.H0 = (lh6<ha8>)publish;
        this.I0 = publish.d();
    }
    
    public final void close() {
        this.I0.dispose();
    }
    
    @Override
    public final t5j w(final Object o) {
        final zsl zsl = (zsl)o;
        e0e.f((Object)zsl, "query");
        return ((t5j)this.H0).startWith((Object)ha8.a).observeOn(jxo.c()).map((rtb)new dql((stb)new k2d(this, zsl), 8)).observeOn(iqs.j()).replay(1).f();
    }
}
