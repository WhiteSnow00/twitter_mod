import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o9y implements Parcelable$Creator
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        byte[] b = null;
        boolean k = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    k = SafeParcelReader.k(parcel, int1);
                }
            }
            else {
                b = SafeParcelReader.b(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new yir(b, k);
    }
    
    public final Object[] newArray(final int n) {
        return new yir[n];
    }
}
