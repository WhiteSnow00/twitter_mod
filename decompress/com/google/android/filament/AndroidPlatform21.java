// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

import android.opengl.EGLObjectHandle;
import android.opengl.EGLContext;

final class AndroidPlatform21
{
    public AndroidPlatform21() {
    }
    
    public static long getSharedContextNativeHandle(final Object o) {
        return ((EGLObjectHandle)o).getNativeHandle();
    }
}
