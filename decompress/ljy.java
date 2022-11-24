import android.app.PendingIntent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljy implements Parcelable$Creator<bi6>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        PendingIntent pendingIntent = null;
        String e = null;
        int r = 0;
        int r2 = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            SafeParcelReader.v(parcel, int1);
                        }
                        else {
                            e = SafeParcelReader.e(parcel, int1);
                        }
                    }
                    else {
                        pendingIntent = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<PendingIntent>)PendingIntent.CREATOR);
                    }
                }
                else {
                    r2 = SafeParcelReader.r(parcel, int1);
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new bi6(r, r2, pendingIntent, e);
    }
    
    public final Object[] newArray(final int n) {
        return new bi6[n];
    }
}
