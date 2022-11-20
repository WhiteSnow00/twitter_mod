// 
// Decompiled by Procyon v0.6.0
// 

public final class ur0 extends h6r
{
    public static volatile ur0 G0;
    public static final ur0$a H0;
    public tj8 E0;
    public tj8 F0;
    
    static {
        H0 = new ur0$a();
    }
    
    public ur0() {
        super(1);
        final tj8 tj8 = new tj8();
        this.F0 = tj8;
        this.E0 = tj8;
    }
    
    public static ur0 L() {
        if (ur0.G0 != null) {
            return ur0.G0;
        }
        synchronized (ur0.class) {
            if (ur0.G0 == null) {
                ur0.G0 = new ur0();
            }
            return ur0.G0;
        }
    }
    
    public final boolean M() {
        return this.E0.N();
    }
    
    public final void N(final Runnable runnable) {
        this.E0.O(runnable);
    }
}
