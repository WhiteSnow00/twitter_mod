import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class q8y extends Binder implements IInterface
{
    public q8y() {
        this.attachInterface((IInterface)this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        final boolean b = false;
        boolean onTransact;
        if (n > 16777215) {
            onTransact = super.onTransact(n, parcel, parcel2, n2);
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            onTransact = false;
        }
        if (onTransact) {
            return true;
        }
        final byz byz = (byz)this;
        boolean b2 = b;
        if (n == 1) {
            final Parcelable$Creator creator = Status.CREATOR;
            n = gsy.a;
            n = parcel.readInt();
            final PendingIntent pendingIntent = null;
            Object o;
            if (n == 0) {
                o = null;
            }
            else {
                o = creator.createFromParcel(parcel);
            }
            final Status status = (Status)o;
            final Parcelable$Creator creator2 = PendingIntent.CREATOR;
            Object o2;
            if (parcel.readInt() == 0) {
                o2 = pendingIntent;
            }
            else {
                o2 = creator2.createFromParcel(parcel);
            }
            af8.O(status, (Object)o2, ((boy)byz).a);
            b2 = true;
        }
        return b2;
    }
}
