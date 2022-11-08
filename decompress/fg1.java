import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fg1 implements Runnable
{
    public abstract void a();
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.a();
    }
}
