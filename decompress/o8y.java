import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o8y implements Parcelable$Creator<i7q>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        String e2 = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    SafeParcelReader.v(parcel, int1);
                }
                else {
                    e2 = SafeParcelReader.e(parcel, int1);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new i7q(e, e2);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new i7q[n];
    }
}
