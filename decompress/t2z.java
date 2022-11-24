import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t2z extends m9y implements uxy
{
    public t2z(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.ICreator");
    }
    
    public final void C0(final l3d l3d) throws RemoteException {
        final Parcel s = this.s();
        coy.a(s, (IInterface)l3d);
        s.writeInt(12451000);
        this.U0(6, s);
    }
    
    public final t2d f() throws RemoteException {
        final Parcel x = this.x(4, this.s());
        final IBinder strongBinder = x.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof t2d) {
                o = queryLocalInterface;
            }
            else {
                o = new xiy(strongBinder);
            }
        }
        x.recycle();
        return (t2d)o;
    }
    
    public final nyy i() throws RemoteException {
        final Parcel x = this.x(5, this.s());
        final IBinder strongBinder = x.readStrongBinder();
        final int a = j3z.a;
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof nyy) {
                o = queryLocalInterface;
            }
            else {
                o = new x7z(strongBinder);
            }
        }
        x.recycle();
        return (nyy)o;
    }
    
    public final h3d y1(final l3d l3d, final GoogleMapOptions googleMapOptions) throws RemoteException {
        final Parcel s = this.s();
        coy.a(s, (IInterface)l3d);
        coy.b(s, (Parcelable)googleMapOptions);
        final Parcel x = this.x(3, s);
        final IBinder strongBinder = x.readStrongBinder();
        Object o;
        if (strongBinder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof h3d) {
                o = queryLocalInterface;
            }
            else {
                o = new elz(strongBinder);
            }
        }
        x.recycle();
        return (h3d)o;
    }
}
