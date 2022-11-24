import java.io.Serializable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpz implements Parcelable$Creator
{
    public static void a(final xpz xpz, final Parcel parcel) {
        final int x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, xpz.F0);
        xd.s1(parcel, 2, xpz.G0);
        xd.q1(parcel, 3, xpz.H0);
        final Long i0 = xpz.I0;
        if (i0 != null) {
            parcel.writeInt(524292);
            parcel.writeLong((long)i0);
        }
        xd.s1(parcel, 6, xpz.J0);
        xd.s1(parcel, 7, xpz.K0);
        xd.j1(parcel, 8, xpz.L0);
        xd.B1(parcel, x1);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        final String s = null;
        final Double n = null;
        Serializable e;
        final Double n2 = (Double)(e = n);
        Serializable n3;
        String e2 = (String)(n3 = e);
        long t = 0L;
        int r = 0;
        Number p = n2;
        Number value = n;
        String e3 = s;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\b': {
                    n3 = SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    p = SafeParcelReader.p(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    final int u = SafeParcelReader.u(parcel, int1);
                    if (u == 0) {
                        value = null;
                        continue;
                    }
                    SafeParcelReader.x(parcel, u, 8);
                    value = parcel.readLong();
                    continue;
                }
                case '\u0003': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new xpz(r, e3, t, (Long)value, (Float)p, (String)e, e2, (Double)n3);
    }
    
    public final Object[] newArray(final int n) {
        return new xpz[n];
    }
}
