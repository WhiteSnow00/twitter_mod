import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zqy
{
    public static final h4a k;
    public final tuy a;
    public final ypy b;
    public final m1z c;
    public final xwy d;
    public final pxy e;
    public final qzy f;
    public final g0z g;
    public final nry<w100> h;
    public final gvy i;
    public final AtomicBoolean j;
    
    static {
        k = new h4a("ExtractorLooper");
    }
    
    public zqy(final tuy a, final nry<w100> h, final ypy b, final m1z c, final xwy d, final pxy e, final qzy f, final g0z g, final gvy i) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = new AtomicBoolean(false);
    }
    
    public final void a(final int n, final Exception ex) {
        try {
            tuy tuy = this.a;
            Objects.requireNonNull(tuy);
            try {
                tuy.f.lock();
                tuy.b(n).c.d = 5;
                tuy.f.unlock();
                tuy = this.a;
                Objects.requireNonNull(tuy);
                tuy.c((quy)new uzz(tuy, n));
            }
            finally {
                tuy.f.unlock();
            }
        }
        catch (final vqy vqy) {
            zqy.k.j("Error during error handling: %s", ex.getMessage());
        }
    }
}
