import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class si1 implements Serializable
{
    public final transient int[] F0;
    public final transient char[] G0;
    public final transient byte[] H0;
    public final String I0;
    public final transient boolean J0;
    public final transient char K0;
    public final transient int L0;
    
    public si1(final String i0, final String s, final boolean j0, final char k0, int l) {
        final int[] f0 = new int[128];
        this.F0 = f0;
        final char[] g0 = new char[64];
        this.G0 = g0;
        this.H0 = new byte[64];
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l;
        final int length = s.length();
        if (length == 64) {
            l = 0;
            s.getChars(0, length, g0, 0);
            Arrays.fill(f0, -1);
            while (l < length) {
                final char c = this.G0[l];
                this.H0[l] = (byte)c;
                this.F0[c] = l;
                ++l;
            }
            if (j0) {
                this.F0[k0] = -2;
            }
            return;
        }
        throw new IllegalArgumentException(ffe.m("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }
    
    public si1(final si1 si1, final boolean j0, final char k0) {
        final int[] f0 = new int[128];
        this.F0 = f0;
        final char[] g0 = new char[64];
        this.G0 = g0;
        final byte[] h0 = new byte[64];
        this.H0 = h0;
        this.I0 = "MIME-NO-LINEFEEDS";
        final byte[] h2 = si1.H0;
        System.arraycopy(h2, 0, h0, 0, h2.length);
        final char[] g2 = si1.G0;
        System.arraycopy(g2, 0, g0, 0, g2.length);
        final int[] f2 = si1.F0;
        System.arraycopy(f2, 0, f0, 0, f2.length);
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = Integer.MAX_VALUE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public final int hashCode() {
        return this.I0.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.I0;
    }
}
