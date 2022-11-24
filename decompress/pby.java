import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pby extends sd implements etm
{
    public static final Parcelable$Creator<pby> CREATOR;
    public final Status F0;
    
    static {
        new pby(Status.K0);
        CREATOR = (Parcelable$Creator)new zby();
    }
    
    public pby(final Status f0) {
        this.F0 = f0;
    }
    
    public final Status k() {
        return this.F0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 1, (Parcelable)this.F0, n);
        xd.B1(parcel, x1);
    }
}
