import java.util.concurrent.Callable;
import androidx.annotation.RecentlyNonNull;
import android.os.HandlerThread;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ueg
{
    public static final Object b;
    public static ueg c;
    public t8y a;
    
    static {
        b = new Object();
    }
    
    public ueg(final Looper looper) {
        this.a = new t8y(looper);
    }
    
    @RecentlyNonNull
    public static ueg a() {
        synchronized (ueg.b) {
            if (ueg.c == null) {
                final HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                ((Thread)handlerThread).start();
                ueg.c = new ueg(handlerThread.getLooper());
            }
            return ueg.c;
        }
    }
    
    @RecentlyNonNull
    public final <ResultT> ubs<ResultT> b(@RecentlyNonNull final Callable<ResultT> callable) {
        final zbs zbs = new zbs();
        qaz.D0.execute((Runnable)new wkz((Object)callable, (Object)zbs, 4));
        return zbs.a;
    }
}
