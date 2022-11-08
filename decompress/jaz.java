import android.os.IBinder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaz implements Parcelable$Creator<plg>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Object e;
        Object o = e = null;
        Object q;
        String e2 = (String)(q = e);
        float o2 = 0.0f;
        float o3 = 0.0f;
        boolean k = false;
        boolean i = false;
        boolean j = false;
        float o4 = 0.0f;
        float o5 = 0.5f;
        float o6 = 0.0f;
        float o7 = 1.0f;
        float o8 = 0.0f;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u000f': {
                    o8 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    o7 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\r': {
                    o6 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\f': {
                    o5 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    o4 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\n': {
                    j = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\t': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\b': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u0007': {
                    o3 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o2 = SafeParcelReader.o(parcel, int1);
                    continue;
                }
                case '\u0005': {
                    q = SafeParcelReader.q(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    o = SafeParcelReader.d(parcel, int1, LatLng.CREATOR);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new plg((LatLng)o, (String)e, e2, (IBinder)q, o2, o3, k, i, j, o4, o5, o6, o7, o8);
    }
}
