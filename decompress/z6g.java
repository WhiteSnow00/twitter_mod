import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6g extends sd
{
    public static final Parcelable$Creator<z6g> CREATOR;
    public final boolean C0;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    
    static {
        CREATOR = (Parcelable$Creator)new yby();
    }
    
    public z6g(final boolean c0, final boolean d0, final boolean e0, final boolean f0, final boolean g0, final boolean h0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.e0(parcel, 1, this.C0);
        ri4.e0(parcel, 2, this.D0);
        ri4.e0(parcel, 3, this.E0);
        ri4.e0(parcel, 4, this.F0);
        ri4.e0(parcel, 5, this.G0);
        ri4.e0(parcel, 6, this.H0);
        ri4.A0(parcel, x0);
    }
}
