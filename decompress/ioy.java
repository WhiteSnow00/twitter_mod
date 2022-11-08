import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioy extends kky implements roy
{
    public ioy(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
    
    public final void m(final Bundle bundle) throws RemoteException {
        final Parcel s = this.s();
        uky.c(s, (Parcelable)bundle);
        this.U0(1, s);
    }
}
