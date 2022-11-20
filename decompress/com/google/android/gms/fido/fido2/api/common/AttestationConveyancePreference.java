// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public enum AttestationConveyancePreference implements Parcelable
{
    public static final Parcelable$Creator<AttestationConveyancePreference> CREATOR;
    
    E0("none"), 
    F0("indirect"), 
    G0("direct");
    
    public static final AttestationConveyancePreference[] H0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    public AttestationConveyancePreference(final String d0) {
        this.D0 = d0;
    }
    
    public static AttestationConveyancePreference b(final String s) throws UnsupportedAttestationConveyancePreferenceException {
        for (final AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (s.equals(attestationConveyancePreference.D0)) {
                return attestationConveyancePreference;
            }
        }
        throw new UnsupportedAttestationConveyancePreferenceException(s);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
    }
    
    public static class UnsupportedAttestationConveyancePreferenceException extends Exception
    {
        public UnsupportedAttestationConveyancePreferenceException(final String s) {
            super(String.format("Attestation conveyance preference %s not supported", s));
        }
    }
}
