import android.os.Process;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znm implements ThreadFactory
{
    public String F0;
    public int G0;
    
    public znm() {
        this.F0 = "fonts-androidx";
        this.G0 = 10;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new a(runnable, this.F0, this.G0);
    }
    
    public static final class a extends Thread
    {
        public final int F0;
        
        public a(final Runnable runnable, final String s, final int f0) {
            super(runnable, s);
            this.F0 = f0;
        }
        
        @Override
        public final void run() {
            Process.setThreadPriority(this.F0);
            super.run();
        }
    }
}
