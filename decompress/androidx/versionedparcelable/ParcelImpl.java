// 
// Decompiled by Procyon v0.6.0
// 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator<ParcelImpl> CREATOR;
    public final qsw D0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelImpl>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ParcelImpl(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ParcelImpl[n];
            }
        };
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.D0 = ((VersionedParcel)new psw(parcel)).o();
    }
    
    public ParcelImpl(final qsw d0) {
        this.D0 = d0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ((VersionedParcel)new psw(parcel)).y(this.D0);
    }
}
