import android.os.Bundle;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.util.List;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x0z extends uly implements g1z
{
    public x0z(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    public final void C1(final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)sxz);
        this.U0(18, s);
    }
    
    public final void G0(final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)sxz);
        this.U0(6, s);
    }
    
    public final void O1(final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)sxz);
        this.U0(4, s);
    }
    
    public final List R(final String s, final String s2, final boolean b, final sxz sxz) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        final ClassLoader a = emy.a;
        s3.writeInt((int)(b ? 1 : 0));
        emy.c(s3, (Parcelable)sxz);
        final Parcel x = this.x(14, s3);
        final ArrayList typedArrayList = x.createTypedArrayList(xpz.CREATOR);
        x.recycle();
        return typedArrayList;
    }
    
    public final void R0(final rhy rhy, final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)rhy);
        emy.c(s, (Parcelable)sxz);
        this.U0(1, s);
    }
    
    public final void a0(final xpz xpz, final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)xpz);
        emy.c(s, (Parcelable)sxz);
        this.U0(2, s);
    }
    
    public final List d1(final String s, final String s2, final String s3, final boolean b) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeString((String)null);
        s4.writeString(s2);
        s4.writeString(s3);
        final ClassLoader a = emy.a;
        s4.writeInt((int)(b ? 1 : 0));
        final Parcel x = this.x(15, s4);
        final ArrayList typedArrayList = x.createTypedArrayList(xpz.CREATOR);
        x.recycle();
        return typedArrayList;
    }
    
    public final List e1(final String s, final String s2, final sxz sxz) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        emy.c(s3, (Parcelable)sxz);
        final Parcel x = this.x(16, s3);
        final ArrayList typedArrayList = x.createTypedArrayList((Parcelable$Creator)kby.CREATOR);
        x.recycle();
        return typedArrayList;
    }
    
    public final byte[] i0(final rhy rhy, final String s) throws RemoteException {
        final Parcel s2 = this.s();
        emy.c(s2, (Parcelable)rhy);
        s2.writeString(s);
        final Parcel x = this.x(9, s2);
        final byte[] byteArray = x.createByteArray();
        x.recycle();
        return byteArray;
    }
    
    public final void k1(final kby kby, final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)kby);
        emy.c(s, (Parcelable)sxz);
        this.U0(12, s);
    }
    
    public final void n0(final long n, final String s, final String s2, final String s3) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeLong(n);
        s4.writeString(s);
        s4.writeString(s2);
        s4.writeString(s3);
        this.U0(10, s4);
    }
    
    public final List o1(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeString((String)null);
        s4.writeString(s2);
        s4.writeString(s3);
        final Parcel x = this.x(17, s4);
        final ArrayList typedArrayList = x.createTypedArrayList((Parcelable$Creator)kby.CREATOR);
        x.recycle();
        return typedArrayList;
    }
    
    public final String t0(final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)sxz);
        final Parcel x = this.x(11, s);
        final String string = x.readString();
        x.recycle();
        return string;
    }
    
    public final void x1(final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)sxz);
        this.U0(20, s);
    }
    
    public final void z0(final Bundle bundle, final sxz sxz) throws RemoteException {
        final Parcel s = this.s();
        emy.c(s, (Parcelable)bundle);
        emy.c(s, (Parcelable)sxz);
        this.U0(19, s);
    }
}
