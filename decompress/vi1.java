import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vi1 implements Serializable
{
    public final transient int[] C0;
    public final transient char[] D0;
    public final transient byte[] E0;
    public final String F0;
    public final transient boolean G0;
    public final transient char H0;
    public final transient int I0;
    
    public vi1(final String f0, final String s, final boolean g0, final char c, int i) {
        final int[] c2 = new int[128];
        this.C0 = c2;
        final char[] d0 = new char[64];
        this.D0 = d0;
        this.E0 = new byte[64];
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = c;
        this.I0 = i;
        final int length = s.length();
        if (length == 64) {
            i = 0;
            s.getChars(0, length, d0, 0);
            Arrays.fill(c2, -1);
            while (i < length) {
                final char c3 = this.D0[i];
                this.E0[i] = (byte)c3;
                this.C0[c3] = i;
                ++i;
            }
            if (g0) {
                this.C0[c] = -2;
            }
            return;
        }
        throw new IllegalArgumentException(ffa.k("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }
    
    public vi1(final vi1 vi1, final boolean g0, final char c) {
        final int[] c2 = new int[128];
        this.C0 = c2;
        final char[] d0 = new char[64];
        this.D0 = d0;
        final byte[] e0 = new byte[64];
        this.E0 = e0;
        this.F0 = "MIME-NO-LINEFEEDS";
        final byte[] e2 = vi1.E0;
        System.arraycopy(e2, 0, e0, 0, e2.length);
        final char[] d2 = vi1.D0;
        System.arraycopy(d2, 0, d0, 0, d2.length);
        final int[] c3 = vi1.C0;
        System.arraycopy(c3, 0, c2, 0, c3.length);
        this.G0 = g0;
        this.H0 = c;
        this.I0 = Integer.MAX_VALUE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.F0;
    }
}
