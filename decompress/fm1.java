import android.os.Handler;
import android.os.IBinder;
import android.content.Intent;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.os.RemoteException;
import android.accounts.Account;
import java.util.concurrent.Executor;
import android.content.ServiceConnection;
import android.util.Log;
import java.util.Objects;
import android.os.DeadObjectException;
import java.util.Collections;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.os.Bundle;
import android.text.TextUtils;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import android.content.Context;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fm1<T extends IInterface>
{
    public static final bta[] e1;
    public int C0;
    public long D0;
    public long E0;
    public int F0;
    public long G0;
    public volatile String H0;
    public pyz I0;
    public final Context J0;
    public final h5c K0;
    public final o5c L0;
    public final diy M0;
    public final Object N0;
    public final Object O0;
    public v2d P0;
    public c Q0;
    public T R0;
    public final ArrayList<jny<?>> S0;
    public vwy T0;
    public int U0;
    public final a V0;
    public final b W0;
    public final int X0;
    public final String Y0;
    public volatile String Z0;
    public ph6 a1;
    public boolean b1;
    public volatile pgz c1;
    public AtomicInteger d1;
    
    static {
        e1 = new bta[0];
    }
    
    public fm1(final Context j0, final Looper looper, final h5c k0, final o5c l0, final int x0, final a v0, final b w0, final String y0) {
        this.H0 = null;
        this.N0 = new Object();
        this.O0 = new Object();
        this.S0 = new ArrayList<jny<?>>();
        this.U0 = 1;
        this.a1 = null;
        this.b1 = false;
        this.c1 = null;
        this.d1 = new AtomicInteger(0);
        xd.u((Object)j0, (Object)"Context must not be null");
        this.J0 = j0;
        xd.u((Object)looper, (Object)"Looper must not be null");
        xd.u((Object)k0, (Object)"Supervisor must not be null");
        this.K0 = k0;
        xd.u((Object)l0, (Object)"API availability must not be null");
        this.L0 = l0;
        this.M0 = new diy(this, looper);
        this.X0 = x0;
        this.V0 = v0;
        this.W0 = w0;
        this.Y0 = y0;
    }
    
    public void A() {
    }
    
    public Bundle B() {
        return new Bundle();
    }
    
    public Set<Scope> C() {
        return Collections.emptySet();
    }
    
    public final T D() throws DeadObjectException {
        synchronized (this.N0) {
            if (this.U0 != 5) {
                this.w();
                final IInterface r0 = this.R0;
                xd.u((Object)r0, (Object)"Client is connected but service is null");
                return (T)r0;
            }
            throw new DeadObjectException();
        }
    }
    
    public abstract String E();
    
    public abstract String F();
    
    public boolean G() {
        return this.r() >= 211700000;
    }
    
    public final void H(final ph6 ph6) {
        this.F0 = ph6.D0;
        this.G0 = System.currentTimeMillis();
    }
    
    public boolean I() {
        return this instanceof nsy;
    }
    
    public final String J() {
        String s;
        if ((s = this.Y0) == null) {
            s = this.J0.getClass().getName();
        }
        return s;
    }
    
    public final void N(int u0, final T r0) {
        boolean b = false;
        if (u0 == 4 == (r0 != null)) {
            b = true;
        }
        xd.k(b);
        final Object n0 = this.N0;
        monitorenter(n0);
        Label_0279: {
            try {
                this.U0 = u0;
                this.R0 = r0;
                if (u0 == 1) {
                    break Label_0279;
                }
                if (u0 != 2 && u0 != 3) {
                    if (u0 != 4) {
                        break Label_0279;
                    }
                    Objects.requireNonNull(r0, "null reference");
                    this.E0 = System.currentTimeMillis();
                    break Label_0279;
                }
                else {
                    final vwy t0 = this.T0;
                    if (t0 == null) {
                        break Label_0279;
                    }
                    final pyz i0 = this.I0;
                    if (i0 != null) {
                        final String a = i0.a;
                        u0 = String.valueOf(a).length();
                        final StringBuilder sb = new StringBuilder(u0 + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append("com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        final h5c k0 = this.K0;
                        final String a2 = this.I0.a;
                        xd.t((Object)a2);
                        Objects.requireNonNull(this.I0);
                        this.J();
                        k0.c(a2, "com.google.android.gms", 4225, (ServiceConnection)t0, this.I0.b);
                        this.d1.incrementAndGet();
                    }
                    break Label_0279;
                }
            }
            finally {
                monitorexit(n0);
                String concat = null;
                Label_0383: {
                    concat = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                }
                throw new IllegalStateException(concat);
                Label_0403:
                final h5c k2 = this.K0;
                final String a3 = this.I0.a;
                xd.t((Object)a3);
                Objects.requireNonNull(this.I0);
                final String j = this.J();
                final boolean b2 = this.I0.b;
                this.A();
                vwy t2 = null;
                iftrue(Label_0680:)(k2.d(new grz(a3, "com.google.android.gms", 4225, b2), (ServiceConnection)t2, j, null));
                vwy t3 = null;
            Block_17:
                while (true) {
                    Block_14: {
                        Block_16: {
                            break Block_16;
                            t2 = new vwy(this, this.d1.get());
                            this.T0 = t2;
                            final String f = this.F();
                            final Object a4 = h5c.a;
                            final boolean g = this.G();
                            this.I0 = new pyz(f, g);
                            iftrue(Label_0403:)(!g || this.r() >= 17895000);
                            break Block_14;
                        }
                        final String a5 = this.I0.a;
                        final int length = String.valueOf(a5).length();
                        u0 = "com.google.android.gms".length();
                        final StringBuilder sb2 = new StringBuilder(length + 34 + u0);
                        sb2.append("unable to connect to service: ");
                        sb2.append(a5);
                        sb2.append(" on ");
                        sb2.append("com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        u0 = this.d1.get();
                        final diy m0 = this.M0;
                        ((Handler)m0).sendMessage(((Handler)m0).obtainMessage(7, u0, -1, (Object)new e6z(this, 16)));
                        break Label_0279;
                        final String value;
                        concat = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(value);
                        throw new IllegalStateException(concat);
                        t3 = this.T0;
                        iftrue(Label_0680:)(t3 == null);
                        break Block_17;
                    }
                    final String value = String.valueOf(this.I0.a);
                    iftrue(Label_0383:)(value.length() == 0);
                    continue;
                }
                final h5c k3 = this.K0;
                final String a6 = this.I0.a;
                xd.t((Object)a6);
                Objects.requireNonNull(this.I0);
                this.J();
                k3.c(a6, "com.google.android.gms", 4225, (ServiceConnection)t3, this.I0.b);
                this.T0 = null;
                monitorexit(n0);
            }
        }
    }
    
    public final boolean b() {
        synchronized (this.N0) {
            return this.U0 == 4;
        }
    }
    
    public boolean d() {
        return this instanceof h6y;
    }
    
    public final void f(final String h0) {
        this.H0 = h0;
        this.o();
    }
    
    public final boolean g() {
        synchronized (this.N0) {
            final int u0 = this.U0;
            boolean b = true;
            if (u0 != 2) {
                b = (u0 == 3 && b);
            }
            return b;
        }
    }
    
    public final String h() {
        if (this.b() && this.I0 != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    public final boolean i() {
        return true;
    }
    
    public final void j(final e e) {
        final y1y y1y = (y1y)e;
        ((Handler)y1y.a.m.P0).post((Runnable)new x1y(y1y));
    }
    
    public boolean k() {
        return false;
    }
    
    public final void l(final l2d ex, final Set<Scope> set) {
        final Bundle b = this.B();
        final t2c t2c = new t2c(this.X0, this.Z0);
        t2c.F0 = this.J0.getPackageName();
        t2c.I0 = b;
        if (set != null) {
            t2c.H0 = (Scope[])set.toArray((Object[])new Scope[set.size()]);
        }
        if (this.k()) {
            Account y;
            if ((y = this.y()) == null) {
                y = new Account("<<default account>>", "com.google");
            }
            t2c.J0 = y;
            if (ex != null) {
                t2c.G0 = ((IInterface)ex).asBinder();
            }
        }
        t2c.K0 = fm1.e1;
        t2c.L0 = this.z();
        if (this.I()) {
            t2c.O0 = true;
        }
        try {
            synchronized (this.O0) {
                final v2d p2 = this.P0;
                if (p2 != null) {
                    p2.D0((u2d)new jsy(this, this.d1.get()), t2c);
                }
                else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        }
        catch (final RuntimeException ex) {
            goto Label_0217;
        }
        catch (final RemoteException ex2) {}
        catch (final SecurityException ex3) {
            throw ex3;
        }
        catch (final DeadObjectException ex4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)ex4);
            final diy m0 = this.M0;
            ((Handler)m0).sendMessage(((Handler)m0).obtainMessage(6, this.d1.get(), 3));
        }
    }
    
    public final void n(final c q0) {
        xd.u((Object)q0, (Object)"Connection progress callbacks cannot be null.");
        this.Q0 = q0;
        this.N(2, null);
    }
    
    public void o() {
        this.d1.incrementAndGet();
        final ArrayList<jny<?>> s0 = this.S0;
        monitorenter(s0);
        Label_0074: {
            try {
                for (int size = this.S0.size(), i = 0; i < size; ++i) {
                    final jny jny = this.S0.get(i);
                    synchronized (jny) {
                        jny.a = null;
                        monitorexit(jny);
                    }
                }
                break Label_0074;
            }
            finally {
                monitorexit(s0);
                this.S0.clear();
                monitorexit(s0);
                synchronized (this.O0) {
                    this.P0 = null;
                    monitorexit(this.O0);
                    this.N(1, null);
                }
            }
        }
    }
    
    public final void q(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] array) {
        array = (String[])this.N0;
        synchronized (array) {
            final int u0 = this.U0;
            final IInterface r0 = this.R0;
            monitorexit(array);
            array = (String[])this.O0;
            synchronized (array) {
                final v2d p3 = this.P0;
                monitorexit(array);
                printWriter.append(s).append("mConnectState=");
                if (u0 != 1) {
                    if (u0 != 2) {
                        if (u0 != 3) {
                            if (u0 != 4) {
                                if (u0 != 5) {
                                    printWriter.print("UNKNOWN");
                                }
                                else {
                                    printWriter.print("DISCONNECTING");
                                }
                            }
                            else {
                                printWriter.print("CONNECTED");
                            }
                        }
                        else {
                            printWriter.print("LOCAL_CONNECTING");
                        }
                    }
                    else {
                        printWriter.print("REMOTE_CONNECTING");
                    }
                }
                else {
                    printWriter.print("DISCONNECTED");
                }
                printWriter.append(" mService=");
                if (r0 == null) {
                    printWriter.append("null");
                }
                else {
                    printWriter.append(this.E()).append("@").append(Integer.toHexString(System.identityHashCode(r0.asBinder())));
                }
                printWriter.append(" mServiceBroker=");
                if (p3 == null) {
                    printWriter.println("null");
                }
                else {
                    printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)p3).asBinder())));
                }
                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
                if (this.E0 > 0L) {
                    final PrintWriter append = printWriter.append(s).append("lastConnectedTime=");
                    final long e0 = this.E0;
                    array = (String[])(Object)simpleDateFormat.format(new Date(e0));
                    final StringBuilder sb = new StringBuilder(String.valueOf(array).length() + 21);
                    sb.append(e0);
                    sb.append(" ");
                    sb.append((String)(Object)array);
                    append.println(sb.toString());
                }
                if (this.D0 > 0L) {
                    printWriter.append(s).append("lastSuspendedCause=");
                    final int c0 = this.C0;
                    if (c0 != 1) {
                        if (c0 != 2) {
                            if (c0 != 3) {
                                printWriter.append(String.valueOf(c0));
                            }
                            else {
                                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                            }
                        }
                        else {
                            printWriter.append("CAUSE_NETWORK_LOST");
                        }
                    }
                    else {
                        printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    }
                    final PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                    final long d0 = this.D0;
                    array = (String[])(Object)simpleDateFormat.format(new Date(d0));
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(array).length() + 21);
                    sb2.append(d0);
                    sb2.append(" ");
                    sb2.append((String)(Object)array);
                    append2.println(sb2.toString());
                }
                if (this.G0 > 0L) {
                    printWriter.append(s).append("lastFailedStatus=").append(asy.P(this.F0));
                    final PrintWriter append3 = printWriter.append(" lastFailedTime=");
                    final long g0 = this.G0;
                    final String format = simpleDateFormat.format(new Date(g0));
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(format).length() + 21);
                    sb3.append(g0);
                    sb3.append(" ");
                    sb3.append(format);
                    append3.println(sb3.toString());
                }
            }
        }
    }
    
    public int r() {
        return o5c.a;
    }
    
    public final bta[] s() {
        final pgz c1 = this.c1;
        if (c1 == null) {
            return null;
        }
        return c1.D0;
    }
    
    public final String t() {
        return this.H0;
    }
    
    public Intent u() {
        throw new UnsupportedOperationException("Not a sign in API");
    }
    
    public final void v() {
        final int c = this.L0.c(this.J0, this.r());
        if (c != 0) {
            this.N(1, null);
            this.Q0 = (c)new fm1.fm1$d(this);
            final diy m0 = this.M0;
            ((Handler)m0).sendMessage(((Handler)m0).obtainMessage(3, this.d1.get(), c, (Object)null));
            return;
        }
        this.n((c)new fm1.fm1$d(this));
    }
    
    public final void w() {
        if (this.b()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    
    public abstract T x(final IBinder p0);
    
    public Account y() {
        return null;
    }
    
    public bta[] z() {
        return fm1.e1;
    }
    
    public interface a
    {
        void b();
        
        void x(final int p0);
    }
    
    public interface b
    {
        void s(final ph6 p0);
    }
    
    public interface c
    {
        void a(final ph6 p0);
    }
    
    public interface e
    {
    }
}
