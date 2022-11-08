// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2;

import java.util.Arrays;

public final class u extends y
{
    public static final f$a<u> E0;
    public final float D0;
    
    static {
        u.E0 = g71.F0;
    }
    
    public u() {
        this.D0 = -1.0f;
    }
    
    public u(final float d0) {
        ri4.l(d0 >= 0.0f && d0 <= 100.0f, (Object)"percent must be in the range of [0, 100]");
        this.D0 = d0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof u;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        if (this.D0 == ((u)o).D0) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0 });
    }
}
