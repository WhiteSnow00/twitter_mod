// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import java.util.Objects;
import android.os.Parcelable$Creator;

public final class e extends sd
{
    public static final Parcelable$Creator<e> CREATOR;
    public final PublicKeyCredentialType C0;
    public final COSEAlgorithmIdentifier D0;
    
    static {
        CREATOR = (Parcelable$Creator)new qyz();
    }
    
    public e(final String s, final int n) {
        Objects.requireNonNull(s, "null reference");
        try {
            this.C0 = PublicKeyCredentialType.b(s);
            xd.t((Object)n);
            try {
                this.D0 = COSEAlgorithmIdentifier.a(n);
            }
            catch (final COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException ex) {
                throw new IllegalArgumentException((Throwable)ex);
            }
        }
        catch (final PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException ex2) {
            throw new IllegalArgumentException((Throwable)ex2);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.C0.equals(e.C0) && this.D0.equals((Object)e.D0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0 });
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, this.C0.C0);
        ri4.p0(parcel, 3, Integer.valueOf(this.D0.C0.b()));
        ri4.A0(parcel, x0);
    }
}
