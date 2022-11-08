import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwz extends z7y
{
    public bwz(final IBinder binder) {
        super(binder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }
    
    public final g3d D1(final g3d g3d, final String s, final int n, final g3d g3d2) throws RemoteException {
        final Parcel x = this.x();
        qmy.b(x, (IInterface)g3d);
        x.writeString(s);
        x.writeInt(n);
        qmy.b(x, (IInterface)g3d2);
        final Parcel s2 = this.s(8, x);
        final g3d x2 = g3d$a.x(s2.readStrongBinder());
        s2.recycle();
        return x2;
    }
    
    public final g3d U0(g3d x, final String s, final int n) throws RemoteException {
        final Parcel x2 = this.x();
        qmy.b(x2, (IInterface)x);
        x2.writeString(s);
        x2.writeInt(n);
        final Parcel s2 = this.s(2, x2);
        x = g3d$a.x(s2.readStrongBinder());
        s2.recycle();
        return x;
    }
    
    public final g3d V1(g3d x, final String s, final int n) throws RemoteException {
        final Parcel x2 = this.x();
        qmy.b(x2, (IInterface)x);
        x2.writeString(s);
        x2.writeInt(n);
        final Parcel s2 = this.s(4, x2);
        x = g3d$a.x(s2.readStrongBinder());
        s2.recycle();
        return x;
    }
    
    public final g3d W1(g3d x, final String s, final boolean b, final long n) throws RemoteException {
        final Parcel x2 = this.x();
        qmy.b(x2, (IInterface)x);
        x2.writeString(s);
        x2.writeInt((int)(b ? 1 : 0));
        x2.writeLong(n);
        final Parcel s2 = this.s(7, x2);
        x = g3d$a.x(s2.readStrongBinder());
        s2.recycle();
        return x;
    }
}
