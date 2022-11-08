import java.io.Serializable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moz implements Parcelable$Creator
{
    public static void a(final koz koz, final Parcel parcel) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, koz.C0);
        ri4.s0(parcel, 2, koz.D0);
        ri4.q0(parcel, 3, koz.E0);
        final Long f0 = koz.F0;
        if (f0 != null) {
            parcel.writeInt(524292);
            parcel.writeLong((long)f0);
        }
        ri4.s0(parcel, 6, koz.G0);
        ri4.s0(parcel, 7, koz.H0);
        ri4.j0(parcel, 8, koz.I0);
        ri4.A0(parcel, x0);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Number value;
        Serializable e = value = null;
        Serializable e2;
        Number p = (Number)(e2 = value);
        Serializable n;
        String e3 = (String)(n = e2);
        long t = 0L;
        int r = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\b': {
                    n = SafeParcelReader.n(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    e3 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    e2 = SafeParcelReader.e(parcel, int1);
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
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new koz(r, (String)e, t, (Long)value, (Float)p, (String)e2, e3, (Double)n);
    }
}
