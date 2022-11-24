import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqz extends o9y implements oqz
{
    public jqz(final IBinder binder) {
        super(binder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }
    
    @Override
    public final gqz a1(final l3d l3d) throws RemoteException {
        final Parcel s = this.s();
        eoy.a(s, (IInterface)l3d);
        final Parcel x = this.x(1, s);
        final IBinder strongBinder = x.readStrongBinder();
        gqz gqz;
        if (strongBinder == null) {
            gqz = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            if (queryLocalInterface instanceof gqz) {
                gqz = (gqz)queryLocalInterface;
            }
            else {
                gqz = new gqz(strongBinder);
            }
        }
        x.recycle();
        return gqz;
    }
}
