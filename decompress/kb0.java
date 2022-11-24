import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kb0<T extends ib0> extends jb0<T>
{
    public final uqh G0;
    public final ScheduledExecutorService H0;
    public boolean I0;
    public long J0;
    public kb0.kb0$b K0;
    public final kb0$a L0;
    
    public kb0(final T t, final kb0.kb0$b k0, final uqh g0, final ScheduledExecutorService h0) {
        super((ib0)t);
        this.I0 = false;
        this.L0 = new kb0$a(this);
        this.K0 = k0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void a() {
        synchronized (this) {
            if (!this.I0) {
                this.I0 = true;
                this.H0.schedule((Runnable)this.L0, 1000L, TimeUnit.MILLISECONDS);
            }
        }
    }
    
    public final boolean p(final Drawable drawable, final Canvas canvas, final int n) {
        this.J0 = this.G0.now();
        final boolean p3 = super.p(drawable, canvas, n);
        this.a();
        return p3;
    }
}
