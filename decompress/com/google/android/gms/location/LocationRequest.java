// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LocationRequest extends sd implements ReflectedParcelable
{
    public static final Parcelable$Creator<LocationRequest> CREATOR;
    public int C0;
    public long D0;
    public long E0;
    public boolean F0;
    public long G0;
    public int H0;
    public float I0;
    public long J0;
    
    static {
        CREATOR = (Parcelable$Creator)new s9y();
    }
    
    public LocationRequest() {
        this.C0 = 102;
        this.D0 = 3600000L;
        this.E0 = 600000L;
        this.F0 = false;
        this.G0 = Long.MAX_VALUE;
        this.H0 = Integer.MAX_VALUE;
        this.I0 = 0.0f;
        this.J0 = 0L;
    }
    
    public LocationRequest(final int c0, final long d0, final long e0, final boolean f0, final long g0, final int h0, final float i0, final long j0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public static void t(final long n) {
        if (n >= 0L) {
            return;
        }
        final StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocationRequest)) {
            return false;
        }
        final LocationRequest locationRequest = (LocationRequest)o;
        if (this.C0 == locationRequest.C0) {
            long d0 = this.D0;
            long d2 = locationRequest.D0;
            if (d0 == d2 && this.E0 == locationRequest.E0 && this.F0 == locationRequest.F0 && this.G0 == locationRequest.G0 && this.H0 == locationRequest.H0 && this.I0 == locationRequest.I0) {
                final long j0 = this.J0;
                if (j0 >= d0) {
                    d0 = j0;
                }
                final long j2 = locationRequest.J0;
                if (j2 >= d2) {
                    d2 = j2;
                }
                if (d0 == d2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.I0, this.J0 });
    }
    
    public final LocationRequest r(final int c0) {
        if (c0 != 100 && c0 != 102 && c0 != 104 && c0 != 105) {
            throw new IllegalArgumentException(q1a.f(28, "invalid quality: ", c0));
        }
        this.C0 = c0;
        return this;
    }
    
    public final LocationRequest s(final float i0) {
        if (i0 >= 0.0f) {
            this.I0 = i0;
            return this;
        }
        final StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(i0);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Request[");
        final int c0 = this.C0;
        String s;
        if (c0 != 100) {
            if (c0 != 102) {
                if (c0 != 104) {
                    if (c0 != 105) {
                        s = "???";
                    }
                    else {
                        s = "PRIORITY_NO_POWER";
                    }
                }
                else {
                    s = "PRIORITY_LOW_POWER";
                }
            }
            else {
                s = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        }
        else {
            s = "PRIORITY_HIGH_ACCURACY";
        }
        g.append(s);
        if (this.C0 != 105) {
            g.append(" requested=");
            g.append(this.D0);
            g.append("ms");
        }
        g.append(" fastest=");
        g.append(this.E0);
        g.append("ms");
        if (this.J0 > this.D0) {
            g.append(" maxWait=");
            g.append(this.J0);
            g.append("ms");
        }
        if (this.I0 > 0.0f) {
            g.append(" smallestDisplacement=");
            g.append(this.I0);
            g.append("m");
        }
        final long g2 = this.G0;
        if (g2 != Long.MAX_VALUE) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            g.append(" expireIn=");
            g.append(g2 - elapsedRealtime);
            g.append("ms");
        }
        if (this.H0 != Integer.MAX_VALUE) {
            g.append(" num=");
            g.append(this.H0);
        }
        g.append(']');
        return g.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.q0(parcel, 2, this.D0);
        ri4.q0(parcel, 3, this.E0);
        ri4.e0(parcel, 4, this.F0);
        ri4.q0(parcel, 5, this.G0);
        ri4.n0(parcel, 6, this.H0);
        ri4.k0(parcel, 7, this.I0);
        ri4.q0(parcel, 8, this.J0);
        ri4.A0(parcel, x0);
    }
}
