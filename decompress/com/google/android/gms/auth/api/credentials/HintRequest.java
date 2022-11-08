// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Objects;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class HintRequest extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<HintRequest> CREATOR;
    public final int C0;
    public final CredentialPickerConfig D0;
    public final boolean E0;
    public final boolean F0;
    public final String[] G0;
    public final boolean H0;
    public final String I0;
    public final String J0;
    
    static {
        CREATOR = (Parcelable$Creator)new j6y();
    }
    
    public HintRequest(final int c0, final CredentialPickerConfig d0, final boolean e0, final boolean f0, final String[] g0, final boolean h0, final String i0, final String j0) {
        this.C0 = c0;
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        Objects.requireNonNull(g0, "null reference");
        this.G0 = g0;
        if (c0 < 2) {
            this.H0 = true;
            this.I0 = null;
            this.J0 = null;
            return;
        }
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.r0(parcel, 1, (Parcelable)this.D0, n);
        ri4.e0(parcel, 2, this.E0);
        ri4.e0(parcel, 3, this.F0);
        ri4.t0(parcel, 4, this.G0);
        ri4.e0(parcel, 5, this.H0);
        ri4.s0(parcel, 6, this.I0);
        ri4.s0(parcel, 7, this.J0);
        ri4.n0(parcel, 1000, this.C0);
        ri4.A0(parcel, x0);
    }
}
