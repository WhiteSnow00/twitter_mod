// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.support.v4.media.MediaMetadataCompat;
import android.os.RemoteException;
import java.util.List;
import android.os.IInterface;

public interface a extends IInterface
{
    void M1(final List<MediaSessionCompat.QueueItem> p0) throws RemoteException;
    
    void N() throws RemoteException;
    
    void V0(final ParcelableVolumeInfo p0) throws RemoteException;
    
    void f0() throws RemoteException;
    
    void q0() throws RemoteException;
    
    void s0(final MediaMetadataCompat p0) throws RemoteException;
}
