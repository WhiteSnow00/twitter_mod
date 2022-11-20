// 
// Decompiled by Procyon v0.6.0
// 

public enum a8a
{
    E0(1), 
    F0(2);
    
    public static final a8a[] G0;
    public static final a8a[] H0;
    public final int D0;
    
    static {
        final a8a a8a2 = new a8a(0);
        final a8a a8a3 = new a8a(3);
        final a8a a8a;
        final a8a a8a4;
        H0 = new a8a[] { a8a, a8a2, a8a3, a8a4 };
        G0 = new a8a[] { a8a2, a8a, a8a4, a8a3 };
    }
    
    public a8a(final int d0) {
        this.D0 = d0;
    }
}
