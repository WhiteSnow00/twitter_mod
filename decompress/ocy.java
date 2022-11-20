import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocy implements Parcelable$Creator<n6g>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        boolean k = false;
        boolean i = false;
        boolean j = false;
        boolean l = false;
        boolean m = false;
        boolean k2 = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    k2 = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    m = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    l = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    j = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new n6g(k, i, j, l, m, k2);
    }
    
    public final Object[] newArray(final int n) {
        return new n6g[n];
    }
}
