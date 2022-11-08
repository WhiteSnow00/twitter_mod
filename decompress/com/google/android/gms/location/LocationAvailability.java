// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LocationAvailability extends sd implements ReflectedParcelable
{
    public static final Parcelable$Creator<LocationAvailability> CREATOR;
    @Deprecated
    public int C0;
    @Deprecated
    public int D0;
    public long E0;
    public int F0;
    public gcy[] G0;
    
    static {
        CREATOR = (Parcelable$Creator)new j9y();
    }
    
    public LocationAvailability(final int f0, final int c0, final int d0, final long e0, final gcy[] g0) {
        this.F0 = f0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.G0 = g0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (LocationAvailability.class == o.getClass()) {
                final LocationAvailability locationAvailability = (LocationAvailability)o;
                if (this.C0 == locationAvailability.C0 && this.D0 == locationAvailability.D0 && this.E0 == locationAvailability.E0 && this.F0 == locationAvailability.F0 && Arrays.equals(this.G0, locationAvailability.G0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.C0, this.D0, this.E0, this.G0 });
    }
    
    public final String toString() {
        final boolean b = this.F0 < 1000;
        final StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.n0(parcel, 2, this.D0);
        ri4.q0(parcel, 3, this.E0);
        ri4.n0(parcel, 4, this.F0);
        ri4.v0(parcel, 5, (Parcelable[])this.G0, n);
        ri4.A0(parcel, x0);
    }
}
