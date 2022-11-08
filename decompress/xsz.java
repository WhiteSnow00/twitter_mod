import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xsz implements Parcelable$Creator<upz>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        List i = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            if ((char)int1 != '\u0001') {
                SafeParcelReader.v(parcel, int1);
            }
            else {
                i = SafeParcelReader.i(parcel, int1, (Parcelable$Creator)ymz.CREATOR);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new upz(i);
    }
}
