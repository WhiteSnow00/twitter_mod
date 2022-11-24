import android.os.RemoteException;
import java.util.List;
import android.os.Bundle;
import android.net.Uri;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface w2d extends IInterface
{
    boolean F1(final v2d p0, final Uri p1, final Bundle p2, final List<Bundle> p3) throws RemoteException;
    
    boolean U1() throws RemoteException;
    
    boolean W(final v2d p0) throws RemoteException;
    
    boolean e0(final v2d p0, final Uri p1) throws RemoteException;
}
