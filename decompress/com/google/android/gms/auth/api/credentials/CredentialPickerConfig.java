// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class CredentialPickerConfig extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<CredentialPickerConfig> CREATOR;
    public final int C0;
    public final boolean D0;
    public final boolean E0;
    public final int F0;
    
    static {
        CREATOR = (Parcelable$Creator)new v5y();
    }
    
    public CredentialPickerConfig(int n, final boolean d0, final boolean e0, final boolean b, final int f0) {
        this.C0 = n;
        this.D0 = d0;
        this.E0 = e0;
        if (n < 2) {
            n = 1;
            if (b) {
                n = 3;
            }
            this.F0 = n;
            return;
        }
        this.F0 = f0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        final boolean d0 = this.D0;
        boolean b = true;
        ri4.e0(parcel, 1, d0);
        ri4.e0(parcel, 2, this.E0);
        if (this.F0 != 3) {
            b = false;
        }
        ri4.e0(parcel, 3, b);
        ri4.n0(parcel, 4, this.F0);
        ri4.n0(parcel, 1000, this.C0);
        ri4.A0(parcel, x0);
    }
}
