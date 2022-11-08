// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class b0 extends y
{
    public static final f$a<b0> F0;
    public final int D0;
    public final float E0;
    
    static {
        b0.F0 = j71.G0;
    }
    
    public b0(final int d0) {
        ri4.l(d0 > 0, (Object)"maxStars must be a positive integer");
        this.D0 = d0;
        this.E0 = -1.0f;
    }
    
    public b0(final int d0, final float e0) {
        final boolean b = true;
        ri4.l(d0 > 0, (Object)"maxStars must be a positive integer");
        ri4.l(e0 >= 0.0f && e0 <= d0 && b, (Object)"starRating is out of range [0, maxStars]");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof b0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final b0 b3 = (b0)o;
        boolean b4 = b2;
        if (this.D0 == b3.D0) {
            b4 = b2;
            if (this.E0 == b3.E0) {
                b4 = true;
            }
        }
        return b4;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0 });
    }
}
