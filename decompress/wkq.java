// 
// Decompiled by Procyon v0.6.0
// 

public enum wkq
{
    G0(0), 
    H0(1), 
    I0(2), 
    J0(3), 
    K0(4);
    
    public static final wkq[] L0;
    public final int F0;
    
    public wkq(final int f0) {
        this.F0 = f0;
    }
    
    public static wkq b(final int n) {
        for (final wkq wkq : values()) {
            if (wkq.F0 == n) {
                return wkq;
            }
        }
        return wkq.G0;
    }
}
