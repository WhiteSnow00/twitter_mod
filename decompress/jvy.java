import android.os.RemoteException;
import android.os.SystemClock;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jvy implements Runnable
{
    public final long C0;
    public final long D0;
    public final boolean E0;
    public final /* synthetic */ wxy F0;
    
    public jvy(final wxy f0, final boolean e0) {
        this.F0 = f0;
        Objects.requireNonNull(f0);
        this.C0 = System.currentTimeMillis();
        this.D0 = SystemClock.elapsedRealtime();
        this.E0 = e0;
    }
    
    public abstract void a() throws RemoteException;
    
    public void b() {
    }
    
    @Override
    public final void run() {
        if (this.F0.e) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.F0.a(ex, false, this.E0);
            this.b();
        }
    }
}
