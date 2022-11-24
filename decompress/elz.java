import android.os.IInterface;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class elz extends m9y implements h3d
{
    public elz(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }
    
    public final void A(final Bundle bundle) throws RemoteException {
        final Parcel s = this.s();
        coy.b(s, (Parcelable)bundle);
        final Parcel x = this.x(7, s);
        if (x.readInt() != 0) {
            bundle.readFromParcel(x);
        }
        x.recycle();
    }
    
    public final void b() throws RemoteException {
        this.U0(5, this.s());
    }
    
    public final void g0(final ofy ofy) throws RemoteException {
        final Parcel s = this.s();
        coy.a(s, (IInterface)ofy);
        this.U0(9, s);
    }
    
    public final l3d getView() throws RemoteException {
        final Parcel x = this.x(8, this.s());
        final l3d x2 = l3d.a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
    
    public final void onLowMemory() throws RemoteException {
        this.U0(6, this.s());
    }
    
    public final void r(final Bundle bundle) throws RemoteException {
        final Parcel s = this.s();
        coy.b(s, (Parcelable)bundle);
        this.U0(2, s);
    }
    
    public final void w1() throws RemoteException {
        this.U0(4, this.s());
    }
    
    public final void z() throws RemoteException {
        this.U0(3, this.s());
    }
}
