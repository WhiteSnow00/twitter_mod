// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class d0 extends y
{
    public static final f$a<d0> F0;
    public final boolean D0;
    public final boolean E0;
    
    static {
        d0.F0 = h71.G0;
    }
    
    public d0() {
        this.D0 = false;
        this.E0 = false;
    }
    
    public d0(final boolean e0) {
        this.D0 = true;
        this.E0 = e0;
    }
    
    public static String a(final int n) {
        return Integer.toString(n, 36);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof d0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d0 d0 = (d0)o;
        boolean b3 = b2;
        if (this.E0 == d0.E0) {
            b3 = b2;
            if (this.D0 == d0.D0) {
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
