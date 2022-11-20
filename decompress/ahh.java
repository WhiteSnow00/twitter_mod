// 
// Decompiled by Procyon v0.6.0
// 

public enum ahh
{
    F0(new int[] { 0, 0, 0 }, 0), 
    G0(new int[] { 10, 12, 14 }, 1), 
    H0(new int[] { 9, 11, 13 }, 2), 
    I0(new int[] { 0, 0, 0 }, 3), 
    J0(new int[] { 8, 16, 16 }, 4), 
    K0(new int[] { 0, 0, 0 }, 7), 
    L0(new int[] { 8, 10, 12 }, 8), 
    M0(new int[] { 0, 0, 0 }, 5), 
    N0(new int[] { 0, 0, 0 }, 9), 
    O0(new int[] { 8, 10, 12 }, 13);
    
    public static final ahh[] P0;
    public final int[] D0;
    public final int E0;
    
    public ahh(final int[] d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final int b(final lsw lsw) {
        final int a = lsw.a;
        int n;
        if (a <= 9) {
            n = 0;
        }
        else if (a <= 26) {
            n = 1;
        }
        else {
            n = 2;
        }
        return this.D0[n];
    }
}
