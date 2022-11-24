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

public final class d extends w51
{
    public static final Parcelable$Creator<d> CREATOR;
    public final snl F0;
    public final tnl G0;
    public final byte[] H0;
    public final List<e> I0;
    public final Double J0;
    public final List<PublicKeyCredentialDescriptor> K0;
    public final c L0;
    public final Integer M0;
    public final TokenBinding N0;
    public final AttestationConveyancePreference O0;
    public final t51 P0;
    
    static {
        CREATOR = (Parcelable$Creator)new oyz();
    }
    
    public d(final snl f0, final tnl g0, final byte[] h0, final List<e> i0, final Double j0, final List<PublicKeyCredentialDescriptor> k0, final c l0, final Integer m0, final TokenBinding n0, final String s, final t51 p11) {
        Objects.requireNonNull(f0, "null reference");
        this.F0 = f0;
        Objects.requireNonNull(g0, "null reference");
        this.G0 = g0;
        Objects.requireNonNull(h0, "null reference");
        this.H0 = h0;
        Objects.requireNonNull(i0, "null reference");
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        Label_0116: {
            if (s != null) {
                try {
                    this.O0 = AttestationConveyancePreference.b(s);
                    break Label_0116;
                }
                catch (final AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException ex) {
                    throw new IllegalArgumentException((Throwable)ex);
                }
            }
            this.O0 = null;
        }
        this.P0 = p11;
    }
    
    public final boolean equals(final Object o) {
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (r5j.a(this.F0, d.F0) && r5j.a(this.G0, d.G0) && Arrays.equals(this.H0, d.H0) && r5j.a(this.J0, d.J0) && this.I0.containsAll(d.I0) && d.I0.containsAll(this.I0)) {
            final List<PublicKeyCredentialDescriptor> k0 = this.K0;
            if (k0 != null || d.K0 != null) {
                if (k0 == null) {
                    return false;
                }
                final List<PublicKeyCredentialDescriptor> k2 = d.K0;
                if (k2 == null || !k0.containsAll(k2) || !d.K0.containsAll(this.K0)) {
                    return false;
                }
            }
            if (r5j.a(this.L0, d.L0) && r5j.a(this.M0, d.M0) && r5j.a(this.N0, d.N0) && r5j.a(this.O0, d.O0) && r5j.a(this.P0, d.P0)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0, Arrays.hashCode(this.H0), this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 2, (Parcelable)this.F0, n);
        xd.r1(parcel, 3, (Parcelable)this.G0, n);
        xd.i1(parcel, 4, this.H0);
        xd.w1(parcel, 5, this.I0);
        xd.j1(parcel, 6, this.J0);
        xd.w1(parcel, 7, this.K0);
        xd.r1(parcel, 8, (Parcelable)this.L0, n);
        xd.p1(parcel, 9, this.M0);
        xd.r1(parcel, 10, (Parcelable)this.N0, n);
        final AttestationConveyancePreference o0 = this.O0;
        String f0;
        if (o0 == null) {
            f0 = null;
        }
        else {
            f0 = o0.F0;
        }
        xd.s1(parcel, 11, f0);
        xd.r1(parcel, 12, (Parcelable)this.P0, n);
        xd.B1(parcel, x1);
    }
}
