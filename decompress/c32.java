import android.content.ComponentName;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c32 implements ServiceConnection
{
    public boolean D0;
    public final BlockingQueue<IBinder> E0;
    
    public c32() {
        this.D0 = false;
        this.E0 = new LinkedBlockingQueue();
    }
    
    public final IBinder a() throws InterruptedException, TimeoutException {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        eli.p("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.D0) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.D0 = true;
        final IBinder binder = this.E0.poll(10000L, milliseconds);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.E0.add(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
