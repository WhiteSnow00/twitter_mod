import android.os.Looper;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsx implements gcs
{
    public final alp a;
    public final Handler b;
    public final bsx$a c;
    
    public bsx(final Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new bsx$a(this);
        this.a = new alp(executor);
    }
    
    public final void a(final Runnable runnable) {
        this.a.execute(runnable);
    }
}
