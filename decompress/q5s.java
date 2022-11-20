import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5s implements Runnable
{
    public final int D0;
    public final Notification E0;
    public final SystemForegroundService F0;
    
    public q5s(final SystemForegroundService f0, final int d0, final Notification e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        this.F0.H0.notify(this.D0, this.E0);
    }
}
