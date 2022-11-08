import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h4y implements Parcelable$Creator<d4y>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        ph6 ph6 = null;
        b5y b5y = null;
        int r = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        SafeParcelReader.v(parcel, int1);
                    }
                    else {
                        b5y = (b5y)SafeParcelReader.d(parcel, int1, b5y.CREATOR);
                    }
                }
                else {
                    ph6 = (ph6)SafeParcelReader.d(parcel, int1, ph6.CREATOR);
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new d4y(r, ph6, b5y);
    }
}
