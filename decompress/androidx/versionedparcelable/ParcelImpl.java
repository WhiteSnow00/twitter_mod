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
    public final xrw C0;
    
    static {
        CREATOR = (Parcelable$Creator)new ParcelImpl$a();
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.C0 = new wrw(parcel).o();
    }
    
    public ParcelImpl(final xrw c0) {
        this.C0 = c0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        new wrw(parcel).y(this.C0);
    }
}
