import java.util.List;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class scy implements Parcelable$Creator<g7g>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        boolean k = false;
        Object i = null;
        dcy dcy = null;
        boolean j = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0005') {
                            SafeParcelReader.v(parcel, int1);
                        }
                        else {
                            dcy = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<dcy>)dcy.CREATOR);
                        }
                    }
                    else {
                        j = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    k = SafeParcelReader.k(parcel, int1);
                }
            }
            else {
                i = SafeParcelReader.i(parcel, int1, (android.os.Parcelable$Creator<Object>)LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new g7g((List<LocationRequest>)i, k, j, dcy);
    }
    
    public final Object[] newArray(final int n) {
        return new g7g[n];
    }
}
