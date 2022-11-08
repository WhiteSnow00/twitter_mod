import android.os.Handler;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fey
{
    public static volatile jmy d;
    public final hbz a;
    public final xdy b;
    public volatile long c;
    
    public fey(final hbz a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.b = new xdy(this, a);
    }
    
    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks((Runnable)this.b);
    }
    
    public abstract void b();
    
    public final void c(final long n) {
        this.a();
        if (n >= 0L) {
            Objects.requireNonNull((ca7)this.a.c());
            this.c = System.currentTimeMillis();
            if (!this.d().postDelayed((Runnable)this.b, n)) {
                this.a.b().H0.b("Failed to schedule delayed post. time", (Object)n);
            }
        }
    }
    
    public final Handler d() {
        if (fey.d != null) {
            return fey.d;
        }
        synchronized (fey.class) {
            if (fey.d == null) {
                fey.d = new jmy(this.a.e().getMainLooper());
            }
            return fey.d;
        }
    }
}
