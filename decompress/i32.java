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

public final class i32 implements ServiceConnection
{
    public boolean C0;
    public final BlockingQueue<IBinder> D0;
    
    public i32() {
        this.C0 = false;
        this.D0 = new LinkedBlockingQueue();
    }
    
    public final IBinder a() throws InterruptedException, TimeoutException {
        final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        xd.s("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.C0) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.C0 = true;
        final IBinder binder = this.D0.poll(10000L, milliseconds);
        if (binder != null) {
            return binder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.D0.add(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
