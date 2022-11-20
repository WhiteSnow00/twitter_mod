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

public final class d extends p51
{
    public static final Parcelable$Creator<d> CREATOR;
    public final gnl D0;
    public final hnl E0;
    public final byte[] F0;
    public final List<e> G0;
    public final Double H0;
    public final List<PublicKeyCredentialDescriptor> I0;
    public final c J0;
    public final Integer K0;
    public final TokenBinding L0;
    public final AttestationConveyancePreference M0;
    public final m51 N0;
    
    static {
        CREATOR = (Parcelable$Creator)new pxz();
    }
    
    public d(final gnl d0, final hnl e0, final byte[] f0, final List<e> g0, final Double h0, final List<PublicKeyCredentialDescriptor> i0, final c j0, final Integer k0, final TokenBinding l0, final String s, final m51 n0) {
        Objects.requireNonNull(d0, "null reference");
        this.D0 = d0;
        Objects.requireNonNull(e0, "null reference");
        this.E0 = e0;
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
        Objects.requireNonNull(g0, "null reference");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        Label_0116: {
            if (s != null) {
                try {
                    this.M0 = AttestationConveyancePreference.b(s);
                    break Label_0116;
                }
                catch (final AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException ex) {
                    throw new IllegalArgumentException(ex);
                }
            }
            this.M0 = null;
        }
        this.N0 = n0;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (f5j.a(this.D0, d.D0) && f5j.a(this.E0, d.E0) && Arrays.equals(this.F0, d.F0) && f5j.a(this.H0, d.H0) && this.G0.containsAll(d.G0) && d.G0.containsAll(this.G0)) {
            final List<PublicKeyCredentialDescriptor> i0 = this.I0;
            if (i0 != null || d.I0 != null) {
                if (i0 == null) {
                    return false;
                }
                final List<PublicKeyCredentialDescriptor> i2 = d.I0;
                if (i2 == null || !i0.containsAll(i2) || !d.I0.containsAll(this.I0)) {
                    return false;
                }
            }
            if (f5j.a(this.J0, d.J0) && f5j.a(this.K0, d.K0) && f5j.a(this.L0, d.L0) && f5j.a(this.M0, d.M0) && f5j.a(this.N0, d.N0)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0, this.E0, Arrays.hashCode(this.F0), this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 2, (Parcelable)this.D0, n);
        fli.X0(parcel, 3, (Parcelable)this.E0, n);
        fli.O0(parcel, 4, this.F0);
        fli.c1(parcel, 5, (List)this.G0);
        fli.P0(parcel, 6, this.H0);
        fli.c1(parcel, 7, (List)this.I0);
        fli.X0(parcel, 8, (Parcelable)this.J0, n);
        fli.V0(parcel, 9, this.K0);
        fli.X0(parcel, 10, (Parcelable)this.L0, n);
        final AttestationConveyancePreference m0 = this.M0;
        String d2;
        if (m0 == null) {
            d2 = null;
        }
        else {
            d2 = m0.D0;
        }
        fli.Y0(parcel, 11, d2);
        fli.X0(parcel, 12, (Parcelable)this.N0, n);
        fli.g1(parcel, d1);
    }
}
