import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public enum qaz implements Executor
{
    D0;
    
    public static final qaz[] E0;
    
    @Override
    public final void execute(final Runnable runnable) {
        ((Handler)ueg.a().a).post(runnable);
    }
}
