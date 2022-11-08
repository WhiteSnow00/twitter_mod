import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jay implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t = 0L;
        long t3;
        long t2 = t3 = t;
        Object e = null;
        Object o;
        String e2 = (String)(o = e);
        Object o2;
        Object e3 = o2 = o;
        Object o3;
        hgy hgy = (hgy)(o3 = o2);
        boolean k = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\f': {
                    o3 = SafeParcelReader.d(parcel, int1, hgy.CREATOR);
                    continue;
                }
                case '\u000b': {
                    t3 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\n': {
                    hgy = (hgy)SafeParcelReader.d(parcel, int1, hgy.CREATOR);
                    continue;
                }
                case '\t': {
                    t2 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\b': {
                    o2 = SafeParcelReader.d(parcel, int1, hgy.CREATOR);
                    continue;
                }
                case '\u0007': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    o = SafeParcelReader.d(parcel, int1, (Parcelable$Creator)koz.CREATOR);
                    continue;
                }
                case '\u0003': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new aay((String)e, e2, (koz)o, t, k, (String)e3, (hgy)o2, t2, hgy, t3, (hgy)o3);
    }
}
