import android.os.Bundle;
import java.io.Writer;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collection;
import android.os.Handler;
import java.util.Objects;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedList;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import java.util.List;
import java.util.ArrayList;
import com.google.android.gms.common.api.a$a;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$f;
import java.util.Map;
import com.google.android.gms.common.api.internal.a;
import java.util.Queue;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.api.c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x2y extends c implements p3y
{
    public final Lock G0;
    public final o5y H0;
    public y3y I0;
    public final int J0;
    public final Context K0;
    public final Looper L0;
    public final Queue<com.google.android.gms.common.api.internal.a<?, ?>> M0;
    public volatile boolean N0;
    public long O0;
    public long P0;
    public final v2y Q0;
    public final r5c R0;
    public o3y S0;
    public final Map<com.google.android.gms.common.api.a.c<?>, a$f> T0;
    public Set<Scope> U0;
    public final lh4 V0;
    public final Map<com.google.android.gms.common.api.a<?>, Boolean> W0;
    public final a$a<? extends t4y, h7q> X0;
    public final rnf Y0;
    public final ArrayList<i6y> Z0;
    public Integer a1;
    public final q4y b1;
    public final sog c1;
    
    public x2y(final Context k0, final Lock g0, final Looper l0, final lh4 v0, final r5c r0, final a$a<? extends t4y, h7q> x0, final Map<com.google.android.gms.common.api.a<?>, Boolean> w0, final List<c$b> list, final List<c$c> list2, final Map<com.google.android.gms.common.api.a.c<?>, a$f> t0, final int j0, final int n, final ArrayList<i6y> z0) {
        this.I0 = null;
        this.M0 = new LinkedList();
        this.O0 = 120000L;
        this.P0 = 5000L;
        this.U0 = new HashSet<Scope>();
        this.Y0 = new rnf();
        this.a1 = null;
        final sog c1 = new sog(this);
        this.c1 = c1;
        this.K0 = k0;
        this.G0 = g0;
        this.H0 = new o5y(l0, (m5y)c1);
        this.L0 = l0;
        this.Q0 = new v2y(this, l0);
        this.R0 = r0;
        this.J0 = j0;
        if (j0 >= 0) {
            this.a1 = n;
        }
        this.W0 = w0;
        this.T0 = t0;
        this.Z0 = z0;
        this.b1 = new q4y();
        final Iterator<c$b> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.H0.b((c$b)iterator.next());
        }
        final Iterator<c$c> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            this.H0.c((c$c)iterator2.next());
        }
        this.V0 = v0;
        this.X0 = x0;
    }
    
    public static int m(final Iterable<a$f> iterable, final boolean b) {
        final Iterator<a$f> iterator = iterable.iterator();
        boolean b2 = false;
        boolean b3 = false;
        while (iterator.hasNext()) {
            final a$f a$f = iterator.next();
            b2 |= a$f.k();
            b3 |= a$f.d();
        }
        if (!b2) {
            return 3;
        }
        if (b3 && b) {
            return 2;
        }
        return 1;
    }
    
    public static String o(final int n) {
        if (n == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (n == 2) {
            return "SIGN_IN_MODE_OPTIONAL";
        }
        if (n != 3) {
            return "UNKNOWN";
        }
        return "SIGN_IN_MODE_NONE";
    }
    
    public static /* bridge */ void p(final x2y x2y) {
        x2y.G0.lock();
        try {
            if (x2y.N0) {
                x2y.s();
            }
        }
        finally {
            x2y.G0.unlock();
        }
    }
    
    public final void E(final bi6 bi6) {
        final r5c r0 = this.R0;
        final Context k0 = this.K0;
        final int g0 = bi6.G0;
        Objects.requireNonNull(r0);
        final AtomicBoolean a = g6c.a;
        if (g0 != 18 && (g0 != 1 || !g6c.c(k0))) {
            this.q();
        }
        if (!this.N0) {
            final o5y h0 = this.H0;
            iuk.w((Handler)h0.M0, "onConnectionFailure must only be called on the Handler thread");
            ((Handler)h0.M0).removeMessages(1);
            synchronized (h0.N0) {
                final ArrayList list = new ArrayList(h0.I0);
                final int value = h0.K0.get();
                while (true) {
                    for (c$c c$c : list) {
                        if (!h0.J0 || h0.K0.get() != value) {
                            monitorexit(h0.N0);
                            this.H0.a();
                            return;
                        }
                        if (!h0.I0.contains(c$c)) {
                            continue;
                        }
                        ((whj)c$c).s(bi6);
                    }
                    monitorexit(h0.N0);
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void a() {
        this.G0.lock();
        try {
            final int j0 = this.J0;
            final int n = 2;
            final boolean b = false;
            if (j0 >= 0) {
                iuk.H(this.a1 != null, (Object)"Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                final Integer a1 = this.a1;
                if (a1 == null) {
                    this.a1 = m(this.T0.values(), false);
                }
                else if (a1 == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            final Integer a2 = this.a1;
            Objects.requireNonNull(a2, "null reference");
            int intValue = a2;
            this.G0.lock();
            Label_0148: {
                if (intValue != 3 && intValue != 1) {
                    if (intValue != 2) {
                        final boolean b2 = b;
                        break Label_0148;
                    }
                    intValue = n;
                }
                final boolean b2 = true;
                try {
                    final StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(intValue);
                    iuk.q(b2, (Object)sb.toString());
                    this.r(intValue);
                    this.s();
                    return;
                }
                finally {
                    this.G0.unlock();
                }
            }
            throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        finally {
            this.G0.unlock();
        }
    }
    
    @Override
    public final void b() {
        this.G0.lock();
        try {
            this.b1.a();
            final y3y i0 = this.I0;
            if (i0 != null) {
                i0.c();
            }
            final rnf y0 = this.Y0;
            for (final qnf qnf : y0.a) {
                qnf.b = null;
                qnf.c = null;
            }
            y0.a.clear();
            for (final com.google.android.gms.common.api.internal.a a : this.M0) {
                ((BasePendingResult)a).l((p4y)null);
                ((BasePendingResult)a).c();
            }
            this.M0.clear();
            Lock lock;
            if (this.I0 == null) {
                lock = this.G0;
            }
            else {
                this.q();
                this.H0.a();
                lock = this.G0;
            }
            lock.unlock();
        }
        finally {
            this.G0.unlock();
        }
    }
    
    @Override
    public final <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.a<? extends etm, A>> T c(T i) {
        final com.google.android.gms.common.api.a p = i.p;
        final boolean containsKey = this.T0.containsKey(i.o);
        String c;
        if (p != null) {
            c = p.c;
        }
        else {
            c = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(c);
        sb.append(" required for this call.");
        iuk.q(containsKey, (Object)sb.toString());
        this.G0.lock();
        try {
            final y3y i2 = this.I0;
            if (i2 != null) {
                Lock lock;
                if (this.N0) {
                    this.M0.add(i);
                    while (!this.M0.isEmpty()) {
                        final com.google.android.gms.common.api.internal.a a = this.M0.remove();
                        final q4y b1 = this.b1;
                        b1.a.add(a);
                        ((BasePendingResult)a).l(b1.b);
                        a.o(Status.M0);
                    }
                    lock = this.G0;
                }
                else {
                    i = (T)i2.i((com.google.android.gms.common.api.internal.a)i);
                    lock = this.G0;
                }
                lock.unlock();
                return i;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        finally {
            this.G0.unlock();
        }
    }
    
    public final void c0(int i, final boolean b) {
        int n = i;
        Label_0118: {
            if (i != 1) {
                break Label_0118;
            }
            Label_0116: {
                if (b) {
                    break Label_0116;
                }
                if (this.N0) {
                    break Label_0116;
                }
                this.N0 = true;
                while (true) {
                    if (this.S0 != null) {
                        break Label_0072;
                    }
                    try {
                        this.S0 = this.R0.g(this.K0.getApplicationContext(), (dcu)new w2y(this));
                        final v2y q0 = this.Q0;
                        ((Handler)q0).sendMessageDelayed(((Handler)q0).obtainMessage(1), this.O0);
                        final v2y q2 = this.Q0;
                        ((Handler)q2).sendMessageDelayed(((Handler)q2).obtainMessage(2), this.P0);
                        n = 1;
                        final BasePendingResult[] array = this.b1.a.toArray(new BasePendingResult[0]);
                        int length;
                        for (length = array.length, i = 0; i < length; ++i) {
                            array[i].e(q4y.c);
                        }
                        final o5y h0 = this.H0;
                        iuk.w((Handler)h0.M0, "onUnintentionalDisconnection must only be called on the Handler thread");
                        ((Handler)h0.M0).removeMessages(1);
                        synchronized (h0.N0) {
                            h0.L0 = true;
                            final ArrayList list = new ArrayList(h0.G0);
                            i = h0.K0.get();
                            for (final c$b c$b : list) {
                                if (!h0.J0) {
                                    break;
                                }
                                if (h0.K0.get() != i) {
                                    break;
                                }
                                if (!h0.G0.contains(c$b)) {
                                    continue;
                                }
                                ((zh6)c$b).x(n);
                            }
                            h0.H0.clear();
                            h0.L0 = false;
                            monitorexit(h0.N0);
                            this.H0.a();
                            if (n == 2) {
                                this.s();
                            }
                        }
                    }
                    catch (final SecurityException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    @Override
    public final <C extends a$f> C e(final com.google.android.gms.common.api.a.c<C> c) {
        final a$f a$f = this.T0.get(e7g.a);
        iuk.D((Object)a$f, (Object)"Appropriate Api was not requested.");
        return (C)a$f;
    }
    
    @Override
    public final Looper f() {
        return this.L0;
    }
    
    @Override
    public final boolean g() {
        final y3y i0 = this.I0;
        return i0 != null && i0.g();
    }
    
    @Override
    public final boolean h() {
        final y3y i0 = this.I0;
        return i0 != null && i0.e();
    }
    
    @Override
    public final boolean i(final f7q f7q) {
        final y3y i0 = this.I0;
        return i0 != null && i0.h(f7q);
    }
    
    @Override
    public final void j() {
        final y3y i0 = this.I0;
        if (i0 != null) {
            i0.b();
        }
    }
    
    public final void k(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("mContext=").println(this.K0);
        printWriter.append(s).append("mResuming=").print(this.N0);
        printWriter.append(" mWorkQueue.size()=").print(this.M0.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.b1.a.size());
        final y3y i0 = this.I0;
        if (i0 != null) {
            i0.d(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final <A extends com.google.android.gms.common.api.a.b, R extends etm, T extends com.google.android.gms.common.api.internal.a<R, A>> T l(T f) {
        final com.google.android.gms.common.api.a p = f.p;
        final boolean containsKey = this.T0.containsKey(f.o);
        String c;
        if (p != null) {
            c = p.c;
        }
        else {
            c = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(c);
        sb.append(" required for this call.");
        iuk.q(containsKey, (Object)sb.toString());
        this.G0.lock();
        try {
            final y3y i0 = this.I0;
            Lock lock;
            if (i0 == null) {
                this.M0.add(f);
                lock = this.G0;
            }
            else {
                f = (T)i0.f((com.google.android.gms.common.api.internal.a)f);
                lock = this.G0;
            }
            lock.unlock();
            return f;
        }
        finally {
            this.G0.unlock();
        }
    }
    
    public final String n() {
        final StringWriter stringWriter = new StringWriter();
        this.k("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
    
    public final boolean q() {
        if (!this.N0) {
            return false;
        }
        this.N0 = false;
        ((Handler)this.Q0).removeMessages(2);
        ((Handler)this.Q0).removeMessages(1);
        final o3y s0 = this.S0;
        if (s0 != null) {
            s0.a();
            this.S0 = null;
        }
        return true;
    }
    
    public final void r(int n) {
        final Integer a1 = this.a1;
        if (a1 == null) {
            this.a1 = n;
        }
        else if (a1 != n) {
            final String o = o(n);
            final String o2 = o(this.a1);
            n = o.length();
            throw new IllegalStateException(m58.v(new StringBuilder(o2.length() + (n + 51)), "Cannot use sign-in mode: ", o, ". Mode was already set to ", o2));
        }
        if (this.I0 != null) {
            return;
        }
        final Iterator<a$f> iterator = this.T0.values().iterator();
        boolean b = false;
        n = 0;
        while (iterator.hasNext()) {
            final a$f a$f = iterator.next();
            b |= a$f.k();
            n |= (a$f.d() ? 1 : 0);
        }
        final int intValue = this.a1;
        if (intValue != 1) {
            if (intValue == 2 && b) {
                final Context k0 = this.K0;
                final Lock g0 = this.G0;
                final Looper l0 = this.L0;
                final r5c r0 = this.R0;
                final Map<com.google.android.gms.common.api.a.c<?>, a$f> t0 = this.T0;
                final lh4 v0 = this.V0;
                final Map<com.google.android.gms.common.api.a<?>, Boolean> w0 = this.W0;
                final a$a<? extends t4y, h7q> x0 = this.X0;
                final ArrayList<i6y> z0 = this.Z0;
                final ws0 ws0 = new ws0<Object, Object>();
                final ws0<Object, Object> ws2 = new ws0<Object, Object>();
                final Iterator<Map.Entry<com.google.android.gms.common.api.a.c<?>, a$f>> iterator2 = t0.entrySet().iterator();
                a$f a$f2 = null;
                while (iterator2.hasNext()) {
                    final Map.Entry<com.google.android.gms.common.api.a.c<?>, a$f> entry = iterator2.next();
                    final a$f a$f3 = entry.getValue();
                    if (a$f3.d()) {
                        a$f2 = a$f3;
                    }
                    if (a$f3.k()) {
                        ws0.put((Object)entry.getKey(), (Object)a$f3);
                    }
                    else {
                        ws2.put((Object)entry.getKey(), (Object)a$f3);
                    }
                }
                iuk.H(ws0.isEmpty() ^ true, (Object)"CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                final ws0<Object, Object> ws3 = new ws0<Object, Object>();
                final ws0<Object, Object> ws4 = new ws0<Object, Object>();
                for (final com.google.android.gms.common.api.a a2 : w0.keySet()) {
                    final com.google.android.gms.common.api.a.a$g<?> b2 = a2.b;
                    if (ws0.containsKey((Object)b2)) {
                        ws3.put((Object)a2, (Object)w0.get(a2));
                    }
                    else {
                        if (!ws2.containsKey((Object)b2)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        ws4.put((Object)a2, (Object)w0.get(a2));
                    }
                }
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                n = z0.size();
                int i = 0;
                final ArrayList list3 = z0;
                while (i < n) {
                    final i6y i6y = (i6y)list3.get(i);
                    if (ws3.containsKey((Object)i6y.a)) {
                        list.add(i6y);
                    }
                    else {
                        if (!ws4.containsKey((Object)i6y.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        list2.add(i6y);
                    }
                    ++i;
                }
                this.I0 = (y3y)new w1y(k0, this, g0, l0, (s5c)r0, (Map)ws0, (Map)ws2, v0, (a$a)x0, a$f2, list, list2, (Map)ws3, (Map)ws4);
                return;
            }
        }
        else {
            if (!b) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (n != 0) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.I0 = (y3y)new b3y(this.K0, this, this.G0, this.L0, (s5c)this.R0, (Map)this.T0, this.V0, (Map)this.W0, (a$a)this.X0, (ArrayList)this.Z0, (p3y)this);
    }
    
    public final void s() {
        this.H0.J0 = true;
        final y3y i0 = this.I0;
        Objects.requireNonNull(i0, "null reference");
        i0.a();
    }
    
    public final void u(final Bundle bundle) {
        while (!this.M0.isEmpty()) {
            this.c(this.M0.remove());
        }
        final o5y h0 = this.H0;
        iuk.w((Handler)h0.M0, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (h0.N0) {
            iuk.G(h0.L0 ^ true);
            ((Handler)h0.M0).removeMessages(1);
            h0.L0 = true;
            iuk.G(h0.H0.isEmpty());
            final ArrayList list = new ArrayList(h0.G0);
            final int value = h0.K0.get();
            for (final c$b c$b : list) {
                if (!h0.J0 || !h0.F0.b()) {
                    break;
                }
                if (h0.K0.get() != value) {
                    break;
                }
                if (h0.H0.contains(c$b)) {
                    continue;
                }
                ((zh6)c$b).U0(bundle);
            }
            h0.H0.clear();
            h0.L0 = false;
        }
    }
}
