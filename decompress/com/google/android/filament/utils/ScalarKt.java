// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\u001a!\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0015\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017" }, d2 = { "FOUR_PI", "", "FPI", "HALF_PI", "INV_FOUR_PI", "INV_PI", "INV_TWO_PI", "TWO_PI", "clamp", "x", "min", "max", "degrees", "v", "fract", "mix", "a", "b", "pow", "y", "radians", "saturate", "sqr", "filament-utils-android_fullRelease" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class ScalarKt
{
    public static final float FOUR_PI = 12.566371f;
    public static final float FPI = 3.1415927f;
    public static final float HALF_PI = 1.5707964f;
    public static final float INV_FOUR_PI = 0.07957747f;
    public static final float INV_PI = 0.31830987f;
    public static final float INV_TWO_PI = 0.15915494f;
    public static final float TWO_PI = 6.2831855f;
    
    public static final float clamp(final float n, float n2, final float n3) {
        if (n >= n2) {
            n2 = n;
            if (n > n3) {
                n2 = n3;
            }
        }
        return n2;
    }
    
    public static final float degrees(final float n) {
        return n * 57.295776f;
    }
    
    public static final float fract(final float n) {
        return n % 1;
    }
    
    public static final float mix(final float n, final float n2, final float n3) {
        return n2 * n3 + (1.0f - n3) * n;
    }
    
    public static final float pow(final float n, final float n2) {
        return (float)Math.pow(n, n2);
    }
    
    public static final float radians(final float n) {
        return n * 0.017453292f;
    }
    
    public static final float saturate(final float n) {
        float n2;
        if (n < 0.0f) {
            n2 = 0.0f;
        }
        else {
            n2 = n;
            if (n > 1.0f) {
                n2 = 1.0f;
            }
        }
        return n2;
    }
    
    public static final float sqr(final float n) {
        return n * n;
    }
}
