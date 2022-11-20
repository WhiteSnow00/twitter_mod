// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import java.util.Objects;

public abstract class b extends BasePool<w3h>
{
    public final int[] N0;
    
    public b(final g4h g4h, final rqk rqk, final sqk sqk) {
        super(g4h, rqk, sqk);
        final SparseIntArray c = rqk.c;
        Objects.requireNonNull(c);
        this.N0 = new int[c.size()];
        int n = 0;
        while (true) {
            final int[] n2 = this.N0;
            if (n >= n2.length) {
                break;
            }
            n2[n] = c.keyAt(n);
            ++n;
        }
        this.o();
    }
    
    public /* bridge */ Object g(final int n) {
        return this.v(n);
    }
    
    public final void i(final Object o) {
        final w3h w3h = (w3h)o;
        Objects.requireNonNull(w3h);
        w3h.close();
    }
    
    public final int k(final int n) {
        if (n > 0) {
            for (final int n3 : this.N0) {
                if (n3 >= n) {
                    return n3;
                }
            }
            return n;
        }
        throw new BasePool$InvalidSizeException((Object)n);
    }
    
    public final int l(final Object o) {
        final w3h w3h = (w3h)o;
        Objects.requireNonNull(w3h);
        return w3h.getSize();
    }
    
    public final int m(final int n) {
        return n;
    }
    
    public final boolean q(final Object o) {
        final w3h w3h = (w3h)o;
        Objects.requireNonNull(w3h);
        return w3h.isClosed() ^ true;
    }
    
    public abstract w3h v(final int p0);
}
