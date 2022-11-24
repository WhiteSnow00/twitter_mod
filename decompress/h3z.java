import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class h3z extends miy
{
    public h3z() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }
    
    public final boolean s(int a, final Parcel parcel) throws RemoteException {
        boolean b = false;
        if (a == 1) {
            final Parcelable$Creator creator = Status.CREATOR;
            a = zny.a;
            Object o;
            if (parcel.readInt() == 0) {
                o = null;
            }
            else {
                o = creator.createFromParcel(parcel);
            }
            final Status status = (Status)o;
            if (parcel.readInt() != 0) {
                b = true;
            }
            p4j.Q(status, (Object)b, ((qyz)this).a);
            return true;
        }
        return false;
    }
}
