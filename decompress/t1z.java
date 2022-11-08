import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t1z implements ywy, IInterface
{
    public final IBinder a;
    
    public t1z(final IBinder a) {
        this.a = a;
    }
    
    public final void S1(final h6z h6z) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        final int a = ony.a;
        obtain.writeStrongBinder((IBinder)h6z);
        final Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
