import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8y extends rd
{
    public static final Parcelable$Creator<g8y> CREATOR;
    public final Credential D0;
    
    static {
        CREATOR = (Parcelable$Creator)new i8y();
    }
    
    public g8y(final Credential d0) {
        this.D0 = d0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 1, (Parcelable)this.D0, n);
        fli.g1(parcel, d1);
    }
}
