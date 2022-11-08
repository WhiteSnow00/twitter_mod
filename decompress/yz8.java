import java.util.Map;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yz8 implements bp6<z3a, Void>
{
    public final /* synthetic */ u0l a;
    public final /* synthetic */ q0l b;
    public final /* synthetic */ dk6 c;
    public final /* synthetic */ a09 d;
    
    public yz8(final a09 d, final u0l a, final q0l b, final dk6 c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final cbs cbs) throws Exception {
        Object o = cbs.a;
        synchronized (o) {
            final boolean c = cbs.c;
            monitorexit(o);
            if (c || (cbs.e() && cbs.d() instanceof CancellationException)) {
                this.a.g(this.b, "DiskCacheProducer");
                this.c.a();
                return;
            }
            if (cbs.e()) {
                this.a.h(this.b, "DiskCacheProducer", (Throwable)cbs.d(), (Map)null);
                this.d.d.a(this.c, this.b);
                return;
            }
            o = cbs.a;
            synchronized (o) {
                final Object d = cbs.d;
                monitorexit(o);
                final z3a z3a = (z3a)d;
                if (z3a != null) {
                    o = this.a;
                    final q0l b = this.b;
                    ((u0l)o).a(b, "DiskCacheProducer", a09.b((u0l)o, b, true, z3a.i()));
                    this.a.d(this.b, "DiskCacheProducer", true);
                    this.b.h("disk");
                    this.c.b(1.0f);
                    this.c.c((Object)z3a, 1);
                    z3a.close();
                }
                else {
                    o = this.a;
                    final q0l b2 = this.b;
                    ((u0l)o).a(b2, "DiskCacheProducer", a09.b((u0l)o, b2, false, 0));
                    this.d.d.a(this.c, this.b);
                }
            }
        }
    }
}
