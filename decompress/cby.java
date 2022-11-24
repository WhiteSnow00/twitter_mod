import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cby implements Parcelable$Creator<LocationRequest>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        long t = 3600000L;
        long t2 = 600000L;
        long t3 = Long.MAX_VALUE;
        long t4 = 0L;
        int r = 102;
        boolean k = false;
        int r2 = Integer.MAX_VALUE;
        float o = 0.0f;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\b': {
                    t4 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    o = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    r2 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    t3 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    t2 = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    t = SafeParcelReader.t(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new LocationRequest(r, t, t2, k, t3, r2, o, t4);
    }
    
    public final Object[] newArray(final int n) {
        return new LocationRequest[n];
    }
}
