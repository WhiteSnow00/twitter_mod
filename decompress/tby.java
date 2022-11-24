import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tby implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t = 0L;
        long t3;
        long t2 = t3 = 0L;
        String e = null;
        Object o;
        Object e2 = o = null;
        Object o2;
        Object e3 = o2 = o;
        Object o3;
        rhy rhy = (rhy)(o3 = o2);
        boolean k = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\f': {
                    o3 = SafeParcelReader.d(parcel, int1, rhy.CREATOR);
                    continue;
                }
                case '\u000b': {
                    t3 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\n': {
                    rhy = SafeParcelReader.d(parcel, int1, rhy.CREATOR);
                    continue;
                }
                case '\t': {
                    t2 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\b': {
                    o2 = SafeParcelReader.d(parcel, int1, rhy.CREATOR);
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
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<xpz>)xpz.CREATOR);
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
        return new kby(e, (String)e2, (xpz)o, t, k, (String)e3, (rhy)o2, t2, rhy, t3, (rhy)o3);
    }
    
    public final Object[] newArray(final int n) {
        return new kby[n];
    }
}
