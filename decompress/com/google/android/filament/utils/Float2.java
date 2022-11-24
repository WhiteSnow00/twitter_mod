// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\bC\u0010DB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\bC\u0010(B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\bC\u0010;J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0086\nJ\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004H\u0086\nJ\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\nJ \u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014H\u0086\b\u00f8\u0001\u0000J\u0006\u0010\u0018\u001a\u00020\u0017J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001J\t\u0010 \u001a\u00020\bH\u00d6\u0001J\u0013\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R&\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R&\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R&\u00104\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R&\u00107\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R&\u0010<\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R&\u0010?\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R&\u0010B\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00109\"\u0004\bA\u0010;\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006E" }, d2 = { "Lcom/google/android/filament/utils/Float2;", "", "Lcom/google/android/filament/utils/VectorComponent;", "index", "", "get", "index1", "index2", "", "invoke", "v", "Lvzv;", "set", "unaryMinus", "inc", "dec", "plus", "minus", "times", "div", "Lkotlin/Function1;", "block", "transform", "", "toFloatArray", "component1", "component2", "x", "y", "copy", "", "toString", "hashCode", "other", "", "equals", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "value", "getR", "setR", "r", "getG", "setG", "g", "getS", "setS", "s", "getT", "setT", "t", "getXy", "()Lcom/google/android/filament/utils/Float2;", "setXy", "(Lcom/google/android/filament/utils/Float2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "<init>", "(FF)V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Float2
{
    private float x;
    private float y;
    
    public Float2() {
        this(0.0f, 0.0f, 3, null);
    }
    
    public Float2(final float n) {
        this(n, n);
    }
    
    public Float2(final float x, final float y) {
        this.x = x;
        this.y = y;
    }
    
    public Float2(float n, float n2, final int n3, final wg8 wg8) {
        if ((n3 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        this(n, n2);
    }
    
    public Float2(final Float2 float2) {
        e0e.f((Object)float2, "v");
        this(float2.x, float2.y);
    }
    
    public static Float2 copy$default(final Float2 float2, float x, float y, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = float2.x;
        }
        if ((n & 0x2) != 0x0) {
            y = float2.y;
        }
        return float2.copy(x, y);
    }
    
    public final float component1() {
        return this.x;
    }
    
    public final float component2() {
        return this.y;
    }
    
    public final Float2 copy(final float n, final float n2) {
        return new Float2(n, n2);
    }
    
    public final Float2 dec() {
        final float x = this.x;
        this.x = x - 1.0f;
        final float y = this.y;
        this.y = -1.0f + y;
        return new Float2(x, y);
    }
    
    public final Float2 div(final float n) {
        return new Float2(this.getX() / n, this.getY() / n);
    }
    
    public final Float2 div(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(this.getX() / float2.getX(), this.getY() / float2.getY());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Float2)) {
            return false;
        }
        final Float2 float2 = (Float2)o;
        return e0e.a((Object)this.x, (Object)float2.x) && e0e.a((Object)this.y, (Object)float2.y);
    }
    
    public final float get(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            n2 = this.y;
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
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
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
    
    public final float getG() {
        return this.getY();
    }
    
    public final float getR() {
        return this.getX();
    }
    
    public final Float2 getRg() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final float getS() {
        return this.getX();
    }
    
    public final Float2 getSt() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final float getT() {
        return this.getY();
    }
    
    public final float getX() {
        return this.x;
    }
    
    public final Float2 getXy() {
        return new Float2(this.getX(), this.getY());
    }
    
    public final float getY() {
        return this.y;
    }
    
    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.y) + Float.floatToIntBits(this.x) * 31;
    }
    
    public final Float2 inc() {
        final float x = this.x;
        this.x = x + 1.0f;
        final float y = this.y;
        this.y = 1.0f + y;
        return new Float2(x, y);
    }
    
    public final float invoke(final int n) {
        return this.get(n - 1);
    }
    
    public final Float2 minus(final float n) {
        return new Float2(this.getX() - n, this.getY() - n);
    }
    
    public final Float2 minus(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(this.getX() - float2.getX(), this.getY() - float2.getY());
    }
    
    public final Float2 plus(final float n) {
        return new Float2(this.getX() + n, this.getY() + n);
    }
    
    public final Float2 plus(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(float2.getX() + this.getX(), float2.getY() + this.getY());
    }
    
    public final void set(final int n, final float n2) {
        if (n != 0) {
            if (n != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = n2;
        }
        else {
            this.x = n2;
        }
    }
    
    public final void set(final int n, final int n2, final float n3) {
        this.set(n, n3);
        this.set(n2, n3);
    }
    
    public final void set(final VectorComponent vectorComponent, final float n) {
        e0e.f((Object)vectorComponent, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[vectorComponent.ordinal()]) {
            default: {
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
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
    
    public final void setG(final float y) {
        this.setY(y);
    }
    
    public final void setR(final float x) {
        this.setX(x);
    }
    
    public final void setRg(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setS(final float x) {
        this.setX(x);
    }
    
    public final void setSt(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setT(final float y) {
        this.setY(y);
    }
    
    public final void setX(final float x) {
        this.x = x;
    }
    
    public final void setXy(final Float2 float2) {
        e0e.f((Object)float2, "value");
        this.setX(float2.getX());
        this.setY(float2.getY());
    }
    
    public final void setY(final float y) {
        this.y = y;
    }
    
    public final Float2 times(final float n) {
        return new Float2(this.getX() * n, this.getY() * n);
    }
    
    public final Float2 times(final Float2 float2) {
        e0e.f((Object)float2, "v");
        return new Float2(float2.getX() * this.getX(), float2.getY() * this.getY());
    }
    
    public final float[] toFloatArray() {
        return new float[] { this.x, this.y };
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("Float2(x=");
        f.append(this.x);
        f.append(", y=");
        return dn.C(f, this.y, ')');
    }
    
    public final Float2 transform(final stb<? super Float, Float> stb) {
        e0e.f((Object)stb, "block");
        this.setX(((Number)stb.invoke((Object)this.getX())).floatValue());
        this.setY(((Number)stb.invoke((Object)this.getY())).floatValue());
        return this;
    }
    
    public final Float2 unaryMinus() {
        return new Float2(-this.x, -this.y);
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
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
