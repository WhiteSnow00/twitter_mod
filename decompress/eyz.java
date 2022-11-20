import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyz implements Parcelable$Creator<dxz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        mrz[] array = null;
        Object o2;
        Object o = o2 = null;
        Object e2;
        Object e = e2 = o2;
        float o3 = 0.0f;
        boolean k = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\b': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o3 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    o2 = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<t1z>)t1z.CREATOR);
                    continue;
                }
                case '\u0003': {
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<t1z>)t1z.CREATOR);
                    continue;
                }
                case '\u0002': {
                    array = SafeParcelReader.h(parcel, int1, mrz.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new dxz(array, (t1z)o, (t1z)o2, (String)e, o3, (String)e2, k);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new dxz[n];
    }
}
