import android.os.RemoteException;
import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brz extends sjz implements iuz
{
    public brz(final IBinder binder) {
        super(binder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }
    
    public final void Z0(final String s, final Bundle bundle, final wwz wwz) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        final int a = npz.a;
        s2.writeInt(1);
        bundle.writeToParcel(s2, 0);
        s2.writeStrongBinder((IBinder)wwz);
        this.x(2, s2);
    }
}
