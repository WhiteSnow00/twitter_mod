import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpy extends uly implements npy
{
    public dpy(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public final void beginAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        s2.writeLong(n);
        this.U0(23, s2);
    }
    
    public final void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        emy.c(s3, (Parcelable)bundle);
        this.U0(9, s3);
    }
    
    public final void clearMeasurementEnabled(final long n) throws RemoteException {
        final Parcel s = this.s();
        s.writeLong(n);
        this.U0(43, s);
    }
    
    public final void endAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        s2.writeLong(n);
        this.U0(24, s2);
    }
    
    public final void generateEventId(final aqy aqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)aqy);
        this.U0(22, s);
    }
    
    public final void getCachedAppInstanceId(final aqy aqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)aqy);
        this.U0(19, s);
    }
    
    public final void getConditionalUserProperties(final String s, final String s2, final aqy aqy) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        emy.d(s3, (IInterface)aqy);
        this.U0(10, s3);
    }
    
    public final void getCurrentScreenClass(final aqy aqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)aqy);
        this.U0(17, s);
    }
    
    public final void getCurrentScreenName(final aqy aqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)aqy);
        this.U0(16, s);
    }
    
    public final void getGmpAppId(final aqy aqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)aqy);
        this.U0(21, s);
    }
    
    public final void getMaxUserProperties(final String s, final aqy aqy) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        emy.d(s2, (IInterface)aqy);
        this.U0(6, s2);
    }
    
    public final void getUserProperties(final String s, final String s2, final boolean b, final aqy aqy) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        final ClassLoader a = emy.a;
        s3.writeInt((int)(b ? 1 : 0));
        emy.d(s3, (IInterface)aqy);
        this.U0(5, s3);
    }
    
    public final void initialize(final l3d l3d, final ary ary, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        emy.c(s, (Parcelable)ary);
        s.writeLong(n);
        this.U0(1, s);
    }
    
    public final void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        emy.c(s3, (Parcelable)bundle);
        s3.writeInt((int)(b ? 1 : 0));
        s3.writeInt((int)(b2 ? 1 : 0));
        s3.writeLong(n);
        this.U0(2, s3);
    }
    
    public final void logHealthData(final int n, final String s, final l3d l3d, final l3d l3d2, final l3d l3d3) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeInt(5);
        s2.writeString(s);
        emy.d(s2, (IInterface)l3d);
        emy.d(s2, (IInterface)l3d2);
        emy.d(s2, (IInterface)l3d3);
        this.U0(33, s2);
    }
    
    public final void onActivityCreated(final l3d l3d, final Bundle bundle, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        emy.c(s, (Parcelable)bundle);
        s.writeLong(n);
        this.U0(27, s);
    }
    
    public final void onActivityDestroyed(final l3d l3d, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        s.writeLong(n);
        this.U0(28, s);
    }
    
    public final void onActivityPaused(final l3d l3d, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        s.writeLong(n);
        this.U0(29, s);
    }
    
    public final void onActivityResumed(final l3d l3d, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        s.writeLong(n);
        this.U0(30, s);
    }
    
    public final void onActivitySaveInstanceState(final l3d l3d, final aqy aqy, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        emy.d(s, (IInterface)aqy);
        s.writeLong(n);
        this.U0(31, s);
    }
    
    public final void onActivityStarted(final l3d l3d, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        s.writeLong(n);
        this.U0(25, s);
    }
    
    public final void onActivityStopped(final l3d l3d, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)l3d);
        s.writeLong(n);
        this.U0(26, s);
    }
    
    public final void registerOnMeasurementEventListener(final oqy oqy) throws RemoteException {
        final Parcel s = this.s();
        emy.d(s, (IInterface)oqy);
        this.U0(35, s);
    }
    
    public final void setConditionalUserProperty(final Bundle bundle, final long n) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)bundle);
        s.writeLong(n);
        this.U0(8, s);
    }
    
    public final void setCurrentScreen(final l3d l3d, final String s, final String s2, final long n) throws RemoteException {
        final Parcel s3 = this.s();
        emy.d(s3, (IInterface)l3d);
        s3.writeString(s);
        s3.writeString(s2);
        s3.writeLong(n);
        this.U0(15, s3);
    }
    
    public final void setDataCollectionEnabled(final boolean b) throws RemoteException {
        final Parcel s = this.s();
        final ClassLoader a = emy.a;
        s.writeInt((int)(b ? 1 : 0));
        this.U0(39, s);
    }
    
    public final void setMeasurementEnabled(final boolean b, final long n) throws RemoteException {
        final Parcel s = this.s();
        final ClassLoader a = emy.a;
        s.writeInt((int)(b ? 1 : 0));
        s.writeLong(n);
        this.U0(11, s);
    }
    
    public final void setUserId(final String s, final long n) throws RemoteException {
        final Parcel s2 = this.s();
        s2.writeString(s);
        s2.writeLong(n);
        this.U0(7, s2);
    }
    
    public final void setUserProperty(final String s, final String s2, final l3d l3d, final boolean b, final long n) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        emy.d(s3, (IInterface)l3d);
        s3.writeInt((int)(b ? 1 : 0));
        s3.writeLong(n);
        this.U0(4, s3);
    }
}
