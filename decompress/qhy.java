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

public class qhy extends Binder implements IInterface
{
    public qhy() {
        this.attachInterface((IInterface)this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) throws RemoteException {
        boolean b = true;
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        final mxy mxy = (mxy)this;
        if (n == 1) {
            final Parcelable$Creator creator = Status.CREATOR;
            n = doy.a;
            n = parcel.readInt();
            final Object o = null;
            Object o2;
            if (n == 0) {
                o2 = null;
            }
            else {
                o2 = creator.createFromParcel(parcel);
            }
            final Status status = (Status)o2;
            final Parcelable$Creator<foy> creator2 = foy.CREATOR;
            Object o3;
            if (parcel.readInt() == 0) {
                o3 = null;
            }
            else {
                o3 = creator2.createFromParcel(parcel);
            }
            final foy foy = (foy)o3;
            final ltz ltz = (ltz)mxy;
            Object o4 = o;
            if (foy != null) {
                o4 = new co0(foy.D0);
            }
            af8.O(status, o4, ltz.a);
        }
        else {
            b = false;
        }
        return b;
    }
}
