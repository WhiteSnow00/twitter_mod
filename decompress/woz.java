import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class woz extends e8y implements bpz
{
    public woz(final IBinder binder) {
        super(binder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }
    
    public final toz a1(final g3d g3d) throws RemoteException {
        final Parcel s = this.s();
        umy.a(s, (IInterface)g3d);
        final Parcel x = this.x(1, s);
        final IBinder strongBinder = x.readStrongBinder();
        toz toz;
        if (strongBinder == null) {
            toz = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof toz) {
                toz = (toz)queryLocalInterface;
            }
            else {
                toz = new toz(strongBinder);
            }
        }
        x.recycle();
        return toz;
    }
}
