import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgy implements Parcelable$Creator
{
    public static void a(final hgy hgy, final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.s0(parcel, 2, hgy.C0);
        ri4.r0(parcel, 3, (Parcelable)hgy.D0, n);
        ri4.s0(parcel, 4, hgy.E0);
        ri4.q0(parcel, 5, hgy.F0);
        ri4.A0(parcel, x0);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        String e2;
        Object o = e2 = e;
        long t = 0L;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0002') {
                if (c != '\u0003') {
                    if (c != '\u0004') {
                        if (c != '\u0005') {
                            SafeParcelReader.v(parcel, int1);
                        }
                        else {
                            t = SafeParcelReader.t(parcel, int1);
                        }
                    }
                    else {
                        e2 = SafeParcelReader.e(parcel, int1);
                    }
                }
                else {
                    o = SafeParcelReader.d(parcel, int1, vfy.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new hgy(e, (vfy)o, e2, t);
    }
}
