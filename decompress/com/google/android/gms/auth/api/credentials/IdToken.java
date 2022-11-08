// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class IdToken extends sd implements ReflectedParcelable
{
    @RecentlyNonNull
    public static final Parcelable$Creator<IdToken> CREATOR;
    public final String C0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new m6y();
    }
    
    public IdToken(@RecentlyNonNull final String c0, @RecentlyNonNull final String d0) {
        xd.l(TextUtils.isEmpty((CharSequence)c0) ^ true, (Object)"account type string cannot be null or empty");
        xd.l(TextUtils.isEmpty((CharSequence)d0) ^ true, (Object)"id token string cannot be null or empty");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdToken)) {
            return false;
        }
        final IdToken idToken = (IdToken)o;
        return z4j.a((Object)this.C0, (Object)idToken.C0) && z4j.a((Object)this.D0, (Object)idToken.D0);
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 1, this.C0);
        ri4.s0(parcel, 2, this.D0);
        ri4.A0(parcel, x0);
    }
}
