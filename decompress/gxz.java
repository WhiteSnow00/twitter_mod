import java.io.Serializable;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxz implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = "";
        String e2 = "";
        long t = 0L;
        long t3;
        long t2 = t3 = 0L;
        long t5;
        long t4 = t5 = t3;
        String e3 = null;
        Object e5;
        Object e4 = e5 = null;
        Object e7;
        String e6 = (String)(e7 = e5);
        Object e9;
        String e8 = (String)(e9 = e7);
        Object g;
        Serializable l = (Serializable)(g = e9);
        Object e11;
        Object e10 = e11 = g;
        long t6 = -2147483648L;
        boolean k = true;
        boolean i = false;
        int r = 0;
        boolean j = true;
        boolean m = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u001b': {
                    e11 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u001a': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0019': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0018': {
                    e10 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0017': {
                    g = SafeParcelReader.g(parcel, int1);
                    continue;
                }
                case '\u0016': {
                    t5 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0015': {
                    l = SafeParcelReader.l(parcel, int1);
                    continue;
                }
                case '\u0013': {
                    e9 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0012': {
                    m = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0010': {
                    j = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u000f': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    t4 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\r': {
                    t3 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\f': {
                    e8 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    t6 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\n': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\t': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\b': {
                    e7 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    t2 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    e6 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    e5 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    e4 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new twz(e3, (String)e4, (String)e5, e6, t, t2, (String)e7, k, i, t6, e8, t3, t4, r, j, m, (String)e9, (Boolean)l, t5, (List)g, (String)e10, e, e2, (String)e11);
    }
    
    public final Object[] newArray(final int n) {
        return new twz[n];
    }
}
