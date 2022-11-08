import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j6z extends c8y implements axy
{
    public j6z(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }
    
    public final g3d o(final int n) throws RemoteException {
        final Parcel s = this.s();
        s.writeInt(n);
        final Parcel x = this.x(1, s);
        final g3d x2 = g3d$a.x(x.readStrongBinder());
        x.recycle();
        return x2;
    }
}
