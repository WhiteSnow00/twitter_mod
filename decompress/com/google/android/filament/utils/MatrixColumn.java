// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006�\u0006\u0007" }, d2 = { "Lcom/google/android/filament/utils/MatrixColumn;", "", "(Ljava/lang/String;I)V", "X", "Y", "Z", "W", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum MatrixColumn
{
    private static final MatrixColumn[] $VALUES;
    
    W, 
    X, 
    Y, 
    Z;
    
    private static final MatrixColumn[] $values() {
        return new MatrixColumn[] { MatrixColumn.X, MatrixColumn.Y, MatrixColumn.Z, MatrixColumn.W };
    }
    
    static {
        $VALUES = $values();
    }
}
