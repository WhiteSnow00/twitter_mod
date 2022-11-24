import android.os.RemoteException;
import android.os.Parcelable$Creator;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yqz extends qiy implements aoz
{
    public yqz() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }
    
    public final boolean s(int a, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (a == 1) {
            final Parcelable$Creator creator = CameraPosition.CREATOR;
            a = coy.a;
            Object o;
            if (parcel.readInt() == 0) {
                o = null;
            }
            else {
                o = creator.createFromParcel(parcel);
            }
            final CameraPosition cameraPosition = (CameraPosition)o;
            final n5w n5w = (n5w)((izz)this).a;
            final x5c x5c = (x5c)n5w.G0;
            x5c.b((yrb)n5w.H0);
            x5c.c((x5c$a)null);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
