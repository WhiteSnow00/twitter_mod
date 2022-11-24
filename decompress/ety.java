import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ety extends sd
{
    public static final Parcelable$Creator<ety> CREATOR;
    public int F0;
    public int G0;
    public int H0;
    public long I0;
    public int J0;
    
    static {
        CREATOR = (Parcelable$Creator)new sxy();
    }
    
    public ety(final int f0, final int g0, final int h0, final long i0, final int j0) {
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
        xd.q1(parcel, 5, this.I0);
        xd.n1(parcel, 6, this.J0);
        xd.B1(parcel, x1);
    }
}
