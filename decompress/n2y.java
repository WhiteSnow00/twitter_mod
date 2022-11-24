import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n2y implements Runnable
{
    public final o2y F0;
    
    public n2y(final o2y f0) {
        this.F0 = f0;
    }
    
    public abstract void a();
    
    @Override
    public final void run() {
        this.F0.b.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    this.F0.b.unlock();
                    return;
                }
                this.a();
                this.F0.b.unlock();
                return;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            final b3y a = this.F0.a;
            ((Handler)a.e).sendMessage(((Handler)a.e).obtainMessage(2, (Object)ex));
            this.F0.b.unlock();
            return;
        }
        this.F0.b.unlock();
    }
}
