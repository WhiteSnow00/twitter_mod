import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqn extends ste implements qsb<uqn, uqn>
{
    public final List<eig> D0;
    public final r7m<List<eig>> E0;
    public final List<eig> F0;
    public final List<eig> G0;
    
    public pqn(final List<? extends eig> d0, final r7m<List<eig>> e0, final List<? extends eig> f0, final List<? extends eig> g0) {
        this.D0 = (List<eig>)d0;
        this.E0 = e0;
        this.F0 = (List<eig>)f0;
        this.G0 = (List<eig>)g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final uqn uqn = (uqn)o;
        czd.f((Object)uqn, "$this$setState");
        return uqn.l(uqn, false, mq4.x0((Collection)mq4.x0((Collection)mq4.x0((Collection)this.D0, (Iterable)this.E0.D0), (Iterable)this.F0), (Iterable)this.G0), (List)null, (List)null, (List)null, (List)null, 0, (String)null, (n8s)null, (wqn)null, false, 0, 0, (Boolean)null, 32763);
    }
}
