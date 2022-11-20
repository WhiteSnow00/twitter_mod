// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import java.util.Objects;

public class a extends BasePool<byte[]> implements r53
{
    public final int[] N0;
    
    public a(final g4h g4h, final rqk rqk, final sqk sqk) {
        super(g4h, rqk, sqk);
        final SparseIntArray c = rqk.c;
        Objects.requireNonNull(c);
        this.N0 = new int[c.size()];
        for (int i = 0; i < c.size(); ++i) {
            this.N0[i] = c.keyAt(i);
        }
        this.o();
    }
    
    public final Object g(final int n) {
        return new byte[n];
    }
    
    public final void i(final Object o) {
        Objects.requireNonNull(o);
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
        final byte[] array = (byte[])o;
        Objects.requireNonNull(array);
        return array.length;
    }
    
    public final int m(final int n) {
        return n;
    }
}
