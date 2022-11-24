import com.facebook.imagepipeline.request.a;
import java.util.Objects;
import java.util.Map;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d12 implements m1l<cj4<aj4>>
{
    public final k4h<z73, PooledByteBuffer> a;
    public final qr2 b;
    public final qr2 c;
    public final d83 d;
    public final m1l<cj4<aj4>> e;
    public final xpw f;
    public final xpw g;
    
    public d12(final k4h<z73, PooledByteBuffer> a, final qr2 b, final qr2 c, final d83 d, final xpw f, final xpw g, final m1l<cj4<aj4>> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = e;
    }
    
    @Override
    public final void a(final pk6<cj4<aj4>> pk6, final n1l n1l) {
        try {
            rrb.b();
            final r1l i = n1l.i();
            i.k(n1l, "BitmapProbeProducer");
            final a a = new a(pk6, n1l, this.a, this.b, this.c, this.d, this.f, this.g);
            i.a(n1l, "BitmapProbeProducer", null);
            rrb.b();
            this.e.a((pk6<cj4<aj4>>)a, n1l);
            rrb.b();
        }
        finally {
            rrb.b();
        }
    }
    
    public static final class a extends kn8<cj4<aj4>, cj4<aj4>>
    {
        public final n1l c;
        public final k4h<z73, PooledByteBuffer> d;
        public final d83 e;
        
        public a(final pk6<cj4<aj4>> pk6, final n1l c, final k4h<z73, PooledByteBuffer> d, final qr2 qr2, final qr2 qr3, final d83 e, final xpw xpw, final xpw xpw2) {
            super(pk6);
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public final void i(final Object o, final int n) {
            final cj4 cj4 = (cj4)o;
            try {
                rrb.b();
                if (!vj1.f(n) && cj4 != null && !vj1.l(n, 8)) {
                    final com.facebook.imagepipeline.request.a l = this.c.l();
                    final d83 e = this.e;
                    this.c.a();
                    ((eg8)e).V(l);
                    final String s = (String)this.c.c();
                    if (s != null && s.equals("memory_bitmap")) {
                        Objects.requireNonNull(this.c.e().D());
                        Objects.requireNonNull(this.c.e().D());
                    }
                    super.b.c(cj4, n);
                }
                else {
                    super.b.c(cj4, n);
                }
            }
            finally {
                rrb.b();
            }
        }
    }
}
