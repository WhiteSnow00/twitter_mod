import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yci implements xea
{
    public final x4f<ldi> D0;
    public final q88 E0;
    
    public yci(final x4f<ldi> d0, final q88 e0) {
        czd.f((Object)d0, "networkOperationBroadcaster");
        czd.f((Object)e0, "dataUsageTypeConverter");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void a(final arc<?, ?> arc) {
        czd.f((Object)arc, "operation");
        final bsc n = arc.n;
        czd.e((Object)n, "operation.result");
        if (!arc.x) {
            final boolean g = as2.G();
            long f;
            if (g) {
                final Iterator iterator = s9i.s((Long)n.l, (Long)n.m, (Long)n.k, ii8.z((arc)arc)).iterator();
                long n2 = 0L;
                while (iterator.hasNext()) {
                    final Long n3 = (Long)iterator.next();
                    long longValue;
                    if (n3 != null && n3 > 0L) {
                        longValue = n3;
                    }
                    else {
                        longValue = 0L;
                    }
                    n2 += longValue;
                }
                f = n.e - n2;
            }
            else {
                f = n.f;
            }
            final x4f<ldi> d0 = this.D0;
            final p88 a = this.E0.a(arc.c.getHost(), n.r);
            long n4;
            if (g) {
                n4 = n.i;
            }
            else {
                n4 = arc.g();
            }
            d0.a((Object)new ldi(a, (c12)new k63((double)n4), (nl9)new zah((double)arc.e), (c12)new k63((double)n.j), (nl9)new zah((double)f), (nl9)new zah((double)n.z[3])));
        }
    }
    
    @Override
    public final void b(final arc arc, final Exception ex) {
    }
    
    @Override
    public final void c(final arc arc) {
    }
    
    @Override
    public final void d(final arc arc) {
    }
}
