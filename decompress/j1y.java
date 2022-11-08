import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j1y implements Parcelable$Creator<k0y>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        int r = 0;
        Intent intent = null;
        int r2 = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        SafeParcelReader.v(parcel, int1);
                    }
                    else {
                        intent = (Intent)SafeParcelReader.d(parcel, int1, Intent.CREATOR);
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
        return new k0y(r, r2, intent);
    }
}
