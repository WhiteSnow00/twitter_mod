// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class o extends y
{
    public static final f$a<o> F0;
    public final boolean D0;
    public final boolean E0;
    
    static {
        o.F0 = g1r.F0;
    }
    
    public o() {
        this.D0 = false;
        this.E0 = false;
    }
    
    public o(final boolean e0) {
        this.D0 = true;
        this.E0 = e0;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof o;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final o o2 = (o)o;
        boolean b3 = b2;
        if (this.E0 == o2.E0) {
            b3 = b2;
            if (this.D0 == o2.D0) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0 });
    }
}
