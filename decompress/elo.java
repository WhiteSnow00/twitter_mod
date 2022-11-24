import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elo extends sd
{
    public static final Parcelable$Creator<elo> CREATOR;
    public final int F0;
    public final boolean G0;
    public final boolean H0;
    public final int I0;
    public final int J0;
    
    static {
        CREATOR = (Parcelable$Creator)new mdy();
    }
    
    public elo(final int f0, final boolean g0, final boolean h0, final int i0, final int j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.e1(parcel, 2, this.G0);
        xd.e1(parcel, 3, this.H0);
        xd.n1(parcel, 4, this.I0);
        xd.n1(parcel, 5, this.J0);
        xd.B1(parcel, x1);
    }
}
