import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itz implements Parcelable$Creator<trz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        IBinder q = null;
        boolean k = false;
        boolean i = false;
        boolean j = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            if (c != '\u0005') {
                                SafeParcelReader.v(parcel, int1);
                            }
                            else {
                                j = SafeParcelReader.k(parcel, int1);
                            }
                        }
                        else {
                            q = SafeParcelReader.q(parcel, int1);
                        }
                    }
                    else {
                        i = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    k = SafeParcelReader.k(parcel, int1);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new trz(e, k, i, q, j);
    }
    
    public final Object[] newArray(final int n) {
        return new trz[n];
    }
}
