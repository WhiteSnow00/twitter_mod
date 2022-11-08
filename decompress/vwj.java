import com.facebook.imagepipeline.request.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Map;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwj implements bp6<z3a, Void>
{
    public final /* synthetic */ u0l a;
    public final /* synthetic */ q0l b;
    public final /* synthetic */ dk6 c;
    public final /* synthetic */ q73 d;
    public final /* synthetic */ xwj e;
    
    public vwj(final xwj e, final u0l a, final q0l b, final dk6 c, final q73 d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final cbs cbs) throws Exception {
        Object o = cbs.a;
        synchronized (o) {
            final boolean c = cbs.c;
            monitorexit(o);
            final boolean b = false;
            if (c || (cbs.e() && cbs.d() instanceof CancellationException)) {
                this.a.g(this.b, "PartialDiskCacheProducer");
                this.c.a();
                return;
            }
            if (cbs.e()) {
                this.a.h(this.b, "PartialDiskCacheProducer", (Throwable)cbs.d(), (Map)null);
                xwj.b(this.e, this.c, this.b, this.d, (z3a)null);
                return;
            }
            o = cbs.a;
            synchronized (o) {
                final Object d = cbs.d;
                monitorexit(o);
                final z3a z3a = (z3a)d;
                if (z3a != null) {
                    final u0l a = this.a;
                    o = this.b;
                    a.a((q0l)o, "PartialDiskCacheProducer", xwj.c(a, (q0l)o, true, z3a.i()));
                    final int n = z3a.i() - 1;
                    ri4.j(Boolean.valueOf(n > 0));
                    z3a.L0 = new v63(0, n);
                    final int i = z3a.i();
                    final a l = this.b.l();
                    o = l.i;
                    boolean b2 = false;
                    Label_0283: {
                        if (o != null) {
                            if (((v63)o).a >= 0 && n >= ((v63)o).b) {
                                b2 = true;
                                break Label_0283;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        this.b.f("disk", "partial");
                        this.a.d(this.b, "PartialDiskCacheProducer", true);
                        this.c.c((Object)z3a, 9);
                    }
                    else {
                        this.c.c((Object)z3a, 8);
                        o = ImageRequestBuilder.b(l);
                        final int n2 = i - 1;
                        boolean b3 = b;
                        if (n2 >= 0) {
                            b3 = true;
                        }
                        ri4.j(Boolean.valueOf(b3));
                        ((ImageRequestBuilder)o).n = new v63(n2, Integer.MAX_VALUE);
                        o = new cnp(((ImageRequestBuilder)o).a(), this.b);
                        xwj.b(this.e, this.c, (q0l)o, this.d, z3a);
                    }
                }
                else {
                    final u0l a2 = this.a;
                    o = this.b;
                    a2.a((q0l)o, "PartialDiskCacheProducer", xwj.c(a2, (q0l)o, false, 0));
                    xwj.b(this.e, this.c, this.b, this.d, z3a);
                }
            }
        }
    }
}
