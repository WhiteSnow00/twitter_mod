import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r2z extends sd
{
    public static final Parcelable$Creator<r2z> CREATOR;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final float J0;
    
    static {
        CREATOR = (Parcelable$Creator)new f7z();
    }
    
    public r2z(final int f0, final int g0, final int h0, final int i0, final float j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 2, this.F0);
        xd.n1(parcel, 3, this.G0);
        xd.n1(parcel, 4, this.H0);
        xd.n1(parcel, 5, this.I0);
        xd.k1(parcel, 6, this.J0);
        xd.B1(parcel, x1);
    }
}
