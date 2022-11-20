import android.os.DeadObjectException;
import android.os.RemoteException;
import java.util.Objects;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4y<ResultT> extends x2y
{
    public final ybs<a.b, ResultT> b;
    public final zbs<ResultT> c;
    public final chw d;
    
    public e4y(final int n, final ybs<a.b, ResultT> b, final zbs<ResultT> c, final chw d) {
        super(n);
        this.c = c;
        this.b = b;
        this.d = d;
        if (n == 2 && b.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
    
    public final void a(final Status status) {
        final zbs<ResultT> c = this.c;
        Objects.requireNonNull(this.d);
        c.c((Exception)wd.o(status));
    }
    
    public final void b(final Exception ex) {
        this.c.c(ex);
    }
    
    public final void c(final p2y<?> p2y) throws DeadObjectException {
        try {
            this.b.b((a.b)p2y.b, this.c);
        }
        catch (final RuntimeException ex) {
            this.c.c((Exception)ex);
        }
        catch (final RemoteException ex2) {
            this.a(q4y.e(ex2));
        }
        catch (final DeadObjectException ex3) {
            throw ex3;
        }
    }
    
    public final void d(final f1y f1y, final boolean b) {
        final zbs<ResultT> c = this.c;
        f1y.b.put(c, b);
        c.a.c((ghj)new qmi((Object)f1y, (Object)c, (da8)null));
    }
    
    public final boolean f(final p2y<?> p2y) {
        return this.b.b;
    }
    
    public final yra[] g(final p2y<?> p2y) {
        return this.b.a;
    }
}
