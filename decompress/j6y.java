import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.HintRequest;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j6y implements Parcelable$Creator<HintRequest>
{
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        String[] f;
        Object o = f = null;
        Object e2;
        Object e = e2 = f;
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
                    case 7: {
                        e2 = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 6: {
                        e = SafeParcelReader.e(parcel, int1);
                        continue;
                    }
                    case 5: {
                        j = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 4: {
                        f = SafeParcelReader.f(parcel, int1);
                        continue;
                    }
                    case 3: {
                        i = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 2: {
                        k = SafeParcelReader.k(parcel, int1);
                        continue;
                    }
                    case 1: {
                        o = SafeParcelReader.d(parcel, int1, (Parcelable$Creator)CredentialPickerConfig.CREATOR);
                        continue;
                    }
                }
            }
            else {
                r = SafeParcelReader.r(parcel, int1);
            }
        }
        SafeParcelReader.j(parcel, w);
        return new HintRequest(r, (CredentialPickerConfig)o, k, i, f, j, (String)e, (String)e2);
    }
}
