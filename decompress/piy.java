import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class piy extends Binder implements IInterface
{
    public piy(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        boolean onTransact;
        if (n > 16777215) {
            onTransact = super.onTransact(n, parcel, parcel2, n2);
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            onTransact = false;
        }
        return onTransact || this.s(n, parcel);
    }
    
    public boolean s(final int n, final Parcel parcel) throws RemoteException {
        throw null;
    }
}
