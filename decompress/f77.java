import android.os.Parcelable;
import android.os.Parcel;
import java.util.Objects;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f77 extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<f77> CREATOR;
    public final int F0;
    public final boolean G0;
    public final String[] H0;
    public final CredentialPickerConfig I0;
    public final CredentialPickerConfig J0;
    public final boolean K0;
    public final String L0;
    public final String M0;
    public final boolean N0;
    
    static {
        CREATOR = (Parcelable$Creator)new o7y();
    }
    
    public f77(final int f0, final boolean g0, final String[] h0, final CredentialPickerConfig credentialPickerConfig, final CredentialPickerConfig credentialPickerConfig2, final boolean k0, final String l0, final String m0, final boolean n0) {
        this.F0 = f0;
        this.G0 = g0;
        Objects.requireNonNull(h0, "null reference");
        this.H0 = h0;
        CredentialPickerConfig i0 = credentialPickerConfig;
        if (credentialPickerConfig == null) {
            i0 = new CredentialPickerConfig(2, false, true, false, 1);
        }
        this.I0 = i0;
        CredentialPickerConfig j0;
        if ((j0 = credentialPickerConfig2) == null) {
            j0 = new CredentialPickerConfig(2, false, true, false, 1);
        }
        this.J0 = j0;
        if (f0 < 3) {
            this.K0 = true;
            this.L0 = null;
            this.M0 = null;
        }
        else {
            this.K0 = k0;
            this.L0 = l0;
            this.M0 = m0;
        }
        this.N0 = n0;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.e1(parcel, 1, this.G0);
        xd.t1(parcel, 2, this.H0);
        xd.r1(parcel, 3, (Parcelable)this.I0, n);
        xd.r1(parcel, 4, (Parcelable)this.J0, n);
        xd.e1(parcel, 5, this.K0);
        xd.s1(parcel, 6, this.L0);
        xd.s1(parcel, 7, this.M0);
        xd.e1(parcel, 8, this.N0);
        xd.n1(parcel, 1000, this.F0);
        xd.B1(parcel, x1);
    }
}
