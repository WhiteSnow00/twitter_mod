import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lpz extends fhy implements nmz
{
    public lpz() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }
    
    @Override
    public final boolean s(int a, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (a == 1) {
            final Parcelable$Creator creator = CameraPosition.CREATOR;
            a = smy.a;
            Object o;
            if (parcel.readInt() == 0) {
                o = null;
            }
            else {
                o = creator.createFromParcel(parcel);
            }
            final CameraPosition cameraPosition = (CameraPosition)o;
            final se8 se8 = (se8)((xxz)this).a;
            final t5c t5c = (t5c)se8.D0;
            t5c.b((xaz)se8.E0);
            t5c.c((t5c$a)null);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
