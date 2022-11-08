import android.os.Handler;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsv extends jcc
{
    public static bsv D0;
    
    public bsv() {
        super(new Handler(Looper.getMainLooper()));
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (Thread.currentThread() == super.C0.getLooper().getThread()) {
            runnable.run();
        }
        else {
            super.execute(runnable);
        }
    }
}
