import android.os.Parcelable;
import android.os.Parcel;
import android.graphics.Point;
import java.util.List;
import android.graphics.Rect;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqz extends sd
{
    public static final Parcelable$Creator<pqz> CREATOR;
    public final String F0;
    public final Rect G0;
    public final List<Point> H0;
    public final String I0;
    public final List<orz> J0;
    
    static {
        CREATOR = (Parcelable$Creator)new rqz();
    }
    
    public pqz(final String f0, final Rect g0, final List<Point> h0, final String i0, final List<orz> j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 1, this.F0);
        xd.r1(parcel, 2, (Parcelable)this.G0, n);
        xd.w1(parcel, 3, this.H0);
        xd.s1(parcel, 4, this.I0);
        xd.w1(parcel, 5, this.J0);
        xd.B1(parcel, x1);
    }
}
