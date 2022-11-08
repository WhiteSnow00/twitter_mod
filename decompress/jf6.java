// 
// Decompiled by Procyon v0.6.0
// 

public final class jf6
{
    public boolean a;
    
    public final void a() {
        monitorenter(this);
        boolean b = false;
        try {
            while (!this.a) {
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {
                    b = true;
                }
            }
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final boolean b() {
        synchronized (this) {
            final boolean a = this.a;
            this.a = false;
            return a;
        }
    }
    
    public final boolean c() {
        synchronized (this) {
            if (this.a) {
                return false;
            }
            this.a = true;
            this.notifyAll();
            return true;
        }
    }
}
