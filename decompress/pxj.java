import com.facebook.imagepipeline.request.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Map;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxj implements np6<l4a, Void>
{
    public final r1l a;
    public final n1l b;
    public final pk6 c;
    public final z73 d;
    public final rxj e;
    
    public pxj(final rxj e, final r1l a, final n1l b, final pk6 c, final z73 d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final pcs pcs) throws Exception {
        Object o = pcs.a;
        synchronized (o) {
            final boolean c = pcs.c;
            monitorexit(o);
            final boolean b = false;
            if (c || (pcs.e() && pcs.d() instanceof CancellationException)) {
                this.a.g(this.b, "PartialDiskCacheProducer");
                this.c.a();
                return;
            }
            if (pcs.e()) {
                this.a.h(this.b, "PartialDiskCacheProducer", pcs.d(), null);
                rxj.b(this.e, this.c, this.b, this.d, (l4a)null);
                return;
            }
            o = pcs.a;
            synchronized (o) {
                final TResult d = pcs.d;
                monitorexit(o);
                final l4a l4a = (l4a)d;
                if (l4a != null) {
                    final r1l a = this.a;
                    o = this.b;
                    a.a((n1l)o, "PartialDiskCacheProducer", rxj.c(a, (n1l)o, true, l4a.i()));
                    final int n = l4a.i() - 1;
                    xd.D(n > 0);
                    l4a.O0 = new e73(0, n);
                    final int i = l4a.i();
                    final a l = this.b.l();
                    o = l.i;
                    boolean b2 = false;
                    Label_0291: {
                        if (o != null) {
                            if (((e73)o).a >= 0 && n >= ((e73)o).b) {
                                b2 = true;
                                break Label_0291;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        this.b.f("disk", "partial");
                        this.a.d(this.b, "PartialDiskCacheProducer", true);
                        this.c.c(l4a, 9);
                    }
                    else {
                        this.c.c(l4a, 8);
                        o = ImageRequestBuilder.b(l);
                        final int n2 = i - 1;
                        boolean b3 = b;
                        if (n2 >= 0) {
                            b3 = true;
                        }
                        xd.D(b3);
                        ((ImageRequestBuilder)o).n = new e73(n2, Integer.MAX_VALUE);
                        o = new pop(((ImageRequestBuilder)o).a(), this.b);
                        rxj.b(this.e, this.c, (n1l)o, this.d, l4a);
                    }
                }
                else {
                    o = this.a;
                    final n1l b4 = this.b;
                    ((r1l)o).a(b4, "PartialDiskCacheProducer", rxj.c((r1l)o, b4, false, 0));
                    rxj.b(this.e, this.c, this.b, this.d, l4a);
                }
            }
        }
    }
}
