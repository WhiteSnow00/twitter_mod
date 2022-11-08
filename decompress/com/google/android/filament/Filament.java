// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament;

public class Filament
{
    static {
        Platform.get();
        System.loadLibrary("filament-jni");
    }
    
    private Filament() {
    }
    
    public static void init() {
    }
}
