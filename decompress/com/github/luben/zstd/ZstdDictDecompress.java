// 
// Decompiled by Procyon v0.6.0
// 

package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;

public class ZstdDictDecompress extends SharedDictBase
{
    private long nativePtr;
    
    static {
        Native.load();
    }
    
    public ZstdDictDecompress(final byte[] array) {
        this(array, 0, array.length);
    }
    
    public ZstdDictDecompress(final byte[] array, final int n, final int n2) {
        this.nativePtr = 0L;
        this.init(array, n, n2);
        if (this.nativePtr != 0L) {
            ((AutoCloseBase)this).storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createDDict failed");
    }
    
    private native void free();
    
    private native void init(final byte[] p0, final int p1, final int p2);
    
    public /* bridge */ void close() {
        super.close();
    }
    
    public void doClose() {
        if (this.nativePtr != 0L) {
            this.free();
            this.nativePtr = 0L;
        }
    }
}
