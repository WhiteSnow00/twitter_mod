// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class b0 extends y
{
    public static final f$a<b0> I0;
    public final int G0;
    public final float H0;
    
    static {
        b0.I0 = j71.J0;
    }
    
    public b0(final int g0) {
        omi.n(g0 > 0, (Object)"maxStars must be a positive integer");
        this.G0 = g0;
        this.H0 = -1.0f;
    }
    
    public b0(final int g0, final float h0) {
        final boolean b = true;
        omi.n(g0 > 0, (Object)"maxStars must be a positive integer");
        omi.n(h0 >= 0.0f && h0 <= g0 && b, (Object)"starRating is out of range [0, maxStars]");
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof b0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final b0 b3 = (b0)o;
        boolean b4 = b2;
        if (this.G0 == b3.G0) {
            b4 = b2;
            if (this.H0 == b3.H0) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.G0, this.H0 });
    }
}
