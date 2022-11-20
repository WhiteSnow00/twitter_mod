import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pru extends ste implements qsb<List<? extends wqp>, ckf<Object>>
{
    public static final pru D0;
    
    static {
        D0 = new pru();
    }
    
    public pru() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        czd.f((Object)list, "$this$null");
        final wcj$b a = wcj.a;
        return new ckf((Iterable)wcj.a(list, (qsb)wcj.a, list.size()));
    }
}
