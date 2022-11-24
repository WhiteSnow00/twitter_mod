// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class u extends y
{
    public static final f$a<u> H0;
    public final float G0;
    
    static {
        u.H0 = g71.J0;
    }
    
    public u() {
        this.G0 = -1.0f;
    }
    
    public u(final float g0) {
        omi.n(g0 >= 0.0f && g0 <= 100.0f, (Object)"percent must be in the range of [0, 100]");
        this.G0 = g0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof u;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this.G0 == ((u)o).G0) {
            b2 = true;
        }
        return b2;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.G0 });
    }
}
