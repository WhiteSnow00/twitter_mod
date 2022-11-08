import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6y implements Parcelable$Creator<tro>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.v(parcel, int1);
            }
            else {
                pendingIntent = (PendingIntent)SafeParcelReader.d(parcel, int1, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new tro(pendingIntent);
    }
}
