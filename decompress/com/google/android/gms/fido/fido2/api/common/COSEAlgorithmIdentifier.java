// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class COSEAlgorithmIdentifier implements Parcelable
{
    public static final Parcelable$Creator<COSEAlgorithmIdentifier> CREATOR;
    public a D0;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public COSEAlgorithmIdentifier(final a d0) {
        this.D0 = d0;
    }
    
    public static COSEAlgorithmIdentifier a(final int n) throws UnsupportedAlgorithmIdentifierException {
        if (n != -262) {
            final bwl[] values = bwl.values();
            final int length = values.length;
            final int n2 = 0;
            for (final Object e0 : values) {
                if (((bwl)e0).D0 == n) {
                    return new COSEAlgorithmIdentifier((a)e0);
                }
            }
            final mo9[] values2 = mo9.values();
            for (int length2 = values2.length, j = n2; j < length2; ++j) {
                final Object e0 = values2[j];
                if (((mo9)e0).D0 == n) {
                    return new COSEAlgorithmIdentifier((a)e0);
                }
            }
            throw new UnsupportedAlgorithmIdentifierException(n);
        }
        Object e0 = bwl.E0;
        return new COSEAlgorithmIdentifier((a)e0);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof COSEAlgorithmIdentifier && this.D0.b() == ((COSEAlgorithmIdentifier)o).D0.b();
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.D0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.D0.b());
    }
    
    public static class UnsupportedAlgorithmIdentifierException extends Exception
    {
        public UnsupportedAlgorithmIdentifierException(final int n) {
            final StringBuilder sb = new StringBuilder(51);
            sb.append("Algorithm with COSE value ");
            sb.append(n);
            sb.append(" not supported");
            super(sb.toString());
        }
    }
}
