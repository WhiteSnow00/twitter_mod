import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppp extends bur
{
    public static final int q = 0;
    public final List<rrp> j;
    public final String k;
    public final pej l;
    public final cph m;
    public final boolean n;
    public final e4a o;
    public final boolean p;
    
    public ppp(final ppp.ppp$a ppp$a) {
        super((bur$a)ppp$a);
        final List k = ppp$a.k;
        vmw.g((Object)k);
        this.j = k;
        this.k = ppp$a.l;
        this.l = ppp$a.m;
        this.m = ppp$a.n;
        this.n = ppp$a.o;
        this.o = ppp$a.p;
        this.p = ppp$a.q;
    }
    
    public final List<oh0> a() {
        final ojf h = ojf.H();
        h.q((Iterable)super.a());
        h.q((Iterable)Collection$_EL.stream((Collection)this.j).flatMap((Function)vie.d).collect(Collectors.toList()));
        return (List)((z4j)h).e();
    }
    
    public final qtr b(final String s) {
        return (qtr)new mpp(s, this);
    }
}
