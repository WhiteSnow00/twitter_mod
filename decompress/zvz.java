import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvz extends sd
{
    public static final Parcelable$Creator<zvz> CREATOR;
    public final boolean C0;
    public final String D0;
    public final int E0;
    
    static {
        CREATOR = (Parcelable$Creator)new axz();
    }
    
    public zvz(final boolean c0, final String d0, final int n) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = x3j.P(n) - 1;
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.e0(parcel, 1, this.C0);
        ri4.s0(parcel, 2, this.D0);
        ri4.n0(parcel, 3, this.E0);
        ri4.A0(parcel, x0);
    }
}
