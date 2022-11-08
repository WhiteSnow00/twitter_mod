import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owv implements xq<nvv>
{
    public static final owv a;
    public static final List<String> b;
    
    static {
        a = new owv();
        b = tdy.v0((Object[])new String[] { "card_fetch_state", "card_type", "display_options", "layout", "experiment_signals" });
    }
    
    public final nvv c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        Object o = null;
        Object o3;
        Object o2 = o3 = o;
        Object o5;
        Object o4 = o5 = o3;
        while (true) {
            final int k3 = eie.k3((List)owv.b);
            if (k3 != 0) {
                if (k3 != 1) {
                    if (k3 != 2) {
                        if (k3 != 3) {
                            if (k3 != 4) {
                                break;
                            }
                            o5 = ar.b((xq<nvv$b>)ar.c((xq<Object>)gwv.a, false)).b(eie, bb7);
                        }
                        else {
                            o4 = ar.b((xq<nvv$g>)ar.c((xq<Object>)lwv.a, true)).b(eie, bb7);
                        }
                    }
                    else {
                        o3 = ar.b((xq<nvv$a>)ar.c((xq<Object>)fwv.a, false)).b(eie, bb7);
                    }
                }
                else {
                    o2 = ar.b((xq<al3>)bl3.a).b(eie, bb7);
                }
            }
            else {
                o = ar.b((xq<kj3>)mj3.a).b(eie, bb7);
            }
        }
        return new nvv((kj3)o, (al3)o2, (nvv$a)o3, (nvv$g)o4, (nvv$b)o5);
    }
    
    public final void d(final qle qle, final bb7 bb7, final nvv nvv) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)nvv, "value");
        qle.A1("card_fetch_state");
        ar.b((xq<kj3>)mj3.a).a(qle, bb7, nvv.a);
        qle.A1("card_type");
        ar.b((xq<al3>)bl3.a).a(qle, bb7, nvv.b);
        qle.A1("display_options");
        ar.b((xq<nvv$a>)ar.c((xq<Object>)fwv.a, false)).a(qle, bb7, nvv.c);
        qle.A1("layout");
        ar.b((xq<nvv$g>)ar.c((xq<Object>)lwv.a, true)).a(qle, bb7, nvv.d);
        qle.A1("experiment_signals");
        ar.b((xq<nvv$b>)ar.c((xq<Object>)gwv.a, false)).a(qle, bb7, nvv.e);
    }
}
