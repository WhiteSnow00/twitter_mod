import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8y extends n8y<Status>
{
    public e8y(final c c) {
        super(c);
    }
    
    public final /* bridge */ etm d(final Status status) {
        return (etm)status;
    }
    
    public final void p(final y8y y8y) throws RemoteException {
        final h8y h8y = new h8y((nm1)this);
        final Parcel s = ((q6y)y8y).s();
        n7y.c(s, (IInterface)h8y);
        ((q6y)y8y).x(4, s);
    }
}
