// 
// Decompiled by Procyon v0.6.0
// 

public enum xgh
{
    E0(new int[] { 0, 0, 0 }, 0), 
    F0(new int[] { 10, 12, 14 }, 1), 
    G0(new int[] { 9, 11, 13 }, 2), 
    H0(new int[] { 0, 0, 0 }, 3), 
    I0(new int[] { 8, 16, 16 }, 4), 
    J0(new int[] { 0, 0, 0 }, 7), 
    K0(new int[] { 8, 10, 12 }, 8), 
    L0(new int[] { 0, 0, 0 }, 5), 
    M0(new int[] { 0, 0, 0 }, 9), 
    N0(new int[] { 8, 10, 12 }, 13);
    
    public final int[] C0;
    public final int D0;
    
    public xgh(final int[] c0, final int d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final int b(final srw srw) {
        final int a = srw.a;
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
        return this.C0[n];
    }
}
