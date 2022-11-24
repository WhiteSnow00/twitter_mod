import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rcs<TResult>
{
    public final c100<TResult> a;
    
    public rcs() {
        this.a = new c100<TResult>();
    }
    
    public rcs(final ajy ajy) {
        this.a = new c100<TResult>();
        ajy.a.i((Executor)ads.a, (okj)new v9y(new v9y(this)));
    }
    
    public final void a(final Exception ex) {
        this.a.w(ex);
    }
    
    public final void b(final TResult tResult) {
        this.a.x(tResult);
    }
    
    public final boolean c(final Exception f) {
        final c100<TResult> a = this.a;
        Objects.requireNonNull(a);
        iuk.D((Object)f, (Object)"Exception must not be null");
        synchronized (a.a) {
            boolean b;
            if (a.c) {
                monitorexit(a.a);
                b = false;
            }
            else {
                a.c = true;
                a.f = f;
                monitorexit(a.a);
                a.b.b((mcs)a);
                b = true;
            }
            return b;
        }
    }
    
    public final boolean d(final TResult tResult) {
        return this.a.z(tResult);
    }
}
