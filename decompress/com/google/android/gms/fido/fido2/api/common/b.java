// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class b extends w51
{
    public static final Parcelable$Creator<b> CREATOR;
    public final ErrorCode F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new t7z();
    }
    
    public b(final int n, final String g0) {
        try {
            this.F0 = ErrorCode.b(n);
            this.G0 = g0;
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
        return r5j.a(this.F0, b.F0) && r5j.a(this.G0, b.G0);
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0 });
    }
    
    public final String toString() {
        final edy edy = new edy(b.class.getSimpleName());
        final int f0 = this.F0.F0;
        final ney ney = new ney();
        edy.c.c = ney;
        edy.c = ney;
        ney.b = String.valueOf(f0);
        ney.a = "errorCode";
        final String g0 = this.G0;
        if (g0 != null) {
            edy.a("errorMessage", (Object)g0);
        }
        return edy.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 2, this.F0.F0);
        xd.s1(parcel, 3, this.G0);
        xd.B1(parcel, x1);
    }
}
