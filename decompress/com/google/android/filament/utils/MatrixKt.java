// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a \u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a6\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e\u001a&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e\u001a\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000e\u001a\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a\u001a.\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0002\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u001a\u000e\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006\u001a\u000e\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u000e\u0010&\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010'\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020(\u001a\u000e\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006)" }, d2 = { "inverse", "Lcom/google/android/filament/utils/Mat3;", "m", "Lcom/google/android/filament/utils/Mat4;", "lookAt", "eye", "Lcom/google/android/filament/utils/Float3;", "target", "up", "lookTowards", "forward", "normal", "ortho", "l", "", "r", "b", "t", "n", "f", "perspective", "fov", "ratio", "near", "far", "quaternion", "Lcom/google/android/filament/utils/Quaternion;", "rotation", "d", "order", "Lcom/google/android/filament/utils/RotationsOrder;", "axis", "angle", "yaw", "pitch", "roll", "scale", "s", "translation", "transpose", "Lcom/google/android/filament/utils/Mat2;", "filament-utils-android_fullRelease" }, k = 2, mv = { 1, 6, 0 }, xi = 48)
public final class MatrixKt
{
    public static final Mat3 inverse(final Mat3 mat3) {
        e0e.f((Object)mat3, "m");
        final float x = mat3.getX().getX();
        final float y = mat3.getX().getY();
        final float z = mat3.getX().getZ();
        final float x2 = mat3.getY().getX();
        final float y2 = mat3.getY().getY();
        final float z2 = mat3.getY().getZ();
        final float x3 = mat3.getZ().getX();
        final float y3 = mat3.getZ().getY();
        final float z3 = mat3.getZ().getZ();
        final float n = y2 * z3 - z2 * y3;
        final float n2 = z2 * x3 - x2 * z3;
        final float n3 = x2 * y3 - y2 * x3;
        final float n4 = z * n3 + (y * n2 + x * n);
        return Mat3.Companion.of(n / n4, n2 / n4, n3 / n4, j98.h(y, z3, z * y3, n4), j98.h(z, x3, z3 * x, n4), j98.h(y3, x, x3 * y, n4), j98.h(z, y2, y * z2, n4), j98.h(z2, x, z * x2, n4), j98.h(y, x2, x * y2, n4));
    }
    
