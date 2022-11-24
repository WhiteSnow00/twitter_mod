import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1y implements Parcelable$Creator<kg4>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        int r = 0;
        String e = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    e = SafeParcelReader.e(parcel, int1);
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new kg4(r, e);
    }
    
    public final Object[] newArray(final int n) {
        return new kg4[n];
    }
}
