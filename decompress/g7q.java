import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7q extends sd
{
    @RecentlyNonNull
    public static final Parcelable$Creator<g7q> CREATOR;
    public final String F0;
    public final String G0;
    public final String H0;
    public final String I0;
    public final Uri J0;
    public final String K0;
    public final String L0;
    
    static {
        CREATOR = (Parcelable$Creator)new i8y();
    }
    
    public g7q(@RecentlyNonNull final String f0, final String g0, final String h0, final String i0, final Uri j0, final String k0, final String l0) {
        iuk.z(f0);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof g7q)) {
            return false;
        }
        final g7q g7q = (g7q)o;
        return r5j.a(this.F0, g7q.F0) && r5j.a(this.G0, g7q.G0) && r5j.a(this.H0, g7q.H0) && r5j.a(this.I0, g7q.I0) && r5j.a(this.J0, g7q.J0) && r5j.a(this.K0, g7q.K0) && r5j.a(this.L0, g7q.L0);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0 });
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 1, this.F0);
        xd.s1(parcel, 2, this.G0);
        xd.s1(parcel, 3, this.H0);
        xd.s1(parcel, 4, this.I0);
        xd.r1(parcel, 5, (Parcelable)this.J0, n);
        xd.s1(parcel, 6, this.K0);
        xd.s1(parcel, 7, this.L0);
        xd.B1(parcel, x1);
    }
}
