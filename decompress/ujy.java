import java.util.List;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ujy implements Parcelable$Creator<qjy>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        List<ff4> list = qjy.K0;
        LocationRequest locationRequest = null;
        String e2;
        String e = e2 = null;
        boolean k = false;
        boolean i = false;
        boolean j = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                switch (c) {
                    default: {
                        SafeParcelReader.v(parcel, int1);
                        continue;
                    }
                    case 10: {
                        e2 = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 9: {
                        j = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 8: {
                        i = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 7: {
                        k = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 6: {
                        e = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 5: {
                        list = SafeParcelReader.i(parcel, int1, ff4.CREATOR);
                        continue;
                    }
                }
            }
            else {
                locationRequest = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<LocationRequest>)LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new qjy(locationRequest, (List)list, e, k, i, j, e2);
    }
    
    public final Object[] newArray(final int n) {
        return new qjy[n];
    }
}
