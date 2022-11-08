import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executor;
import android.graphics.SurfaceTexture;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cms implements bms
{
    public boolean C0;
    public final Object D0 = d0;
    public final Object E0 = e0;
    
    public cms(final Executor e0) {
        this.C0 = false;
        Objects.requireNonNull(e0);
        this.E0 = e0;
        this.D0 = new ArrayDeque();
    }
    
    public final void b(final Runnable runnable) {
        synchronized (this) {
            ((Deque)this.D0).remove(runnable);
        }
    }
    
    public final void d(final Runnable runnable) {
        synchronized (this) {
            if (this.C0) {
                ((Deque)this.D0).add(runnable);
            }
            else {
                ((Executor)this.E0).execute(runnable);
            }
        }
    }
}
