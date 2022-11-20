import java.io.IOException;
import java.io.Closeable;
import java.io.InputStream;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class b4g implements y0l<j3a>
{
    public final Executor a;
    public final uqk b;
    
    public b4g(final Executor a, final uqk b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final jj6<j3a> jj6, final z0l z0l) {
        final d1l i = z0l.i();
        final a l = z0l.l();
        z0l.f("local", "fetch");
        final q9r<j3a> q9r = new q9r<j3a>(this, jj6, i, z0l, this.d(), l, i, z0l) {
            public final a I0;
            public final d1l J0;
            public final z0l K0;
            public final b4g L0;
            
            @Override
            public final void b(final Object o) {
                j3a.b((j3a)o);
            }
            
            @Override
            public final Object d() throws Exception {
                j3a c = this.L0.c(this.I0);
                if (c == null) {
                    this.J0.d(this.K0, this.L0.d(), false);
                    this.K0.h("local");
                    c = null;
                }
                else {
                    c.j();
                    this.J0.d(this.K0, this.L0.d(), true);
                    this.K0.h("local");
                }
                return c;
            }
        };
        z0l.p((a1l)new to1(q9r) {
            public final q9r a;
            
            public final void b() {
                this.a.a();
            }
        });
        this.a.execute(q9r);
    }
    
    public final j3a b(final InputStream inputStream, final int n) throws IOException {
        xh4 xh4 = null;
        Label_0027: {
            if (n > 0) {
                break Label_0027;
            }
            try {
                xh4 = xh4.k((Closeable)this.b.a(inputStream));
                return new j3a(xh4 = xh4);
                xh4 = xh4.k((Closeable)this.b.b(inputStream, n));
                return new j3a(xh4 = xh4);
            }
            finally {
                bi4.b(inputStream);
                xh4.e(xh4);
            }
        }
    }
    
    public abstract j3a c(final a p0) throws IOException;
    
    public abstract String d();
}
