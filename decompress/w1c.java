import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w1c extends rd
{
    public static final Parcelable$Creator<w1c> CREATOR;
    public final int D0;
    public final int E0;
    public int F0;
    public String G0;
    public IBinder H0;
    public Scope[] I0;
    public Bundle J0;
    public Account K0;
    public yra[] L0;
    public yra[] M0;
    public boolean N0;
    public int O0;
    public boolean P0;
    public String Q0;
    
    static {
        CREATOR = (Parcelable$Creator)new hqz();
    }
    
    public w1c(int a, final int e0, final int f0, final String g0, final IBinder h0, final Scope[] i0, final Bundle j0, Account k0, final yra[] l0, final yra[] m0, final boolean n0, final int o0, final boolean p14, final String q0) {
        this.D0 = a;
        this.E0 = e0;
        this.F0 = f0;
        if ("com.google.android.gms".equals(g0)) {
            this.G0 = "com.google.android.gms";
        }
        else {
            this.G0 = g0;
        }
        if (a < 2) {
            final Account account = null;
            k0 = null;
            Account k2 = account;
            Label_0136: {
                if (h0 != null) {
                    final q1d x = q1d$a.x(h0);
                    a = bh.a;
                    k2 = account;
                    if (x != null) {
                        final long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            try {
                                x.c();
                            }
                            finally {}
                        }
                        catch (final RemoteException ex) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            k2 = k0;
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        break Label_0136;
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.K0 = k2;
        }
        else {
            this.H0 = h0;
            this.K0 = k0;
        }
        this.I0 = i0;
        this.J0 = j0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
    }
    
    public w1c(final int e0, final String q0) {
        this.D0 = 6;
        this.F0 = q4c.a;
        this.E0 = e0;
        this.N0 = true;
        this.Q0 = q0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        hqz.a(this, parcel, n);
    }
}
