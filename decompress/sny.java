import android.os.RemoteException;
import android.os.Parcel;
import android.os.Bundle;
import java.util.List;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sny extends flz implements cpy
{
    public sny(final IBinder binder) {
        super(binder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }
    
    public final void L(final String s, final List<Bundle> list, final Bundle bundle, final mpy mpy) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        s2.writeTypedList((List)list);
        final int a = arz.a;
        s2.writeInt(1);
        bundle.writeToParcel(s2, 0);
        s2.writeStrongBinder((IBinder)mpy);
        this.x(2, s2);
    }
}
