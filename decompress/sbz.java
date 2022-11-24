import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.c;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sbz implements Parcelable$Creator<c>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String e = null;
        Boolean l = null;
        String e2 = null;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0002') {
                if (c != '\u0003') {
                    if (c != '\u0004') {
                        SafeParcelReader.v(parcel, int1);
                    }
                    else {
                        e2 = SafeParcelReader.e(parcel, int1);
                    }
                }
                else {
                    l = SafeParcelReader.l(parcel, int1);
                }
            }
            else {
                e = SafeParcelReader.e(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new c(e, l, e2);
    }
    
    public final Object[] newArray(final int n) {
        return new c[n];
    }
}
