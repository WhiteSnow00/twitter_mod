import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eiz extends miy
{
    public eiz() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }
    
    public final boolean s(int a, final Parcel parcel) throws RemoteException {
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
            p4j.Q((Status)o, (Object)parcel.readInt(), ((yvz)this).a);
            return true;
        }
        return false;
    }
}
