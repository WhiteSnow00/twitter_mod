// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import com.google.android.filament.Filament;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006" }, d2 = { "Lcom/google/android/filament/utils/Utils;", "", "Lfzv;", "init", "<init>", "()V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Utils
{
    public static final Utils INSTANCE;
    
    static {
        INSTANCE = new Utils();
    }
    
    private Utils() {
    }
    
    public final void init() {
        Filament.init();
        System.loadLibrary("filament-utils-jni");
    }
}
