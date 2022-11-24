import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k6c extends sd
{
    public static final Parcelable$Creator<k6c> CREATOR;
    public final int F0;
    public int G0;
    public Bundle H0;
    
    static {
        CREATOR = (Parcelable$Creator)new q1y();
    }
    
    public k6c(final int f0, final int g0, final Bundle h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.n1(parcel, 2, this.G0);
        xd.g1(parcel, 3, this.H0);
        xd.B1(parcel, x1);
    }
}
