import android.os.RemoteException;
import android.os.SystemClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class uwy implements Runnable
{
    public final long F0;
    public final long G0;
    public final boolean H0;
    public final jzy I0;
    
    public uwy(final jzy i0, final boolean h0) {
        this.I0 = i0;
        Objects.requireNonNull(i0);
        this.F0 = System.currentTimeMillis();
        this.G0 = SystemClock.elapsedRealtime();
        this.H0 = h0;
    }
    
    public abstract void a() throws RemoteException;
    
    public void b() {
    }
    
    @Override
    public final void run() {
        if (this.I0.e) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.I0.a(ex, false, this.H0);
            this.b();
        }
    }
}
