// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcelable;
import android.os.Parcel;
import android.content.IntentSender$SendIntentException;
import android.content.Intent;
import android.app.Activity;
import java.util.Arrays;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Status extends sd implements xrm, ReflectedParcelable
{
    public static final Parcelable$Creator<Status> CREATOR;
    public static final Status H0;
    public static final Status I0;
    public static final Status J0;
    public static final Status K0;
    public static final Status L0;
    public final int C0;
    public final int D0;
    public final String E0;
    public final PendingIntent F0;
    public final ph6 G0;
    
    static {
        H0 = new Status(0, null);
        I0 = new Status(14, null);
        J0 = new Status(8, null);
        K0 = new Status(15, null);
        L0 = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = (Parcelable$Creator)new biy();
    }
    
    public Status(final int c0, final int d0, final String e0, final PendingIntent f0, final ph6 g0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public Status(final int n, final String s) {
        this(1, n, s, null, null);
    }
    
    public Status(final int n, final String s, final PendingIntent pendingIntent) {
        this(1, n, s, pendingIntent, null);
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof Status)) {
            return false;
        }
        final Status status = (Status)o;
        return this.C0 == status.C0 && this.D0 == status.D0 && z4j.a((Object)this.E0, (Object)status.E0) && z4j.a((Object)this.F0, (Object)status.F0) && z4j.a((Object)this.G0, (Object)status.G0);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, this.E0, this.F0, this.G0 });
    }
    
    @Override
    public final Status l() {
        return this;
    }
    
    public final boolean r() {
        return this.D0 <= 0;
    }
    
    public final void s(final Activity activity, final int n) throws IntentSender$SendIntentException {
        final PendingIntent f0 = this.F0;
        if (f0 == null) {
            return;
        }
        xd.t((Object)f0);
        activity.startIntentSenderForResult(f0.getIntentSender(), n, (Intent)null, 0, 0, 0);
    }
    
    public final String toString() {
        final z4j$a z4j$a = new z4j$a((Object)this);
        String s = this.E0;
        if (s == null) {
            s = asy.P(this.D0);
        }
        z4j$a.a("statusCode", (Object)s);
        z4j$a.a("resolution", (Object)this.F0);
        return z4j$a.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.D0);
        ri4.s0(parcel, 2, this.E0);
        ri4.r0(parcel, 3, (Parcelable)this.F0, n);
        ri4.r0(parcel, 4, (Parcelable)this.G0, n);
        ri4.n0(parcel, 1000, this.C0);
        ri4.A0(parcel, x0);
    }
}
