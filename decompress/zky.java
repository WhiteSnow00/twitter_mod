import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zky extends kky implements hly
{
    public zky(final IBinder binder) {
        super(binder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }
    
    public final Bundle m(Bundle bundle) throws RemoteException {
        final Parcel s = this.s();
        uky.c(s, (Parcelable)bundle);
        final Parcel x = this.x(1, s);
        bundle = (Bundle)uky.a(x, Bundle.CREATOR);
        x.recycle();
        return bundle;
    }
}
