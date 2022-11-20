// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import com.google.android.filament.Texture;
import com.google.android.filament.Engine;

public class IBLPrefilterContext
{
    private long mNativeObject;
    
    public IBLPrefilterContext(final Engine engine) {
        final long nCreate = nCreate(engine.getNativeObject());
        this.mNativeObject = nCreate;
        if (nCreate != 0L) {
            return;
        }
        throw new IllegalStateException("Couldn't create IBLPrefilterContext");
    }
    
    public static long access$000(final long n) {
        return nCreateEquirectHelper(n);
    }
    
    public static long access$100(final long n, final long n2) {
        return nEquirectHelperRun(n, n2);
    }
    
    public static void access$200(final long n) {
        nDestroyEquirectHelper(n);
    }
    
    public static long access$300(final long n) {
        return nCreateSpecularFilter(n);
    }
    
    public static long access$400(final long n, final long n2) {
        return nSpecularFilterRun(n, n2);
    }
    
    public static void access$500(final long n) {
        nDestroySpecularFilter(n);
    }
    
    private static native long nCreate(final long p0);
    
    private static native long nCreateEquirectHelper(final long p0);
    
    private static native long nCreateSpecularFilter(final long p0);
    
    private static native void nDestroy(final long p0);
    
    private static native void nDestroyEquirectHelper(final long p0);
    
    private static native void nDestroySpecularFilter(final long p0);
    
    private static native long nEquirectHelperRun(final long p0, final long p1);
    
    private static native long nSpecularFilterRun(final long p0, final long p1);
    
    public void destroy() {
        nDestroy(this.getNativeObject());
        this.mNativeObject = 0L;
    }
    
    public long getNativeObject() {
        final long mNativeObject = this.mNativeObject;
        if (mNativeObject != 0L) {
            return mNativeObject;
        }
        throw new IllegalStateException("Calling method on destroyed IBLPrefilterContext");
    }
    
    public static class EquirectangularToCubemap
    {
        private long mNativeObject;
        
        public EquirectangularToCubemap(final IBLPrefilterContext iblPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.access$000(iblPrefilterContext.getNativeObject());
        }
        
        public void destroy() {
            IBLPrefilterContext.access$200(this.getNativeObject());
            this.mNativeObject = 0L;
        }
        
        public long getNativeObject() {
            final long mNativeObject = this.mNativeObject;
            if (mNativeObject != 0L) {
                return mNativeObject;
            }
            throw new IllegalStateException("Calling method on destroyed EquirectangularToCubemap");
        }
        
        public Texture run(final Texture texture) {
            return new Texture(IBLPrefilterContext.access$100(this.getNativeObject(), texture.getNativeObject()));
        }
    }
    
    public static class SpecularFilter
    {
        private long mNativeObject;
        
        public SpecularFilter(final IBLPrefilterContext iblPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.access$300(iblPrefilterContext.getNativeObject());
        }
        
        public void destroy() {
            IBLPrefilterContext.access$500(this.getNativeObject());
            this.mNativeObject = 0L;
        }
        
        public long getNativeObject() {
            final long mNativeObject = this.mNativeObject;
            if (mNativeObject != 0L) {
                return mNativeObject;
            }
            throw new IllegalStateException("Calling method on destroyed SpecularFilter");
        }
        
        public Texture run(final Texture texture) {
            return new Texture(IBLPrefilterContext.access$400(this.getNativeObject(), texture.getNativeObject()));
        }
    }
}
