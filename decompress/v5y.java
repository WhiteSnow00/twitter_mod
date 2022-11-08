import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5y implements Parcelable$Creator<CredentialPickerConfig>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        int r = 0;
        boolean k = false;
        boolean i = false;
        boolean j = false;
        int r2 = 0;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u0001') {
                if (c != '\u0002') {
                    if (c != '\u0003') {
                        if (c != '\u0004') {
                            if (c != '\u03e8') {
                                SafeParcelReader.v(parcel, int1);
                            }
                            else {
                                r = SafeParcelReader.r(parcel, int1);
                            }
                        }
                        else {
                            r2 = SafeParcelReader.r(parcel, int1);
                        }
                    }
                    else {
                        j = SafeParcelReader.k(parcel, int1);
                    }
                }
                else {
                    i = SafeParcelReader.k(parcel, int1);
                }
            }
            else {
                k = SafeParcelReader.k(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new CredentialPickerConfig(r, k, i, j, r2);
    }
}
