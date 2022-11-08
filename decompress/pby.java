import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pby implements Parcelable$Creator<y6g>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Status status = null;
        z6g z6g = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    z6g = (z6g)SafeParcelReader.d(parcel, int1, (Parcelable$Creator)z6g.CREATOR);
                }
            }
            else {
                status = (Status)SafeParcelReader.d(parcel, int1, (Parcelable$Creator)Status.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new y6g(status, z6g);
    }
}
