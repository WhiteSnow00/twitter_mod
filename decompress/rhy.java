import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class rhy extends Binder implements IInterface
{
    public rhy() {
        this.attachInterface((IInterface)this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(int a, final Parcel parcel, final Parcel parcel2, final int n) throws RemoteException {
        final boolean b = false;
        boolean onTransact;
        if (a > 16777215) {
            onTransact = super.onTransact(a, parcel, parcel2, n);
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            onTransact = false;
        }
        if (onTransact) {
            return true;
        }
        final vaz vaz = (vaz)this;
        boolean b2 = b;
        if (a == 1) {
            final Parcelable$Creator creator = Status.CREATOR;
            a = eoy.a;
            Object o;
            if (parcel.readInt() == 0) {
                o = null;
            }
            else {
                o = creator.createFromParcel(parcel);
            }
            af8.O((Status)o, (Object)null, ((jqz)((nnz)vaz).a).d);
            b2 = true;
        }
        return b2;
    }
}
