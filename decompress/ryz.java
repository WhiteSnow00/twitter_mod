import android.os.RemoteException;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.d;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ryz extends uhy implements sxz
{
    public ryz(final IBinder binder) {
        super(binder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }
    
    public final void k1(avz obtain, final d d) throws RemoteException {
        final Parcel obtain2 = Parcel.obtain();
        obtain2.writeInterfaceToken(super.b);
        final int a = gsy.a;
        obtain2.writeStrongBinder((IBinder)obtain);
        if (d == null) {
            obtain2.writeInt(0);
        }
        else {
            obtain2.writeInt(1);
            d.writeToParcel(obtain2, 0);
        }
        obtain = (avz)Parcel.obtain();
        try {
            super.a.transact(1, obtain2, (Parcel)obtain, 0);
            ((Parcel)obtain).readException();
        }
        finally {
            obtain2.recycle();
            ((Parcel)obtain).recycle();
        }
    }
}
