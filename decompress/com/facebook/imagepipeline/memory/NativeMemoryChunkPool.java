// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.memory;

@m59
public class NativeMemoryChunkPool extends b
{
    @m59
    public NativeMemoryChunkPool(final x4h x4h, final drk drk, final erk erk) {
        super(x4h, drk, erk);
    }
    
    @Override
    public final Object g(final int n) {
        return new NativeMemoryChunk(n);
    }
    
    @Override
    public final n4h v(final int n) {
        return (n4h)new NativeMemoryChunk(n);
    }
}
