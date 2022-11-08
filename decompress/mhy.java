import com.google.android.gms.maps.model.LatLngBounds;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhy extends c8y implements o2d
{
    public mhy(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }
    
    public final g3d Q(final LatLng latLng) throws RemoteException {
        final Parcel s = this.s();
        smy.b(s, (Parcelable)latLng);
        s.writeFloat(15.0f);
        final Parcel x = this.x(9, s);
        final g3d x2 = g3d$a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
    
    public final g3d k0(final LatLngBounds latLngBounds) throws RemoteException {
        final Parcel s = this.s();
        smy.b(s, (Parcelable)latLngBounds);
        s.writeInt(0);
        final Parcel x = this.x(10, s);
        final g3d x2 = g3d$a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
    
    public final g3d p1(final LatLng latLng) throws RemoteException {
        final Parcel s = this.s();
        smy.b(s, (Parcelable)latLng);
        final Parcel x = this.x(8, s);
        final g3d x2 = g3d$a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
}
