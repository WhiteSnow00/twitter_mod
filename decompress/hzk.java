import android.os.Process;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzk implements ThreadFactory
{
    public final int C0;
    public final String D0;
    public final boolean E0;
    public final AtomicInteger F0;
    
    public hzk(final String d0) {
        this.F0 = new AtomicInteger(1);
        this.C0 = 10;
        this.D0 = d0;
        this.E0 = true;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                while (true) {
                    try {
                        Process.setThreadPriority(hzk.this.C0);
                        runnable.run();
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        };
        String s;
        if (this.E0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.D0);
            sb.append("-");
            sb.append(this.F0.getAndIncrement());
            s = sb.toString();
        }
        else {
            s = this.D0;
        }
        return new Thread(runnable2, s);
    }
}
