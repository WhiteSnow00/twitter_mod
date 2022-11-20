// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class b extends p51
{
    public static final Parcelable$Creator<b> CREATOR;
    public final ErrorCode D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new u6z();
    }
    
    public b(final int n, final String e0) {
        try {
            this.D0 = ErrorCode.b(n);
            this.E0 = e0;
        }
        catch (final ErrorCode.UnsupportedErrorCodeException ex) {
            throw new IllegalArgumentException(ex);
        }
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return f5j.a(this.D0, b.D0) && f5j.a(this.E0, b.E0);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0 });
    }
    
    public final String toString() {
        final kcy kcy = new kcy(b.class.getSimpleName());
        final int d0 = this.D0.D0;
        final tdy tdy = new tdy();
        kcy.c.c = tdy;
        kcy.c = tdy;
        tdy.b = String.valueOf(d0);
        tdy.a = "errorCode";
        final String e0 = this.E0;
        if (e0 != null) {
            kcy.a("errorMessage", (Object)e0);
        }
        return kcy.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 2, this.D0.D0);
        fli.Y0(parcel, 3, this.E0);
        fli.g1(parcel, d1);
    }
}
