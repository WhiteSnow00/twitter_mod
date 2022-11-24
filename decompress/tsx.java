import android.os.Looper;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsx implements ycs
{
    public final wlp a;
    public final Handler b;
    public final tsx$a c;
    
    public tsx(final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new tsx$a(this);
        this.a = new wlp(executor);
    }
    
    public final void a(final Runnable runnable) {
        this.a.execute(runnable);
    }
}
