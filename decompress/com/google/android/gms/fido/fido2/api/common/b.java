// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class b extends u51
{
    public static final Parcelable$Creator<b> CREATOR;
    public final ErrorCode C0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new f6z();
    }
    
    public b(final int n, final String d0) {
        try {
            this.C0 = ErrorCode.b(n);
            this.D0 = d0;
        }
        catch (final ErrorCode$UnsupportedErrorCodeException ex) {
            throw new IllegalArgumentException((Throwable)ex);
        }
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return z4j.a((Object)this.C0, (Object)b.C0) && z4j.a((Object)this.D0, (Object)b.D0);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0 });
    }
    
    public final String toString() {
        final uby uby = new uby(b.class.getSimpleName());
        final int c0 = this.C0.C0;
        final ddy ddy = new ddy();
        uby.c.c = ddy;
        uby.c = ddy;
        ddy.b = String.valueOf(c0);
        ddy.a = "errorCode";
        final String d0 = this.D0;
        if (d0 != null) {
            uby.a("errorMessage", (Object)d0);
        }
        return uby.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 2, this.C0.C0);
        ri4.s0(parcel, 3, this.D0);
        ri4.A0(parcel, x0);
    }
}
