// 
// Decompiled by Procyon v0.6.0
// 

public abstract class toy<TListener>
{
    public TListener a;
    public boolean b;
    public final gm1 c;
    
    public toy(final TListener c) {
        final Boolean true = Boolean.TRUE;
        this.c = (gm1)c;
        this.a = (TListener)true;
        this.b = false;
    }
    
    public abstract void a(final TListener p0);
    
    public abstract void b();
    
    public final void c() {
        synchronized (this) {
            this.a = null;
            monitorexit(this);
            synchronized (this.c.V0) {
                this.c.V0.remove(this);
            }
        }
    }
}
