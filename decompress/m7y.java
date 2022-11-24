import java.util.Iterator;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import com.google.android.gms.common.api.c;
import java.util.Set;
import java.util.concurrent.Semaphore;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m7y extends ow0<Void> implements f7q
{
    public final Semaphore Q0;
    public final Set<c> R0;
    
    public m7y(final Context context, final Set<c> r0) {
        super(context);
        this.Q0 = new Semaphore(0);
        this.R0 = r0;
    }
    
    public final void k() {
        this.Q0.drainPermits();
        this.i();
    }
    
    public final void onComplete() {
        this.Q0.release();
    }
    
    public final /* bridge */ Object r() {
        final Iterator<c> iterator = this.R0.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (iterator.next().i((f7q)this)) {
                ++n;
            }
        }
        try {
            this.Q0.tryAcquire(n, 5L, TimeUnit.SECONDS);
        }
        catch (final InterruptedException ex) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", (Throwable)ex);
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
