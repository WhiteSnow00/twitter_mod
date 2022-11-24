import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r5y implements Parcelable$Creator<n5y>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        bi6 bi6 = null;
        l6y l6y = null;
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
                        l6y = SafeParcelReader.d(parcel, int1, l6y.CREATOR);
                    }
                }
                else {
                    bi6 = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<bi6>)bi6.CREATOR);
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new n5y(r, bi6, l6y);
    }
    
    public final Object[] newArray(final int n) {
        return new n5y[n];
    }
}
