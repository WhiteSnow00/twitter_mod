// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import java.util.Objects;

public abstract class b extends BasePool<n4h>
{
    public final int[] P0;
    
    public b(final x4h x4h, final drk drk, final erk erk) {
        super(x4h, drk, erk);
        final SparseIntArray c = drk.c;
        Objects.requireNonNull(c);
        this.P0 = new int[c.size()];
        int n = 0;
        while (true) {
            final int[] p3 = this.P0;
            if (n >= p3.length) {
                break;
            }
            p3[n] = c.keyAt(n);
            ++n;
        }
        this.o();
    }
    
    @Override
    public /* bridge */ Object g(final int n) {
        return this.v(n);
    }
    
    @Override
    public final void i(final Object o) {
        final n4h n4h = (n4h)o;
        Objects.requireNonNull(n4h);
        n4h.close();
    }
    
    @Override
    public final int k(final int n) {
        if (n > 0) {
            for (final int n2 : this.P0) {
                if (n2 >= n) {
                    return n2;
                }
            }
            return n;
        }
        throw new BasePool$InvalidSizeException((Object)n);
    }
    
    @Override
    public final int l(final Object o) {
        final n4h n4h = (n4h)o;
        Objects.requireNonNull(n4h);
        return n4h.getSize();
    }
    
    @Override
    public final int m(final int n) {
        return n;
    }
    
    @Override
    public final boolean q(final Object o) {
        final n4h n4h = (n4h)o;
        Objects.requireNonNull(n4h);
        return n4h.isClosed() ^ true;
    }
    
    public abstract n4h v(final int p0);
}
