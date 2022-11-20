import android.os.Parcelable;
import android.os.Parcel;
import android.graphics.Point;
import java.util.List;
import android.graphics.Rect;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class upz extends rd
{
    public static final Parcelable$Creator<upz> CREATOR;
    public final String D0;
    public final Rect E0;
    public final List<Point> F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new wpz();
    }
    
    public upz(final String d0, final Rect e0, final List<Point> f0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        fli.X0(parcel, 2, (Parcelable)this.E0, n);
        fli.c1(parcel, 3, (List)this.F0);
        fli.Y0(parcel, 4, this.G0);
        fli.g1(parcel, d1);
    }
}
