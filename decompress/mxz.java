import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxz extends j9y
{
    public mxz(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final l3d D1(final l3d l3d, final String s, final int n, final l3d l3d2) throws RemoteException {
        final Parcel x = this.x();
        aoy.b(x, (IInterface)l3d);
        x.writeString(s);
        x.writeInt(n);
        aoy.b(x, (IInterface)l3d2);
        final Parcel s2 = this.s(8, x);
        final l3d x2 = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
    
    public final l3d U0(final l3d l3d, final String s, final int n) throws RemoteException {
        final Parcel x = this.x();
        aoy.b(x, (IInterface)l3d);
        x.writeString(s);
        x.writeInt(n);
        final Parcel s2 = this.s(2, x);
        final l3d x2 = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
    
    public final l3d V1(final l3d l3d, final String s, final int n) throws RemoteException {
        final Parcel x = this.x();
        aoy.b(x, (IInterface)l3d);
        x.writeString(s);
        x.writeInt(n);
        final Parcel s2 = this.s(4, x);
        final l3d x2 = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
    
    public final l3d W1(final l3d l3d, final String s, final boolean b, final long n) throws RemoteException {
        final Parcel x = this.x();
        aoy.b(x, (IInterface)l3d);
        x.writeString(s);
        x.writeInt((int)(b ? 1 : 0));
        x.writeLong(n);
        final Parcel s2 = this.s(7, x);
        final l3d x2 = l3d.a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
}
