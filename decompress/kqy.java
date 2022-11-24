import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kqy extends bmy implements oqy
{
    public kqy() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    public final boolean s(int e, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (e != 1) {
            if (e != 2) {
                return false;
            }
            e = ((cxy)this).e();
            parcel2.writeNoException();
            parcel2.writeInt(e);
        }
        else {
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final Bundle bundle = (Bundle)emy.a(parcel, Bundle.CREATOR);
            final long long1 = parcel.readLong();
            emy.b(parcel);
            ((cxy)this).E(string, string2, bundle, long1);
            parcel2.writeNoException();
        }
        return true;
    }
}
