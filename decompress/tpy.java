import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpy implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t2;
        long t = t2 = 0L;
        String e = null;
        String e3;
        String e2 = e3 = e;
        String e4;
        Object a = e4 = e3;
        boolean k = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\b': {
                    e4 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    a = SafeParcelReader.a(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    t2 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new ppy(t, t2, k, e, e2, e3, (Bundle)a, e4);
    }
}
