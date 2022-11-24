// 
// Decompiled by Procyon v0.6.0
// 

package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;

public class ZstdDictCompress extends SharedDictBase
{
    private int level;
    private long nativePtr;
    
    static {
        Native.load();
    }
    
    public ZstdDictCompress(final byte[] array, final int n) {
        this(array, 0, array.length, n);
    }
    
    public ZstdDictCompress(final byte[] array, final int n, final int n2, final int level) {
        this.nativePtr = 0L;
        Zstd.defaultCompressionLevel();
        this.level = level;
        if (array.length - n < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        this.init(array, n, n2, level);
        if (0L != this.nativePtr) {
            ((AutoCloseBase)this).storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createCDict failed");
    }
    
    private native void free();
    
    private native void init(final byte[] p0, final int p1, final int p2, final int p3);
    
    public /* bridge */ void close() {
        super.close();
    }
    
    public void doClose() {
        if (this.nativePtr != 0L) {
            this.free();
            this.nativePtr = 0L;
        }
    }
    
    public int level() {
        return this.level;
    }
}
