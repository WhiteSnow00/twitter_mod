import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0y extends sd implements xrm
{
    public static final Parcelable$Creator<k0y> CREATOR;
    public final int C0;
    public int D0;
    public Intent E0;
    
    static {
        CREATOR = (Parcelable$Creator)new j1y();
    }
    
    public k0y() {
        this.C0 = 2;
        this.D0 = 0;
        this.E0 = null;
    }
    
    public k0y(final int c0, final int d0, final Intent e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Status l() {
        if (this.D0 == 0) {
            return Status.H0;
        }
        return Status.L0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.n0(parcel, 2, this.D0);
        ri4.r0(parcel, 3, (Parcelable)this.E0, n);
        ri4.A0(parcel, x0);
    }
}
