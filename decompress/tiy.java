import android.os.RemoteException;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tiy extends txy implements fty
{
    public tiy(final IBinder binder) {
        super(binder);
    }
    
    public final Bundle B1(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeInt(3);
        s4.writeString(s);
        s4.writeString(s2);
        s4.writeString(s3);
        final Parcel x = this.x(4, s4);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle = (Bundle)g7z.a(x);
        x.recycle();
        return bundle;
    }
    
    public final Bundle E1(final String s, final String s2, final Bundle bundle, final Bundle bundle2) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeInt(10);
        s3.writeString(s);
        s3.writeString(s2);
        final int a = g7z.a;
        s3.writeInt(1);
        bundle.writeToParcel(s3, 0);
        s3.writeInt(1);
        bundle2.writeToParcel(s3, 0);
        final Parcel x = this.x(901, s3);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle3 = (Bundle)g7z.a(x);
        x.recycle();
        return bundle3;
    }
    
    public final Bundle Q1(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeInt(3);
        s4.writeString(s);
        s4.writeString(s2);
        s4.writeString(s3);
        s4.writeString((String)null);
        final Parcel x = this.x(3, s4);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle = (Bundle)g7z.a(x);
        x.recycle();
        return bundle;
    }
    
    public final Bundle R1(final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeInt(9);
        s4.writeString(s);
        s4.writeString(s2);
        s4.writeString(s3);
        final int a = g7z.a;
        s4.writeInt(1);
        bundle.writeToParcel(s4, 0);
        final Parcel x = this.x(11, s4);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle2 = (Bundle)g7z.a(x);
        x.recycle();
        return bundle2;
    }
    
    public final Bundle T0(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeInt(9);
        s3.writeString(s);
        s3.writeString(s2);
        final int a = g7z.a;
        s3.writeInt(1);
        bundle.writeToParcel(s3, 0);
        final Parcel x = this.x(12, s3);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle2 = (Bundle)g7z.a(x);
        x.recycle();
        return bundle2;
    }
    
    public final Bundle Y0(int a, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel s4 = this.s();
        s4.writeInt(a);
        s4.writeString(s);
        s4.writeString(s2);
        s4.writeString(s3);
        s4.writeString((String)null);
        a = g7z.a;
        s4.writeInt(1);
        bundle.writeToParcel(s4, 0);
        final Parcel x = this.x(8, s4);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle2 = (Bundle)g7z.a(x);
        x.recycle();
        return bundle2;
    }
    
    public final int j0(int int1, final String s, final String s2) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeInt(int1);
        s3.writeString(s);
        s3.writeString(s2);
        final Parcel x = this.x(1, s3);
        int1 = x.readInt();
        x.recycle();
        return int1;
    }
    
    public final Bundle j1(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeInt(3);
        s3.writeString(s);
        s3.writeString(s2);
        final int a = g7z.a;
        s3.writeInt(1);
        bundle.writeToParcel(s3, 0);
        final Parcel x = this.x(2, s3);
        final Parcelable$Creator creator = Bundle.CREATOR;
        final Bundle bundle2 = (Bundle)g7z.a(x);
        x.recycle();
        return bundle2;
    }
    
    public final int w(final String s, final String s2) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeInt(3);
        s3.writeString(s);
        s3.writeString(s2);
        final Parcel x = this.x(5, s3);
        final int int1 = x.readInt();
        x.recycle();
        return int1;
    }
}
