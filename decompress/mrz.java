import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrz implements Parcelable$Creator<qoz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        cyz[] array = null;
        Object o = null;
        Object o2;
        r2z r2z = (r2z)(o2 = o);
        Object e2;
        Object e = e2 = o2;
        float o3 = 0.0f;
        int r = 0;
        boolean k = false;
        int r2 = 0;
        int r3 = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\f': {
                    r3 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    r2 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\n': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\t': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\b': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    o3 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    o2 = SafeParcelReader.d(parcel, int1, r2z.CREATOR);
                    continue;
                }
                case '\u0004': {
                    r2z = SafeParcelReader.d(parcel, int1, r2z.CREATOR);
                    continue;
                }
                case '\u0003': {
                    o = SafeParcelReader.d(parcel, int1, r2z.CREATOR);
                    continue;
                }
                case '\u0002': {
                    array = SafeParcelReader.h(parcel, int1, (android.os.Parcelable$Creator<cyz>)cyz.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new qoz(array, (r2z)o, r2z, (r2z)o2, (String)e, o3, (String)e2, r, k, r2, r3);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new qoz[n];
    }
}
