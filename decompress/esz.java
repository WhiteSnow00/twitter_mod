// 
// Decompiled by Procyon v0.6.0
// 

public enum esz
{
    E0("DOUBLE", 0, fsz.H0);
    
    public static final esz[] F0;
    public final fsz D0;
    
    static {
        final esz esz2 = new esz("FLOAT", 1, fsz.G0);
        final fsz f0 = fsz.F0;
        final esz esz3 = new esz("INT64", 2, f0);
        final esz esz4 = new esz("UINT64", 3, f0);
        final fsz e0 = fsz.E0;
        final esz esz5 = new esz("INT32", 4, e0);
        final esz esz6 = new esz("FIXED64", 5, f0);
        final esz esz7 = new esz("FIXED32", 6, e0);
        final esz esz8 = new esz("BOOL", 7, fsz.I0);
        final esz esz9 = new esz("STRING", 8, fsz.J0);
        final fsz m0 = fsz.M0;
        final esz esz;
        F0 = new esz[] { esz, esz2, esz3, esz4, esz5, esz6, esz7, esz8, esz9, new esz("GROUP", 9, m0), new esz("MESSAGE", 10, m0), new esz("BYTES", 11, fsz.K0), new esz("UINT32", 12, e0), new esz("ENUM", 13, fsz.L0), new esz("SFIXED32", 14, e0), new esz("SFIXED64", 15, f0), new esz("SINT32", 16, e0), new esz("SINT64", 17, f0) };
    }
    
    public esz(final String s, final int n, final fsz d0) {
        this.D0 = d0;
    }
}
