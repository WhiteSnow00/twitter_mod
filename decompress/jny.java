// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jny<TListener>
{
    public TListener a;
    public boolean b;
    public final /* synthetic */ fm1 c;
    
    public jny(final TListener c) {
        final Boolean true = Boolean.TRUE;
        this.c = (fm1)c;
        this.a = (TListener)true;
        this.b = false;
    }
    
    public abstract void a(final TListener p0);
    
    public abstract void b();
    
    public final void c() {
        synchronized (this) {
            this.a = null;
            monitorexit(this);
            synchronized (this.c.S0) {
                this.c.S0.remove(this);
            }
        }
    }
}
