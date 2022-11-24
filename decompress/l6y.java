import android.os.Parcelable;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l6y extends sd
{
    public static final Parcelable$Creator<l6y> CREATOR;
    public final int F0;
    public final IBinder G0;
    public final bi6 H0;
    public final boolean I0;
    public final boolean J0;
    
    static {
        CREATOR = (Parcelable$Creator)new m6y();
    }
    
    public l6y(final int f0, final IBinder g0, final bi6 h0, final boolean i0, final boolean j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof l6y)) {
            return false;
        }
        final l6y l6y = (l6y)o;
        return this.H0.equals((Object)l6y.H0) && r5j.a(this.p(), l6y.p());
    }
    
    public final q2d p() {
        final IBinder g0 = this.G0;
        if (g0 == null) {
            return null;
        }
        return q2d.a.x(g0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.m1(parcel, 2, this.G0);
        xd.r1(parcel, 3, (Parcelable)this.H0, n);
        xd.e1(parcel, 4, this.I0);
        xd.e1(parcel, 5, this.J0);
        xd.B1(parcel, x1);
    }
}
