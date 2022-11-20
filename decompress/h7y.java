import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.common.api.c;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h7y extends t7y<Status>
{
    public final Credential q;
    
    public h7y(final c c, final Credential q) {
        this.q = q;
        super(c);
    }
    
    public final /* bridge */ psm d(final Status status) {
        return (psm)status;
    }
    
    public final void p(final e8y e8y) throws RemoteException {
        final n7y n7y = new n7y((im1)this);
        final x7y x7y = new x7y(this.q);
        final Parcel s = e8y.s();
        t6y.c(s, (IInterface)n7y);
        t6y.b(s, (Parcelable)x7y);
        e8y.x(3, s);
    }
}
