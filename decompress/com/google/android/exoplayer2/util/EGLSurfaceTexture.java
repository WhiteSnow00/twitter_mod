// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.os.Handler;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public final class EGLSurfaceTexture implements SurfaceTexture$OnFrameAvailableListener, Runnable
{
    public static final int[] J0;
    public final Handler D0;
    public final int[] E0;
    public EGLDisplay F0;
    public EGLContext G0;
    public EGLSurface H0;
    public SurfaceTexture I0;
    
    static {
        J0 = new int[] { 12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344 };
    }
    
    public EGLSurfaceTexture(final Handler d0) {
        this.D0 = d0;
        this.E0 = new int[1];
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.D0.post((Runnable)this);
    }
    
    public final void run() {
        final SurfaceTexture i0 = this.I0;
        if (i0 == null) {
            return;
        }
        try {
            i0.updateTexImage();
        }
        catch (final RuntimeException ex) {}
    }
    
    public static final class GlException extends RuntimeException
    {
        public GlException(final String s) {
            super(s);
        }
    }
}
