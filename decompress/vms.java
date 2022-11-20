import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vms<T> implements y0l<T>
{
    public final y0l<T> a;
    public final wms b;
    
    public vms(final y0l<T> a, final wms b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final jj6<T> jj6, final z0l z0l) {
        try {
            pqb.b();
            final d1l i = z0l.i();
            final q9r<T> q9r = new q9r<T>(this, jj6, i, z0l, i, z0l, jj6) {
                public final d1l I0;
                public final z0l J0;
                public final jj6 K0;
                public final vms L0;
                
                @Override
                public final void b(final T t) {
                }
                
                @Override
                public final T d() throws Exception {
                    return null;
                }
                
                @Override
                public final void g(final T t) {
                    this.I0.a(this.J0, "BackgroundThreadHandoffProducer", (Map)null);
                    this.L0.a.a(this.K0, this.J0);
                }
            };
            z0l.p((a1l)new to1(this, q9r) {
                public final q9r a;
                public final vms b;
                
                public final void b() {
                    this.a.a();
                    this.b.b.c((Runnable)this.a);
                }
            });
            this.b.e((Runnable)q9r);
        }
        finally {
            pqb.b();
        }
    }
}
