import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x7z extends m9y implements nyy
{
    public x7z(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }
    
    public final l3d o(final int n) throws RemoteException {
        final Parcel s = this.s();
        s.writeInt(n);
        final Parcel x = this.x(1, s);
        final l3d x2 = l3d.a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
}
