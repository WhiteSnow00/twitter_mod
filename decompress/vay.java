import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vay extends rd implements psm
{
    public static final Parcelable$Creator<vay> CREATOR;
    public final Status D0;
    
    static {
        new vay(Status.I0);
        CREATOR = (Parcelable$Creator)new fby();
    }
    
    public vay(final Status d0) {
        this.D0 = d0;
    }
    
    public final Status l() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 1, (Parcelable)this.D0, n);
        fli.g1(parcel, d1);
    }
}