    public static final Mat4 inverse(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final Mat4 mat5 = new Mat4(null, null, null, (Float4)null, 15, null);
        final float n = mat4.getW().getW() * mat4.getZ().getZ();
        final float n2 = mat4.getZ().getW() * mat4.getW().getZ();
        final float n3 = mat4.getW().getW() * mat4.getY().getZ();
        final float n4 = mat4.getY().getW() * mat4.getW().getZ();
        final float n5 = mat4.getZ().getW() * mat4.getY().getZ();
        final float n6 = mat4.getY().getW() * mat4.getZ().getZ();
        final float n7 = mat4.getW().getW() * mat4.getX().getZ();
        final float n8 = mat4.getX().getW() * mat4.getW().getZ();
        final float n9 = mat4.getZ().getW() * mat4.getX().getZ();
        final float n10 = mat4.getX().getW() * mat4.getZ().getZ();
        final float n11 = mat4.getY().getW() * mat4.getX().getZ();
        final float n12 = mat4.getX().getW() * mat4.getY().getZ();
        mat5.getX().setX(mat4.getW().getY() * n5 + (mat4.getZ().getY() * n4 + mat4.getY().getY() * n));
        final Float4 x = mat5.getX();
        x.setX(x.getX() - (mat4.getW().getY() * n6 + (mat4.getZ().getY() * n3 + mat4.getY().getY() * n2)));
        mat5.getX().setY(mat4.getW().getY() * n10 + (mat4.getZ().getY() * n7 + mat4.getX().getY() * n2));
        final Float4 x2 = mat5.getX();
        x2.setY(x2.getY() - (mat4.getW().getY() * n9 + (mat4.getZ().getY() * n8 + mat4.getX().getY() * n)));
        mat5.getX().setZ(mat4.getW().getY() * n11 + (mat4.getY().getY() * n8 + mat4.getX().getY() * n3));
        final Float4 x3 = mat5.getX();
        x3.setZ(x3.getZ() - (mat4.getW().getY() * n12 + (mat4.getY().getY() * n7 + mat4.getX().getY() * n4)));
        mat5.getX().setW(mat4.getZ().getY() * n12 + (mat4.getY().getY() * n9 + mat4.getX().getY() * n6));
        final Float4 x4 = mat5.getX();
        x4.setW(x4.getW() - (mat4.getZ().getY() * n11 + (mat4.getY().getY() * n10 + mat4.getX().getY() * n5)));
        mat5.getY().setX(mat4.getW().getX() * n6 + (mat4.getZ().getX() * n3 + mat4.getY().getX() * n2));
        final Float4 y = mat5.getY();
        y.setX(y.getX() - (mat4.getW().getX() * n5 + (mat4.getZ().getX() * n4 + mat4.getY().getX() * n)));
        mat5.getY().setY(mat4.getW().getX() * n9 + (mat4.getZ().getX() * n8 + mat4.getX().getX() * n));
        final Float4 y2 = mat5.getY();
        y2.setY(y2.getY() - (mat4.getW().getX() * n10 + (mat4.getZ().getX() * n7 + mat4.getX().getX() * n2)));
        mat5.getY().setZ(mat4.getW().getX() * n12 + (mat4.getY().getX() * n7 + mat4.getX().getX() * n4));
        final Float4 y3 = mat5.getY();
        y3.setZ(y3.getZ() - (mat4.getW().getX() * n11 + (mat4.getY().getX() * n8 + mat4.getX().getX() * n3)));
        mat5.getY().setW(mat4.getZ().getX() * n11 + (mat4.getY().getX() * n10 + mat4.getX().getX() * n5));
        final Float4 y4 = mat5.getY();
        y4.setW(y4.getW() - (mat4.getZ().getX() * n12 + (mat4.getY().getX() * n9 + mat4.getX().getX() * n6)));
        final float n13 = mat4.getW().getY() * mat4.getZ().getX();
        final float n14 = mat4.getZ().getY() * mat4.getW().getX();
        final float n15 = mat4.getW().getY() * mat4.getY().getX();
        final float n16 = mat4.getY().getY() * mat4.getW().getX();
        final float n17 = mat4.getZ().getY() * mat4.getY().getX();
        final float n18 = mat4.getY().getY() * mat4.getZ().getX();
        final float n19 = mat4.getW().getY() * mat4.getX().getX();
        final float n20 = mat4.getX().getY() * mat4.getW().getX();
        final float n21 = mat4.getZ().getY() * mat4.getX().getX();
        final float n22 = mat4.getX().getY() * mat4.getZ().getX();
        final float n23 = mat4.getY().getY() * mat4.getX().getX();
        final float n24 = mat4.getX().getY() * mat4.getY().getX();
        mat5.getZ().setX(mat4.getW().getW() * n17 + (mat4.getZ().getW() * n16 + mat4.getY().getW() * n13));
        final Float4 z = mat5.getZ();
        z.setX(z.getX() - (mat4.getW().getW() * n18 + (mat4.getZ().getW() * n15 + mat4.getY().getW() * n14)));
        mat5.getZ().setY(mat4.getW().getW() * n22 + (mat4.getZ().getW() * n19 + mat4.getX().getW() * n14));
        final Float4 z2 = mat5.getZ();
        z2.setY(z2.getY() - (mat4.getW().getW() * n21 + (mat4.getZ().getW() * n20 + mat4.getX().getW() * n13)));
        mat5.getZ().setZ(mat4.getW().getW() * n23 + (mat4.getY().getW() * n20 + mat4.getX().getW() * n15));
        final Float4 z3 = mat5.getZ();
        z3.setZ(z3.getZ() - (mat4.getW().getW() * n24 + (mat4.getY().getW() * n19 + mat4.getX().getW() * n16)));
        mat5.getZ().setW(mat4.getZ().getW() * n24 + (mat4.getY().getW() * n21 + mat4.getX().getW() * n18));
        final Float4 z4 = mat5.getZ();
        z4.setW(z4.getW() - (mat4.getZ().getW() * n23 + (mat4.getY().getW() * n22 + mat4.getX().getW() * n17)));
        mat5.getW().setX(mat4.getY().getZ() * n14 + (mat4.getW().getZ() * n18 + mat4.getZ().getZ() * n15));
        final Float4 w = mat5.getW();
        w.setX(w.getX() - (mat4.getZ().getZ() * n16 + (mat4.getY().getZ() * n13 + mat4.getW().getZ() * n17)));
        mat5.getW().setY(mat4.getZ().getZ() * n20 + (mat4.getX().getZ() * n13 + mat4.getW().getZ() * n21));
        final Float4 w2 = mat5.getW();
        w2.setY(w2.getY() - (mat4.getX().getZ() * n14 + (mat4.getW().getZ() * n22 + mat4.getZ().getZ() * n19)));
        mat5.getW().setZ(mat4.getX().getZ() * n16 + (mat4.getW().getZ() * n24 + mat4.getY().getZ() * n19));
        final Float4 w3 = mat5.getW();
        w3.setZ(w3.getZ() - (mat4.getY().getZ() * n20 + (mat4.getX().getZ() * n15 + mat4.getW().getZ() * n23)));
        mat5.getW().setW(mat4.getY().getZ() * n22 + (mat4.getX().getZ() * n17 + mat4.getZ().getZ() * n23));
        final Float4 w4 = mat5.getW();
        w4.setW(w4.getW() - (mat4.getX().getZ() * n18 + (mat4.getZ().getZ() * n24 + mat4.getY().getZ() * n21)));
        return mat5.div(mat5.getX().getW() * mat4.getW().getX() + (mat5.getX().getZ() * mat4.getZ().getX() + (mat5.getX().getY() * mat4.getY().getX() + mat5.getX().getX() * mat4.getX().getX())));
    }
    
