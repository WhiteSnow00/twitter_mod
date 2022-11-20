// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t" }, d2 = { "Lcom/google/android/filament/utils/RotationsOrder;", "", "(Ljava/lang/String;I)V", "XYZ", "XZY", "YXZ", "YZX", "ZXY", "ZYX", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum RotationsOrder
{
    private static final RotationsOrder[] $VALUES;
    
    XYZ, 
    XZY, 
    YXZ, 
    YZX, 
    ZXY, 
    ZYX;
    
    private static final RotationsOrder[] $values() {
        return new RotationsOrder[] { RotationsOrder.XYZ, RotationsOrder.XZY, RotationsOrder.YXZ, RotationsOrder.YZX, RotationsOrder.ZXY, RotationsOrder.ZYX };
    }
    
    static {
        $VALUES = $values();
    }
}
