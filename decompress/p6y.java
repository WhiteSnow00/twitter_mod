import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p6y extends f5y
{
    public final /* synthetic */ q6y a;
    
    public p6y(final q6y a) {
        this.a = a;
    }
    
    public final void v(final Status status) throws RemoteException {
        ((BasePendingResult<Status>)this.a).g(status);
    }
}
