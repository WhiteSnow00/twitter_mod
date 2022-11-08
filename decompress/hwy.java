import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwy implements Parcelable$Creator<vry>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t = 0L;
        int r = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0002') {
                if (c != '\u0003') {
                    if (c != '\u0004') {
                        if (c != '\u0005') {
                            if (c != '\u0006') {
                                SafeParcelReader.v(parcel, int1);
                            }
                            else {
                                r4 = SafeParcelReader.r(parcel, int1);
                            }
                        }
                        else {
                            t = SafeParcelReader.t(parcel, int1);
                        }
                    }
                    else {
                        r3 = SafeParcelReader.r(parcel, int1);
                    }
                }
                else {
                    r2 = SafeParcelReader.r(parcel, int1);
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new vry(r, r2, r3, t, r4);
    }
}