    public static final Mat4 lookAt(final Float3 float3, final Float3 float4, final Float3 float5) {
        e0e.f((Object)float3, "eye");
        e0e.f((Object)float4, "target");
        e0e.f((Object)float5, "up");
        return lookTowards(float3, new Float3(float4.getX() - float3.getX(), float4.getY() - float3.getY(), float4.getZ() - float3.getZ()), float5);
    }
    
    public static Mat4 lookAt$default(final Float3 float3, final Float3 float4, Float3 float5, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            float5 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookAt(float3, float4, float5);
    }
    
    public static final Mat4 lookTowards(final Float3 float3, Float3 normalize, Float3 normalize2) {
        e0e.f((Object)float3, "eye");
        e0e.f((Object)normalize, "forward");
        e0e.f((Object)normalize2, "up");
        normalize = VectorKt.normalize(normalize);
        final Float3 normalize3 = VectorKt.normalize(new Float3(normalize2.getZ() * normalize.getY() - normalize2.getY() * normalize.getZ(), normalize2.getX() * normalize.getZ() - normalize2.getZ() * normalize.getX(), normalize2.getY() * normalize.getX() - normalize2.getX() * normalize.getY()));
        normalize2 = VectorKt.normalize(new Float3(normalize.getZ() * normalize3.getY() - normalize.getY() * normalize3.getZ(), normalize.getX() * normalize3.getZ() - normalize.getZ() * normalize3.getX(), normalize.getY() * normalize3.getX() - normalize.getX() * normalize3.getY()));
        return new Mat4(new Float4(normalize3, 0.0f, 2, null), new Float4(normalize2, 0.0f, 2, null), new Float4(normalize.unaryMinus(), 0.0f, 2, null), new Float4(float3, 1.0f));
    }
    
