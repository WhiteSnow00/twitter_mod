import java.util.ArrayList;
import android.view.Choreographer$FrameCallback;
import java.util.List;
import android.os.Handler;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j70 extends vx6
{
    public static final j70.j70$c Companion;
    public static final qwe<sx6> P0;
    public static final ThreadLocal<sx6> Q0;
    public final Choreographer F0;
    public final Handler G0;
    public final Object H0;
    public final ks0<Runnable> I0;
    public List<Choreographer$FrameCallback> J0;
    public List<Choreographer$FrameCallback> K0;
    public boolean L0;
    public boolean M0;
    public final j70$d N0;
    public final k70 O0;
    
    static {
        Companion = new j70.j70$c();
        j70.P0 = (n4s)pps.n((nsb)j70$a.D0);
        j70.Q0 = new j70$b();
    }
    
    public j70(final Choreographer f0, final Handler g0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = new Object();
        this.I0 = (ks0<Runnable>)new ks0();
        this.J0 = new ArrayList<Choreographer$FrameCallback>();
        this.K0 = new ArrayList<Choreographer$FrameCallback>();
        this.N0 = new j70$d(this);
        this.O0 = new k70(f0);
    }
    
    public static final void J0(final j70 j70) {
        while (true) {
            for (Runnable runnable = j70.L0(); runnable != null; runnable = j70.L0()) {
                runnable.run();
            }
            synchronized (j70.H0) {
                final boolean empty = j70.I0.isEmpty();
                boolean b = false;
                if (empty) {
                    j70.L0 = false;
                }
                else {
                    b = true;
                }
                monitorexit(j70.H0);
                if (!b) {
                    return;
                }
                continue;
            }
        }
    }
    
    public final Runnable L0() {
        synchronized (this.H0) {
            final ks0<Runnable> i0 = this.I0;
            Object removeFirst;
            if (i0.isEmpty()) {
                removeFirst = null;
            }
            else {
                removeFirst = i0.removeFirst();
            }
            return (Runnable)removeFirst;
        }
    }
    
    public final void j(final sx6 sx6, final Runnable runnable) {
        czd.f((Object)sx6, "context");
        czd.f((Object)runnable, "block");
        synchronized (this.H0) {
            this.I0.addLast((Object)runnable);
            if (!this.L0) {
                this.L0 = true;
                this.G0.post((Runnable)this.N0);
                if (!this.M0) {
                    this.M0 = true;
                    this.F0.postFrameCallback((Choreographer$FrameCallback)this.N0);
                }
            }
        }
    }
}
