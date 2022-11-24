import android.os.RemoteException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Objects;
import android.os.Parcelable$Creator;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c1z extends bmy implements g1z
{
    public c1z() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    public final boolean s(int n, Parcel o, final Parcel parcel) throws RemoteException {
        final boolean b = false;
        final int n2 = 0;
        boolean b2 = false;
        final ExecutionException ex = null;
        switch (n) {
            default: {
                return false;
            }
            case 20: {
                final sxz sxz = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                ((kcz)this).x1(sxz);
                parcel.writeNoException();
                break;
            }
            case 19: {
                final Bundle bundle = (Bundle)emy.a((Parcel)o, Bundle.CREATOR);
                final sxz sxz2 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz = (kcz)this;
                kcz.D1(sxz2);
                final String f0 = sxz2.F0;
                iuk.C((Object)f0);
                kcz.U0((Runnable)new q9z(kcz, (Object)f0, (Object)bundle, 0));
                parcel.writeNoException();
                break;
            }
            case 18: {
                final sxz sxz3 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                ((kcz)this).C1(sxz3);
                parcel.writeNoException();
                break;
            }
            case 17: {
                final String string = ((Parcel)o).readString();
                final String string2 = ((Parcel)o).readString();
                final String string3 = ((Parcel)o).readString();
                emy.b((Parcel)o);
                final List o2 = ((kcz)this).o1(string, string2, string3);
                parcel.writeNoException();
                parcel.writeTypedList(o2);
                break;
            }
            case 16: {
                final String string4 = ((Parcel)o).readString();
                final String string5 = ((Parcel)o).readString();
                final sxz sxz4 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final List e1 = ((kcz)this).e1(string4, string5, sxz4);
                parcel.writeNoException();
                parcel.writeTypedList(e1);
                break;
            }
            case 15: {
                final String string6 = ((Parcel)o).readString();
                final String string7 = ((Parcel)o).readString();
                final String string8 = ((Parcel)o).readString();
                final ClassLoader a = emy.a;
                if (((Parcel)o).readInt() != 0) {
                    b2 = true;
                }
                emy.b((Parcel)o);
                final List d1 = ((kcz)this).d1(string6, string7, string8, b2);
                parcel.writeNoException();
                parcel.writeTypedList(d1);
                break;
            }
            case 14: {
                final String string9 = ((Parcel)o).readString();
                final String string10 = ((Parcel)o).readString();
                final ClassLoader a2 = emy.a;
                boolean b3 = b;
                if (((Parcel)o).readInt() != 0) {
                    b3 = true;
                }
                final sxz sxz5 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final List r = ((kcz)this).R(string9, string10, b3, sxz5);
                parcel.writeNoException();
                parcel.writeTypedList(r);
                break;
            }
            case 13: {
                final kby kby = (kby)emy.a((Parcel)o, (Parcelable$Creator)kby.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz2 = (kcz)this;
                Objects.requireNonNull(kby, "null reference");
                iuk.C((Object)kby.H0);
                iuk.z(kby.F0);
                kcz2.V1(kby.F0, true);
                kcz2.U0((Runnable)new d4y((Object)kcz2, (Object)new kby(kby), 1, (j98)null));
                parcel.writeNoException();
                break;
            }
            case 12: {
                final kby kby2 = (kby)emy.a((Parcel)o, (Parcelable$Creator)kby.CREATOR);
                final sxz sxz6 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                ((kcz)this).k1(kby2, sxz6);
                parcel.writeNoException();
                break;
            }
            case 11: {
                final sxz sxz7 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final String t0 = ((kcz)this).t0(sxz7);
                parcel.writeNoException();
                parcel.writeString(t0);
                break;
            }
            case 10: {
                final long long1 = ((Parcel)o).readLong();
                final String string11 = ((Parcel)o).readString();
                final String string12 = ((Parcel)o).readString();
                final String string13 = ((Parcel)o).readString();
                emy.b((Parcel)o);
                ((kcz)this).n0(long1, string11, string12, string13);
                parcel.writeNoException();
                break;
            }
            case 9: {
                final rhy rhy = (rhy)emy.a((Parcel)o, (Parcelable$Creator)rhy.CREATOR);
                final String string14 = ((Parcel)o).readString();
                emy.b((Parcel)o);
                final byte[] i0 = ((kcz)this).i0(rhy, string14);
                parcel.writeNoException();
                parcel.writeByteArray(i0);
                break;
            }
            case 7: {
                final sxz sxz8 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                n = n2;
                if (((Parcel)o).readInt() != 0) {
                    n = 1;
                }
                emy.b((Parcel)o);
                final kcz kcz3 = (kcz)this;
                kcz3.D1(sxz8);
                final String f2 = sxz8.F0;
                iuk.C((Object)f2);
                o = (ExecutionException)kcz3.a.a().o((Callable)new kbz(kcz3, f2));
                Label_0964: {
                    try {
                        final List list = ((FutureTask)o).get();
                        o = (ExecutionException)new ArrayList(list.size());
                        for (final cqz cqz : list) {
                            if (n != 0 || !kqz.V(cqz.c)) {
                                ((ArrayList<xpz>)o).add(new xpz(cqz));
                            }
                        }
                        break Label_0964;
                    }
                    catch (final ExecutionException o) {}
                    catch (final InterruptedException ex2) {}
                    kcz3.a.b().K0.c("Failed to get user properties. appId", o3z.s(sxz8.F0), (Object)o);
                    o = ex;
                }
                parcel.writeNoException();
                parcel.writeTypedList((List)o);
                break;
            }
            case 6: {
                final sxz sxz9 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz4 = (kcz)this;
                kcz4.D1(sxz9);
                kcz4.U0(new raz(kcz4, sxz9, 0));
                parcel.writeNoException();
                break;
            }
            case 5: {
                final rhy rhy2 = (rhy)emy.a((Parcel)o, (Parcelable$Creator)rhy.CREATOR);
                final String string15 = ((Parcel)o).readString();
                ((Parcel)o).readString();
                emy.b((Parcel)o);
                final kcz kcz5 = (kcz)this;
                Objects.requireNonNull(rhy2, "null reference");
                iuk.z(string15);
                kcz5.V1(string15, true);
                kcz5.U0(new t9z(kcz5, rhy2, string15, 1));
                parcel.writeNoException();
                break;
            }
            case 4: {
                final sxz sxz10 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz6 = (kcz)this;
                kcz6.D1(sxz10);
                kcz6.U0((Runnable)new tyz((Object)kcz6, (Object)sxz10, 3, (j98)null));
                parcel.writeNoException();
                break;
            }
            case 2: {
                final xpz xpz = (xpz)emy.a((Parcel)o, xpz.CREATOR);
                final sxz sxz11 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz7 = (kcz)this;
                Objects.requireNonNull(xpz, "null reference");
                kcz7.D1(sxz11);
                kcz7.U0((Runnable)new gbz(kcz7, xpz, sxz11));
                parcel.writeNoException();
                break;
            }
            case 1: {
                final rhy rhy3 = (rhy)emy.a((Parcel)o, (Parcelable$Creator)rhy.CREATOR);
                final sxz sxz12 = (sxz)emy.a((Parcel)o, sxz.CREATOR);
                emy.b((Parcel)o);
                final kcz kcz8 = (kcz)this;
                Objects.requireNonNull(rhy3, "null reference");
                kcz8.D1(sxz12);
                kcz8.U0((Runnable)new q9z(kcz8, (Object)rhy3, (Object)sxz12, 1));
                parcel.writeNoException();
                break;
            }
        }
        return true;
    }
}
