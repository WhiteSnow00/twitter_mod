import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpz implements Parcelable$Creator<t2c>
{
    public static void a(final t2c t2c, final Parcel parcel, final int n) {
        final int x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, t2c.C0);
        ri4.n0(parcel, 2, t2c.D0);
        ri4.n0(parcel, 3, t2c.E0);
        ri4.s0(parcel, 4, t2c.F0);
        ri4.m0(parcel, 5, t2c.G0);
        ri4.v0(parcel, 6, (Parcelable[])t2c.H0, n);
        ri4.g0(parcel, 7, t2c.I0);
        ri4.r0(parcel, 8, (Parcelable)t2c.J0, n);
        ri4.v0(parcel, 10, (Parcelable[])t2c.K0, n);
        ri4.v0(parcel, 11, (Parcelable[])t2c.L0, n);
        ri4.e0(parcel, 12, t2c.M0);
        ri4.n0(parcel, 13, t2c.N0);
        ri4.e0(parcel, 14, t2c.O0);
        ri4.s0(parcel, 15, t2c.P0);
        ri4.A0(parcel, x0);
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        final int w = SafeParcelReader.w(parcel);
        Object q;
        Object e = q = null;
        Object a;
        Object o = a = q;
        Object o3;
        Object o2 = o3 = a;
        Object e2;
        Object[] array = (Object[])(e2 = o3);
        int r = 0;
        int r2 = 0;
        int r3 = 0;
        boolean k = false;
        int r4 = 0;
        boolean i = false;
        while (parcel.dataPosition() < w) {
            final int int1 = parcel.readInt();
            switch ((char)int1) {
                default: {
                    SafeParcelReader.v(parcel, int1);
                    continue;
                }
                case '\u000f': {
                    e2 = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u000e': {
                    i = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\r': {
                    r4 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\f': {
                    k = SafeParcelReader.k(parcel, int1);
                    continue;
                }
                case '\u000b': {
                    array = SafeParcelReader.h(parcel, int1, bta.CREATOR);
                    continue;
                }
                case '\n': {
                    o3 = SafeParcelReader.h(parcel, int1, bta.CREATOR);
                    continue;
                }
                case '\b': {
                    o2 = SafeParcelReader.d(parcel, int1, Account.CREATOR);
                    continue;
                }
                case '\u0007': {
                    a = SafeParcelReader.a(parcel, int1);
                    continue;
                }
                case '\u0006': {
                    o = SafeParcelReader.h(parcel, int1, (Parcelable$Creator)Scope.CREATOR);
                    continue;
                }
                case '\u0005': {
                    q = SafeParcelReader.q(parcel, int1);
                    continue;
                }
                case '\u0004': {
                    e = SafeParcelReader.e(parcel, int1);
                    continue;
                }
                case '\u0003': {
                    r3 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u0002': {
                    r2 = SafeParcelReader.r(parcel, int1);
                    continue;
                }
                case '\u0001': {
                    r = SafeParcelReader.r(parcel, int1);
                    continue;
                }
            }
        }
        SafeParcelReader.j(parcel, w);
        return new t2c(r, r2, r3, (String)e, (IBinder)q, (Scope[])o, (Bundle)a, (Account)o2, (bta[])o3, (bta[])array, k, r4, i, (String)e2);
    }
}
