import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xyz implements Executor
{
    public final g8y C0;
    
    public xyz() {
        this.C0 = new g8y(Looper.getMainLooper());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        ((Handler)this.C0).post(runnable);
    }
}
