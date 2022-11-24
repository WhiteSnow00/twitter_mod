import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nyz extends j9y
{
    public nyz(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }
    
    public final l3d D1(final l3d l3d, final String s, final int n, final l3d l3d2) throws RemoteException {
        final Parcel x = this.x();
        aoy.b(x, (IInterface)l3d);
        x.writeString(s);
        x.writeInt(n);
        aoy.b(x, (IInterface)l3d2);
        final Parcel s2 = this.s(3, x);
        final l3d x2 = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
    
    public final l3d U0(l3d x, final String s, final int n, final l3d l3d) throws RemoteException {
        final Parcel x2 = this.x();
        aoy.b(x2, (IInterface)x);
        x2.writeString(s);
        x2.writeInt(n);
        aoy.b(x2, (IInterface)l3d);
        final Parcel s2 = this.s(2, x2);
        x = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x;
    }
}
