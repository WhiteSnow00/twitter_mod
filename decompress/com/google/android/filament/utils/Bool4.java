// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\bd\u0010eB%\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\bd\u0010fB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\bd\u0010gB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\bd\u0010\\J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J!\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0086\u0002J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0086\u0002J!\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0086\u0002J)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH\u0086\nJ\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\u0019\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R&\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R&\u00100\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R&\u00103\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R&\u00106\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R&\u00109\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R&\u0010<\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R&\u0010?\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R&\u0010B\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#R&\u0010G\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR&\u0010J\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR&\u0010M\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR&\u0010R\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR&\u0010U\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR&\u0010X\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR&\u0010]\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R&\u0010`\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R&\u0010c\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u00008\u00c6\u0002@\u00c6\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010Z\"\u0004\bb\u0010\\¨\u0006h" }, d2 = { "Lcom/google/android/filament/utils/Bool4;", "", "Lcom/google/android/filament/utils/VectorComponent;", "index", "", "get", "index1", "index2", "Lcom/google/android/filament/utils/Bool2;", "index3", "Lcom/google/android/filament/utils/Bool3;", "index4", "", "invoke", "v", "Lvzv;", "set", "component1", "component2", "component3", "component4", "x", "y", "z", "w", "copy", "", "toString", "hashCode", "other", "equals", "Z", "getX", "()Z", "setX", "(Z)V", "getY", "setY", "getZ", "setZ", "getW", "setW", "value", "getR", "setR", "r", "getG", "setG", "g", "getB", "setB", "b", "getA", "setA", "a", "getS", "setS", "s", "getT", "setT", "t", "getP", "setP", "p", "getQ", "setQ", "q", "getXy", "()Lcom/google/android/filament/utils/Bool2;", "setXy", "(Lcom/google/android/filament/utils/Bool2;)V", "xy", "getRg", "setRg", "rg", "getSt", "setSt", "st", "getRgb", "()Lcom/google/android/filament/utils/Bool3;", "setRgb", "(Lcom/google/android/filament/utils/Bool3;)V", "rgb", "getXyz", "setXyz", "xyz", "getStp", "setStp", "stp", "getRgba", "()Lcom/google/android/filament/utils/Bool4;", "setRgba", "(Lcom/google/android/filament/utils/Bool4;)V", "rgba", "getXyzw", "setXyzw", "xyzw", "getStpq", "setStpq", "stpq", "<init>", "(ZZZZ)V", "(Lcom/google/android/filament/utils/Bool2;ZZ)V", "(Lcom/google/android/filament/utils/Bool3;Z)V", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 })
public final class Bool4
{
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    public Bool4() {
        this(false, false, false, false, 15, null);
    }
    
    public Bool4(final Bool2 bool2, final boolean b, final boolean b2) {
        e0e.f((Object)bool2, "v");
        this(bool2.getX(), bool2.getY(), b, b2);
    }
    
