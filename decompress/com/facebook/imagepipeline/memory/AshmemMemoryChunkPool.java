// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;

@TargetApi(27)
@m59
public class AshmemMemoryChunkPool extends b
{
    @m59
    public AshmemMemoryChunkPool(final x4h x4h, final drk drk, final erk erk) {
        super(x4h, drk, erk);
    }
    
    @Override
    public final Object g(final int n) {
        return new cv0(n);
    }
    
    @Override
    public final n4h v(final int n) {
        return new cv0(n);
    }
}
