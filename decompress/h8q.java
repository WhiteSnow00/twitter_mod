import com.google.android.exoplayer2.upstream.cache.c;
import android.os.ConditionVariable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h8q extends Thread
{
    public final ConditionVariable D0;
    public final c E0;
    
    public h8q(final c e0, final ConditionVariable d0) {
        this.E0 = e0;
        this.D0 = d0;
        super("ExoPlayer:SimpleCacheInit");
    }
    
    @Override
    public final void run() {
        synchronized (this.E0) {
            this.D0.open();
            c.s(this.E0);
            this.E0.b.e();
        }
    }
}
