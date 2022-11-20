import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface h2d extends IInterface
{
    void A(final Bundle p0) throws RemoteException;
    
    void V(final tey p0) throws RemoteException;
    
    l2d getView() throws RemoteException;
    
    void j() throws RemoteException;
    
    void onLowMemory() throws RemoteException;
    
    void r(final Bundle p0) throws RemoteException;
    
    void v1() throws RemoteException;
    
    void z() throws RemoteException;
}
