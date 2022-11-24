// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cdy implements Runnable
{
    public final ffz<?> F0;
    
    public cdy() {
        this.F0 = null;
    }
    
    public cdy(final ffz<?> f0) {
        this.F0 = f0;
    }
    
    public abstract void a();
    
    public final void b(final Exception ex) {
        final ffz<?> f0 = this.F0;
        if (f0 != null) {
            f0.a(ex);
        }
    }
    
    @Override
    public final void run() {
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.b(ex);
        }
    }
}
