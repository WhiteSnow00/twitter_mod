import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zdz extends e8y implements gkz
{
    public zdz(final IBinder binder) {
        super(binder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }
    
    public final iaz U(final g3d g3d, final ruz ruz) throws RemoteException {
        final Parcel s = this.s();
        umy.a(s, (IInterface)g3d);
        s.writeInt(1);
        ruz.writeToParcel(s, 0);
        final Parcel x = this.x(1, s);
        final IBinder strongBinder = x.readStrongBinder();
        iaz iaz;
        if (strongBinder == null) {
            iaz = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            if (queryLocalInterface instanceof iaz) {
                iaz = (iaz)queryLocalInterface;
            }
            else {
                iaz = new iaz(strongBinder);
            }
        }
        x.recycle();
        return iaz;
    }
}
