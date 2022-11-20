import android.os.RemoteException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.List;
import java.util.concurrent.Callable;
import android.os.Parcelable$Creator;
import java.util.Objects;
import android.os.Bundle;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e0z extends ily implements i0z
{
    public e0z() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    @Override
    public final boolean s(int n, Parcel o, final Parcel parcel) throws RemoteException {
        boolean b = false;
        final int n2 = 0;
        final boolean b2 = false;
        final ExecutionException ex = null;
        switch (n) {
            default: {
                return false;
            }
            case 20: {
                final twz twz = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                ((lbz)this).w1(twz);
                parcel.writeNoException();
                break;
            }
            case 19: {
                final Bundle bundle = (Bundle)lly.a((Parcel)o, Bundle.CREATOR);
                final twz twz2 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz = (lbz)this;
                lbz.D1(twz2);
                final String d0 = twz2.D0;
                eli.q(d0);
                lbz.U0((Runnable)new r8z(lbz, d0, bundle, 0));
                parcel.writeNoException();
                break;
            }
            case 18: {
                final twz twz3 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                ((lbz)this).C1(twz3);
                parcel.writeNoException();
                break;
            }
            case 17: {
                final String string = ((Parcel)o).readString();
                final String string2 = ((Parcel)o).readString();
                final String string3 = ((Parcel)o).readString();
                lly.b((Parcel)o);
                final List n3 = ((lbz)this).n1(string, string2, string3);
                parcel.writeNoException();
                parcel.writeTypedList(n3);
                break;
            }
            case 16: {
                final String string4 = ((Parcel)o).readString();
                final String string5 = ((Parcel)o).readString();
                final twz twz4 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final List e1 = ((lbz)this).e1(string4, string5, twz4);
                parcel.writeNoException();
                parcel.writeTypedList(e1);
                break;
            }
            case 15: {
                final String string6 = ((Parcel)o).readString();
                final String string7 = ((Parcel)o).readString();
                final String string8 = ((Parcel)o).readString();
                final ClassLoader a = lly.a;
                boolean b3 = b2;
                if (((Parcel)o).readInt() != 0) {
                    b3 = true;
                }
                lly.b((Parcel)o);
                final List d2 = ((lbz)this).d1(string6, string7, string8, b3);
                parcel.writeNoException();
                parcel.writeTypedList(d2);
                break;
            }
            case 14: {
                final String string9 = ((Parcel)o).readString();
                final String string10 = ((Parcel)o).readString();
                final ClassLoader a2 = lly.a;
                if (((Parcel)o).readInt() != 0) {
                    b = true;
                }
                final twz twz5 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final List r = ((lbz)this).R(string9, string10, b, twz5);
                parcel.writeNoException();
                parcel.writeTypedList(r);
                break;
            }
            case 13: {
                final qay qay = (qay)lly.a((Parcel)o, qay.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz2 = (lbz)this;
                Objects.requireNonNull(qay, "null reference");
                eli.q(qay.F0);
                eli.n(qay.D0);
                lbz2.V1(qay.D0, true);
                lbz2.U0((Runnable)new j3y((Object)lbz2, (Object)new qay(qay), 1, (da8)null));
                parcel.writeNoException();
                break;
            }
            case 12: {
                final qay qay2 = (qay)lly.a((Parcel)o, qay.CREATOR);
                final twz twz6 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                ((lbz)this).h0(qay2, twz6);
                parcel.writeNoException();
                break;
            }
            case 11: {
                final twz twz7 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final String t0 = ((lbz)this).t0(twz7);
                parcel.writeNoException();
                parcel.writeString(t0);
                break;
            }
            case 10: {
                final long long1 = ((Parcel)o).readLong();
                final String string11 = ((Parcel)o).readString();
                final String string12 = ((Parcel)o).readString();
                final String string13 = ((Parcel)o).readString();
                lly.b((Parcel)o);
                ((lbz)this).n0(long1, string11, string12, string13);
                parcel.writeNoException();
                break;
            }
            case 9: {
                final wgy wgy = (wgy)lly.a((Parcel)o, (Parcelable$Creator)wgy.CREATOR);
                final String string14 = ((Parcel)o).readString();
                lly.b((Parcel)o);
                final byte[] i0 = ((lbz)this).i0(wgy, string14);
                parcel.writeNoException();
                parcel.writeByteArray(i0);
                break;
            }
            case 7: {
                final twz twz8 = (twz)lly.a((Parcel)o, twz.CREATOR);
                n = n2;
                if (((Parcel)o).readInt() != 0) {
                    n = 1;
                }
                lly.b((Parcel)o);
                final lbz lbz3 = (lbz)this;
                lbz3.D1(twz8);
                final String d3 = twz8.D0;
                eli.q(d3);
                o = (ExecutionException)lbz3.a.a().o((Callable)new laz(lbz3, d3));
                Label_0964: {
                    try {
                        final List list = ((FutureTask)o).get();
                        o = (ExecutionException)new ArrayList(list.size());
                        for (final dpz dpz : list) {
                            if (n != 0 || !lpz.V(dpz.c)) {
                                ((ArrayList<yoz>)o).add(new yoz(dpz));
                            }
                        }
                        break Label_0964;
                    }
                    catch (final ExecutionException o) {}
                    catch (final InterruptedException ex2) {}
                    lbz3.a.b().I0.c("Failed to get user properties. appId", q2z.s(twz8.D0), (Object)o);
                    o = ex;
                }
                parcel.writeNoException();
                parcel.writeTypedList((List)o);
                break;
            }
            case 6: {
                final twz twz9 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz4 = (lbz)this;
                lbz4.D1(twz9);
                lbz4.U0((Runnable)new s9z((Object)lbz4, (Object)twz9, 0));
                parcel.writeNoException();
                break;
            }
            case 5: {
                final wgy wgy2 = (wgy)lly.a((Parcel)o, (Parcelable$Creator)wgy.CREATOR);
                final String string15 = ((Parcel)o).readString();
                ((Parcel)o).readString();
                lly.b((Parcel)o);
                final lbz lbz5 = (lbz)this;
                Objects.requireNonNull(wgy2, "null reference");
                eli.n(string15);
                lbz5.V1(string15, true);
                lbz5.U0((Runnable)new u8z(lbz5, wgy2, string15, 1));
                parcel.writeNoException();
                break;
            }
            case 4: {
                final twz twz10 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz6 = (lbz)this;
                lbz6.D1(twz10);
                lbz6.U0((Runnable)new uxz((Object)lbz6, (Object)twz10, 3, (da8)null));
                parcel.writeNoException();
                break;
            }
            case 2: {
                final yoz yoz = (yoz)lly.a((Parcel)o, (Parcelable$Creator)yoz.CREATOR);
                final twz twz11 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz7 = (lbz)this;
                Objects.requireNonNull(yoz, "null reference");
                lbz7.D1(twz11);
                lbz7.U0((Runnable)new haz(lbz7, yoz, twz11));
                parcel.writeNoException();
                break;
            }
            case 1: {
                final wgy wgy3 = (wgy)lly.a((Parcel)o, (Parcelable$Creator)wgy.CREATOR);
                final twz twz12 = (twz)lly.a((Parcel)o, twz.CREATOR);
                lly.b((Parcel)o);
                final lbz lbz8 = (lbz)this;
                Objects.requireNonNull(wgy3, "null reference");
                lbz8.D1(twz12);
                lbz8.U0((Runnable)new r8z(lbz8, wgy3, twz12, 1));
                parcel.writeNoException();
                break;
            }
        }
        return true;
    }
}
