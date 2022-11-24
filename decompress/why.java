import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class why implements Parcelable$Creator
{
    public static void a(final rhy rhy, final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 2, rhy.F0);
        xd.r1(parcel, 3, (Parcelable)rhy.G0, n);
        xd.s1(parcel, 4, rhy.H0);
        xd.q1(parcel, 5, rhy.I0);
        xd.B1(parcel, x1);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        String e2;
        Object o = e2 = null;
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
                    o = SafeParcelReader.d(parcel, int1, fhy.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new rhy(e, (fhy)o, e2, t);
    }
    
    public final Object[] newArray(final int n) {
        return new rhy[n];
    }
}
