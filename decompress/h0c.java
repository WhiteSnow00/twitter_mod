import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h0c extends pue implements stb<List<? extends rrp>, zkf<Object>>
{
    public static final h0c F0;
    
    static {
        F0 = new h0c();
    }
    
    public h0c() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        e0e.f((Object)list, "$this$null");
        final stb<rrp, ipp> a = (stb<rrp, ipp>)jdj.a;
        return new zkf((Iterable)jdj.a(list, (stb)jdj.b, list.size()));
    }
}
