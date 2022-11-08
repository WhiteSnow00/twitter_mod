// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collection;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import android.os.Parcelable$Creator;

public final class d extends u51
{
    public static final Parcelable$Creator<d> CREATOR;
    public final sml C0;
    public final tml D0;
    public final byte[] E0;
    public final List<e> F0;
    public final Double G0;
    public final List<PublicKeyCredentialDescriptor> H0;
    public final c I0;
    public final Integer J0;
    public final TokenBinding K0;
    public final AttestationConveyancePreference L0;
    public final r51 M0;
    
    static {
        CREATOR = (Parcelable$Creator)new dxz();
    }
    
    public d(final sml c0, final tml d0, final byte[] e0, final List<e> f0, final Double g0, final List<PublicKeyCredentialDescriptor> h0, final c i0, final Integer j0, final TokenBinding k0, final String s, final r51 m0) {
        Objects.requireNonNull(c0, "null reference");
        this.C0 = c0;
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        Objects.requireNonNull(e0, "null reference");
        this.E0 = e0;
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        Label_0116: {
            if (s != null) {
                try {
                    this.L0 = AttestationConveyancePreference.b(s);
                    break Label_0116;
                }
                catch (final AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException ex) {
                    throw new IllegalArgumentException((Throwable)ex);
                }
            }
            this.L0 = null;
        }
        this.M0 = m0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (z4j.a((Object)this.C0, (Object)d.C0) && z4j.a((Object)this.D0, (Object)d.D0) && Arrays.equals(this.E0, d.E0) && z4j.a((Object)this.G0, (Object)d.G0) && this.F0.containsAll(d.F0) && d.F0.containsAll(this.F0)) {
            final List<PublicKeyCredentialDescriptor> h0 = this.H0;
            if (h0 != null || d.H0 != null) {
                if (h0 == null) {
                    return false;
                }
                final List<PublicKeyCredentialDescriptor> h2 = d.H0;
                if (h2 == null || !h0.containsAll(h2) || !d.H0.containsAll(this.H0)) {
                    return false;
                }
            }
            if (z4j.a((Object)this.I0, (Object)d.I0) && z4j.a((Object)this.J0, (Object)d.J0) && z4j.a((Object)this.K0, (Object)d.K0) && z4j.a((Object)this.L0, (Object)d.L0) && z4j.a((Object)this.M0, (Object)d.M0)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0, this.D0, Arrays.hashCode(this.E0), this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.r0(parcel, 2, (Parcelable)this.C0, n);
        ri4.r0(parcel, 3, (Parcelable)this.D0, n);
        ri4.i0(parcel, 4, this.E0);
        ri4.w0(parcel, 5, (List)this.F0);
        ri4.j0(parcel, 6, this.G0);
        ri4.w0(parcel, 7, (List)this.H0);
        ri4.r0(parcel, 8, (Parcelable)this.I0, n);
        ri4.p0(parcel, 9, this.J0);
        ri4.r0(parcel, 10, (Parcelable)this.K0, n);
        final AttestationConveyancePreference l0 = this.L0;
        String c0;
        if (l0 == null) {
            c0 = null;
        }
        else {
            c0 = l0.C0;
        }
        ri4.s0(parcel, 11, c0);
        ri4.r0(parcel, 12, (Parcelable)this.M0, n);
        ri4.A0(parcel, x0);
    }
}
