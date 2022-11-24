import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rrz extends sd
{
    public static final Parcelable$Creator<rrz> CREATOR;
    public final String F0;
    public final List<pqz> G0;
    
    static {
        CREATOR = (Parcelable$Creator)new srz();
    }
    
    public rrz(final String f0, final List<pqz> g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 1, this.F0);
        xd.w1(parcel, 2, this.G0);
        xd.B1(parcel, x1);
    }
}
