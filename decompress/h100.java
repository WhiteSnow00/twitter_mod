import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h100 extends j9y implements z100
{
    public h100(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.ICertData");
    }
    
    public final int d() throws RemoteException {
        final Parcel s = this.s(2, this.x());
        final int int1 = s.readInt();
        s.recycle();
        return int1;
    }
    
    public final l3d e() throws RemoteException {
        final Parcel s = this.s(1, this.x());
        final l3d x = l3d.a.x(s.readStrongBinder());
        s.recycle();
        return x;
    }
}
