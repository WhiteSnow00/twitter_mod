import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fby implements Parcelable$Creator<vay>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Status status = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.v(parcel, int1);
            }
            else {
                status = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Status>)Status.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new vay(status);
    }
    
    public final Object[] newArray(final int n) {
        return new vay[n];
    }
}
