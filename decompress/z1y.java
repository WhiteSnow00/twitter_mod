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
import com.google.android.gms.common.api.a;
import java.util.Queue;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.a$d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z1y<O extends a$d> implements b, c.c, a5y
{
    public final Queue<a4y> a;
    @NotOnlyInitialized
    public final a.f b;
    public final wf0<O> c;
    public final p0y d;
    public final Set<i4y> e;
    public final Map<inf$a<?>, v2y> f;
    public final int g;
    public final y2y h;
    public boolean i;
    public final List<a2y> j;
    public ph6 k;
    public int l;
    public final /* synthetic */ p5c m;
    
    public z1y(final p5c m, final com.google.android.gms.common.api.b<O> b) {
        this.m = m;
        this.a = new LinkedList();
        this.e = new HashSet();
        this.f = new HashMap();
        this.j = new ArrayList();
        this.k = null;
        this.l = 0;
        final Looper looper = ((Handler)m.P0).getLooper();
        final fh4 a = b.i().a();
        final a.a a2 = b.c.a;
        Objects.requireNonNull(a2, "null reference");
        final a.f c = a2.c(b.a, looper, a, b.d, this, this);
        final String b2 = b.b;
        if (b2 != null && c instanceof fm1) {
            ((fm1)c).Z0 = b2;
        }
        if (b2 != null && c instanceof rni) {
            Objects.requireNonNull((rni)c);
        }
        this.b = c;
        this.c = b.e;
        this.d = new p0y();
        this.g = b.g;
        if (c.k()) {
            this.h = new y2y(m.G0, (Handler)m.P0, b.i().a());
            return;
        }
        this.h = null;
    }
    
    public final void D1(final ph6 ph6, final a<?> a, final boolean b) {
        throw null;
    }
    
    public final void U0(final Bundle bundle) {
        if (Looper.myLooper() == ((Handler)this.m.P0).getLooper()) {
            this.f();
            return;
        }
        ((Handler)this.m.P0).post((Runnable)new v1y(this, 0));
    }
    
    public final bta a(final bta[] array) {
        if (array != null) {
            if (array.length != 0) {
                final bta[] s = this.b.s();
                final int n = 0;
                bta[] array2;
                if ((array2 = s) == null) {
                    array2 = new bta[0];
                }
                final int length = array2.length;
                final at0 at0 = new at0(length);
                for (final bta bta : array2) {
                    ((l7q)at0).put((Object)bta.C0, (Object)bta.r());
                }
                for (int length2 = array.length, j = n; j < length2; ++j) {
                    final bta bta2 = array[j];
                    final Long n2 = (Long)((l7q)at0).getOrDefault((Object)bta2.C0, (Object)null);
                    if (n2 == null || n2 < bta2.r()) {
                        return bta2;
                    }
                }
            }
        }
        return null;
    }
    
    public final void b(final ph6 ph6) {
        for (final i4y i4y : this.e) {
            String h;
            if (z4j.a((Object)ph6, (Object)ph6.G0)) {
                h = this.b.h();
            }
            else {
                h = null;
            }
            i4y.a(this.c, ph6, h);
        }
        this.e.clear();
    }
    
    public final void c(final Status status) {
        xd.n((Handler)this.m.P0);
        this.d(status, null, false);
    }
    
    public final void d(final Status status, final Exception ex, final boolean b) {
        xd.n((Handler)this.m.P0);
        int n = true ? 1 : 0;
        final boolean b2 = status == null;
        if (ex != null) {
            n = (false ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final a4y a4y = (a4y)iterator.next();
                if (!b || a4y.a == 2) {
                    if (status != null) {
                        a4y.a(status);
                    }
                    else {
                        a4y.b(ex);
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
            final a4y a4y = list.get(i);
            if (!this.b.b()) {
                break;
            }
            if (this.k(a4y)) {
                this.a.remove(a4y);
            }
        }
    }
    
    public final void f() {
        this.n();
        this.b(ph6.G0);
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
        final p0y d = this.d;
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
        final t4y p = this.m.P0;
        final Message obtain = Message.obtain((Handler)p, 9, (Object)this.c);
        Objects.requireNonNull(this.m);
        ((Handler)p).sendMessageDelayed(obtain, 5000L);
        final t4y p2 = this.m.P0;
        final Message obtain2 = Message.obtain((Handler)p2, 11, (Object)this.c);
        Objects.requireNonNull(this.m);
        ((Handler)p2).sendMessageDelayed(obtain2, 120000L);
        this.m.I0.a.clear();
        final Iterator iterator = this.f.values().iterator();
        if (!iterator.hasNext()) {
            return;
        }
        Objects.requireNonNull(iterator.next());
        throw null;
    }
    
    public final void h() {
        ((Handler)this.m.P0).removeMessages(12, (Object)this.c);
        final t4y p0 = this.m.P0;
        ((Handler)p0).sendMessageDelayed(((Handler)p0).obtainMessage(12, (Object)this.c), this.m.C0);
    }
    
    public final void i(final a4y a4y) {
        a4y.d(this.d, this.t());
        try {
            a4y.c(this);
        }
        catch (final DeadObjectException ex) {
            this.x(1);
            this.b.f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }
    
    public final void j() {
        if (this.i) {
            ((Handler)this.m.P0).removeMessages(11, (Object)this.c);
            ((Handler)this.m.P0).removeMessages(9, (Object)this.c);
            this.i = false;
        }
    }
    
    public final boolean k(final a4y a4y) {
        if (!(a4y instanceof h2y)) {
            this.i(a4y);
            return true;
        }
        final h2y h2y = (h2y)a4y;
        final bta a = this.a(h2y.g(this));
        if (a == null) {
            this.i(a4y);
            return true;
        }
        final String name = this.b.getClass().getName();
        final String c0 = a.C0;
        final long r = a.r();
        final StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(c0).length());
        mag.m(sb, name, " could not execute call because it requires feature (", c0, ", ");
        sb.append(r);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.m.Q0 && h2y.f(this)) {
            final a2y a2y = new a2y((wf0)this.c, a);
            final int index = this.j.indexOf(a2y);
            if (index >= 0) {
                final a2y a2y2 = this.j.get(index);
                ((Handler)this.m.P0).removeMessages(15, (Object)a2y2);
                final t4y p = this.m.P0;
                final Message obtain = Message.obtain((Handler)p, 15, (Object)a2y2);
                Objects.requireNonNull(this.m);
                ((Handler)p).sendMessageDelayed(obtain, 5000L);
            }
            else {
                this.j.add(a2y);
                final t4y p2 = this.m.P0;
                final Message obtain2 = Message.obtain((Handler)p2, 15, (Object)a2y);
                Objects.requireNonNull(this.m);
                ((Handler)p2).sendMessageDelayed(obtain2, 5000L);
                final t4y p3 = this.m.P0;
                final Message obtain3 = Message.obtain((Handler)p3, 16, (Object)a2y);
                Objects.requireNonNull(this.m);
                ((Handler)p3).sendMessageDelayed(obtain3, 120000L);
                final ph6 ph6 = new ph6(2, (PendingIntent)null, (String)null);
                if (!this.l(ph6)) {
                    this.m.d(ph6, this.g);
                }
            }
            return false;
        }
        ((a4y)h2y).b((Exception)new UnsupportedApiCallException(a));
        return true;
    }
    
    public final boolean l(final ph6 ph6) {
        synchronized (p5c.T0) {
            final p5c m = this.m;
            if (m.M0 != null && m.N0.contains((Object)this.c)) {
                ((r4y)this.m.M0).n(ph6, this.g);
                return true;
            }
            return false;
        }
    }
    
    public final boolean m(final boolean b) {
        xd.n((Handler)this.m.P0);
        if (!this.b.b() || this.f.size() != 0) {
            return false;
        }
        final p0y d = this.d;
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
        xd.n((Handler)this.m.P0);
        this.k = null;
    }
    
    public final void o() {
        xd.n((Handler)this.m.P0);
        if (!this.b.b()) {
            if (!this.b.g()) {
                try {
                    final p5c m = this.m;
                    final int a = m.I0.a(m.G0, this.b);
                    if (a != 0) {
                        final ph6 ph6 = new ph6(a, (PendingIntent)null, (String)null);
                        final String name = this.b.getClass().getName();
                        final String string = ph6.toString();
                        final StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(string);
                        Log.w("GoogleApiManager", sb.toString());
                        this.q(ph6, null);
                        return;
                    }
                    final p5c i = this.m;
                    final a.f b = this.b;
                    final c2y g = new c2y(b, this.c);
                    if (b.k()) {
                        final y2y h = this.h;
                        Objects.requireNonNull(h, "null reference");
                        final j3y f = h.f;
                        if (f != null) {
                            ((a.f)f).o();
                        }
                        h.e.i = System.identityHashCode(h);
                        final j0y c = h.c;
                        final Context a2 = h.a;
                        final Looper looper = h.b.getLooper();
                        final fh4 e = h.e;
                        h.f = (j3y)c.c(a2, looper, e, e.h, (b)h, (c.c)h);
                        h.g = (x2y)g;
                        final Set d = h.d;
                        if (d != null && !d.isEmpty()) {
                            h.f.c();
                        }
                        else {
                            h.b.post((Runnable)new b6z((Object)h, 1));
                        }
                    }
                    try {
                        this.b.n(g);
                    }
                    catch (final SecurityException ex) {
                        this.q(new ph6(10, (PendingIntent)null, (String)null), ex);
                    }
                }
                catch (final IllegalStateException ex2) {
                    this.q(new ph6(10, (PendingIntent)null, (String)null), ex2);
                }
            }
        }
    }
    
    public final void p(final a4y a4y) {
        xd.n((Handler)this.m.P0);
        if (this.b.b()) {
            if (this.k(a4y)) {
                this.h();
                return;
            }
            this.a.add(a4y);
        }
        else {
            this.a.add(a4y);
            final ph6 k = this.k;
            if (k != null && k.r()) {
                this.q(this.k, null);
                return;
            }
            this.o();
        }
    }
    
    public final void q(final ph6 k, final Exception ex) {
        xd.n((Handler)this.m.P0);
        final y2y h = this.h;
        if (h != null) {
            final j3y f = h.f;
            if (f != null) {
                ((a.f)f).o();
            }
        }
        this.n();
        this.m.I0.a.clear();
        this.b(k);
        if (this.b instanceof q4y && k.D0 != 24) {
            final p5c m = this.m;
            m.D0 = true;
            final t4y p2 = m.P0;
            ((Handler)p2).sendMessageDelayed(((Handler)p2).obtainMessage(19), 300000L);
        }
        if (k.D0 == 4) {
            this.c(p5c.S0);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = k;
            return;
        }
        if (ex != null) {
            xd.n((Handler)this.m.P0);
            this.d(null, ex, false);
            return;
        }
        if (!this.m.Q0) {
            this.c(p5c.e((wf0)this.c, k));
            return;
        }
        this.d(p5c.e((wf0)this.c, k), null, true);
        if (this.a.isEmpty()) {
            return;
        }
        if (this.l(k)) {
            return;
        }
        if (!this.m.d(k, this.g)) {
            if (k.D0 == 18) {
                this.i = true;
            }
            if (this.i) {
                final t4y p3 = this.m.P0;
                final Message obtain = Message.obtain((Handler)p3, 9, (Object)this.c);
                Objects.requireNonNull(this.m);
                ((Handler)p3).sendMessageDelayed(obtain, 5000L);
                return;
            }
            this.c(p5c.e((wf0)this.c, k));
        }
    }
    
    public final void r() {
        xd.n((Handler)this.m.P0);
        final Status r0 = p5c.R0;
        this.c(r0);
        final p0y d = this.d;
        Objects.requireNonNull(d);
        int i = 0;
        d.a(false, r0);
        for (inf$a[] array = (inf$a[])this.f.keySet().toArray(new inf$a[0]); i < array.length; ++i) {
            this.p((a4y)new w3y(array[i], new ebs()));
        }
        this.b(new ph6(4, (PendingIntent)null, (String)null));
        if (this.b.b()) {
            this.b.j((fm1.e)new y1y(this));
        }
    }
    
    public final void s(final ph6 ph6) {
        this.q(ph6, null);
    }
    
    public final boolean t() {
        return this.b.k();
    }
    
    public final void x(final int n) {
        if (Looper.myLooper() == ((Handler)this.m.P0).getLooper()) {
            this.g(n);
            return;
        }
        ((Handler)this.m.P0).post((Runnable)new w1y(this, n));
    }
}
