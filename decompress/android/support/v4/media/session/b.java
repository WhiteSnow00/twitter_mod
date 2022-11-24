// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.support.v4.media.MediaMetadataCompat;
import android.view.KeyEvent;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.app.PendingIntent;
import java.util.List;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.IInterface;

public interface b extends IInterface
{
    void A1(final float p0) throws RemoteException;
    
    void B() throws RemoteException;
    
    void C(final String p0, final Bundle p1) throws RemoteException;
    
    void E0(final String p0, final Bundle p1, final MediaSessionCompat.ResultReceiverWrapper p2) throws RemoteException;
    
    void F() throws RemoteException;
    
    void G1(final boolean p0) throws RemoteException;
    
    void H() throws RemoteException;
    
    void I(final Uri p0, final Bundle p1) throws RemoteException;
    
    void I0(final long p0) throws RemoteException;
    
    void K() throws RemoteException;
    
    List<MediaSessionCompat.QueueItem> K1() throws RemoteException;
    
    PendingIntent M() throws RemoteException;
    
    void N0(final int p0) throws RemoteException;
    
    void O() throws RemoteException;
    
    String P0() throws RemoteException;
    
    ParcelableVolumeInfo P1() throws RemoteException;
    
    void X(final String p0, final Bundle p1) throws RemoteException;
    
    void X0(final a p0) throws RemoteException;
    
    Bundle Y() throws RemoteException;
    
    void Z(final String p0, final Bundle p1) throws RemoteException;
    
    void b0(final String p0, final Bundle p1) throws RemoteException;
    
    void b1(final RatingCompat p0) throws RemoteException;
    
    void d0(final Uri p0, final Bundle p1) throws RemoteException;
    
    void f1(final MediaDescriptionCompat p0) throws RemoteException;
    
    void g() throws RemoteException;
    
    boolean g1() throws RemoteException;
    
    Bundle getExtras() throws RemoteException;
    
    String getTag() throws RemoteException;
    
    long h() throws RemoteException;
    
    void h1(final MediaDescriptionCompat p0) throws RemoteException;
    
    void k() throws RemoteException;
    
    boolean l0(final KeyEvent p0) throws RemoteException;
    
    void m1(final String p0, final Bundle p1) throws RemoteException;
    
    PlaybackStateCompat n() throws RemoteException;
    
    void n1(final int p0, final int p1) throws RemoteException;
    
    void next() throws RemoteException;
    
    void p() throws RemoteException;
    
    void p0(final RatingCompat p0, final Bundle p1) throws RemoteException;
    
    void previous() throws RemoteException;
    
    void r0(final MediaDescriptionCompat p0, final int p1) throws RemoteException;
    
    CharSequence r1() throws RemoteException;
    
    void stop() throws RemoteException;
    
    MediaMetadataCompat t() throws RemoteException;
    
    void t1(final a p0) throws RemoteException;
    
    void u(final long p0) throws RemoteException;
    
    void u1(final int p0, final int p1) throws RemoteException;
    
    void v1() throws RemoteException;
    
    void w0() throws RemoteException;
    
    void x0(final int p0) throws RemoteException;
    
    void y(final int p0) throws RemoteException;
    
    void y0() throws RemoteException;
}
