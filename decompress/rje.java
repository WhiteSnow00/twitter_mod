// 
// Decompiled by Procyon v0.6.0
// 

public enum rje
{
    M0((String)null, -1), 
    N0("{", 1), 
    O0("}", 2), 
    P0("[", 3), 
    Q0("]", 4), 
    R0((String)null, 5), 
    S0((String)null, 6), 
    T0((String)null, 7), 
    U0((String)null, 8), 
    V0("true", 9), 
    W0("false", 10), 
    X0("null", 11);
    
    public static final rje[] Y0;
    public final String F0;
    public final char[] G0;
    public final byte[] H0;
    public final int I0;
    public final boolean J0;
    public final boolean K0;
    public final boolean L0;
    
    public rje(final String f0, final int i2) {
        final boolean b = false;
        if (f0 == null) {
            this.F0 = null;
            this.G0 = null;
            this.H0 = null;
        }
        else {
            this.F0 = f0;
            final char[] charArray = f0.toCharArray();
            this.G0 = charArray;
            final int length = charArray.length;
            this.H0 = new byte[length];
            for (i = 0; i < length; ++i) {
                this.H0[i] = (byte)this.G0[i];
            }
        }
        this.I0 = i2;
        final boolean j0 = i2 == 1 || i2 == 3;
        this.J0 = j0;
        final boolean k0 = i2 == 2 || i2 == 4;
        this.K0 = k0;
        boolean l0 = b;
        if (!j0) {
            l0 = b;
            if (!k0) {
                l0 = b;
                if (i2 != 5) {
                    l0 = b;
                    if (i2 != -1) {
                        l0 = true;
                    }
                }
            }
        }
        this.L0 = l0;
    }
}
