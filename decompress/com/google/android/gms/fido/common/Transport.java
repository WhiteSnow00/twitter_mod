// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable
{
    public static final Parcelable$Creator<Transport> CREATOR;
    public final String C0;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public Transport(final String c0) {
        this.C0 = c0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
    }
}