    public Bool4(final Bool2 bool2, boolean b, boolean b2, final int n, final wg8 wg8) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        if ((n & 0x4) != 0x0) {
            b2 = false;
        }
        this(bool2, b, b2);
    }
    
    public Bool4(final Bool3 bool3, final boolean b) {
        e0e.f((Object)bool3, "v");
        this(bool3.getX(), bool3.getY(), bool3.getZ(), b);
    }
    
    public Bool4(final Bool3 bool3, boolean b, final int n, final wg8 wg8) {
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this(bool3, b);
    }
    
    public Bool4(final Bool4 bool4) {
        e0e.f((Object)bool4, "v");
        this(bool4.x, bool4.y, bool4.z, bool4.w);
    }
    
    public Bool4(final boolean x, final boolean y, final boolean z, final boolean w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    public Bool4(boolean b, boolean b2, boolean b3, boolean b4, final int n, final wg8 wg8) {
        if ((n & 0x1) != 0x0) {
            b = false;
        }
        if ((n & 0x2) != 0x0) {
            b2 = false;
        }
        if ((n & 0x4) != 0x0) {
            b3 = false;
        }
        if ((n & 0x8) != 0x0) {
            b4 = false;
        }
        this(b, b2, b3, b4);
    }
    
    public static Bool4 copy$default(final Bool4 bool4, boolean x, boolean y, boolean z, boolean w, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            x = bool4.x;
        }
        if ((n & 0x2) != 0x0) {
            y = bool4.y;
        }
        if ((n & 0x4) != 0x0) {
            z = bool4.z;
        }
        if ((n & 0x8) != 0x0) {
            w = bool4.w;
        }
        return bool4.copy(x, y, z, w);
    }
    
    public final boolean component1() {
        return this.x;
    }
    
    public final boolean component2() {
        return this.y;
    }
    
    public final boolean component3() {
        return this.z;
    }
    
    public final boolean component4() {
        return this.w;
    }
    
    public final Bool4 copy(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        return new Bool4(b, b2, b3, b4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Bool4)) {
            return false;
        }
        final Bool4 bool4 = (Bool4)o;
        return this.x == bool4.x && this.y == bool4.y && this.z == bool4.z && this.w == bool4.w;
    }
    
    public final Bool2 get(final int n, final int n2) {
        return new Bool2(this.get(n), this.get(n2));
    }
    
    public final Bool2 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        return new Bool2(this.get(vectorComponent), this.get(vectorComponent2));
    }
    
    public final Bool3 get(final int n, final int n2, final int n3) {
        return new Bool3(this.get(n), this.get(n2), this.get(n3));
    }
    
    public final Bool3 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        return new Bool3(this.get(vectorComponent), this.get(vectorComponent2), this.get(vectorComponent3));
    }
    
    public final Bool4 get(final int n, final int n2, final int n3, final int n4) {
        return new Bool4(this.get(n), this.get(n2), this.get(n3), this.get(n4));
    }
    
    public final Bool4 get(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final VectorComponent vectorComponent4) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        e0e.f((Object)vectorComponent4, "index4");
        return new Bool4(this.get(vectorComponent), this.get(vectorComponent2), this.get(vectorComponent3), this.get(vectorComponent4));
    }
    
    public final boolean get(final int n) {
        boolean b;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("index must be in 0..3");
                    }
                    b = this.w;
                }
                else {
                    b = this.z;
                }
            }
            else {
                b = this.y;
            }
        }
        else {
            b = this.x;
        }
        return b;
    }
    
    public final boolean get(final VectorComponent vectorComponent) {
        e0e.f((Object)vectorComponent, "index");
        boolean b = false;
        switch (WhenMappings.$EnumSwitchMapping$0[vectorComponent.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                b = this.w;
                break;
            }
            case 7:
            case 8:
            case 9: {
                b = this.z;
                break;
            }
            case 4:
            case 5:
            case 6: {
                b = this.y;
                break;
            }
            case 1:
            case 2:
            case 3: {
                b = this.x;
                break;
            }
        }
        return b;
    }
    
    public final boolean getA() {
        return this.getW();
    }
    
    public final boolean getB() {
        return this.getZ();
    }
    
    public final boolean getG() {
        return this.getY();
    }
    
    public final boolean getP() {
        return this.getZ();
    }
    
    public final boolean getQ() {
        return this.getW();
    }
    
    public final boolean getR() {
        return this.getX();
    }
    
    public final Bool2 getRg() {
        return new Bool2(this.getX(), this.getY());
    }
    
    public final Bool3 getRgb() {
        return new Bool3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Bool4 getRgba() {
        return new Bool4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final boolean getS() {
        return this.getX();
    }
    
    public final Bool2 getSt() {
        return new Bool2(this.getX(), this.getY());
    }
    
    public final Bool3 getStp() {
        return new Bool3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Bool4 getStpq() {
        return new Bool4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final boolean getT() {
        return this.getY();
    }
    
    public final boolean getW() {
        return this.w;
    }
    
    public final boolean getX() {
        return this.x;
    }
    
    public final Bool2 getXy() {
        return new Bool2(this.getX(), this.getY());
    }
    
    public final Bool3 getXyz() {
        return new Bool3(this.getX(), this.getY(), this.getZ());
    }
    
    public final Bool4 getXyzw() {
        return new Bool4(this.getX(), this.getY(), this.getZ(), this.getW());
    }
    
    public final boolean getY() {
        return this.y;
    }
    
    public final boolean getZ() {
        return this.z;
    }
    
    @Override
    public int hashCode() {
        final int x = this.x ? 1 : 0;
        int n = 1;
        int n2 = x;
        if (x != 0) {
            n2 = 1;
        }
        int y;
        if ((y = (this.y ? 1 : 0)) != 0) {
            y = 1;
        }
        int z;
        if ((z = (this.z ? 1 : 0)) != 0) {
            z = 1;
        }
        final int w = this.w ? 1 : 0;
        if (w == 0) {
            n = w;
        }
        return ((n2 * 31 + y) * 31 + z) * 31 + n;
    }
    
    public final boolean invoke(final int n) {
        return this.get(n - 1);
    }
    
    public final void set(final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.set(n, b);
        this.set(n2, b);
        this.set(n3, b);
        this.set(n4, b);
    }
    
    public final void set(final int n, final int n2, final int n3, final boolean b) {
        this.set(n, b);
        this.set(n2, b);
        this.set(n3, b);
    }
    
    public final void set(final int n, final int n2, final boolean b) {
        this.set(n, b);
        this.set(n2, b);
    }
    
    public final void set(final int n, final boolean b) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException("index must be in 0..3");
                    }
                    this.w = b;
                }
                else {
                    this.z = b;
                }
            }
            else {
                this.y = b;
            }
        }
        else {
            this.x = b;
        }
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final VectorComponent vectorComponent4, final boolean b) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        e0e.f((Object)vectorComponent4, "index4");
        this.set(vectorComponent, b);
        this.set(vectorComponent2, b);
        this.set(vectorComponent3, b);
        this.set(vectorComponent4, b);
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final VectorComponent vectorComponent3, final boolean b) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        e0e.f((Object)vectorComponent3, "index3");
        this.set(vectorComponent, b);
        this.set(vectorComponent2, b);
        this.set(vectorComponent3, b);
    }
    
    public final void set(final VectorComponent vectorComponent, final VectorComponent vectorComponent2, final boolean b) {
        e0e.f((Object)vectorComponent, "index1");
        e0e.f((Object)vectorComponent2, "index2");
        this.set(vectorComponent, b);
        this.set(vectorComponent2, b);
    }
    
    public final void set(final VectorComponent vectorComponent, final boolean b) {
        e0e.f((Object)vectorComponent, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[vectorComponent.ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 10:
            case 11:
            case 12: {
                this.w = b;
                break;
            }
            case 7:
            case 8:
            case 9: {
                this.z = b;
                break;
            }
            case 4:
            case 5:
            case 6: {
                this.y = b;
                break;
            }
            case 1:
            case 2:
            case 3: {
                this.x = b;
                break;
            }
        }
    }
    
    public final void setA(final boolean w) {
        this.setW(w);
    }
    
    public final void setB(final boolean z) {
        this.setZ(z);
    }
    
    public final void setG(final boolean y) {
        this.setY(y);
    }
    
    public final void setP(final boolean z) {
        this.setZ(z);
    }
    
    public final void setQ(final boolean w) {
        this.setW(w);
    }
    
    public final void setR(final boolean x) {
        this.setX(x);
    }
    
    public final void setRg(final Bool2 bool2) {
        e0e.f((Object)bool2, "value");
        this.setX(bool2.getX());
        this.setY(bool2.getY());
    }
    
    public final void setRgb(final Bool3 bool3) {
        e0e.f((Object)bool3, "value");
        this.setX(bool3.getX());
        this.setY(bool3.getY());
        this.setZ(bool3.getZ());
    }
    
    public final void setRgba(final Bool4 bool4) {
        e0e.f((Object)bool4, "value");
        this.setX(bool4.getX());
        this.setY(bool4.getY());
        this.setZ(bool4.getZ());
        this.setW(bool4.getW());
    }
    
    public final void setS(final boolean x) {
        this.setX(x);
    }
    
    public final void setSt(final Bool2 bool2) {
        e0e.f((Object)bool2, "value");
        this.setX(bool2.getX());
        this.setY(bool2.getY());
    }
    
    public final void setStp(final Bool3 bool3) {
        e0e.f((Object)bool3, "value");
        this.setX(bool3.getX());
        this.setY(bool3.getY());
        this.setZ(bool3.getZ());
    }
    
    public final void setStpq(final Bool4 bool4) {
        e0e.f((Object)bool4, "value");
        this.setX(bool4.getX());
        this.setY(bool4.getY());
        this.setZ(bool4.getZ());
        this.setW(bool4.getW());
    }
    
    public final void setT(final boolean y) {
        this.setY(y);
    }
    
    public final void setW(final boolean w) {
        this.w = w;
    }
    
    public final void setX(final boolean x) {
        this.x = x;
    }
    
    public final void setXy(final Bool2 bool2) {
        e0e.f((Object)bool2, "value");
        this.setX(bool2.getX());
        this.setY(bool2.getY());
    }
    
    public final void setXyz(final Bool3 bool3) {
        e0e.f((Object)bool3, "value");
        this.setX(bool3.getX());
        this.setY(bool3.getY());
        this.setZ(bool3.getZ());
    }
    
    public final void setXyzw(final Bool4 bool4) {
        e0e.f((Object)bool4, "value");
        this.setX(bool4.getX());
        this.setY(bool4.getY());
        this.setZ(bool4.getZ());
        this.setW(bool4.getW());
    }
    
    public final void setY(final boolean y) {
        this.y = y;
    }
    
    public final void setZ(final boolean z) {
        this.z = z;
    }
    
    @Override
    public String toString() {
        final StringBuilder f = ehk.f("Bool4(x=");
        f.append(this.x);
        f.append(", y=");
        f.append(this.y);
        f.append(", z=");
        f.append(this.z);
        f.append(", w=");
        return d10.D(f, this.w, ')');
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
