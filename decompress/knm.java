import android.os.Process;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knm implements ThreadFactory
{
    public String D0;
    public int E0;
    
    public knm() {
        this.D0 = "fonts-androidx";
        this.E0 = 10;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new a(runnable, this.D0, this.E0);
    }
    
    public static final class a extends Thread
    {
        public final int D0;
        
        public a(final Runnable runnable, final String s, final int d0) {
            super(runnable, s);
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            Process.setThreadPriority(this.D0);
            super.run();
        }
    }
}
