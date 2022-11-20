import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y8y implements Parcelable$Creator<CameraPosition>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        float o = 0.0f;
        LatLng latLng = null;
        float o2 = 0.0f;
        float o3 = 0.0f;
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
                            o3 = SafeParcelReader.o(parcel, int1);
                        }
                    }
                    else {
                        o2 = SafeParcelReader.o(parcel, int1);
                    }
                }
                else {
                    o = SafeParcelReader.o(parcel, int1);
                }
            }
            else {
                latLng = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<LatLng>)LatLng.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new CameraPosition(latLng, o, o2, o3);
    }
    
    public final Object[] newArray(final int n) {
        return new CameraPosition[n];
    }
}
