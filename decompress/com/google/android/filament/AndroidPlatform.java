// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.util.Log;
import android.opengl.EGL14;

final class AndroidPlatform extends Platform
{
    private static final String LOG_TAG = "Filament";
    
    static {
        EGL14.eglGetDisplay(0);
    }
    
    public AndroidPlatform() {
    }
    
    @Override
    public long getSharedContextNativeHandle(final Object o) {
        return AndroidPlatform21.getSharedContextNativeHandle(o);
    }
    
    @Override
    public void log(final String s) {
        Log.d("Filament", s);
    }
    
    @Override
    public boolean validateSharedContext(final Object o) {
        return o instanceof EGLContext;
    }
    
    @Override
    public boolean validateStreamSource(final Object o) {
        return o instanceof SurfaceTexture;
    }
    
    @Override
    public boolean validateSurface(final Object o) {
        return o instanceof Surface;
    }
    
    @Override
    public void warn(final String s) {
        Log.w("Filament", s);
    }
}
