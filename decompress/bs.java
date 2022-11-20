import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bs
{
    public final nm6 a;
    public final b b;
    
    public bs(final nm6 a, final b b) {
        czd.f((Object)a, "notifier");
        this.a = a;
        this.b = b;
    }
    
    public final vsd a(final tws tws, final w3c w3c, final wrm wrm, final uws uws, final wzs wzs) {
        final as as = (as)tws;
        czd.f((Object)w3c, "globalObjects");
        czd.f((Object)wrm, "responseObjects");
        final mws mws = new mws(uws.b0());
        final a c = this.b.c(as, mws);
        as$a as$a;
        if (c == null) {
            as$a = new as$a((List)f2a.D0);
        }
        else {
            final h8a h8a = new h8a();
            final List c2 = as.c;
            final ArrayList list = new ArrayList();
            for (final zus$a zus$a : c2) {
                zus$a.c = c.a();
                final zus zus = (zus)((n4j)zus$a).j();
                if (zus != null) {
                    list.add(zus);
                }
            }
            final rzs$a o = rzs$a.o((List)list);
            o.c = uws.b0();
            o.f = this.a;
            final rzs rzs = (rzs)((n4j)o).e();
            this.b.b(rzs, h8a, list);
            as$a = new as$a((List)this.b.a(as, mws, list, rzs));
        }
        return (vsd)as$a;
    }
    
    public interface a
    {
        long a();
    }
    
    public interface b
    {
        List<zus> a(final as p0, final mws p1, final List<? extends zus> p2, final rzs p3);
        
        void b(final rzs p0, final h8a p1, final Iterable<? extends zus> p2);
        
        a c(final as p0, final mws p1);
    }
}
