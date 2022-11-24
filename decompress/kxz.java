import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxz extends sd
{
    public static final Parcelable$Creator<kxz> CREATOR;
    public final boolean F0;
    public final String G0;
    public final int H0;
    
    static {
        CREATOR = (Parcelable$Creator)new lyz();
    }
    
    public kxz(final boolean f0, final String g0, final int n) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = ak1.W(n) - 1;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.e1(parcel, 1, this.F0);
        xd.s1(parcel, 2, this.G0);
        xd.n1(parcel, 3, this.H0);
        xd.B1(parcel, x1);
    }
}
