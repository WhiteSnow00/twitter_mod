// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class o extends y
{
    public static final f$a<o> I0;
    public final boolean G0;
    public final boolean H0;
    
    static {
        o.I0 = y2r.I0;
    }
    
    public o() {
        this.G0 = false;
        this.H0 = false;
    }
    
    public o(final boolean h0) {
        this.G0 = true;
        this.H0 = h0;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof o;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final o o2 = (o)o;
        boolean b3 = b2;
        if (this.H0 == o2.H0) {
            b3 = b2;
            if (this.G0 == o2.G0) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.G0, this.H0 });
    }
}
