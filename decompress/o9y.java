import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class o9y implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public o9y(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void U0(final int n, final Parcel parcel) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final Parcel s() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
    
    public final Parcel x(final int n, final Parcel parcel) throws RemoteException {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
}
