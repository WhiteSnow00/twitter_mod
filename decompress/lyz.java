import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyz implements Parcelable$Creator<kxz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        boolean k = false;
        String e = null;
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
                        r = SafeParcelReader.r(parcel, int1);
                    }
                }
                else {
                    e = SafeParcelReader.e(parcel, int1);
                }
            }
            else {
                k = SafeParcelReader.k(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new kxz(k, e, r);
    }
    
    public final Object[] newArray(final int n) {
        return new kxz[n];
    }
}
