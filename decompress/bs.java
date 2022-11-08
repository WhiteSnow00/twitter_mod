import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bs
{
    public final hn6 a;
    public final b b;
    
    public bs(final hn6 a, final b b) {
        zzd.f((Object)a, "notifier");
        this.a = a;
        this.b = b;
    }
    
    public final std a(final ews ews, final u4c u4c, final frm frm, final fws fws, final gzs gzs) {
        final as as = (as)ews;
        zzd.f((Object)u4c, "globalObjects");
        zzd.f((Object)frm, "responseObjects");
        final aws aws = new aws(fws.b0());
        final a c = this.b.c(as, aws);
        as.a a;
        if (c == null) {
            a = new as.a((List<? extends kus>)v2a.C0);
        }
        else {
            final z8a z8a = new z8a();
            final List<kus.a<?, ?>> c2 = as.c;
            final ArrayList list = new ArrayList();
            for (final kus.a a2 : c2) {
                a2.c = c.a();
                final kus kus = (kus)a2.j();
                if (kus != null) {
                    list.add(kus);
                }
            }
            final bzs$a o = bzs$a.o((List)list);
            o.c = fws.b0();
            o.f = this.a;
            final bzs bzs = (bzs)((h4j)o).e();
            this.b.b(bzs, z8a, list);
            a = new as.a(this.b.a(as, aws, list, bzs));
        }
        return (std)a;
    }
    
    public interface a
    {
        long a();
    }
    
    public interface b
    {
        List<kus> a(final as p0, final aws p1, final List<? extends kus> p2, final bzs p3);
        
        void b(final bzs p0, final z8a p1, final Iterable<? extends kus> p2);
        
        a c(final as p0, final aws p1);
    }
}
