import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9y implements Parcelable$Creator<LocationAvailability>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t = 0L;
        gcy[] array = null;
        int r = 1000;
        int r2 = 1;
        int r3 = 1;
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
                                array = (gcy[])SafeParcelReader.h(parcel, int1, gcy.CREATOR);
                            }
                        }
                        else {
                            r = SafeParcelReader.r(parcel, int1);
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
        SafeParcelReader.j(parcel, w);
        return new LocationAvailability(r, r2, r3, t, array);
    }
}
