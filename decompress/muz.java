import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class muz extends sd
{
    public static final Parcelable$Creator<muz> CREATOR;
    public int F0;
    public jrz G0;
    public dyz H0;
    public tdy I0;
    
    static {
        CREATOR = (Parcelable$Creator)new awz();
    }
    
    public muz(int a, final jrz g0, final IBinder binder, final IBinder binder2) {
        this.F0 = a;
        this.G0 = g0;
        final tdy tdy = null;
        Object h0;
        if (binder == null) {
            h0 = null;
        }
        else {
            a = fzz.a;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof dyz) {
                h0 = queryLocalInterface;
            }
            else {
                h0 = new vzz(binder);
            }
        }
        this.H0 = (dyz)h0;
        tdy i0;
        if (binder2 == null) {
            i0 = tdy;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof tdy) {
                i0 = (tdy)queryLocalInterface2;
            }
            else {
                i0 = new eey(binder2);
            }
        }
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.n1(parcel, 1, this.F0);
        xd.r1(parcel, 2, (Parcelable)this.G0, n);
        final dyz h0 = this.H0;
        final IBinder binder = null;
        IBinder binder2;
        if (h0 == null) {
            binder2 = null;
        }
        else {
            binder2 = ((IInterface)h0).asBinder();
        }
        xd.m1(parcel, 3, binder2);
        final tdy i0 = this.I0;
        IBinder binder3;
        if (i0 == null) {
            binder3 = binder;
        }
        else {
            binder3 = ((IInterface)i0).asBinder();
        }
        xd.m1(parcel, 4, binder3);
        xd.B1(parcel, x1);
    }
}
