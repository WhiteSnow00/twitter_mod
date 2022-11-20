// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a implements Parcelable$Creator<Transport>
{
    public final Object createFromParcel(final Parcel parcel) {
        final String string = parcel.readString();
        try {
            for (final Transport transport : Transport.values()) {
                if (string.equals(transport.D0)) {
                    return transport;
                }
            }
            throw new Transport.UnsupportedTransportException(String.format("Transport %s not supported", string));
        }
        catch (final Transport.UnsupportedTransportException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final Object[] newArray(final int n) {
        return new Transport[n];
    }
}
