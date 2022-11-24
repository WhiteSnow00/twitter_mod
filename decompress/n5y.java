import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n5y extends sd
{
    public static final Parcelable$Creator<n5y> CREATOR;
    public final int F0;
    public final bi6 G0;
    public final l6y H0;
    
    static {
        CREATOR = (Parcelable$Creator)new r5y();
    }
    
    public n5y(final int f0, final bi6 g0, final l6y h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.r1(parcel, 2, (Parcelable)this.G0, n);
        xd.r1(parcel, 3, (Parcelable)this.H0, n);
        xd.B1(parcel, x1);
    }
}
