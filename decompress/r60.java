import android.os.SystemClock;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.annotation.TargetApi;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(16)
public final class r60 extends q7b
{
    public final Choreographer H0;
    public final r60$a I0;
    public boolean J0;
    public long K0;
    
    public r60(final Choreographer h0) {
        this.H0 = h0;
        this.I0 = new Choreographer$FrameCallback(this) {
            public final r60 F0;
            
            public final void doFrame(long uptimeMillis) {
                final r60 f0 = this.F0;
                if (f0.J0) {
                    if (f0.G0 != null) {
                        uptimeMillis = SystemClock.uptimeMillis();
                        final r60 f2 = this.F0;
                        ((dq1)f2.G0).c((double)(uptimeMillis - f2.K0));
                        final r60 f3 = this.F0;
                        f3.K0 = uptimeMillis;
                        f3.H0.postFrameCallback((Choreographer$FrameCallback)f3.I0);
                    }
                }
            }
        };
    }
    
    @Override
    public final void c() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        this.K0 = SystemClock.uptimeMillis();
        this.H0.removeFrameCallback((Choreographer$FrameCallback)this.I0);
        this.H0.postFrameCallback((Choreographer$FrameCallback)this.I0);
    }
    
    @Override
    public final void d() {
        this.J0 = false;
        this.H0.removeFrameCallback((Choreographer$FrameCallback)this.I0);
    }
}
