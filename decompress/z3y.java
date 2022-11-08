import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z3y extends sd
{
    public static final Parcelable$Creator<z3y> CREATOR;
    public final int C0;
    public final x4y D0;
    
    static {
        CREATOR = (Parcelable$Creator)new b4y();
    }
    
    public z3y(final int c0, final x4y d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.r0(parcel, 2, (Parcelable)this.D0, n);
        ri4.A0(parcel, x0);
    }
}