    public static Mat4 lookTowards$default(final Float3 float3, final Float3 float4, Float3 float5, final int n, final Object o) {
        if ((n & 0x4) != 0x0) {
            float5 = new Float3(0.0f, 0.0f, 1.0f, 3, null);
        }
        return lookTowards(float3, float4, float5);
    }
    
    public static final Mat4 normal(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final Float4 x = mat4.getX();
        final Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        final float e = bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX()));
        final Float4 y = mat4.getY();
        final Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        final float e2 = bng.e(float4, float4.getZ(), ang.b(float4, float4.getY(), float4.getX() * float4.getX()));
        final Float4 z = mat4.getZ();
        final Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        final Float3 float6 = new Float3(e, e2, bng.e(float5, float5.getZ(), ang.b(float5, float5.getY(), float5.getX() * float5.getX())));
        return scale(new Float3(1.0f / float6.getX(), 1.0f / float6.getY(), 1.0f / float6.getZ())).times(mat4);
    }
    
    public static final Mat4 ortho(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final Float4 float4 = new Float4(2.0f / (n2 - 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
        final float n7 = n4 - n3;
        final Float4 float5 = new Float4(0.0f, 2.0f / n7, 0.0f, 0.0f, 13, null);
        final float n8 = n6 - n5;
        return new Mat4(float4, float5, new Float4(0.0f, 0.0f, -2.0f / n8, 0.0f, 11, null), new Float4(-(n2 + n) / (n2 - n), -(n4 + n3) / n7, -(n6 + n5) / n8, 1.0f));
    }
    
    public static final Mat4 perspective(float n, final float n2, float n3, final float n4) {
        final float n5 = 1.0f / (float)Math.tan(0.017453292f * n * 0.5f);
        final float n6 = n4 - n3;
        n = (n4 + n3) / n6;
        n3 = 2.0f * n4 * n3 / n6;
        return new Mat4(new Float4(n5 / n2, 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, n5, 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, n, 1.0f, 3, null), new Float4(0.0f, 0.0f, -n3, 0.0f, 11, null));
    }
    
    public static final Quaternion quaternion(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final float n = mat4.getZ().getZ() + (mat4.getY().getY() + mat4.getX().getX());
        Quaternion quaternion;
        if (n > 0.0f) {
            final float n2 = (float)Math.sqrt(n + 1.0f) * 2.0f;
            quaternion = new Quaternion((mat4.getY().getZ() - mat4.getZ().getY()) / n2, (mat4.getZ().getX() - mat4.getX().getZ()) / n2, (mat4.getX().getY() - mat4.getY().getX()) / n2, n2 * 0.25f);
        }
        else if (mat4.getX().getX() > mat4.getY().getY() && mat4.getX().getX() > mat4.getZ().getZ()) {
            final float n3 = (float)Math.sqrt(mat4.getX().getX() + 1.0f - mat4.getY().getY() - mat4.getZ().getZ()) * 2.0f;
            quaternion = new Quaternion(0.25f * n3, (mat4.getX().getY() + mat4.getY().getX()) / n3, (mat4.getX().getZ() + mat4.getZ().getX()) / n3, (mat4.getY().getZ() - mat4.getZ().getY()) / n3);
        }
        else if (mat4.getY().getY() > mat4.getZ().getZ()) {
            final float n4 = (float)Math.sqrt(mat4.getY().getY() + 1.0f - mat4.getX().getX() - mat4.getZ().getZ()) * 2.0f;
            quaternion = new Quaternion((mat4.getX().getY() + mat4.getY().getX()) / n4, 0.25f * n4, (mat4.getY().getZ() + mat4.getZ().getY()) / n4, (mat4.getZ().getX() - mat4.getX().getZ()) / n4);
        }
        else {
            final float n5 = (float)Math.sqrt(mat4.getZ().getZ() + 1.0f - mat4.getX().getX() - mat4.getY().getY()) * 2.0f;
            quaternion = new Quaternion((mat4.getX().getZ() + mat4.getZ().getX()) / n5, (mat4.getY().getZ() + mat4.getZ().getY()) / n5, 0.25f * n5, (mat4.getX().getY() - mat4.getY().getX()) / n5);
        }
        return QuaternionKt.normalize(quaternion);
    }
    
    public static final Mat4 rotation(float n, float n2, float n3, final RotationsOrder rotationsOrder) {
        e0e.f((Object)rotationsOrder, "order");
        final double n4 = n;
        n = (float)Math.cos(n4);
        final float n5 = (float)Math.sin(n4);
        final double n6 = n2;
        final float n7 = (float)Math.cos(n6);
        n2 = (float)Math.sin(n6);
        final double n8 = n3;
        n3 = (float)Math.cos(n8);
        final float n9 = (float)Math.sin(n8);
        Mat4 mat4 = null;
        switch (WhenMappings.$EnumSwitchMapping$0[rotationsOrder.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 6: {
                final Mat4.Companion companion = Mat4.Companion;
                final float n10 = n * n3;
                final float n11 = -n7;
                final float n12 = n3 * n5;
                mat4 = companion.of(n10 - n5 * n2 * n9, n11 * n5, n12 * n2 + n * n9, 0.0f, n * n2 * n9 + n12, n * n7, n5 * n9 - n10 * n2, 0.0f, n11 * n9, n2, n7 * n3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case 5: {
                final Mat4.Companion companion2 = Mat4.Companion;
                final float n13 = n3 * n5;
                final float n14 = n * n3;
                mat4 = companion2.of(n * n7, n * n2 * n9 - n13, n14 * n2 + n5 * n9, 0.0f, n7 * n5, n5 * n2 * n9 + n14, n13 * n2 - n * n9, 0.0f, -n2, n9 * n7, n7 * n3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case 4: {
                final Mat4.Companion companion3 = Mat4.Companion;
                final float n15 = n * n3;
                final float n16 = n3 * n5;
                final float n17 = -n7;
                mat4 = companion3.of(n * n7, n5 * n9 - n15 * n2, n * n2 * n9 + n16, 0.0f, n2, n3 * n7, n17 * n9, 0.0f, n17 * n5, n16 * n2 + n * n9, n15 - n5 * n2 * n9, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case 3: {
                final Mat4.Companion companion4 = Mat4.Companion;
                final float n18 = n * n3;
                final float n19 = n3 * n5;
                mat4 = companion4.of(n5 * n2 * n9 + n18, n19 * n2 - n * n9, n7 * n5, 0.0f, n7 * n9, n3 * n7, -n2, 0.0f, n * n2 * n9 - n19, n5 * n9 + n18 * n2, n * n7, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case 2: {
                final Mat4.Companion companion5 = Mat4.Companion;
                final float n20 = -n7;
                final float n21 = n3 * n5;
                final float n22 = n3 * n;
                mat4 = companion5.of(n7 * n3, n20 * n9, n2, 0.0f, n21 * n2 + n * n9, n22 - n5 * n2 * n9, n20 * n5, 0.0f, n5 * n9 - n22 * n2, n2 * n * n9 + n21, n * n7, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
            case 1: {
                final Mat4.Companion companion6 = Mat4.Companion;
                final float n23 = -n2;
                final float n24 = n * n3;
                final float n25 = n3 * n5;
                mat4 = companion6.of(n7 * n3, n23, n7 * n9, 0.0f, n24 * n2 + n5 * n9, n * n7, n * n2 * n9 - n25, 0.0f, n25 * n2 - n * n9, n7 * n5, n5 * n2 * n9 + n24, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                break;
            }
        }
        return mat4;
    }
    
    public static final Mat4 rotation(final Float3 float3, float n) {
        e0e.f((Object)float3, "axis");
        final float x = float3.getX();
        final float y = float3.getY();
        final float z = float3.getZ();
        final double n2 = n * 0.017453292f;
        final float n3 = (float)Math.cos(n2);
        final float n4 = (float)Math.sin(n2);
        n = 1.0f - n3;
        final Mat4.Companion companion = Mat4.Companion;
        final float n5 = x * y * n;
        final float n6 = z * n4;
        final float n7 = x * z * n;
        final float n8 = y * n4;
        final float n9 = y * z * n;
        final float n10 = x * n4;
        return companion.of(x * x * n + n3, n5 - n6, n7 + n8, 0.0f, n5 + n6, y * y * n + n3, n9 - n10, 0.0f, n7 - n8, n9 + n10, z * z * n + n3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    public static final Mat4 rotation(Float3 copy$default, final RotationsOrder rotationsOrder) {
        e0e.f((Object)copy$default, "d");
        e0e.f((Object)rotationsOrder, "order");
        copy$default = Float3.copy$default(copy$default, 0.0f, 0.0f, 0.0f, 7, null);
        copy$default.setX(copy$default.getX() * 0.017453292f);
        copy$default.setY(copy$default.getY() * 0.017453292f);
        copy$default.setZ(copy$default.getZ() * 0.017453292f);
        Mat4 mat4 = null;
        switch (WhenMappings.$EnumSwitchMapping$0[rotationsOrder.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 6: {
                mat4 = rotation$default(copy$default.getZ(), copy$default.getX(), copy$default.getY(), null, 8, null);
                break;
            }
            case 5: {
                mat4 = rotation$default(copy$default.getZ(), copy$default.getY(), copy$default.getX(), null, 8, null);
                break;
            }
            case 4: {
                mat4 = rotation$default(copy$default.getY(), copy$default.getZ(), copy$default.getX(), null, 8, null);
                break;
            }
            case 3: {
                mat4 = rotation$default(copy$default.getY(), copy$default.getX(), copy$default.getZ(), null, 8, null);
                break;
            }
            case 2: {
                mat4 = rotation$default(copy$default.getX(), copy$default.getY(), copy$default.getZ(), null, 8, null);
                break;
            }
            case 1: {
                mat4 = rotation$default(copy$default.getX(), copy$default.getZ(), copy$default.getY(), null, 8, null);
                break;
            }
        }
        return mat4;
    }
    
    public static final Mat4 rotation(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final Float4 x = mat4.getX();
        final Float3 normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        final Float4 y = mat4.getY();
        final Float3 normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        final Float4 z = mat4.getZ();
        return new Mat4(normalize, normalize2, VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ())), null, 8, null);
    }
    
    public static final Mat4 rotation(Quaternion normalize) {
        e0e.f((Object)normalize, "quaternion");
        normalize = QuaternionKt.normalize(normalize);
        return new Mat4(new Float4(1.0f - (normalize.getZ() * normalize.getZ() + normalize.getY() * normalize.getY()) * 2.0f, (normalize.getW() * normalize.getZ() + normalize.getY() * normalize.getX()) * 2.0f, (normalize.getZ() * normalize.getX() - normalize.getW() * normalize.getY()) * 2.0f, 0.0f, 8, null), new Float4((normalize.getY() * normalize.getX() - normalize.getW() * normalize.getZ()) * 2.0f, 1.0f - (normalize.getZ() * normalize.getZ() + normalize.getX() * normalize.getX()) * 2.0f, (normalize.getW() * normalize.getX() + normalize.getZ() * normalize.getY()) * 2.0f, 0.0f, 8, null), new Float4((normalize.getW() * normalize.getY() + normalize.getZ() * normalize.getX()) * 2.0f, (normalize.getZ() * normalize.getY() - normalize.getW() * normalize.getX()) * 2.0f, 1.0f - (normalize.getY() * normalize.getY() + normalize.getX() * normalize.getX()) * 2.0f, 0.0f, 8, null), null, 8, null);
    }
    
    public static Mat4 rotation$default(float n, float n2, float n3, RotationsOrder zyx, final int n4, final Object o) {
        if ((n4 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n4 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        if ((n4 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n4 & 0x8) != 0x0) {
            zyx = RotationsOrder.ZYX;
        }
        return rotation(n, n2, n3, zyx);
    }
    
    public static Mat4 rotation$default(final Float3 float3, RotationsOrder zyx, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            zyx = RotationsOrder.ZYX;
        }
        return rotation(float3, zyx);
    }
    
    public static final Mat4 scale(final Float3 float3) {
        e0e.f((Object)float3, "s");
        return new Mat4(new Float4(float3.getX(), 0.0f, 0.0f, 0.0f, 14, null), new Float4(0.0f, float3.getY(), 0.0f, 0.0f, 13, null), new Float4(0.0f, 0.0f, float3.getZ(), 0.0f, 11, null), null, 8, null);
    }
    
    public static final Mat4 scale(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final Float4 x = mat4.getX();
        final Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        final float n = (float)Math.sqrt(bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX())));
        final Float4 y = mat4.getY();
        final Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        final float n2 = (float)Math.sqrt(bng.e(float4, float4.getZ(), ang.b(float4, float4.getY(), float4.getX() * float4.getX())));
        final Float4 z = mat4.getZ();
        final Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        return scale(new Float3(n, n2, (float)Math.sqrt(bng.e(float5, float5.getZ(), ang.b(float5, float5.getY(), float5.getX() * float5.getX())))));
    }
    
    public static final Mat4 translation(final Float3 float3) {
        e0e.f((Object)float3, "t");
        return new Mat4(null, null, null, new Float4(float3, 1.0f), 7, null);
    }
    
    public static final Mat4 translation(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        final Float4 w = mat4.getW();
        return translation(new Float3(w.getX(), w.getY(), w.getZ()));
    }
    
    public static final Mat2 transpose(final Mat2 mat2) {
        e0e.f((Object)mat2, "m");
        return new Mat2(new Float2(mat2.getX().getX(), mat2.getY().getX()), new Float2(mat2.getX().getY(), mat2.getY().getY()));
    }
    
    public static final Mat3 transpose(final Mat3 mat3) {
        e0e.f((Object)mat3, "m");
        return new Mat3(new Float3(mat3.getX().getX(), mat3.getY().getX(), mat3.getZ().getX()), new Float3(mat3.getX().getY(), mat3.getY().getY(), mat3.getZ().getY()), new Float3(mat3.getX().getZ(), mat3.getY().getZ(), mat3.getZ().getZ()));
    }
    
    public static final Mat4 transpose(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        return new Mat4(new Float4(mat4.getX().getX(), mat4.getY().getX(), mat4.getZ().getX(), mat4.getW().getX()), new Float4(mat4.getX().getY(), mat4.getY().getY(), mat4.getZ().getY(), mat4.getW().getY()), new Float4(mat4.getX().getZ(), mat4.getY().getZ(), mat4.getZ().getZ(), mat4.getW().getZ()), new Float4(mat4.getX().getW(), mat4.getY().getW(), mat4.getZ().getW(), mat4.getW().getW()));
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[RotationsOrder.values().length];
            $EnumSwitchMapping$[RotationsOrder.XZY.ordinal()] = 1;
            $EnumSwitchMapping$[RotationsOrder.XYZ.ordinal()] = 2;
            $EnumSwitchMapping$[RotationsOrder.YXZ.ordinal()] = 3;
            $EnumSwitchMapping$[RotationsOrder.YZX.ordinal()] = 4;
            $EnumSwitchMapping$[RotationsOrder.ZYX.ordinal()] = 5;
            $EnumSwitchMapping$[RotationsOrder.ZXY.ordinal()] = 6;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
