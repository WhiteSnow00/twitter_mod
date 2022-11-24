import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nay extends Thread
{
    public nay(final ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(19);
        monitorenter(this);
        try {
            try {
                while (true) {
                    this.wait();
                }
            }
            finally {
                monitorexit(this);
            }
        }
        catch (final InterruptedException ex) {}
    }
}
