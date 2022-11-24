import android.os.RemoteException;
import android.util.Log;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface c4d extends IInterface
{
    public abstract static class a extends Binder implements c4d
    {
        public a() {
            this.attachInterface((IInterface)this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }
        
        public final IBinder asBinder() {
            return (IBinder)this;
        }
        
        public final boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, int n2) throws RemoteException {
            if (n == 1) {
                parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                if (parcel.readInt() != 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (parcel.readInt() != 0) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                final m2w m2w = (m2w)this;
                if (n != 0) {
                    if (n2 != 0) {
                        m2w.a.G0.n(3);
                    }
                    else {
                        m2w.a.G0.n(2);
                    }
                }
                else {
                    m2w.a.G0.n(0);
                    Log.e("PackageManagerCompat", "Unable to retrieve the permission revocation setting from the backport");
                }
                return true;
            }
            if (n != 1598968902) {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            return true;
        }
    }
}
