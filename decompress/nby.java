import android.os.IInterface;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nby extends j9y implements hcy
{
    public nby(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }
    
    public final kxz V(final ssz ssz) throws RemoteException {
        final Parcel x = this.x();
        final int a = aoy.a;
        x.writeInt(1);
        ssz.writeToParcel(x, 0);
        final Parcel s = this.s(6, x);
        final kxz kxz = (kxz)aoy.a(s, (Parcelable$Creator)kxz.CREATOR);
        s.recycle();
        return kxz;
    }
    
    public final boolean i1(final yyz yyz, final l3d l3d) throws RemoteException {
        final Parcel x = this.x();
        final int a = aoy.a;
        boolean b = true;
        x.writeInt(1);
        yyz.writeToParcel(x, 0);
        aoy.b(x, (IInterface)l3d);
        final Parcel s = this.s(5, x);
        if (s.readInt() == 0) {
            b = false;
        }
        s.recycle();
        return b;
    }
    
    public final boolean j() throws RemoteException {
        final Parcel s = this.s(7, this.x());
        final int a = aoy.a;
        final boolean b = s.readInt() != 0;
        s.recycle();
        return b;
    }
}
