// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import java.util.Objects;

public class a extends BasePool<byte[]> implements k63
{
    public final int[] P0;
    
    public a(final x4h x4h, final drk drk, final erk erk) {
        super(x4h, drk, erk);
        final SparseIntArray c = drk.c;
        Objects.requireNonNull(c);
        this.P0 = new int[c.size()];
        for (int i = 0; i < c.size(); ++i) {
            this.P0[i] = c.keyAt(i);
        }
        this.o();
    }
    
    @Override
    public final Object g(final int n) {
        return new byte[n];
    }
    
    @Override
    public final void i(final Object o) {
        Objects.requireNonNull(o);
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
        final byte[] array = (byte[])o;
        Objects.requireNonNull(array);
        return array.length;
    }
    
    @Override
    public final int m(final int n) {
        return n;
    }
}
