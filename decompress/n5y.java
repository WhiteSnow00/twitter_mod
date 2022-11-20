import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n5y extends rd
{
    public static final Parcelable$Creator<n5y> CREATOR;
    public final int D0;
    public final Account E0;
    public final int F0;
    public final GoogleSignInAccount G0;
    
    static {
        CREATOR = (Parcelable$Creator)new p5y();
    }
    
    public n5y(final int d0, final Account e0, final int f0, final GoogleSignInAccount g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public n5y(final Account e0, final int f0, final GoogleSignInAccount g0) {
        this.D0 = 2;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.X0(parcel, 2, (Parcelable)this.E0, n);
        fli.T0(parcel, 3, this.F0);
        fli.X0(parcel, 4, (Parcelable)this.G0, n);
        fli.g1(parcel, d1);
    }
}
