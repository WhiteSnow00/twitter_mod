import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myy implements IInterface
{
    public final IBinder a;
    public final String b;
    
    public myy(final IBinder a) {
        this.a = a;
        this.b = "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final void s(final int n, final Parcel parcel) {
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
}
