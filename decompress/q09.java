import java.util.Map;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q09 implements np6<l4a, Void>
{
    public final r1l a;
    public final n1l b;
    public final pk6 c;
    public final s09 d;
    
    public q09(final s09 d, final r1l a, final n1l b, final pk6 c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final pcs pcs) throws Exception {
        Object o = pcs.a;
        synchronized (o) {
            final boolean c = pcs.c;
            monitorexit(o);
            if (c || (pcs.e() && pcs.d() instanceof CancellationException)) {
                this.a.g(this.b, "DiskCacheProducer");
                this.c.a();
                return;
            }
            if (pcs.e()) {
                this.a.h(this.b, "DiskCacheProducer", pcs.d(), null);
                this.d.d.a(this.c, this.b);
                return;
            }
            o = pcs.a;
            synchronized (o) {
                final TResult d = pcs.d;
                monitorexit(o);
                o = d;
                if (o != null) {
                    final r1l a = this.a;
                    final n1l b = this.b;
                    a.a(b, "DiskCacheProducer", s09.b(a, b, true, ((l4a)o).i()));
                    this.a.d(this.b, "DiskCacheProducer", true);
                    this.b.h("disk");
                    this.c.b(1.0f);
                    this.c.c(o, 1);
                    ((l4a)o).close();
                }
                else {
                    final r1l a2 = this.a;
                    o = this.b;
                    a2.a((n1l)o, "DiskCacheProducer", s09.b(a2, (n1l)o, false, 0));
                    this.d.d.a(this.c, this.b);
                }
            }
        }
    }
}
