// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public class MediaBrowserCompat$MediaItem implements Parcelable
{
    public static final Parcelable$Creator<MediaBrowserCompat$MediaItem> CREATOR;
    public final int F0;
    public final MediaDescriptionCompat G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaBrowserCompat$MediaItem>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new MediaBrowserCompat$MediaItem(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new MediaBrowserCompat$MediaItem[n];
            }
        };
    }
    
    public MediaBrowserCompat$MediaItem(final Parcel parcel) {
        this.F0 = parcel.readInt();
        this.G0 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("MediaItem{", "mFlags=");
        j.append(this.F0);
        j.append(", mDescription=");
        j.append(this.G0);
        j.append('}');
        return j.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        this.G0.writeToParcel(parcel, n);
    }
}
