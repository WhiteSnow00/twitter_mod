// 
// Decompiled by Procyon v0.6.0
// 

public enum glu
{
    D0(0), 
    E0(1), 
    F0(2), 
    G0(3);
    
    public final int C0;
    
    public glu(final int c0) {
        this.C0 = c0;
    }
    
    public static glu b(final int n) {
        for (final glu glu : values()) {
            if (glu.C0 == n) {
                return glu;
            }
        }
        return glu.D0;
    }
}
