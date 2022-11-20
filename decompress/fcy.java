import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcy implements Parcelable$Creator<m6g>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Status status = null;
        n6g n6g = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    n6g = SafeParcelReader.d(parcel, int1, n6g.CREATOR);
                }
            }
            else {
                status = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<Status>)Status.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new m6g(status, n6g);
    }
    
    public final Object[] newArray(final int n) {
        return new m6g[n];
    }
}
