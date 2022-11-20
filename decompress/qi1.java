import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qi1 implements Serializable
{
    public final transient int[] D0;
    public final transient char[] E0;
    public final transient byte[] F0;
    public final String G0;
    public final transient boolean H0;
    public final transient char I0;
    public final transient int J0;
    
    public qi1(final String g0, final String s, final boolean h0, final char i0, int j) {
        final int[] d0 = new int[128];
        this.D0 = d0;
        final char[] e0 = new char[64];
        this.E0 = e0;
        this.F0 = new byte[64];
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j;
        final int length = s.length();
        if (length == 64) {
            j = 0;
            s.getChars(0, length, e0, 0);
            Arrays.fill(d0, -1);
            while (j < length) {
                final char c = this.E0[j];
                this.F0[j] = (byte)c;
                this.D0[c] = j;
                ++j;
            }
            if (h0) {
                this.D0[i0] = -2;
            }
            return;
        }
        throw new IllegalArgumentException(ze.G("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }
    
    public qi1(final qi1 qi1, final boolean h0, final char i0) {
        final int[] d0 = new int[128];
        this.D0 = d0;
        final char[] e0 = new char[64];
        this.E0 = e0;
        final byte[] f0 = new byte[64];
        this.F0 = f0;
        this.G0 = "MIME-NO-LINEFEEDS";
        final byte[] f2 = qi1.F0;
        System.arraycopy(f2, 0, f0, 0, f2.length);
        final char[] e2 = qi1.E0;
        System.arraycopy(e2, 0, e0, 0, e2.length);
        final int[] d2 = qi1.D0;
        System.arraycopy(d2, 0, d0, 0, d2.length);
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = Integer.MAX_VALUE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public final int hashCode() {
        return this.G0.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.G0;
    }
}
