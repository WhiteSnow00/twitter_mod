import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjy extends sd
{
    public static final Parcelable$Creator<jjy> CREATOR;
    public int C0;
    public yiy D0;
    public a000 E0;
    public PendingIntent F0;
    public vyz G0;
    public jcy H0;
    
    static {
        CREATOR = (Parcelable$Creator)new njy();
    }
    
    public jjy(int c0, final yiy d0, final IBinder binder, final PendingIntent f0, final IBinder binder2, final IBinder binder3) {
        this.C0 = c0;
        this.D0 = d0;
        final jcy jcy = null;
        Object e0;
        if (binder == null) {
            e0 = null;
        }
        else {
            c0 = j000.a;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof a000) {
                e0 = queryLocalInterface;
            }
            else {
                e0 = new t000(binder);
            }
        }
        this.E0 = (a000)e0;
        this.F0 = f0;
        Object g0;
        if (binder2 == null) {
            g0 = null;
        }
        else {
            c0 = gzz.a;
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof vyz) {
                g0 = queryLocalInterface2;
            }
            else {
                g0 = new pzz(binder2);
            }
        }
        this.G0 = (vyz)g0;
        Object h0;
        if (binder3 == null) {
            h0 = jcy;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof jcy) {
                h0 = queryLocalInterface3;
            }
            else {
                h0 = new ucy(binder3);
            }
        }
        this.H0 = (jcy)h0;
    }
    
    public static jjy r(final a000 a000, final jcy jcy) {
        final IBinder binder = ((IInterface)a000).asBinder();
        IBinder binder2;
        if (jcy != null) {
            binder2 = ((IInterface)jcy).asBinder();
        }
        else {
            binder2 = null;
        }
        return new jjy(2, null, binder, null, null, binder2);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.r0(parcel, 2, (Parcelable)this.D0, n);
        final a000 e0 = this.E0;
        final IBinder binder = null;
        IBinder binder2;
        if (e0 == null) {
            binder2 = null;
        }
        else {
            binder2 = ((IInterface)e0).asBinder();
        }
        ri4.m0(parcel, 3, binder2);
        ri4.r0(parcel, 4, (Parcelable)this.F0, n);
        final vyz g0 = this.G0;
        IBinder binder3;
        if (g0 == null) {
            binder3 = null;
        }
        else {
            binder3 = ((IInterface)g0).asBinder();
        }
        ri4.m0(parcel, 5, binder3);
        final jcy h0 = this.H0;
        IBinder binder4;
        if (h0 == null) {
            binder4 = binder;
        }
        else {
            binder4 = ((IInterface)h0).asBinder();
        }
        ri4.m0(parcel, 6, binder4);
        ri4.A0(parcel, x0);
    }
}
