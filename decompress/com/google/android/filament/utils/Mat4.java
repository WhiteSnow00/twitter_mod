// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 Q2\u00020\u0001:\u0001QB/\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bM\u0010NB+\b\u0016\u0012\u0006\u00109\u001a\u000203\u0012\u0006\u0010<\u001a\u000203\u0012\u0006\u0010?\u001a\u000203\u0012\b\b\u0002\u0010B\u001a\u000203¢\u0006\u0004\bM\u0010OB\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\bM\u0010PJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J!\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\t\u0010\r\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J1\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u00c6\u0001J\t\u0010$\u001a\u00020\u0002H\u00d6\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010(\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R&\u00109\u001a\u0002032\u0006\u00104\u001a\u0002038\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R&\u0010<\u001a\u0002032\u0006\u00104\u001a\u0002038\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R&\u0010?\u001a\u0002032\u0006\u00104\u001a\u0002038\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00106\"\u0004\b>\u00108R&\u0010B\u001a\u0002032\u0006\u00104\u001a\u0002038\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u0012\u0010D\u001a\u0002038\u00c6\u0002¢\u0006\u0006\u001a\u0004\bC\u00106R\u0012\u0010F\u001a\u0002038\u00c6\u0002¢\u0006\u0006\u001a\u0004\bE\u00106R\u0011\u0010H\u001a\u0002038F¢\u0006\u0006\u001a\u0004\bG\u00106R\u0012\u0010L\u001a\u00020I8\u00c6\u0002¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006R" }, d2 = { "Lcom/google/android/filament/utils/Mat4;", "", "", "column", "Lcom/google/android/filament/utils/Float4;", "get", "row", "", "Lcom/google/android/filament/utils/MatrixColumn;", "invoke", "v", "Lvzv;", "set", "unaryMinus", "inc", "dec", "plus", "minus", "times", "div", "m", "Lcom/google/android/filament/utils/Quaternion;", "toQuaternion", "", "toFloatArray", "", "toString", "component1", "component2", "component3", "component4", "x", "y", "z", "w", "copy", "hashCode", "other", "", "equals", "Lcom/google/android/filament/utils/Float4;", "getX", "()Lcom/google/android/filament/utils/Float4;", "setX", "(Lcom/google/android/filament/utils/Float4;)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "Lcom/google/android/filament/utils/Float3;", "value", "getRight", "()Lcom/google/android/filament/utils/Float3;", "setRight", "(Lcom/google/android/filament/utils/Float3;)V", "right", "getUp", "setUp", "up", "getForward", "setForward", "forward", "getPosition", "setPosition", "position", "getScale", "scale", "getTranslation", "translation", "getRotation", "rotation", "Lcom/google/android/filament/utils/Mat3;", "getUpperLeft", "()Lcom/google/android/filament/utils/Mat3;", "upperLeft", "<init>", "(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;)V", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "(Lcom/google/android/filament/utils/Mat4;)V", "Companion", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Mat4
{
    public static final Companion Companion;
    private Float4 w;
    private Float4 x;
    private Float4 y;
    private Float4 z;
    
    static {
        Companion = new Companion(null);
    }
    
    public Mat4() {
        this(null, null, null, (Float4)null, 15, null);
    }
    
    public Mat4(final Float3 float3, final Float3 float4, final Float3 float5, final Float3 float6) {
        e0e.f((Object)float3, "right");
        e0e.f((Object)float4, "up");
        e0e.f((Object)float5, "forward");
        e0e.f((Object)float6, "position");
        this(new Float4(float3, 0.0f, 2, null), new Float4(float4, 0.0f, 2, null), new Float4(float5, 0.0f, 2, null), new Float4(float6, 1.0f));
    }
    
    public Mat4(final Float3 float3, final Float3 float4, final Float3 float5, Float3 float6, final int n, final wg8 wg8) {
        if ((n & 0x8) != 0x0) {
            float6 = new Float3(0.0f, 0.0f, 0.0f, 7, null);
        }
        this(float3, float4, float5, float6);
    }
    
    public Mat4(final Float4 x, final Float4 y, final Float4 z, final Float4 w) {
        e0e.f((Object)x, "x");
        e0e.f((Object)y, "y");
        e0e.f((Object)z, "z");
        e0e.f((Object)w, "w");
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    public Mat4(Float4 float4, Float4 float5, Float4 float6, Float4 float7, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            float4 = new Float4(1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if ((n & 0x2) != 0x0) {
            float5 = new Float4(0.0f, 1.0f, 0.0f, 0.0f, 13, null);
        }
        if ((n & 0x4) != 0x0) {
            float6 = new Float4(0.0f, 0.0f, 1.0f, 0.0f, 11, null);
        }
        if ((n & 0x8) != 0x0) {
            float7 = new Float4(0.0f, 0.0f, 0.0f, 1.0f, 7, null);
        }
        this(float4, float5, float6, float7);
    }
    
    public Mat4(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        this(Float4.copy$default(mat4.x, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(mat4.y, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(mat4.z, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), Float4.copy$default(mat4.w, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
    }
    
    public static Mat4 copy$default(final Mat4 mat4, Float4 x, Float4 y, Float4 z, Float4 w, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = mat4.x;
        }
        if ((n & 0x2) != 0x0) {
            y = mat4.y;
        }
        if ((n & 0x4) != 0x0) {
            z = mat4.z;
        }
        if ((n & 0x8) != 0x0) {
            w = mat4.w;
        }
        return mat4.copy(x, y, z, w);
    }
    
    public final Float4 component1() {
        return this.x;
    }
    
    public final Float4 component2() {
        return this.y;
    }
    
    public final Float4 component3() {
        return this.z;
    }
    
    public final Float4 component4() {
        return this.w;
    }
    
    public final Mat4 copy(final Float4 float4, final Float4 float5, final Float4 float6, final Float4 float7) {
        e0e.f((Object)float4, "x");
        e0e.f((Object)float5, "y");
        e0e.f((Object)float6, "z");
        e0e.f((Object)float7, "w");
        return new Mat4(float4, float5, float6, float7);
    }
    
    public final Mat4 dec() {
        final Float4 x = this.x;
        this.x = x.dec();
        final Float4 y = this.y;
        this.y = y.dec();
        final Float4 z = this.z;
        this.z = z.dec();
        final Float4 w = this.w;
        this.w = w.dec();
        return new Mat4(x, y, z, w);
    }
    
    public final Mat4 div(final float n) {
        final Float4 x = this.x;
        final Float4 float4 = new Float4(x.getX() / n, x.getY() / n, x.getZ() / n, x.getW() / n);
        final Float4 y = this.y;
        final Float4 float5 = new Float4(y.getX() / n, y.getY() / n, y.getZ() / n, y.getW() / n);
        final Float4 z = this.z;
        final Float4 float6 = new Float4(z.getX() / n, z.getY() / n, z.getZ() / n, z.getW() / n);
        final Float4 w = this.w;
        return new Mat4(float4, float5, float6, new Float4(w.getX() / n, w.getY() / n, w.getZ() / n, w.getW() / n));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Mat4)) {
            return false;
        }
        final Mat4 mat4 = (Mat4)o;
        return e0e.a((Object)this.x, (Object)mat4.x) && e0e.a((Object)this.y, (Object)mat4.y) && e0e.a((Object)this.z, (Object)mat4.z) && e0e.a((Object)this.w, (Object)mat4.w);
    }
    
    public final float get(final int n, final int n2) {
        return this.get(n).get(n2);
    }
    
    public final float get(final MatrixColumn matrixColumn, final int n) {
        e0e.f((Object)matrixColumn, "column");
        return this.get(matrixColumn).get(n);
    }
    
    public final Float4 get(final int n) {
        Float4 float4;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("column must be in 0..3");
                    }
                    float4 = this.w;
                }
                else {
                    float4 = this.z;
                }
            }
            else {
                float4 = this.y;
            }
        }
        else {
            float4 = this.x;
        }
        return float4;
    }
    
    public final Float4 get(final MatrixColumn matrixColumn) {
        e0e.f((Object)matrixColumn, "column");
        final int n = WhenMappings.$EnumSwitchMapping$0[matrixColumn.ordinal()];
        Float4 float4;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float4 = this.w;
                }
                else {
                    float4 = this.z;
                }
            }
            else {
                float4 = this.y;
            }
        }
        else {
            float4 = this.x;
        }
        return float4;
    }
    
    public final Float3 getForward() {
        final Float4 z = this.getZ();
        return new Float3(z.getX(), z.getY(), z.getZ());
    }
    
    public final Float3 getPosition() {
        final Float4 w = this.getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }
    
    public final Float3 getRight() {
        final Float4 x = this.getX();
        return new Float3(x.getX(), x.getY(), x.getZ());
    }
    
    public final Float3 getRotation() {
        final Float4 x = this.getX();
        final Float3 normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        final Float4 y = this.getY();
        final Float3 normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        final Float4 z = this.getZ();
        final Float3 normalize3 = VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ()));
        Float3 float3;
        if (normalize3.getY() <= -1.0f) {
            float3 = new Float3(-90.0f, 0.0f, (float)Math.atan2(normalize.getZ(), normalize2.getZ()) * 57.295776f);
        }
        else if (normalize3.getY() >= 1.0f) {
            float3 = new Float3(90.0f, 0.0f, (float)Math.atan2(-normalize.getZ(), -normalize2.getZ()) * 57.295776f);
        }
        else {
            float3 = new Float3(-(float)Math.asin(normalize3.getY()) * 57.295776f, -(float)Math.atan2(normalize3.getX(), normalize3.getZ()) * 57.295776f, (float)Math.atan2(normalize.getY(), normalize2.getY()) * 57.295776f);
        }
        return float3;
    }
    
    public final Float3 getScale() {
        final Float4 x = this.getX();
        final Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        final float n = (float)Math.sqrt(bng.e(float3, float3.getZ(), ang.b(float3, float3.getY(), float3.getX() * float3.getX())));
        final Float4 y = this.getY();
        final Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        final float n2 = (float)Math.sqrt(bng.e(float4, float4.getZ(), ang.b(float4, float4.getY(), float4.getX() * float4.getX())));
        final Float4 z = this.getZ();
        final Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        return new Float3(n, n2, (float)Math.sqrt(bng.e(float5, float5.getZ(), ang.b(float5, float5.getY(), float5.getX() * float5.getX()))));
    }
    
    public final Float3 getTranslation() {
        final Float4 w = this.getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }
    
    public final Float3 getUp() {
        final Float4 y = this.getY();
        return new Float3(y.getX(), y.getY(), y.getZ());
    }
    
    public final Mat3 getUpperLeft() {
        final Float4 x = this.getX();
        final Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        final Float4 y = this.getY();
        final Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        final Float4 z = this.getZ();
        return new Mat3(float3, float4, new Float3(z.getX(), z.getY(), z.getZ()));
    }
    
    public final Float4 getW() {
        return this.w;
    }
    
    public final Float4 getX() {
        return this.x;
    }
    
    public final Float4 getY() {
        return this.y;
    }
    
    public final Float4 getZ() {
        return this.z;
    }
    
    @Override
    public int hashCode() {
        return this.w.hashCode() + (this.z.hashCode() + (this.y.hashCode() + this.x.hashCode() * 31) * 31) * 31;
    }
    
    public final Mat4 inc() {
        final Float4 x = this.x;
        this.x = x.inc();
        final Float4 y = this.y;
        this.y = y.inc();
        final Float4 z = this.z;
        this.z = z.inc();
        final Float4 w = this.w;
        this.w = w.inc();
        return new Mat4(x, y, z, w);
    }
    
    public final float invoke(final int n, final int n2) {
        return this.get(n2 - 1).get(n - 1);
    }
    
    public final void invoke(final int n, final int n2, final float n3) {
        this.set(n2 - 1, n - 1, n3);
    }
    
    public final Mat4 minus(final float n) {
        final Float4 x = this.x;
        final Float4 float4 = new Float4(x.getX() - n, x.getY() - n, x.getZ() - n, x.getW() - n);
        final Float4 y = this.y;
        final Float4 float5 = new Float4(y.getX() - n, y.getY() - n, y.getZ() - n, y.getW() - n);
        final Float4 z = this.z;
        final Float4 float6 = new Float4(z.getX() - n, z.getY() - n, z.getZ() - n, z.getW() - n);
        final Float4 w = this.w;
        return new Mat4(float4, float5, float6, new Float4(w.getX() - n, w.getY() - n, w.getZ() - n, w.getW() - n));
    }
    
    public final Mat4 plus(final float n) {
        final Float4 x = this.x;
        final Float4 float4 = new Float4(x.getX() + n, x.getY() + n, x.getZ() + n, x.getW() + n);
        final Float4 y = this.y;
        final Float4 float5 = new Float4(y.getX() + n, y.getY() + n, y.getZ() + n, y.getW() + n);
        final Float4 z = this.z;
        final Float4 float6 = new Float4(z.getX() + n, z.getY() + n, z.getZ() + n, z.getW() + n);
        final Float4 w = this.w;
        return new Mat4(float4, float5, float6, new Float4(w.getX() + n, w.getY() + n, w.getZ() + n, w.getW() + n));
    }
    
    public final void set(final int n, final int n2, final float n3) {
        this.get(n).set(n2, n3);
    }
    
    public final void set(final int n, final Float4 float4) {
        e0e.f((Object)float4, "v");
        final Float4 value = this.get(n);
        value.setX(float4.getX());
        value.setY(float4.getY());
        value.setZ(float4.getZ());
        value.setW(float4.getW());
    }
    
    public final void setForward(final Float3 float3) {
        e0e.f((Object)float3, "value");
        final Float4 z = this.getZ();
        z.setX(float3.getX());
        z.setY(float3.getY());
        z.setZ(float3.getZ());
    }
    
    public final void setPosition(final Float3 float3) {
        e0e.f((Object)float3, "value");
        final Float4 w = this.getW();
        w.setX(float3.getX());
        w.setY(float3.getY());
        w.setZ(float3.getZ());
    }
    
    public final void setRight(final Float3 float3) {
        e0e.f((Object)float3, "value");
        final Float4 x = this.getX();
        x.setX(float3.getX());
        x.setY(float3.getY());
        x.setZ(float3.getZ());
    }
    
    public final void setUp(final Float3 float3) {
        e0e.f((Object)float3, "value");
        final Float4 y = this.getY();
        y.setX(float3.getX());
        y.setY(float3.getY());
        y.setZ(float3.getZ());
    }
    
    public final void setW(final Float4 w) {
        e0e.f((Object)w, "<set-?>");
        this.w = w;
    }
    
    public final void setX(final Float4 x) {
        e0e.f((Object)x, "<set-?>");
        this.x = x;
    }
    
    public final void setY(final Float4 y) {
        e0e.f((Object)y, "<set-?>");
        this.y = y;
    }
    
    public final void setZ(final Float4 z) {
        e0e.f((Object)z, "<set-?>");
        this.z = z;
    }
    
    public final Float4 times(final Float4 float4) {
        e0e.f((Object)float4, "v");
        return new Float4(o6f.e(float4, this.w.getX(), ffe.k(float4, this.z.getX(), a88.j(float4, this.y.getX(), float4.getX() * this.x.getX()))), o6f.e(float4, this.w.getY(), ffe.k(float4, this.z.getY(), a88.j(float4, this.y.getY(), float4.getX() * this.x.getY()))), o6f.e(float4, this.w.getZ(), ffe.k(float4, this.z.getZ(), a88.j(float4, this.y.getZ(), float4.getX() * this.x.getZ()))), o6f.e(float4, this.w.getW(), ffe.k(float4, this.z.getW(), a88.j(float4, this.y.getW(), float4.getX() * this.x.getW()))));
    }
    
    public final Mat4 times(final float n) {
        final Float4 x = this.x;
        final Float4 float4 = new Float4(x.getX() * n, x.getY() * n, x.getZ() * n, x.getW() * n);
        final Float4 y = this.y;
        final Float4 float5 = new Float4(y.getX() * n, y.getY() * n, y.getZ() * n, y.getW() * n);
        final Float4 z = this.z;
        final Float4 float6 = new Float4(z.getX() * n, z.getY() * n, z.getZ() * n, z.getW() * n);
        final Float4 w = this.w;
        return new Mat4(float4, float5, float6, new Float4(w.getX() * n, w.getY() * n, w.getZ() * n, w.getW() * n));
    }
    
    public final Mat4 times(final Mat4 mat4) {
        e0e.f((Object)mat4, "m");
        return new Mat4(new Float4(o6f.e(mat4.x, this.w.getX(), ffe.k(mat4.x, this.z.getX(), a88.j(mat4.x, this.y.getX(), mat4.x.getX() * this.x.getX()))), o6f.e(mat4.x, this.w.getY(), ffe.k(mat4.x, this.z.getY(), a88.j(mat4.x, this.y.getY(), mat4.x.getX() * this.x.getY()))), o6f.e(mat4.x, this.w.getZ(), ffe.k(mat4.x, this.z.getZ(), a88.j(mat4.x, this.y.getZ(), mat4.x.getX() * this.x.getZ()))), o6f.e(mat4.x, this.w.getW(), ffe.k(mat4.x, this.z.getW(), a88.j(mat4.x, this.y.getW(), mat4.x.getX() * this.x.getW())))), new Float4(o6f.e(mat4.y, this.w.getX(), ffe.k(mat4.y, this.z.getX(), a88.j(mat4.y, this.y.getX(), mat4.y.getX() * this.x.getX()))), o6f.e(mat4.y, this.w.getY(), ffe.k(mat4.y, this.z.getY(), a88.j(mat4.y, this.y.getY(), mat4.y.getX() * this.x.getY()))), o6f.e(mat4.y, this.w.getZ(), ffe.k(mat4.y, this.z.getZ(), a88.j(mat4.y, this.y.getZ(), mat4.y.getX() * this.x.getZ()))), o6f.e(mat4.y, this.w.getW(), ffe.k(mat4.y, this.z.getW(), a88.j(mat4.y, this.y.getW(), mat4.y.getX() * this.x.getW())))), new Float4(o6f.e(mat4.z, this.w.getX(), ffe.k(mat4.z, this.z.getX(), a88.j(mat4.z, this.y.getX(), mat4.z.getX() * this.x.getX()))), o6f.e(mat4.z, this.w.getY(), ffe.k(mat4.z, this.z.getY(), a88.j(mat4.z, this.y.getY(), mat4.z.getX() * this.x.getY()))), o6f.e(mat4.z, this.w.getZ(), ffe.k(mat4.z, this.z.getZ(), a88.j(mat4.z, this.y.getZ(), mat4.z.getX() * this.x.getZ()))), o6f.e(mat4.z, this.w.getW(), ffe.k(mat4.z, this.z.getW(), a88.j(mat4.z, this.y.getW(), mat4.z.getX() * this.x.getW())))), new Float4(o6f.e(mat4.w, this.w.getX(), ffe.k(mat4.w, this.z.getX(), a88.j(mat4.w, this.y.getX(), mat4.w.getX() * this.x.getX()))), o6f.e(mat4.w, this.w.getY(), ffe.k(mat4.w, this.z.getY(), a88.j(mat4.w, this.y.getY(), mat4.w.getX() * this.x.getY()))), o6f.e(mat4.w, this.w.getZ(), ffe.k(mat4.w, this.z.getZ(), a88.j(mat4.w, this.y.getZ(), mat4.w.getX() * this.x.getZ()))), o6f.e(mat4.w, this.w.getW(), ffe.k(mat4.w, this.z.getW(), a88.j(mat4.w, this.y.getW(), mat4.w.getX() * this.x.getW())))));
    }
    
    public final float[] toFloatArray() {
        return new float[] { this.x.getX(), this.y.getX(), this.z.getX(), this.w.getX(), this.x.getY(), this.y.getY(), this.z.getY(), this.w.getY(), this.x.getZ(), this.y.getZ(), this.z.getZ(), this.w.getZ(), this.x.getW(), this.y.getW(), this.z.getW(), this.w.getW() };
    }
    
    public final Quaternion toQuaternion() {
        return MatrixKt.quaternion(this);
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("\n            |");
        f.append(this.x.getX());
        f.append(' ');
        f.append(this.y.getX());
        f.append(' ');
        f.append(this.z.getX());
        f.append(' ');
        f.append(this.w.getX());
        f.append("|\n            |");
        f.append(this.x.getY());
        f.append(' ');
        f.append(this.y.getY());
        f.append(' ');
        f.append(this.z.getY());
        f.append(' ');
        f.append(this.w.getY());
        f.append("|\n            |");
        f.append(this.x.getZ());
        f.append(' ');
        f.append(this.y.getZ());
        f.append(' ');
        f.append(this.z.getZ());
        f.append(' ');
        f.append(this.w.getZ());
        f.append("|\n            |");
        f.append(this.x.getW());
        f.append(' ');
        f.append(this.y.getW());
        f.append(' ');
        f.append(this.z.getW());
        f.append(' ');
        f.append(this.w.getW());
        f.append("|\n            ");
        return olr.X0(f.toString());
    }
    
    public final Mat4 unaryMinus() {
        return new Mat4(this.x.unaryMinus(), this.y.unaryMinus(), this.z.unaryMinus(), this.w.unaryMinus());
    }
    
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t" }, d2 = { "Lcom/google/android/filament/utils/Mat4$Companion;", "", "()V", "identity", "Lcom/google/android/filament/utils/Mat4;", "of", "a", "", "", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final wg8 wg8) {
            this();
        }
        
        public final Mat4 identity() {
            return new Mat4(null, null, null, (Float4)null, 15, null);
        }
        
        public final Mat4 of(final float... array) {
            e0e.f((Object)array, "a");
            if (array.length >= 16) {
                return new Mat4(new Float4(array[0], array[4], array[8], array[12]), new Float4(array[1], array[5], array[9], array[13]), new Float4(array[2], array[6], array[10], array[14]), new Float4(array[3], array[7], array[11], array[15]));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
    
    @Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
    public final class WhenMappings
    {
        public static final int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[MatrixColumn.values().length];
            $EnumSwitchMapping$[MatrixColumn.X.ordinal()] = 1;
            $EnumSwitchMapping$[MatrixColumn.Y.ordinal()] = 2;
            $EnumSwitchMapping$[MatrixColumn.Z.ordinal()] = 3;
            $EnumSwitchMapping$[MatrixColumn.W.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
