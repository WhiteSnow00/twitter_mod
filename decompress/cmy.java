import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmy extends c8y implements w3d
{
    public cmy(final IBinder binder) {
        super(binder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }
    
    public final void T() throws RemoteException {
        final Parcel s = this.s();
        final int a = smy.a;
        s.writeInt(0);
        this.U0(8, s);
    }
}
