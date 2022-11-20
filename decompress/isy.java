import android.os.RemoteException;
import android.os.Bundle;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public interface isy extends IInterface
{
    Bundle B1(final String p0, final String p1, final String p2) throws RemoteException;
    
    Bundle E1(final String p0, final String p1, final Bundle p2, final Bundle p3) throws RemoteException;
    
    Bundle Q1(final String p0, final String p1, final String p2) throws RemoteException;
    
    Bundle R1(final String p0, final String p1, final String p2, final Bundle p3) throws RemoteException;
    
    Bundle T0(final String p0, final String p1, final Bundle p2) throws RemoteException;
    
    Bundle Y0(final int p0, final String p1, final String p2, final String p3, final Bundle p4) throws RemoteException;
    
    int j0(final int p0, final String p1, final String p2) throws RemoteException;
    
    Bundle j1(final String p0, final String p1, final Bundle p2) throws RemoteException;
    
    int w(final String p0, final String p1) throws RemoteException;
}
