import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface w8y extends IInterface
{
    void H0(final Status p0, final Credential p1) throws RemoteException;
    
    void v(final Status p0) throws RemoteException;
}
