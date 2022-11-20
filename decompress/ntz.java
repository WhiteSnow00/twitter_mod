import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntz extends rd
{
    public static final Parcelable$Creator<ntz> CREATOR;
    public int D0;
    public kqz E0;
    public exz F0;
    public zcy G0;
    
    static {
        CREATOR = (Parcelable$Creator)new bvz();
    }
    
    public ntz(int a, final kqz e0, final IBinder binder, final IBinder binder2) {
        this.D0 = a;
        this.E0 = e0;
        final zcy zcy = null;
        Object f0;
        if (binder == null) {
            f0 = null;
        }
        else {
            a = gyz.a;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof exz) {
                f0 = queryLocalInterface;
            }
            else {
                f0 = new uyz(binder);
            }
        }
        this.F0 = (exz)f0;
        Object g0;
        if (binder2 == null) {
            g0 = zcy;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof zcy) {
                g0 = queryLocalInterface2;
            }
            else {
                g0 = new kdy(binder2);
            }
        }
        this.G0 = (zcy)g0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.T0(parcel, 1, this.D0);
        fli.X0(parcel, 2, (Parcelable)this.E0, n);
        final exz f0 = this.F0;
        final IBinder binder = null;
        IBinder binder2;
        if (f0 == null) {
            binder2 = null;
        }
        else {
            binder2 = ((IInterface)f0).asBinder();
        }
        fli.S0(parcel, 3, binder2);
        final zcy g0 = this.G0;
        IBinder binder3;
        if (g0 == null) {
            binder3 = binder;
        }
        else {
            binder3 = ((IInterface)g0).asBinder();
        }
        fli.S0(parcel, 4, binder3);
        fli.g1(parcel, d1);
    }
}
