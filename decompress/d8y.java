import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d8y extends p6y
{
    public final g8y a;
    
    public d8y(final g8y a) {
        this.a = a;
    }
    
    @Override
    public final void z1(final Status status) throws RemoteException {
        ((BasePendingResult)this.a).g((etm)status);
    }
}
