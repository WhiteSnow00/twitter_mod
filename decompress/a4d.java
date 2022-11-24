import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class a4d extends r2y
{
    public a4d() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }
    
    @Override
    public final boolean V1(final int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        if (n == 1) {
            p4j.Q((Status)u3y.a(parcel, Status.CREATOR), (Object)null, ((z6y)this).a);
            return true;
        }
        return false;
    }
}
