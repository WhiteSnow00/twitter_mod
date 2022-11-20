import android.content.Context;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import android.app.PendingIntent;
import android.util.Log;
import android.os.DeadObjectException;
import android.os.Message;
import java.util.Collection;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import android.os.Bundle;
import android.os.Looper;
import android.os.Handler;
import com.google.android.gms.common.api.a$a;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import com.google.android.gms.common.api.b;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import com.google.android.gms.common.api.a$f;
import java.util.Queue;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p2y<O extends a.d> implements c$b, c$c, q5y
{
    public final Queue<q4y> a;
    @NotOnlyInitialized
    public final a$f b;
    public final sf0<O> c;
    public final f1y d;
    public final Set<y4y> e;
    public final Map<tmf$a<?>, l3y> f;
    public final int g;
    public final o3y h;
    public boolean i;
    public final List<q2y> j;
    public vg6 k;
    public int l;
    public final r4c m;
    
    public p2y(final r4c m, final b<O> b) {
        this.m = m;
        this.a = new LinkedList();
        this.e = new HashSet();
        this.f = new HashMap();
        this.j = new ArrayList();
        this.k = null;
        this.l = 0;
        final Looper looper = ((Handler)m.Q0).getLooper();
        final gg4 a = b.i().a();
        final a.a$a<?, O> a2 = b.c.a;
        Objects.requireNonNull((a$a)a2, "null reference");
        final a$f c = ((a$a)a2).c(b.a, looper, a, (Object)b.d, (c$b)this, (c$c)this);
        final String b2 = b.b;
        if (b2 != null && c instanceof bm1) {
            ((bm1)c).a1 = b2;
        }
        if (b2 != null && c instanceof wni) {
            Objects.requireNonNull((wni)c);
        }
        this.b = c;
        this.c = (sf0<O>)b.e;
        this.d = new f1y();
        this.g = b.g;
        if (c.k()) {
            this.h = new o3y(m.H0, (Handler)m.Q0, b.i().a());
            return;
        }
        this.h = null;
    }
    
    public final void D1(final vg6 vg6, final a<?> a, final boolean b) {
        throw null;
    }
    
    public final void U0(final Bundle bundle) {
        if (Looper.myLooper() == ((Handler)this.m.Q0).getLooper()) {
            this.f();
            return;
        }
        ((Handler)this.m.Q0).post((Runnable)new l2y((Object)this, 0));
    }
    
    public final yra a(final yra[] array) {
        if (array != null) {
            if (array.length != 0) {
                final yra[] s = this.b.s();
                final int n = 0;
                yra[] array2;
                if ((array2 = s) == null) {
                    array2 = new yra[0];
                }
                final int length = array2.length;
                final ts0 ts0 = new ts0(length);
                for (final yra yra : array2) {
                    ((d8q<String, Long>)ts0).put(yra.D0, Long.valueOf(yra.r()));
                }
                for (int length2 = array.length, j = n; j < length2; ++j) {
                    final yra yra2 = array[j];
                    final Long n2 = ((d8q<String, Long>)ts0).getOrDefault(yra2.D0, null);
                    if (n2 == null || n2 < yra2.r()) {
                        return yra2;
                    }
                }
            }
        }
        return null;
    }
    
    public final void b(final vg6 vg6) {
        for (final y4y y4y : this.e) {
            String h;
            if (f5j.a(vg6, vg6.H0)) {
                h = this.b.h();
            }
            else {
                h = null;
            }
            y4y.a(this.c, vg6, h);
        }
        this.e.clear();
    }
    
    public final void c(final Status status) {
        eli.k((Handler)this.m.Q0);
        this.d(status, null, false);
    }
    
    public final void d(final Status status, final Exception ex, final boolean b) {
        eli.k((Handler)this.m.Q0);
        int n = true ? 1 : 0;
        final boolean b2 = status == null;
        if (ex != null) {
            n = (false ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final q4y q4y = (q4y)iterator.next();
                if (!b || q4y.a == 2) {
                    if (status != null) {
                        q4y.a(status);
                    }
                    else {
                        q4y.b(ex);
                    }
                    iterator.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
    
    public final void e() {
        final ArrayList list = new ArrayList(this.a);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final q4y q4y = list.get(i);
            if (!this.b.b()) {
                break;
            }
            if (this.k(q4y)) {
                this.a.remove(q4y);
            }
        }
    }
    
    public final void f() {
        this.n();
        this.b(vg6.H0);
        this.j();
        final Iterator iterator = this.f.values().iterator();
        if (!iterator.hasNext()) {
            this.e();
            this.h();
            return;
        }
        Objects.requireNonNull(iterator.next());
        throw null;
    }
    
    public final void g(final int n) {
        this.n();
        this.i = true;
        final f1y d = this.d;
        final String t = this.b.t();
        Objects.requireNonNull(d);
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (n == 1) {
            sb.append(" due to service disconnection.");
        }
        else if (n == 3) {
            sb.append(" due to dead object exception.");
        }
        if (t != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(t);
        }
        d.a(true, new Status(20, sb.toString()));
        final j5y q0 = this.m.Q0;
        final Message obtain = Message.obtain((Handler)q0, 9, (Object)this.c);
        Objects.requireNonNull(this.m);
        ((Handler)q0).sendMessageDelayed(obtain, 5000L);
        final j5y q2 = this.m.Q0;
        final Message obtain2 = Message.obtain((Handler)q2, 11, (Object)this.c);
        Objects.requireNonNull(this.m);
        ((Handler)q2).sendMessageDelayed(obtain2, 120000L);
        this.m.J0.a.clear();
        final Iterator iterator = this.f.values().iterator();
        if (!iterator.hasNext()) {
            return;
        }
        Objects.requireNonNull(iterator.next());
        throw null;
    }
    
    public final void h() {
        ((Handler)this.m.Q0).removeMessages(12, (Object)this.c);
        final j5y q0 = this.m.Q0;
        ((Handler)q0).sendMessageDelayed(((Handler)q0).obtainMessage(12, (Object)this.c), this.m.D0);
    }
    
    public final void i(final q4y q4y) {
        q4y.d(this.d, this.t());
        try {
            q4y.c(this);
        }
        catch (final DeadObjectException ex) {
            this.x(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }
    
    public final void j() {
        if (this.i) {
            ((Handler)this.m.Q0).removeMessages(11, (Object)this.c);
            ((Handler)this.m.Q0).removeMessages(9, (Object)this.c);
            this.i = false;
        }
    }
    
    public final boolean k(final q4y q4y) {
        if (!(q4y instanceof x2y)) {
            this.i(q4y);
            return true;
        }
        final x2y x2y = (x2y)q4y;
        final yra a = this.a(x2y.g(this));
        if (a == null) {
            this.i(q4y);
            return true;
        }
        final String name = this.b.getClass().getName();
        final String d0 = a.D0;
        final long r = a.r();
        final StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(d0).length());
        nb0.z(sb, name, " could not execute call because it requires feature (", d0, ", ");
        sb.append(r);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.m.R0 && x2y.f(this)) {
            final q2y q2y = new q2y(this.c, a);
            final int index = this.j.indexOf(q2y);
            if (index >= 0) {
                final q2y q2y2 = this.j.get(index);
                ((Handler)this.m.Q0).removeMessages(15, (Object)q2y2);
                final j5y q0 = this.m.Q0;
                final Message obtain = Message.obtain((Handler)q0, 15, (Object)q2y2);
                Objects.requireNonNull(this.m);
                ((Handler)q0).sendMessageDelayed(obtain, 5000L);
            }
            else {
                this.j.add(q2y);
                final j5y q2 = this.m.Q0;
                final Message obtain2 = Message.obtain((Handler)q2, 15, (Object)q2y);
                Objects.requireNonNull(this.m);
                ((Handler)q2).sendMessageDelayed(obtain2, 5000L);
                final j5y q3 = this.m.Q0;
                final Message obtain3 = Message.obtain((Handler)q3, 16, (Object)q2y);
                Objects.requireNonNull(this.m);
                ((Handler)q3).sendMessageDelayed(obtain3, 120000L);
                final vg6 vg6 = new vg6(2, null, null);
                if (!this.l(vg6)) {
                    this.m.d(vg6, this.g);
                }
            }
            return false;
        }
        ((q4y)x2y).b(new UnsupportedApiCallException(a));
        return true;
    }
    
    public final boolean l(final vg6 vg6) {
        synchronized (r4c.U0) {
            final r4c m = this.m;
            if (m.N0 != null && m.O0.contains((Object)this.c)) {
                this.m.N0.n(vg6, this.g);
                return true;
            }
            return false;
        }
    }
    
    public final boolean m(final boolean b) {
        eli.k((Handler)this.m.Q0);
        if (!this.b.b() || this.f.size() != 0) {
            return false;
        }
        final f1y d = this.d;
        if (!d.a.isEmpty() || !d.b.isEmpty()) {
            if (b) {
                this.h();
            }
            return false;
        }
        this.b.f("Timing out service connection.");
        return true;
    }
    
    public final void n() {
        eli.k((Handler)this.m.Q0);
        this.k = null;
    }
    
    public final void o() {
        eli.k((Handler)this.m.Q0);
        if (!this.b.b()) {
            if (!this.b.g()) {
                try {
                    final r4c m = this.m;
                    final int a = m.J0.a(m.H0, this.b);
                    if (a != 0) {
                        final vg6 vg6 = new vg6(a, null, null);
                        final String name = this.b.getClass().getName();
                        final String string = vg6.toString();
                        final StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(string);
                        Log.w("GoogleApiManager", sb.toString());
                        this.q(vg6, null);
                        return;
                    }
                    final r4c i = this.m;
                    final a$f b = this.b;
                    final s2y g = new s2y(b, this.c);
                    if (b.k()) {
                        final o3y h = this.h;
                        Objects.requireNonNull(h, "null reference");
                        final z3y f = h.f;
                        if (f != null) {
                            ((a$f)f).o();
                        }
                        h.e.i = System.identityHashCode(h);
                        final z0y c = h.c;
                        final Context a2 = h.a;
                        final Looper looper = h.b.getLooper();
                        final gg4 e = h.e;
                        h.f = (z3y)c.c(a2, looper, e, e.h, (c$b)h, (c$c)h);
                        h.g = (n3y)g;
                        final Set d = h.d;
                        if (d != null && !d.isEmpty()) {
                            h.f.c();
                        }
                        else {
                            h.b.post((Runnable)new q6z(h, 1));
                        }
                    }
                    try {
                        this.b.n((bm1$c)g);
                    }
                    catch (final SecurityException ex) {
                        this.q(new vg6(10, null, null), ex);
                    }
                }
                catch (final IllegalStateException ex2) {
                    this.q(new vg6(10, null, null), ex2);
                }
            }
        }
    }
    
    public final void p(final q4y q4y) {
        eli.k((Handler)this.m.Q0);
        if (this.b.b()) {
            if (this.k(q4y)) {
                this.h();
                return;
            }
            this.a.add(q4y);
        }
        else {
            this.a.add(q4y);
            final vg6 k = this.k;
            if (k != null && k.r()) {
                this.q(this.k, null);
                return;
            }
            this.o();
        }
    }
    
    public final void q(final vg6 k, final Exception ex) {
        eli.k((Handler)this.m.Q0);
        final o3y h = this.h;
        if (h != null) {
            final z3y f = h.f;
            if (f != null) {
                ((a$f)f).o();
            }
        }
        this.n();
        this.m.J0.a.clear();
        this.b(k);
        if (this.b instanceof g5y && k.E0 != 24) {
            final r4c m = this.m;
            m.E0 = true;
            final j5y q0 = m.Q0;
            ((Handler)q0).sendMessageDelayed(((Handler)q0).obtainMessage(19), 300000L);
        }
        if (k.E0 == 4) {
            this.c(r4c.T0);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = k;
            return;
        }
        if (ex != null) {
            eli.k((Handler)this.m.Q0);
            this.d(null, ex, false);
            return;
        }
        if (!this.m.R0) {
            this.c(r4c.e((sf0)this.c, k));
            return;
        }
        this.d(r4c.e((sf0)this.c, k), null, true);
        if (this.a.isEmpty()) {
            return;
        }
        if (this.l(k)) {
            return;
        }
        if (!this.m.d(k, this.g)) {
            if (k.E0 == 18) {
                this.i = true;
            }
            if (this.i) {
                final j5y q2 = this.m.Q0;
                final Message obtain = Message.obtain((Handler)q2, 9, (Object)this.c);
                Objects.requireNonNull(this.m);
                ((Handler)q2).sendMessageDelayed(obtain, 5000L);
                return;
            }
            this.c(r4c.e((sf0)this.c, k));
        }
    }
    
    public final void r() {
        eli.k((Handler)this.m.Q0);
        final Status s0 = r4c.S0;
        this.c(s0);
        final f1y d = this.d;
        Objects.requireNonNull(d);
        int i = 0;
        d.a(false, s0);
        for (tmf$a[] array = (tmf$a[])this.f.keySet().toArray(new tmf$a[0]); i < array.length; ++i) {
            this.p((q4y)new m4y(array[i], new zbs()));
        }
        this.b(new vg6(4, null, null));
        if (this.b.b()) {
            this.b.j((bm1$e)new o2y(this));
        }
    }
    
    public final void s(final vg6 vg6) {
        this.q(vg6, null);
    }
    
    public final boolean t() {
        return this.b.k();
    }
    
    public final void x(final int n) {
        if (Looper.myLooper() == ((Handler)this.m.Q0).getLooper()) {
            this.g(n);
            return;
        }
        ((Handler)this.m.Q0).post((Runnable)new m2y(this, n));
    }
}
