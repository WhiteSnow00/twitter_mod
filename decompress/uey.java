import android.os.Handler;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class uey
{
    public static volatile ymy d;
    public final wbz a;
    public final mey b;
    public volatile long c;
    
    public uey(final wbz a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.b = new mey(this, a);
    }
    
    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks((Runnable)this.b);
    }
    
    public abstract void b();
    
    public final void c(final long n) {
        this.a();
        if (n >= 0L) {
            Objects.requireNonNull((ffz)this.a.c());
            this.c = System.currentTimeMillis();
            if (!this.d().postDelayed((Runnable)this.b, n)) {
                this.a.b().I0.b("Failed to schedule delayed post. time", (Object)n);
            }
        }
    }
    
    public final Handler d() {
        if (uey.d != null) {
            return (Handler)uey.d;
        }
        synchronized (uey.class) {
            if (uey.d == null) {
                uey.d = new ymy(this.a.e().getMainLooper());
            }
            return (Handler)uey.d;
        }
    }
}
