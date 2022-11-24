// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public class ParcelableVolumeInfo implements Parcelable
{
    public static final Parcelable$Creator<ParcelableVolumeInfo> CREATOR;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ParcelableVolumeInfo>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new ParcelableVolumeInfo(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new ParcelableVolumeInfo[n];
            }
        };
    }
    
    public ParcelableVolumeInfo(final Parcel parcel) {
        this.F0 = parcel.readInt();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readInt();
        this.G0 = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeInt(this.J0);
        parcel.writeInt(this.G0);
    }
}
