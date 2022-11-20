import java.util.List;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yby implements Parcelable$Creator<l6g>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        boolean k = false;
        List<Object> i = null;
        jby jby = null;
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
                            jby = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<jby>)jby.CREATOR);
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
        return new l6g((List)i, k, j, jby);
    }
    
    public final Object[] newArray(final int n) {
        return new l6g[n];
    }
}
