import android.os.Parcelable;
import java.util.Collections;
import android.os.Parcel;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7g extends sd
{
    public static final Parcelable$Creator<g7g> CREATOR;
    public final List<LocationRequest> F0;
    public final boolean G0;
    public final boolean H0;
    public dcy I0;
    
    static {
        CREATOR = (Parcelable$Creator)new scy();
    }
    
    public g7g(final List<LocationRequest> f0, final boolean g0, final boolean h0, final dcy i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.w1(parcel, 1, Collections.unmodifiableList((List<?>)this.F0));
        xd.e1(parcel, 2, this.G0);
        xd.e1(parcel, 3, this.H0);
        xd.r1(parcel, 5, (Parcelable)this.I0, n);
        xd.B1(parcel, x1);
    }
}
