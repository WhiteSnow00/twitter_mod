import android.os.RemoteException;
import android.os.Parcel;
import android.os.IInterface;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k7y extends t7y<Status>
{
    public k7y(final c c) {
        super(c);
    }
    
    public final /* bridge */ psm d(final Status status) {
        return (psm)status;
    }
    
    public final void p(final e8y e8y) throws RemoteException {
        final n7y n7y = new n7y((im1)this);
        final Parcel s = e8y.s();
        t6y.c(s, (IInterface)n7y);
        e8y.x(4, s);
    }
}
