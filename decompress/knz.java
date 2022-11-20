import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knz implements Parcelable$Creator<xg6>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        kko kko = null;
        int[] c2;
        int[] c = c2 = null;
        boolean k = false;
        boolean i = false;
        int r = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    c2 = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    c = SafeParcelReader.c(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    kko = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<kko>)kko.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new xg6(kko, k, i, c, r, c2);
    }
    
    public final Object[] newArray(final int n) {
        return new xg6[n];
    }
}
