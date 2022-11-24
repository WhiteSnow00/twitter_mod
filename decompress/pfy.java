import android.os.Handler;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pfy
{
    public static volatile tny d;
    public final vcz a;
    public final gfy b;
    public volatile long c;
    
    public pfy(final vcz a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.b = new gfy(this, a);
    }
    
    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks((Runnable)this.b);
    }
    
    public abstract void b();
    
    public final void c(final long n) {
        this.a();
        if (n >= 0L) {
            Objects.requireNonNull((r1n)this.a.c());
            this.c = System.currentTimeMillis();
            if (!this.d().postDelayed((Runnable)this.b, n)) {
                this.a.b().K0.b("Failed to schedule delayed post. time", (Object)n);
            }
        }
    }
    
    public final Handler d() {
        if (pfy.d != null) {
            return pfy.d;
        }
        synchronized (pfy.class) {
            if (pfy.d == null) {
                pfy.d = new tny(this.a.e().getMainLooper());
            }
            return pfy.d;
        }
    }
}
