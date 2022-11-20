import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chy implements Parcelable$Creator
{
    public static void a(final wgy wgy, final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 2, wgy.D0);
        fli.X0(parcel, 3, (Parcelable)wgy.E0, n);
        fli.Y0(parcel, 4, wgy.F0);
        fli.W0(parcel, 5, wgy.G0);
        fli.g1(parcel, d1);
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
                    o = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<kgy>)kgy.CREATOR);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new wgy(e, (kgy)o, e2, t);
    }
    
    public final Object[] newArray(final int n) {
        return new wgy[n];
    }
}
