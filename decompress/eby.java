import android.os.RemoteException;
import android.os.IBinder;
import android.util.Log;
import android.os.Bundle;
import java.util.Objects;
import android.os.Parcelable$Creator;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eby extends niy implements z2d
{
    public eby() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                n = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final ciz f1 = (ciz)aoy.a(parcel, (Parcelable$Creator)ciz.CREATOR);
                final sty sty = (sty)this;
                final gm1 a = sty.a;
                iuk.D((Object)a, (Object)"onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                Objects.requireNonNull(f1, "null reference");
                a.f1 = f1;
                Label_0169: {
                    if (a.I()) {
                        final di6 i0 = f1.I0;
                        final dlo a2 = dlo.a();
                        elo f2;
                        if (i0 == null) {
                            f2 = null;
                        }
                        else {
                            f2 = i0.F0;
                        }
                        monitorenter(a2);
                        Label_0120: {
                            if (f2 != null) {
                                break Label_0120;
                            }
                            try {
                                elo c = dlo.c;
                                while (true) {
                                    a2.a = c;
                                    Label_0157: {
                                        break Label_0169;
                                    }
                                    final elo a3 = a2.a;
                                    c = f2;
                                    iftrue(Label_0150:)(a3 == null);
                                    iftrue(Label_0157:)(a3.F0 >= f2.F0);
                                    c = f2;
                                    continue;
                                }
                            }
                            finally {
                                monitorexit(a2);
                            }
                        }
                    }
                }
                sty.x(n, strongBinder, f1.F0);
            }
            else {
                parcel.readInt();
                final Bundle bundle = (Bundle)aoy.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
            }
        }
        else {
            n = parcel.readInt();
            ((sty)this).x(n, parcel.readStrongBinder(), (Bundle)aoy.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
