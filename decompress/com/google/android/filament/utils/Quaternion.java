// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0001NB/\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KB\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010%\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010LB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020D¢\u0006\u0004\bJ\u0010HB\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010MJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J!\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH\u0086\u0002J!\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000bH\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH\u0086\nJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0086\nJ\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\nJ \u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0016H\u0086\b\u00f8\u0001\u0000J\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001cJ\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010 \u001a\u00020\u0004H\u00c6\u0003J\t\u0010!\u001a\u00020\u0004H\u00c6\u0003J1\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u00c6\u0001J\t\u0010(\u001a\u00020'H\u00d6\u0001J\t\u0010)\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R&\u0010=\u001a\u00020\t2\u0006\u00108\u001a\u00020\t8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R&\u0010@\u001a\u00020\t2\u0006\u00108\u001a\u00020\t8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R&\u0010C\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R&\u0010I\u001a\u00020D2\u0006\u00108\u001a\u00020D8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006O" }, d2 = { "Lcom/google/android/filament/utils/Quaternion;", "", "Lcom/google/android/filament/utils/QuaternionComponent;", "index", "", "get", "index1", "index2", "index3", "Lcom/google/android/filament/utils/Float3;", "index4", "", "invoke", "v", "Lvzv;", "set", "unaryMinus", "plus", "minus", "times", "div", "q", "Lkotlin/Function1;", "block", "transform", "toEulerAngles", "Lcom/google/android/filament/utils/Mat4;", "toMatrix", "", "toFloatArray", "component1", "component2", "component3", "component4", "x", "y", "z", "w", "copy", "", "toString", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getXyz", "()Lcom/google/android/filament/utils/Float3;", "setXyz", "(Lcom/google/android/filament/utils/Float3;)V", "xyz", "getImaginary", "setImaginary", "imaginary", "getReal", "setReal", "real", "Lcom/google/android/filament/utils/Float4;", "getXyzw", "()Lcom/google/android/filament/utils/Float4;", "setXyzw", "(Lcom/google/android/filament/utils/Float4;)V", "xyzw", "<init>", "(FFFF)V", "(Lcom/google/android/filament/utils/Float3;F)V", "(Lcom/google/android/filament/utils/Quaternion;)V", "Companion", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Quaternion
{
    public static final Companion Companion;
    private float w;
    private float x;
    private float y;
    private float z;
    
    static {
        Companion = new Companion(null);
    }
    
    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
    
    public Quaternion(final float x, final float y, final float z, final float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    public Quaternion(float n, float n2, float n3, float n4, final int n5, final wg8 wg8) {
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
    
    public Quaternion(final Float3 float3, final float n) {
        e0e.f((Object)float3, "v");
        this(float3.getX(), float3.getY(), float3.getZ(), n);
    }
    
    public Quaternion(final Float3 float3, float n, final int n2, final wg8 wg8) {
        if ((n2 & 0x2) != 0x0) {
            n = 0.0f;
        }
        this(float3, n);
    }
    
    public Quaternion(final Float4 float4) {
        e0e.f((Object)float4, "v");
        this(float4.getX(), float4.getY(), float4.getZ(), float4.getW());
    }
    
    public Quaternion(final Quaternion quaternion) {
        e0e.f((Object)quaternion, "q");
        this(quaternion.x, quaternion.y, quaternion.z, quaternion.w);
    }
    
    public static Quaternion copy$default(final Quaternion quaternion, float x, float y, float z, float w, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = quaternion.x;
        }
        if ((n & 0x2) != 0x0) {
            y = quaternion.y;
        }
        if ((n & 0x4) != 0x0) {
            z = quaternion.z;
        }
        if ((n & 0x8) != 0x0) {
            w = quaternion.w;
        }
        return quaternion.copy(x, y, z, w);
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
    
    public final Quaternion copy(final float n, final float n2, final float n3, final float n4) {
        return new Quaternion(n, n2, n3, n4);
    }
    
    public final Quaternion div(final float n) {
        return new Quaternion(this.getX() / n, this.getY() / n, this.getZ() / n, this.getW() / n);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Quaternion)) {
            return false;
        }
        final Quaternion quaternion = (Quaternion)o;
        return e0e.a((Object)this.x, (Object)quaternion.x) && e0e.a((Object)this.y, (Object)quaternion.y) && e0e.a((Object)this.z, (Object)quaternion.z) && e0e.a((Object)this.w, (Object)quaternion.w);
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
    
    public final float get(final QuaternionComponent quaternionComponent) {
        e0e.f((Object)quaternionComponent, "index");
        final int n = WhenMappings.$EnumSwitchMapping$0[quaternionComponent.ordinal()];
        float n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new NoWhenBranchMatchedException();
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
    
    public final Float3 get(final int n, final int n2, final int n3) {
        return new Float3(this.get(n), this.get(n2), this.get(n3));
    }
    
    public final Float3 get(final QuaternionComponent quaternionComponent, final QuaternionComponent quaternionComponent2, final QuaternionComponent quaternionComponent3) {
        e0e.f((Object)quaternionComponent, "index1");
        e0e.f((Object)quaternionComponent2, "index2");
        e0e.f((Object)quaternionComponent3, "index3");
        return new Float3(this.get(quaternionComponent), this.get(quaternionComponent2), this.get(quaternionComponent3));
    }
    
    public final Quaternion get(final int n, final int n2, final int n3, final int n4) {
        return new Quaternion(this.get(n), this.get(n2), this.get(n3), this.get(n4));
    }
    
    public final Quaternion get(final QuaternionComponent quaternionComponent, final QuaternionComponent quaternionComponent2, final QuaternionComponent quaternionComponent3, final QuaternionComponent quaternionComponent4) {
        e0e.f((Object)quaternionComponent, "index1");
        e0e.f((Object)quaternionComponent2, "index2");
        e0e.f((Object)quaternionComponent3, "index3");
        e0e.f((Object)quaternionComponent4, "index4");
        return new Quaternion(this.get(quaternionComponent), this.get(quaternionComponent2), this.get(quaternionComponent3), this.get(quaternionComponent4));
    }
    
    public final Float3 getImaginary() {
        return new Float3(this.getX(), this.getY(), this.getZ());
    }
    
    public final float getReal() {
        return this.getW();
    }
    
    public final float getW() {
        return this.w;
    }
    
    public final float getX() {
        return this.x;
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
    
    public final float invoke(final int n) {
        return this.get(n - 1);
    }
    
    public final Quaternion minus(final float n) {
        return new Quaternion(this.getX() - n, this.getY() - n, this.getZ() - n, this.getW() - n);
    }
    
    public final Quaternion minus(final Quaternion quaternion) {
        e0e.f((Object)quaternion, "q");
        return new Quaternion(this.getX() - quaternion.getX(), this.getY() - quaternion.getY(), this.getZ() - quaternion.getZ(), this.getW() - quaternion.getW());
    }
    
    public final Quaternion plus(final float n) {
        return new Quaternion(this.getX() + n, this.getY() + n, this.getZ() + n, this.getW() + n);
    }
    
    public final Quaternion plus(final Quaternion quaternion) {
        e0e.f((Object)quaternion, "q");
        return new Quaternion(quaternion.getX() + this.getX(), quaternion.getY() + this.getY(), quaternion.getZ() + this.getZ(), quaternion.getW() + this.getW());
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
    
    public final void set(final QuaternionComponent quaternionComponent, final float n) {
        e0e.f((Object)quaternionComponent, "index");
        final int n2 = WhenMappings.$EnumSwitchMapping$0[quaternionComponent.ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.w = n;
                }
                else {
                    this.z = n;
                }
            }
            else {
                this.y = n;
            }
        }
        else {
            this.x = n;
        }
    }
    
    public final void set(final QuaternionComponent quaternionComponent, final QuaternionComponent quaternionComponent2, final float n) {
        e0e.f((Object)quaternionComponent, "index1");
        e0e.f((Object)quaternionComponent2, "index2");
        this.set(quaternionComponent, n);
        this.set(quaternionComponent2, n);
    }
    
    public final void set(final QuaternionComponent quaternionComponent, final QuaternionComponent quaternionComponent2, final QuaternionComponent quaternionComponent3, final float n) {
        e0e.f((Object)quaternionComponent, "index1");
        e0e.f((Object)quaternionComponent2, "index2");
        e0e.f((Object)quaternionComponent3, "index3");
        this.set(quaternionComponent, n);
        this.set(quaternionComponent2, n);
        this.set(quaternionComponent3, n);
    }
    
    public final void set(final QuaternionComponent quaternionComponent, final QuaternionComponent quaternionComponent2, final QuaternionComponent quaternionComponent3, final QuaternionComponent quaternionComponent4, final float n) {
        e0e.f((Object)quaternionComponent, "index1");
        e0e.f((Object)quaternionComponent2, "index2");
        e0e.f((Object)quaternionComponent3, "index3");
        e0e.f((Object)quaternionComponent4, "index4");
        this.set(quaternionComponent, n);
        this.set(quaternionComponent2, n);
        this.set(quaternionComponent3, n);
        this.set(quaternionComponent4, n);
    }
    
    public final void setImaginary(final Float3 float3) {
        e0e.f((Object)float3, "value");
        this.setX(float3.getX());
        this.setY(float3.getY());
        this.setZ(float3.getZ());
    }
    
    public final void setReal(final float w) {
        this.setW(w);
    }
    
    public final void setW(final float w) {
        this.w = w;
    }
    
    public final void setX(final float x) {
        this.x = x;
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
    
    public final Float3 times(final Float3 float3) {
        e0e.f((Object)float3, "v");
        final Quaternion quaternion = new Quaternion(float3, 0.0f);
        final Quaternion quaternion2 = new Quaternion(quaternion.getZ() * this.getY() + (quaternion.getW() * this.getX() + quaternion.getX() * this.getW()) - quaternion.getY() * this.getZ(), quaternion.getX() * this.getZ() + (quaternion.getW() * this.getY() + (quaternion.getY() * this.getW() - quaternion.getZ() * this.getX())), quaternion.getW() * this.getZ() + (quaternion.getY() * this.getX() + quaternion.getZ() * this.getW() - quaternion.getX() * this.getY()), quaternion.getW() * this.getW() - quaternion.getX() * this.getX() - quaternion.getY() * this.getY() - quaternion.getZ() * this.getZ());
        final Quaternion inverse = QuaternionKt.inverse(this);
        final Quaternion quaternion3 = new Quaternion(inverse.getZ() * quaternion2.getY() + (inverse.getW() * quaternion2.getX() + inverse.getX() * quaternion2.getW()) - inverse.getY() * quaternion2.getZ(), inverse.getX() * quaternion2.getZ() + (inverse.getW() * quaternion2.getY() + (inverse.getY() * quaternion2.getW() - inverse.getZ() * quaternion2.getX())), inverse.getW() * quaternion2.getZ() + (inverse.getY() * quaternion2.getX() + inverse.getZ() * quaternion2.getW() - inverse.getX() * quaternion2.getY()), inverse.getW() * quaternion2.getW() - inverse.getX() * quaternion2.getX() - inverse.getY() * quaternion2.getY() - inverse.getZ() * quaternion2.getZ());
        return new Float3(quaternion3.getX(), quaternion3.getY(), quaternion3.getZ());
    }
    
    public final Quaternion times(final float n) {
        return new Quaternion(this.getX() * n, this.getY() * n, this.getZ() * n, this.getW() * n);
    }
    
    public final Quaternion times(final Quaternion quaternion) {
        e0e.f((Object)quaternion, "q");
        return new Quaternion(quaternion.getZ() * this.getY() + (quaternion.getW() * this.getX() + quaternion.getX() * this.getW()) - quaternion.getY() * this.getZ(), quaternion.getX() * this.getZ() + (quaternion.getW() * this.getY() + (quaternion.getY() * this.getW() - quaternion.getZ() * this.getX())), quaternion.getW() * this.getZ() + (quaternion.getY() * this.getX() + quaternion.getZ() * this.getW() - quaternion.getX() * this.getY()), quaternion.getW() * this.getW() - quaternion.getX() * this.getX() - quaternion.getY() * this.getY() - quaternion.getZ() * this.getZ());
    }
    
    public final Float3 toEulerAngles() {
        return QuaternionKt.eulerAngles(this);
    }
    
    public final float[] toFloatArray() {
        return new float[] { this.x, this.y, this.z, this.w };
    }
    
    public final Mat4 toMatrix() {
        return MatrixKt.rotation(this);
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("Quaternion(x=");
        f.append(this.x);
        f.append(", y=");
        f.append(this.y);
        f.append(", z=");
        f.append(this.z);
        f.append(", w=");
        return dn.C(f, this.w, ')');
    }
    
    public final Quaternion transform(final stb<? super Float, Float> stb) {
        e0e.f((Object)stb, "block");
        this.setX(((Number)stb.invoke((Object)this.getX())).floatValue());
        this.setY(((Number)stb.invoke((Object)this.getY())).floatValue());
        this.setZ(((Number)stb.invoke((Object)this.getZ())).floatValue());
        this.setW(((Number)stb.invoke((Object)this.getW())).floatValue());
        return this;
    }
    
    public final Quaternion unaryMinus() {
        return new Quaternion(-this.x, -this.y, -this.z, -this.w);
    }
    
    @Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006J$\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b¨\u0006\u000f" }, d2 = { "Lcom/google/android/filament/utils/Quaternion$Companion;", "", "()V", "fromAxisAngle", "Lcom/google/android/filament/utils/Quaternion;", "axis", "Lcom/google/android/filament/utils/Float3;", "angle", "", "fromEuler", "d", "fromEulerZYX", "yaw", "pitch", "roll", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final wg8 wg8) {
            this();
        }
        
        public static Quaternion fromEulerZYX$default(final Companion companion, float n, float n2, float n3, final int n4, final Object o) {
            if ((n4 & 0x1) != 0x0) {
                n = 0.0f;
            }
            if ((n4 & 0x2) != 0x0) {
                n2 = 0.0f;
            }
            if ((n4 & 0x4) != 0x0) {
                n3 = 0.0f;
            }
            return companion.fromEulerZYX(n, n2, n3);
        }
        
        public final Quaternion fromAxisAngle(Float3 normalize, float n) {
            e0e.f((Object)normalize, "axis");
            final double n2 = n * 0.017453292f * 0.5f;
            n = (float)Math.sin(n2);
            normalize = VectorKt.normalize(normalize);
            return new Quaternion(new Float3(normalize.getX() * n, normalize.getY() * n, normalize.getZ() * n), (float)Math.cos(n2));
        }
        
        public final Quaternion fromEuler(Float3 copy$default) {
            e0e.f((Object)copy$default, "d");
            copy$default = Float3.copy$default(copy$default, 0.0f, 0.0f, 0.0f, 7, null);
            copy$default.setX(copy$default.getX() * 0.017453292f);
            copy$default.setY(copy$default.getY() * 0.017453292f);
            copy$default.setZ(copy$default.getZ() * 0.017453292f);
            return this.fromEulerZYX(copy$default.getZ(), copy$default.getY(), copy$default.getX());
        }
        
        public final Quaternion fromEulerZYX(float n, float n2, float n3) {
            final double n4 = n * 0.5f;
            final float n5 = (float)Math.cos(n4);
            n = (float)Math.sin(n4);
            final double n6 = n2 * 0.5f;
            final float n7 = (float)Math.cos(n6);
            n2 = (float)Math.sin(n6);
            final double n8 = n3 * 0.5f;
            final float n9 = (float)Math.cos(n8);
            final float n10 = (float)Math.sin(n8);
            final float n11 = n10 * n7;
            n3 = n9 * n2;
            final float n12 = n9 * n7;
            n2 *= n10;
            return new Quaternion(n11 * n5 - n3 * n, n11 * n + n3 * n5, n12 * n - n2 * n5, n2 * n + n12 * n5);
        }
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[QuaternionComponent.values().length];
            $EnumSwitchMapping$[QuaternionComponent.X.ordinal()] = 1;
            $EnumSwitchMapping$[QuaternionComponent.Y.ordinal()] = 2;
            $EnumSwitchMapping$[QuaternionComponent.Z.ordinal()] = 3;
            $EnumSwitchMapping$[QuaternionComponent.W.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
