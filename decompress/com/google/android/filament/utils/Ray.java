// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.filament.utils;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016" }, d2 = { "Lcom/google/android/filament/utils/Ray;", "", "origin", "Lcom/google/android/filament/utils/Float3;", "direction", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "getDirection", "()Lcom/google/android/filament/utils/Float3;", "setDirection", "(Lcom/google/android/filament/utils/Float3;)V", "getOrigin", "setOrigin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "filament-utils-android_fullRelease" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class Ray
{
    private Float3 direction;
    private Float3 origin;
    
    public Ray(final Float3 origin, final Float3 direction) {
        czd.f((Object)origin, "origin");
        czd.f((Object)direction, "direction");
        this.origin = origin;
        this.direction = direction;
    }
    
    public Ray(Float3 float3, final Float3 float4, final int n, final rf8 rf8) {
        if ((n & 0x1) != 0x0) {
            float3 = new Float3(0.0f, 0.0f, 0.0f, 7, (rf8)null);
        }
        this(float3, float4);
    }
    
    public static Ray copy$default(final Ray ray, Float3 origin, Float3 direction, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            origin = ray.origin;
        }
        if ((n & 0x2) != 0x0) {
            direction = ray.direction;
        }
        return ray.copy(origin, direction);
    }
    
    public final Float3 component1() {
        return this.origin;
    }
    
    public final Float3 component2() {
        return this.direction;
    }
    
    public final Ray copy(final Float3 float3, final Float3 float4) {
        czd.f((Object)float3, "origin");
        czd.f((Object)float4, "direction");
        return new Ray(float3, float4);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ray)) {
            return false;
        }
        final Ray ray = (Ray)o;
        return czd.a((Object)this.origin, (Object)ray.origin) && czd.a((Object)this.direction, (Object)ray.direction);
    }
    
    public final Float3 getDirection() {
        return this.direction;
    }
    
    public final Float3 getOrigin() {
        return this.origin;
    }
    
    @Override
    public int hashCode() {
        return this.direction.hashCode() + this.origin.hashCode() * 31;
    }
    
    public final void setDirection(final Float3 direction) {
        czd.f((Object)direction, "<set-?>");
        this.direction = direction;
    }
    
    public final void setOrigin(final Float3 origin) {
        czd.f((Object)origin, "<set-?>");
        this.origin = origin;
    }
    
    @Override
    public String toString() {
        final StringBuilder j = fu8.j("Ray(origin=");
        j.append(this.origin);
        j.append(", direction=");
        j.append(this.direction);
        j.append(')');
        return j.toString();
    }
}
