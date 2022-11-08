import j$.util.stream.Collectors;
import j$.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cop extends lsr
{
    public final List<fqp> j;
    public final String k;
    public final xdj l;
    public final ioh m;
    public final boolean n;
    public final s3a o;
    public final boolean p;
    
    public cop(final cop.cop$a cop$a) {
        super((lsr.lsr$a)cop$a);
        final List k = cop$a.k;
        pf8.r(k);
        this.j = k;
        this.k = cop$a.l;
        this.l = cop$a.m;
        this.m = cop$a.n;
        this.n = cop$a.o;
        this.o = cop$a.p;
        this.p = cop$a.q;
    }
    
    @Override
    public final List<rh0> a() {
        final ijf h = ijf.H();
        h.q((Iterable)super.a());
        h.q((Iterable)Collection$_EL.stream((Collection)this.j).flatMap((Function)gje.c).collect(Collectors.toList()));
        return (List)((h4j)h).e();
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new znp(s, this);
    }
}
