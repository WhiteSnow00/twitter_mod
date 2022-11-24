import android.os.IInterface;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n000 extends m9y implements szz
{
    public n000(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }
    
    public final int l() throws RemoteException {
        final Parcel x = this.x(17, this.s());
        final int int1 = x.readInt();
        x.recycle();
        return int1;
    }
    
    public final void remove() throws RemoteException {
        this.U0(1, this.s());
    }
    
    public final boolean s1(final szz szz) throws RemoteException {
        final Parcel s = this.s();
        coy.a(s, (IInterface)szz);
        final Parcel x = this.x(16, s);
        final boolean b = x.readInt() != 0;
        x.recycle();
        return b;
    }
}
