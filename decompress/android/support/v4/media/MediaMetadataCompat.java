// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.support.v4.media.session.MediaSessionCompat;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({ "BanParcelableUsage" })
public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator<MediaMetadataCompat> CREATOR;
    public static final ws0<String, Integer> G0;
    public final Bundle F0;
    
    static {
        final ws0<String, Integer> ws0 = G0 = new ws0<String, Integer>();
        final Integer value = 1;
        ws0.put((Object)"android.media.metadata.TITLE", (Object)value);
        ws0.put((Object)"android.media.metadata.ARTIST", (Object)value);
        final Integer value2 = 0;
        ws0.put((Object)"android.media.metadata.DURATION", (Object)value2);
        ws0.put((Object)"android.media.metadata.ALBUM", (Object)value);
        ws0.put((Object)"android.media.metadata.AUTHOR", (Object)value);
        ws0.put((Object)"android.media.metadata.WRITER", (Object)value);
        ws0.put((Object)"android.media.metadata.COMPOSER", (Object)value);
        ws0.put((Object)"android.media.metadata.COMPILATION", (Object)value);
        ws0.put((Object)"android.media.metadata.DATE", (Object)value);
        ws0.put((Object)"android.media.metadata.YEAR", (Object)value2);
        ws0.put((Object)"android.media.metadata.GENRE", (Object)value);
        ws0.put((Object)"android.media.metadata.TRACK_NUMBER", (Object)value2);
        ws0.put((Object)"android.media.metadata.NUM_TRACKS", (Object)value2);
        ws0.put((Object)"android.media.metadata.DISC_NUMBER", (Object)value2);
        ws0.put((Object)"android.media.metadata.ALBUM_ARTIST", (Object)value);
        final Integer value3 = 2;
        ws0.put((Object)"android.media.metadata.ART", (Object)value3);
        ws0.put((Object)"android.media.metadata.ART_URI", (Object)value);
        ws0.put((Object)"android.media.metadata.ALBUM_ART", (Object)value3);
        ws0.put((Object)"android.media.metadata.ALBUM_ART_URI", (Object)value);
        final Integer value4 = 3;
        ws0.put((Object)"android.media.metadata.USER_RATING", (Object)value4);
        ws0.put((Object)"android.media.metadata.RATING", (Object)value4);
        ws0.put((Object)"android.media.metadata.DISPLAY_TITLE", (Object)value);
        ws0.put((Object)"android.media.metadata.DISPLAY_SUBTITLE", (Object)value);
        ws0.put((Object)"android.media.metadata.DISPLAY_DESCRIPTION", (Object)value);
        ws0.put((Object)"android.media.metadata.DISPLAY_ICON", (Object)value3);
        ws0.put((Object)"android.media.metadata.DISPLAY_ICON_URI", (Object)value);
        ws0.put((Object)"android.media.metadata.MEDIA_ID", (Object)value);
        ws0.put((Object)"android.media.metadata.BT_FOLDER_TYPE", (Object)value2);
        ws0.put((Object)"android.media.metadata.MEDIA_URI", (Object)value);
        ws0.put((Object)"android.media.metadata.ADVERTISEMENT", (Object)value2);
        ws0.put((Object)"android.media.metadata.DOWNLOAD_STATUS", (Object)value2);
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaMetadataCompat>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new MediaMetadataCompat[n];
            }
        };
    }
    
    public MediaMetadataCompat(final Parcel parcel) {
        this.F0 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.F0);
    }
}
