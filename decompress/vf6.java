// 
// Decompiled by Procyon v0.6.0
// 

public final class vf6
{
    public static final vf6 b;
    public boolean a;
    
    static {
        b = new vf6(true);
    }
    
    public vf6() {
    }
    
    public vf6(final boolean a) {
        this.a = a;
    }
    
    public void a() {
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
    
    public boolean b() {
        synchronized (this) {
            final boolean a = this.a;
            this.a = false;
            return a;
        }
    }
    
    public boolean c() {
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
