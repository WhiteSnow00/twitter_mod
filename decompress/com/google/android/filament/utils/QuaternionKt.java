// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\b\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b\u001a\u001e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a(\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¨\u0006\u0018" }, d2 = { "abs", "Lcom/google/android/filament/utils/Quaternion;", "q", "conjugate", "cross", "a", "b", "dot", "", "eulerAngles", "Lcom/google/android/filament/utils/Float3;", "inverse", "length", "length2", "lerp", "t", "nlerp", "normalize", "slerp", "valueEps", "div", "minus", "plus", "times", "filament-utils-android_fullRelease" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class QuaternionKt
{
    public static final Quaternion abs(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(Math.abs(quaternion.getX()), Math.abs(quaternion.getY()), Math.abs(quaternion.getZ()), Math.abs(quaternion.getW()));
    }
    
    public static final Quaternion conjugate(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(-quaternion.getX(), -quaternion.getY(), -quaternion.getZ(), quaternion.getW());
    }
    
    public static final Quaternion cross(Quaternion quaternion, final Quaternion quaternion2) {
        czd.f((Object)quaternion, "a");
        czd.f((Object)quaternion2, "b");
        quaternion = new Quaternion(quaternion2.getZ() * quaternion.getY() + (quaternion2.getW() * quaternion.getX() + quaternion2.getX() * quaternion.getW()) - quaternion2.getY() * quaternion.getZ(), quaternion2.getX() * quaternion.getZ() + (quaternion2.getW() * quaternion.getY() + (quaternion2.getY() * quaternion.getW() - quaternion2.getZ() * quaternion.getX())), quaternion2.getW() * quaternion.getZ() + (quaternion2.getY() * quaternion.getX() + quaternion2.getZ() * quaternion.getW() - quaternion2.getX() * quaternion.getY()), quaternion2.getW() * quaternion.getW() - quaternion2.getX() * quaternion.getX() - quaternion2.getY() * quaternion.getY() - quaternion2.getZ() * quaternion.getZ());
        return new Quaternion(quaternion.getX(), quaternion.getY(), quaternion.getZ(), 0.0f);
    }
    
    public static final Quaternion div(final float n, final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(n / quaternion.getX(), n / quaternion.getY(), n / quaternion.getZ(), n / quaternion.getW());
    }
    
    public static final float dot(final Quaternion quaternion, final Quaternion quaternion2) {
        czd.f((Object)quaternion, "a");
        czd.f((Object)quaternion2, "b");
        return quaternion2.getW() * quaternion.getW() + (quaternion2.getZ() * quaternion.getZ() + (quaternion2.getY() * quaternion.getY() + quaternion2.getX() * quaternion.getX()));
    }
    
    public static final Float3 eulerAngles(Quaternion normalize) {
        czd.f((Object)normalize, "q");
        normalize = normalize(normalize);
        return new Float3((float)Math.atan2((normalize.getX() * normalize.getW() + normalize.getZ() * normalize.getY()) * 2.0f, normalize.getZ() * normalize.getZ() + (normalize.getW() * normalize.getW() - normalize.getX() * normalize.getX() - normalize.getY() * normalize.getY())) * 57.295776f, (float)Math.asin((normalize.getZ() * normalize.getX() - normalize.getY() * normalize.getW()) * -2.0f) * 57.295776f, (float)Math.atan2((normalize.getZ() * normalize.getW() + normalize.getY() * normalize.getX()) * 2.0f, normalize.getX() * normalize.getX() + normalize.getW() * normalize.getW() - normalize.getY() * normalize.getY() - normalize.getZ() * normalize.getZ()) * 57.295776f);
    }
    
    public static final Quaternion inverse(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        final float n = 1.0f / (quaternion.getW() * quaternion.getW() + (quaternion.getZ() * quaternion.getZ() + (quaternion.getY() * quaternion.getY() + quaternion.getX() * quaternion.getX())));
        return new Quaternion(-quaternion.getX() * n, -quaternion.getY() * n, -quaternion.getZ() * n, quaternion.getW() * n);
    }
    
    public static final float length(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return (float)Math.sqrt(quaternion.getW() * quaternion.getW() + (quaternion.getZ() * quaternion.getZ() + (quaternion.getY() * quaternion.getY() + quaternion.getX() * quaternion.getX())));
    }
    
    public static final float length2(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return quaternion.getW() * quaternion.getW() + (quaternion.getZ() * quaternion.getZ() + (quaternion.getY() * quaternion.getY() + quaternion.getX() * quaternion.getX()));
    }
    
    public static final Quaternion lerp(Quaternion quaternion, Quaternion quaternion2, float x) {
        czd.f((Object)quaternion, "a");
        czd.f((Object)quaternion2, "b");
        final float n = 1 - x;
        quaternion = new Quaternion(quaternion.getX() * n, quaternion.getY() * n, quaternion.getZ() * n, quaternion.getW() * n);
        quaternion2 = new Quaternion(quaternion2.getX() * x, quaternion2.getY() * x, quaternion2.getZ() * x, quaternion2.getW() * x);
        x = quaternion.getX();
        return new Quaternion(quaternion2.getX() + x, quaternion2.getY() + quaternion.getY(), quaternion2.getZ() + quaternion.getZ(), quaternion2.getW() + quaternion.getW());
    }
    
    public static final Quaternion minus(final float n, final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(n - quaternion.getX(), n - quaternion.getY(), n - quaternion.getZ(), n - quaternion.getW());
    }
    
    public static final Quaternion nlerp(final Quaternion quaternion, final Quaternion quaternion2, final float n) {
        czd.f((Object)quaternion, "a");
        czd.f((Object)quaternion2, "b");
        return normalize(lerp(quaternion, quaternion2, n));
    }
    
    public static final Quaternion normalize(final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        final float n = 1.0f / (float)Math.sqrt(quaternion.getW() * quaternion.getW() + (quaternion.getZ() * quaternion.getZ() + (quaternion.getY() * quaternion.getY() + quaternion.getX() * quaternion.getX())));
        return new Quaternion(quaternion.getX() * n, quaternion.getY() * n, quaternion.getZ() * n, quaternion.getW() * n);
    }
    
    public static final Quaternion plus(final float n, final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(quaternion.getX() + n, quaternion.getY() + n, quaternion.getZ() + n, quaternion.getW() + n);
    }
    
    public static final Quaternion slerp(Quaternion quaternion, final Quaternion quaternion2, float y, float y2) {
        czd.f((Object)quaternion, "a");
        czd.f((Object)quaternion2, "b");
        final float n = quaternion2.getW() * quaternion.getW() + (quaternion2.getZ() * quaternion.getZ() + (quaternion2.getY() * quaternion.getY() + quaternion2.getX() * quaternion.getX()));
        final float abs = Math.abs(n);
        if (1.0f - abs < y2) {
            Quaternion unaryMinus = quaternion;
            if (n < 0.0f) {
                unaryMinus = quaternion.unaryMinus();
            }
            return normalize(lerp(unaryMinus, quaternion2, y));
        }
        final float n2 = abs / (float)Math.sqrt((quaternion2.getW() * quaternion2.getW() + (quaternion2.getZ() * quaternion2.getZ() + (quaternion2.getY() * quaternion2.getY() + quaternion2.getX() * quaternion2.getX()))) * (quaternion.getW() * quaternion.getW() + (quaternion.getZ() * quaternion.getZ() + (quaternion.getY() * quaternion.getY() + quaternion.getX() * quaternion.getX()))));
        float n3;
        if (n2 < -1.0f) {
            n3 = -1.0f;
        }
        else {
            n3 = n2;
            if (n2 > 1.0f) {
                n3 = 1.0f;
            }
        }
        final float n4 = (float)Math.acos(n3);
        final float n5 = (float)Math.sin(n4);
        if (n5 < y2) {
            return normalize(lerp(quaternion, quaternion2, y));
        }
        y2 = 1.0f / n5;
        final float n6 = (float)Math.sin((1.0f - y) * n4) * y2;
        y2 *= (float)Math.sin(n4 * y);
        quaternion = new Quaternion(quaternion.getX() * n6, quaternion.getY() * n6, quaternion.getZ() * n6, quaternion.getW() * n6);
        y = y2;
        if (n < 0.0f) {
            y = -y2;
        }
        final Quaternion quaternion3 = new Quaternion(quaternion2.getX() * y, quaternion2.getY() * y, quaternion2.getZ() * y, quaternion2.getW() * y);
        final float x = quaternion.getX();
        final float x2 = quaternion3.getX();
        y = quaternion.getY();
        y2 = quaternion3.getY();
        return normalize(new Quaternion(x2 + x, y2 + y, quaternion3.getZ() + quaternion.getZ(), quaternion3.getW() + quaternion.getW()));
    }
    
    public static Quaternion slerp$default(final Quaternion quaternion, final Quaternion quaternion2, final float n, float n2, final int n3, final Object o) {
        if ((n3 & 0x8) != 0x0) {
            n2 = 1.0E-10f;
        }
        return slerp(quaternion, quaternion2, n, n2);
    }
    
    public static final Quaternion times(final float n, final Quaternion quaternion) {
        czd.f((Object)quaternion, "q");
        return new Quaternion(quaternion.getX() * n, quaternion.getY() * n, quaternion.getZ() * n, quaternion.getW() * n);
    }
}
