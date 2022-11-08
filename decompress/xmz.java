import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xmz implements Parcelable$Creator<rh6>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Object o = null;
        Object c2;
        Object c = c2 = o;
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
                    o = SafeParcelReader.d(parcel, int1, wjo.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new rh6((wjo)o, k, i, (int[])c, r, (int[])c2);
    }
}
