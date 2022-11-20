// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/google/android/filament/utils/VectorComponent;", "", "(Ljava/lang/String;I)V", "X", "Y", "Z", "W", "R", "G", "B", "A", "S", "T", "P", "Q", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum VectorComponent
{
    private static final VectorComponent[] $VALUES;
    
    A, 
    B, 
    G, 
    P, 
    Q, 
    R, 
    S, 
    T, 
    W, 
    X, 
    Y, 
    Z;
    
    private static final VectorComponent[] $values() {
        return new VectorComponent[] { VectorComponent.X, VectorComponent.Y, VectorComponent.Z, VectorComponent.W, VectorComponent.R, VectorComponent.G, VectorComponent.B, VectorComponent.A, VectorComponent.S, VectorComponent.T, VectorComponent.P, VectorComponent.Q };
    }
    
    static {
        $VALUES = $values();
    }
}
