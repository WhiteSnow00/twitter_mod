// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<SignInAccount> CREATOR;
    @Deprecated
    public String C0;
    public GoogleSignInAccount D0;
    @Deprecated
    public String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new b6y();
    }
    
    public SignInAccount(final String c0, final GoogleSignInAccount d0, final String e0) {
        this.D0 = d0;
        xd.r(c0, (Object)"8.3 and 8.4 SDKs require non-null email");
        this.C0 = c0;
        xd.r(e0, (Object)"8.3 and 8.4 SDKs require non-null userId");
        this.E0 = e0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 4, this.C0);
        ri4.r0(parcel, 7, (Parcelable)this.D0, n);
        ri4.s0(parcel, 8, this.E0);
        ri4.A0(parcel, x0);
    }
}
