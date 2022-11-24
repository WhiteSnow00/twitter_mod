// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bK\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004¢\u0006\u0004\bq\u0010rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\bq\u00100B%\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004¢\u0006\u0004\bq\u0010sB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\u0004¢\u0006\u0004\bq\u0010tB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\bq\u0010iJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J!\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0086\u0002J!\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0086\nJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0086\nJ\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0086\nJ\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\nJ \u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018H\u0086\b\u00f8\u0001\u0000J\u0006\u0010\u001c\u001a\u00020\u001bJ\t\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010 \u001a\u00020\u0004H\u00c6\u0003J1\u0010%\u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u0004H\u00c6\u0001J\t\u0010'\u001a\u00020&H\u00d6\u0001J\t\u0010(\u001a\u00020\fH\u00d6\u0001J\u0013\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R&\u0010:\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R&\u0010=\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R&\u0010@\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R&\u0010C\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R&\u0010F\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R&\u0010I\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R&\u0010L\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R&\u0010O\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010.\"\u0004\bN\u00100R&\u0010T\u001a\u00020\b2\u0006\u00107\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR&\u0010W\u001a\u00020\b2\u0006\u00107\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR&\u0010Z\u001a\u00020\b2\u0006\u00107\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Q\"\u0004\bY\u0010SR&\u0010_\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R&\u0010b\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010^R&\u0010e\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010\\\"\u0004\bd\u0010^R&\u0010j\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR&\u0010m\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010g\"\u0004\bl\u0010iR&\u0010p\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010g\"\u0004\bo\u0010i\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006u" }, d2 = { "Lcom/google/android/filament/utils/Float4;", "", "Lcom/google/android/filament/utils/VectorComponent;", "index", "", "get", "index1", "index2", "Lcom/google/android/filament/utils/Float2;", "index3", "Lcom/google/android/filament/utils/Float3;", "index4", "", "invoke", "v", "Lvzv;", "set", "unaryMinus", "inc", "dec", "plus", "minus", "times", "div", "Lkotlin/Function1;", "block", "transform", "", "toFloatArray", "component1", "component2", "component3", "component4", "x", "y", "z", "w", "copy", "", "toString", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getA", "setA", "a", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getQ", "setQ", "q", "getXy", "()Lcom/google/android/filament/utils/Float2;", "setXy", "(Lcom/google/android/filament/utils/Float2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Float3;", "setRgb", "(Lcom/google/android/filament/utils/Float3;)V", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "getRgba", "()Lcom/google/android/filament/utils/Float4;", "setRgba", "(Lcom/google/android/filament/utils/Float4;)V", "rgba", "getXyzw", "setXyzw", "xyzw", "getStpq", "setStpq", "stpq", "<init>", "(FFFF)V", "(Lcom/google/android/filament/utils/Float2;FF)V", "(Lcom/google/android/filament/utils/Float3;F)V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Float4
{
    private float w;
    private float x;
    private float y;
    private float z;
    
    public Float4() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
    
    public Float4(final float n) {
        this(n, n, n, n);
    }
    
    public Float4(final float x, final float y, final float z, final float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    public Float4(float n, float n2, float n3, float n4, final int n5, final wg8 wg8) {
        if ((n5 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        this(n, n2, n3, n4);
    }
    
    public Float4(final Float2 float2, final float n, final float n2) {
        e0e.f((Object)float2, "v");
        this(float2.getX(), float2.getY(), n, n2);
    }
    
    public Float4(final Float2 float2, float n, float n2, final int n3, final wg8 wg8) {
        if ((n3 & 0x2) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = 0.0f;
        }
        this(float2, n, n2);
    }
    
    public Float4(final Float3 float3, final float n) {
        e0e.f((Object)float3, "v");
        this(float3.getX(), float3.getY(), float3.getZ(), n);
    }
    
    public Float4(final Float3 float3, float n, final int n2, final wg8 wg8) {
        if ((n2 & 0x2) != 0x0) {
            n = 0.0f;
        }
        this(float3, n);
    }
    
    public Float4(final Float4 float4) {
        e0e.f((Object)float4, "v");
        this(float4.x, float4.y, float4.z, float4.w);
    }
    
    public static Float4 copy$default(final Float4 float4, float x, float y, float z, float w, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = float4.x;
        }
        if ((n & 0x2) != 0x0) {
            y = float4.y;
        }
        if ((n & 0x4) != 0x0) {
            z = float4.z;
        }
        if ((n & 0x8) != 0x0) {
            w = float4.w;
        }
        return float4.copy(x, y, z, w);
    }
    
    public final float component1() {
        return this.x;
    }
    
    public final float component2() {
        return this.y;
    }
    
    public final float component3() {
        return this.z;
    }
    
    public final float component4() {
        return this.w;
    }
    
    public final Float4 copy(final float n, final float n2, final float n3, final float n4) {
        return new Float4(n, n2, n3, n4);
    }
    
    public final Float4 dec() {
        final float x = this.x;
        this.x = x - 1.0f;
        final float y = this.y;
        this.y = y - 1.0f;
        final float z = this.z;
        this.z = z - 1.0f;
        final float w = this.w;
        this.w = -1.0f + w;
        return new Float4(x, y, z, w);
    }
    
    public final Float4 div(final float n) {
        return new Float4(this.getX() / n, this.getY() / n, this.getZ() / n, this.getW() / n);
    }
    
    public final Float4 div(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float4(this.getX() / float2.getX(), this.getY() / float2.getY(), this.getZ(), this.getW());
    }
    
    public final Float4 div(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float4(this.getX() / float3.getX(), this.getY() / float3.getY(), this.getZ() / float3.getZ(), this.getW());
    }
    
    public final Float4 div(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(this.getX() / float4.getX(), this.getY() / float4.getY(), this.getZ() / float4.getZ(), this.getW() / float4.getW());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Float4)) {
            return false;
        }
        final Float4 float4 = (Float4)o;
        return e0e.a((Object)this.x, (Object)float4.x) && e0e.a((Object)this.y, (Object)float4.y) && e0e.a((Object)this.z, (Object)float4.z) && e0e.a((Object)this.w, (Object)float4.w);
    }
    
    public final float get(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("index must be in 0..3");
                    }
                    n2 = this.w;
                }
                else {
                    n2 = this.z;
                }
            }
            else {
                n2 = this.y;
            }
        }
        else {
            n2 = this.x;
        }
        return n2;
    }
    
    public final float get(final VectorComponent vectorComponent) {
        e0e.f((Object)vectorComponent, "index");
        float n = 0.0f;
        switch (WhenMappings.$EnumSwitchMapping$0[vectorComponent.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                n = this.w;
                break;
            }
            case 7:
            case 8:
            case 9: {
                n = this.z;
                break;
            }
            case 4:
            case 5:
            case 6: {
                n = this.y;
                break;
            }
            case 1:
            case 2:
            case 3: {
                n = this.x;
                break;
            }
        }
        return n;
    }
    
    public final Float2 get(final int n, final int n2) {
        return new Float2(this.get(n), this.get(n2));
    }
    
    public final Float2 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        return new Float2(this.get(vectorComponent), this.get(vectorComponent2));
    }
    
    public final Float3 get(final int n, final int n2, final int n3) {
        return new Float3(this.get(n), this.get(n2), this.get(n3));
    }
    
    public final Float3 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        return new Float3(this.get(vectorComponent), this.get(vectorComponent2), this.get(vectorComponent3));
    }
    
    public final Float4 get(final int n, final int n2, final int n3, final int n4) {
        return new Float4(this.get(n), this.get(n2), this.get(n3), this.get(n4));
    }
    
    public final Float4 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final VectorComponent vectorComponent4) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        e0e.f((Object)vectorComponent4, "index4");
        return new Float4(this.get(vectorComponent), this.get(vectorComponent2), this.get(vectorComponent3), this.get(vectorComponent4));
    }
    
    public final float getA() {
        return this.getW();
    }
    
    public final float getB() {
        return this.getZ();
    }
    
    public final float getG() {
        return this.getY();
    }
    
    public final float getP() {
        return this.getZ();
    }
    
    public final float getQ() {
        return this.getW();
    }
    
    public final float getR() {
        return this.getX();
    }
    
    public final Float2 getRg() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final Float3 getRgb() {
        return new Float3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Float4 getRgba() {
        return new Float4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final float getS() {
        return this.getX();
    }
    
    public final Float2 getSt() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final Float3 getStp() {
        return new Float3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Float4 getStpq() {
        return new Float4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final float getT() {
        return this.getY();
    }
    
    public final float getW() {
        return this.w;
    }
    
    public final float getX() {
        return this.x;
    }
    
    public final Float2 getXy() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final Float3 getXyz() {
        return new Float3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Float4 getXyzw() {
        return new Float4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final float getY() {
        return this.y;
    }
    
    public final float getZ() {
        return this.z;
    }
    
    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.w) + dn.g(this.z, dn.g(this.y, Float.floatToIntBits(this.x) * 31, 31), 31);
    }
    
    public final Float4 inc() {
        final float x = this.x;
        this.x = x + 1.0f;
        final float y = this.y;
        this.y = y + 1.0f;
        final float z = this.z;
        this.z = z + 1.0f;
        final float w = this.w;
        this.w = 1.0f + w;
        return new Float4(x, y, z, w);
    }
    
    public final float invoke(final int n) {
        return this.get(n - 1);
    }
    
    public final Float4 minus(final float n) {
        return new Float4(this.getX() - n, this.getY() - n, this.getZ() - n, this.getW() - n);
    }
    
    public final Float4 minus(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float4(this.getX() - float2.getX(), this.getY() - float2.getY(), this.getZ(), this.getW());
    }
    
    public final Float4 minus(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float4(this.getX() - float3.getX(), this.getY() - float3.getY(), this.getZ() - float3.getZ(), this.getW());
    }
    
    public final Float4 minus(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(this.getX() - float4.getX(), this.getY() - float4.getY(), this.getZ() - float4.getZ(), this.getW() - float4.getW());
    }
    
    public final Float4 plus(final float n) {
        return new Float4(this.getX() + n, this.getY() + n, this.getZ() + n, this.getW() + n);
    }
    
    public final Float4 plus(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float4(float2.getX() + this.getX(), float2.getY() + this.getY(), this.getZ(), this.getW());
    }
    
    public final Float4 plus(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float4(float3.getX() + this.getX(), float3.getY() + this.getY(), float3.getZ() + this.getZ(), this.getW());
    }
    
    public final Float4 plus(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(float4.getX() + this.getX(), float4.getY() + this.getY(), float4.getZ() + this.getZ(), float4.getW() + this.getW());
    }
    
    public final void set(final int n, final float n2) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("index must be in 0..3");
                    }
                    this.w = n2;
                }
                else {
                    this.z = n2;
                }
            }
            else {
                this.y = n2;
            }
        }
        else {
            this.x = n2;
        }
    }
    
    public final void set(final int n, final int n2, final float n3) {
        this.set(n, n3);
        this.set(n2, n3);
    }
    
    public final void set(final int n, final int n2, final int n3, final float n4) {
        this.set(n, n4);
        this.set(n2, n4);
        this.set(n3, n4);
    }
    
    public final void set(final int n, final int n2, final int n3, final int n4, final float n5) {
        this.set(n, n5);
        this.set(n2, n5);
        this.set(n3, n5);
        this.set(n4, n5);
    }
    
    public final void set(final VectorComponent vectorComponent, final float n) {
        e0e.f((Object)vectorComponent, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[vectorComponent.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                this.w = n;
                break;
            }
            case 7:
            case 8:
            case 9: {
                this.z = n;
                break;
            }
            case 4:
            case 5:
            case 6: {
                this.y = n;
                break;
            }
            case 1:
            case 2:
            case 3: {
                this.x = n;
                break;
            }
        }
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final float n) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        this.set(vectorComponent, n);
        this.set(vectorComponent2, n);
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final float n) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        this.set(vectorComponent, n);
        this.set(vectorComponent2, n);
        this.set(vectorComponent3, n);
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final VectorComponent vectorComponent4, final float n) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        e0e.f((Object)vectorComponent4, "index4");
        this.set(vectorComponent, n);
        this.set(vectorComponent2, n);
        this.set(vectorComponent3, n);
        this.set(vectorComponent4, n);
    }
    
    public final void setA(final float w) {
        this.setW(w);
    }
    
    public final void setB(final float z) {
        this.setZ(z);
    }
    
    public final void setG(final float y) {
        this.setY(y);
    }
    
    public final void setP(final float z) {
        this.setZ(z);
    }
    
    public final void setQ(final float w) {
        this.setW(w);
    }
    
    public final void setR(final float x) {
        this.setX(x);
    }
    
    public final void setRg(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setRgb(final Float3 float3) {
        e0e.f((Object)float3, "value");
        this.setX(float3.getX());
        this.setY(float3.getY());
        this.setZ(float3.getZ());
    }
    
    public final void setRgba(final Float4 float4) {
        e0e.f((Object)float4, "value");
        this.setX(float4.getX());
        this.setY(float4.getY());
        this.setZ(float4.getZ());
        this.setW(float4.getW());
    }
    
    public final void setS(final float x) {
        this.setX(x);
    }
    
    public final void setSt(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setStp(final Float3 float3) {
        e0e.f((Object)float3, "value");
        this.setX(float3.getX());
        this.setY(float3.getY());
        this.setZ(float3.getZ());
    }
    
    public final void setStpq(final Float4 float4) {
        e0e.f((Object)float4, "value");
        this.setX(float4.getX());
        this.setY(float4.getY());
        this.setZ(float4.getZ());
        this.setW(float4.getW());
    }
    
    public final void setT(final float y) {
        this.setY(y);
    }
    
    public final void setW(final float w) {
        this.w = w;
    }
    
    public final void setX(final float x) {
        this.x = x;
    }
    
    public final void setXy(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setXyz(final Float3 float3) {
        e0e.f((Object)float3, "value");
        this.setX(float3.getX());
        this.setY(float3.getY());
        this.setZ(float3.getZ());
    }
    
    public final void setXyzw(final Float4 float4) {
        e0e.f((Object)float4, "value");
        this.setX(float4.getX());
        this.setY(float4.getY());
        this.setZ(float4.getZ());
        this.setW(float4.getW());
    }
    
    public final void setY(final float y) {
        this.y = y;
    }
    
    public final void setZ(final float z) {
        this.z = z;
    }
    
    public final Float4 times(final float n) {
        return new Float4(this.getX() * n, this.getY() * n, this.getZ() * n, this.getW() * n);
    }
    
    public final Float4 times(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float4(float2.getX() * this.getX(), float2.getY() * this.getY(), this.getZ(), this.getW());
    }
    
    public final Float4 times(final Float3 float3) {
        e0e.f((Object)float3, "v");
        return new Float4(float3.getX() * this.getX(), float3.getY() * this.getY(), float3.getZ() * this.getZ(), this.getW());
    }
    
    public final Float4 times(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(float4.getX() * this.getX(), float4.getY() * this.getY(), float4.getZ() * this.getZ(), float4.getW() * this.getW());
    }
    
    public final float[] toFloatArray() {
        return new float[] { this.x, this.y, this.z, this.w };
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("Float4(x=");
        f.append(this.x);
        f.append(", y=");
        f.append(this.y);
        f.append(", z=");
        f.append(this.z);
        f.append(", w=");
        return dn.C(f, this.w, ')');
    }
    
    public final Float4 transform(final stb<? super Float, Float> stb) {
        e0e.f((Object)stb, "block");
        this.setX(((Number)stb.invoke((Object)this.getX())).floatValue());
        this.setY(((Number)stb.invoke((Object)this.getY())).floatValue());
        this.setZ(((Number)stb.invoke((Object)this.getZ())).floatValue());
        this.setW(((Number)stb.invoke((Object)this.getW())).floatValue());
        return this;
    }
    
    public final Float4 unaryMinus() {
        return new Float4(-this.x, -this.y, -this.z, -this.w);
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[VectorComponent.values().length];
            $EnumSwitchMapping$[VectorComponent.X.ordinal()] = 1;
            $EnumSwitchMapping$[VectorComponent.R.ordinal()] = 2;
            $EnumSwitchMapping$[VectorComponent.S.ordinal()] = 3;
            $EnumSwitchMapping$[VectorComponent.Y.ordinal()] = 4;
            $EnumSwitchMapping$[VectorComponent.G.ordinal()] = 5;
            $EnumSwitchMapping$[VectorComponent.T.ordinal()] = 6;
            $EnumSwitchMapping$[VectorComponent.Z.ordinal()] = 7;
            $EnumSwitchMapping$[VectorComponent.B.ordinal()] = 8;
            $EnumSwitchMapping$[VectorComponent.P.ordinal()] = 9;
            $EnumSwitchMapping$[VectorComponent.W.ordinal()] = 10;
            $EnumSwitchMapping$[VectorComponent.A.ordinal()] = 11;
            $EnumSwitchMapping$[VectorComponent.Q.ordinal()] = 12;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
