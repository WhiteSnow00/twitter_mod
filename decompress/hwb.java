// 
// Decompiled by Procyon v0.6.0
// 

public final class hwb implements Runnable
{
    public final iwb D0;
    public final int E0;
    
    public hwb(final iwb d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        this.D0.a2.setSelection(this.E0);
    }
}
