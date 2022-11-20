// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005�\u0006\u0006" }, d2 = { "pointAt", "Lcom/google/android/filament/utils/Float3;", "r", "Lcom/google/android/filament/utils/Ray;", "t", "", "filament-utils-android_fullRelease" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class RayKt
{
    public static final Float3 pointAt(final Ray ray, float x) {
        czd.f((Object)ray, "r");
        final Float3 origin = ray.getOrigin();
        final Float3 direction = ray.getDirection();
        final Float3 float3 = new Float3(direction.getX() * x, direction.getY() * x, direction.getZ() * x);
        final float x2 = origin.getX();
        x = float3.getX();
        return new Float3(x + x2, float3.getY() + origin.getY(), float3.getZ() + origin.getZ());
    }
}
