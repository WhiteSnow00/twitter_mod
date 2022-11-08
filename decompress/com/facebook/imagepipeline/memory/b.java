// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import java.util.Objects;

public abstract class b extends BasePool<v3h>
{
    public final int[] M0;
    
    public b(final f4h f4h, final iqk iqk, final jqk jqk) {
        super(f4h, iqk, jqk);
        final SparseIntArray c = iqk.c;
        Objects.requireNonNull(c);
        this.M0 = new int[c.size()];
        int n = 0;
        while (true) {
            final int[] m0 = this.M0;
            if (n >= m0.length) {
                break;
            }
            m0[n] = c.keyAt(n);
            ++n;
        }
        this.o();
    }
    
    @Override
    public final void i(final Object o) {
        final v3h v3h = (v3h)o;
        Objects.requireNonNull(v3h);
        v3h.close();
    }
    
    @Override
    public final int k(final int n) {
        if (n > 0) {
            for (final int n2 : this.M0) {
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
        final v3h v3h = (v3h)o;
        Objects.requireNonNull(v3h);
        return v3h.getSize();
    }
    
    @Override
    public final int m(final int n) {
        return n;
    }
    
    @Override
    public final boolean q(final Object o) {
        final v3h v3h = (v3h)o;
        Objects.requireNonNull(v3h);
        return v3h.isClosed() ^ true;
    }
    
    public abstract v3h v(final int p0);
}
