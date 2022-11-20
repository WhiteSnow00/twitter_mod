import androidx.work.impl.foreground.SystemForegroundService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r5s implements Runnable
{
    public final int D0;
    public final SystemForegroundService E0;
    
    public r5s(final SystemForegroundService e0, final int d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    @Override
    public final void run() {
        this.E0.H0.cancel(this.D0);
    }
}
