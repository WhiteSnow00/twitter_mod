import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u6y implements Parcelable$Creator<a67>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String[] f = null;
        CredentialPickerConfig credentialPickerConfig2;
        CredentialPickerConfig credentialPickerConfig = credentialPickerConfig2 = null;
        Object e2;
        Object e = e2 = credentialPickerConfig2;
        int r = 0;
        boolean k = false;
        boolean i = false;
        boolean j = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            final char c = (char)int1;
            if (c != '\u03e8') {
                switch (c) {
                    default: {
                        SafeParcelReader.v(parcel, int1);
                        continue;
                    }
                    case 8: {
                        j = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 7: {
                        e2 = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 6: {
                        e = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 5: {
                        i = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 4: {
                        credentialPickerConfig2 = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<CredentialPickerConfig>)CredentialPickerConfig.CREATOR);
                        continue;
                    }
                    case 3: {
                        credentialPickerConfig = SafeParcelReader.d(parcel, int1, (android.os.Parcelable$Creator<CredentialPickerConfig>)CredentialPickerConfig.CREATOR);
                        continue;
                    }
                    case 2: {
                        f = SafeParcelReader.f(parcel, int1);
                        continue;
                    }
                    case 1: {
                        k = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new a67(r, k, f, credentialPickerConfig, credentialPickerConfig2, i, (String)e, (String)e2, j);
    }
    
    public final /* bridge */ Object[] newArray(final int n) {
        return new a67[n];
    }
}
