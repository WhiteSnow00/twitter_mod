import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rby implements Parcelable$Creator<jby>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = "";
        String e2 = "";
        String e3 = "";
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0005') {
                        SafeParcelReader.v(parcel, int1);
                    }
                    else {
                        e = SafeParcelReader.e(parcel, int1);
                    }
                }
                else {
                    e3 = SafeParcelReader.e(parcel, int1);
                }
            }
            else {
                e2 = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new jby(e, e2, e3);
    }
    
    public final Object[] newArray(final int n) {
        return new jby[n];
    }
}
