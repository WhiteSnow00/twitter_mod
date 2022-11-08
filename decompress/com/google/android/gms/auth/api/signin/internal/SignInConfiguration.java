// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class SignInConfiguration extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<SignInConfiguration> CREATOR;
    public final String C0;
    public GoogleSignInOptions D0;
    
    static {
        CREATOR = (Parcelable$Creator)new r7y();
    }
    
    public SignInConfiguration(@RecentlyNonNull final String c0, @RecentlyNonNull final GoogleSignInOptions d0) {
        xd.q(c0);
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof SignInConfiguration)) {
            return false;
        }
        final SignInConfiguration signInConfiguration = (SignInConfiguration)o;
        if (this.C0.equals(signInConfiguration.C0)) {
            final GoogleSignInOptions d0 = this.D0;
            final GoogleSignInOptions d2 = signInConfiguration.D0;
            if (d0 == null) {
                if (d2 != null) {
                    return false;
                }
            }
            else if (!d0.equals(d2)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        final String c0 = this.C0;
        int hashCode = 0;
        int hashCode2;
        if (c0 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c0.hashCode();
        }
        final GoogleSignInOptions d0 = this.D0;
        if (d0 != null) {
            hashCode = d0.hashCode();
        }
        return (1 * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, this.C0);
        ri4.r0(parcel, 5, (Parcelable)this.D0, n);
        ri4.A0(parcel, x0);
    }
}
