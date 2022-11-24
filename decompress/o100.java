import android.os.RemoteException;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class o100 extends eoz
{
    public o100() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }
    
    public final boolean s(int a, final Parcel parcel) throws RemoteException {
        final g200 g200 = null;
        final g200 g201 = null;
        if (a != 2) {
            if (a != 3) {
                return false;
            }
            final Parcelable$Creator creator = Bundle.CREATOR;
            final Bundle bundle = (Bundle)arz.a(parcel);
            final IBinder strongBinder = parcel.readStrongBinder();
            Object o;
            if (strongBinder == null) {
                o = g201;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface instanceof g200) {
                    o = queryLocalInterface;
                }
                else {
                    o = new g200(strongBinder);
                }
            }
            final cjy cjy = (cjy)this;
            cjy.a.i("clearAssetPackStorage AIDL call", new Object[0]);
            if (jqy.b(cjy.b) && jqy.a(cjy.b)) {
                dly.j(cjy.c.g());
                final Bundle bundle2 = new Bundle();
                final Parcel s = ((flz)o).s();
                a = arz.a;
                s.writeInt(1);
                bundle2.writeToParcel(s, 0);
                ((flz)o).x(4, s);
            }
            else {
                ((g200)o).m(new Bundle());
            }
        }
        else {
            final Parcelable$Creator creator2 = Bundle.CREATOR;
            final Bundle bundle3 = (Bundle)arz.a(parcel);
            final IBinder strongBinder2 = parcel.readStrongBinder();
            g200 g202;
            if (strongBinder2 == null) {
                g202 = g200;
            }
            else {
                final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                if (queryLocalInterface2 instanceof g200) {
                    g202 = (g200)queryLocalInterface2;
                }
                else {
                    g202 = new g200(strongBinder2);
                }
            }
            ((cjy)this).x(bundle3, g202);
        }
        return true;
    }
}
