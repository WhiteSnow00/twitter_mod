import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yyz extends sd
{
    public static final Parcelable$Creator<yyz> CREATOR;
    public final String F0;
    public final ifz G0;
    public final boolean H0;
    public final boolean I0;
    
    static {
        CREATOR = (Parcelable$Creator)new nzz();
    }
    
    public yyz(final String f0, final IBinder binder, final boolean h0, final boolean i0) {
        this.F0 = f0;
        final ifz ifz = null;
        ifz g0;
        if (binder == null) {
            g0 = ifz;
        }
        else {
            try {
                final int a = y100.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                Object o;
                if (queryLocalInterface instanceof z100) {
                    o = queryLocalInterface;
                }
                else {
                    o = new h100(binder);
                }
                final l3d e = ((z100)o).e();
                byte[] array;
                if (e == null) {
                    array = null;
                }
                else {
                    array = p5j.U0(e);
                }
                if (array != null) {
                    g0 = new kiz(array);
                }
                else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    g0 = ifz;
                }
            }
            catch (final RemoteException ex) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
                g0 = ifz;
            }
        }
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public yyz(final String f0, final ifz g0, final boolean h0, final boolean i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x1) {
        x1 = xd.x1(parcel, 20293);
        xd.s1(parcel, 1, this.F0);
        Object g0;
        if ((g0 = this.G0) == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            g0 = null;
        }
        xd.m1(parcel, 2, (IBinder)g0);
        xd.e1(parcel, 3, this.H0);
        xd.e1(parcel, 4, this.I0);
        xd.B1(parcel, x1);
    }
}
