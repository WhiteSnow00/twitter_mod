import android.os.RemoteException;
import java.util.Iterator;
import android.os.Parcelable$Creator;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.Objects;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ozy extends rky implements szy
{
    public ozy() {
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
                final hwz hwz = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                ((waz)this).x1(hwz);
                parcel.writeNoException();
                break;
            }
            case 19: {
                final Bundle bundle = (Bundle)uky.a((Parcel)o, Bundle.CREATOR);
                final hwz hwz2 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final waz waz = (waz)this;
                waz.D1(hwz2);
                final String c0 = hwz2.C0;
                xd.t((Object)c0);
                waz.U0((Runnable)new c8z(waz, (Object)c0, (Object)bundle, 0));
                parcel.writeNoException();
                break;
            }
            case 18: {
                final hwz hwz3 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                ((waz)this).C1(hwz3);
                parcel.writeNoException();
                break;
            }
            case 17: {
                final String string = ((Parcel)o).readString();
                final String string2 = ((Parcel)o).readString();
                final String string3 = ((Parcel)o).readString();
                uky.b((Parcel)o);
                final List o2 = ((waz)this).o1(string, string2, string3);
                parcel.writeNoException();
                parcel.writeTypedList(o2);
                break;
            }
            case 16: {
                final String string4 = ((Parcel)o).readString();
                final String string5 = ((Parcel)o).readString();
                final hwz hwz4 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final List e1 = ((waz)this).e1(string4, string5, hwz4);
                parcel.writeNoException();
                parcel.writeTypedList(e1);
                break;
            }
            case 15: {
                final String string6 = ((Parcel)o).readString();
                final String string7 = ((Parcel)o).readString();
                final String string8 = ((Parcel)o).readString();
                final ClassLoader a = uky.a;
                if (((Parcel)o).readInt() != 0) {
                    b2 = true;
                }
                uky.b((Parcel)o);
                final List d1 = ((waz)this).d1(string6, string7, string8, b2);
                parcel.writeNoException();
                parcel.writeTypedList(d1);
                break;
            }
            case 14: {
                final String string9 = ((Parcel)o).readString();
                final String string10 = ((Parcel)o).readString();
                final ClassLoader a2 = uky.a;
                boolean b3 = b;
                if (((Parcel)o).readInt() != 0) {
                    b3 = true;
                }
                final hwz hwz5 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final List r = ((waz)this).R(string9, string10, b3, hwz5);
                parcel.writeNoException();
                parcel.writeTypedList(r);
                break;
            }
            case 13: {
                final aay aay = (aay)uky.a((Parcel)o, aay.CREATOR);
                uky.b((Parcel)o);
                final waz waz2 = (waz)this;
                Objects.requireNonNull(aay, "null reference");
                xd.t((Object)aay.E0);
                xd.q(aay.C0);
                waz2.V1(aay.C0, true);
                waz2.U0((Runnable)new t2y((Object)waz2, (Object)new aay(aay), 1, (w48)null));
                parcel.writeNoException();
                break;
            }
            case 12: {
                final aay aay2 = (aay)uky.a((Parcel)o, aay.CREATOR);
                final hwz hwz6 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                ((waz)this).k1(aay2, hwz6);
                parcel.writeNoException();
                break;
            }
            case 11: {
                final hwz hwz7 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final String t0 = ((waz)this).t0(hwz7);
                parcel.writeNoException();
                parcel.writeString(t0);
                break;
            }
            case 10: {
                final long long1 = ((Parcel)o).readLong();
                final String string11 = ((Parcel)o).readString();
                final String string12 = ((Parcel)o).readString();
                final String string13 = ((Parcel)o).readString();
                uky.b((Parcel)o);
                ((waz)this).n0(long1, string11, string12, string13);
                parcel.writeNoException();
                break;
            }
            case 9: {
                final hgy hgy = (hgy)uky.a((Parcel)o, hgy.CREATOR);
                final String string14 = ((Parcel)o).readString();
                uky.b((Parcel)o);
                final byte[] i0 = ((waz)this).i0(hgy, string14);
                parcel.writeNoException();
                parcel.writeByteArray(i0);
                break;
            }
            case 7: {
                final hwz hwz8 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                n = n2;
                if (((Parcel)o).readInt() != 0) {
                    n = 1;
                }
                uky.b((Parcel)o);
                final waz waz3 = (waz)this;
                waz3.D1(hwz8);
                final String c2 = hwz8.C0;
                xd.t((Object)c2);
                o = (ExecutionException)waz3.a.a().o((Callable)new w9z(waz3, c2));
                Label_0964: {
                    try {
                        final List list = ((FutureTask)o).get();
                        o = (ExecutionException)new ArrayList(list.size());
                        for (final poz poz : list) {
                            if (n != 0 || !xoz.V(poz.c)) {
                                ((ArrayList<koz>)o).add(new koz(poz));
                            }
                        }
                        break Label_0964;
                    }
                    catch (final ExecutionException o) {}
                    catch (final InterruptedException ex2) {}
                    waz3.a.b().H0.c("Failed to get user properties. appId", b2z.s(hwz8.C0), (Object)o);
                    o = ex;
                }
                parcel.writeNoException();
                parcel.writeTypedList((List)o);
                break;
            }
            case 6: {
                final hwz hwz9 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final waz waz4 = (waz)this;
                waz4.D1(hwz9);
                waz4.U0((Runnable)new d9z((Object)waz4, (Object)hwz9, 0));
                parcel.writeNoException();
                break;
            }
            case 5: {
                final hgy hgy2 = (hgy)uky.a((Parcel)o, hgy.CREATOR);
                final String string15 = ((Parcel)o).readString();
                ((Parcel)o).readString();
                uky.b((Parcel)o);
                final waz waz5 = (waz)this;
                Objects.requireNonNull(hgy2, "null reference");
                xd.q(string15);
                waz5.V1(string15, true);
                waz5.U0((Runnable)new f8z(waz5, (sd)hgy2, string15, 1));
                parcel.writeNoException();
                break;
            }
            case 4: {
                final hwz hwz10 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final waz waz6 = (waz)this;
                waz6.D1(hwz10);
                waz6.U0((Runnable)new ixz(waz6, hwz10, 3, null));
                parcel.writeNoException();
                break;
            }
            case 2: {
                final koz koz = (koz)uky.a((Parcel)o, (Parcelable$Creator)koz.CREATOR);
                final hwz hwz11 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final waz waz7 = (waz)this;
                Objects.requireNonNull(koz, "null reference");
                waz7.D1(hwz11);
                waz7.U0((Runnable)new s9z(waz7, koz, hwz11));
                parcel.writeNoException();
                break;
            }
            case 1: {
                final hgy hgy3 = (hgy)uky.a((Parcel)o, hgy.CREATOR);
                final hwz hwz12 = (hwz)uky.a((Parcel)o, hwz.CREATOR);
                uky.b((Parcel)o);
                final waz waz8 = (waz)this;
                Objects.requireNonNull(hgy3, "null reference");
                waz8.D1(hwz12);
                waz8.U0((Runnable)new c8z(waz8, (Object)hgy3, (Object)hwz12, 1));
                parcel.writeNoException();
                break;
            }
        }
        return true;
    }
}
