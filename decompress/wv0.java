import java.util.concurrent.FutureTask;
import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Looper;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class wv0<S> implements zv0<S>
{
    public static final Handler P0;
    public final String D0;
    public final boolean E0;
    public final List<wv0.wv0$b<wv0<S>>> F0;
    public final List<zv0$a<S>> G0;
    public final j9j<atm<S>> H0;
    public final ew0 I0;
    public final fo3<S> J0;
    public final zv0<S> K0;
    public int L0;
    public int M0;
    public cw0 N0;
    public boolean O0;
    
    static {
        P0 = new Handler(Looper.getMainLooper());
    }
    
    public wv0(final zv0<S> k0) {
        this.F0 = new CopyOnWriteArrayList();
        this.G0 = new CopyOnWriteArrayList();
        this.H0 = (j9j<atm<S>>)new j9j();
        this.I0 = new ew0();
        this.J0 = (fo3<S>)new fo3();
        this.M0 = 1;
        this.O0 = true;
        this.D0 = ikr.p(6);
        if (k0 != null) {
            if (k0 instanceof aw0) {
                this.E0 = ((aw0)k0).h((zv0)this);
            }
            else {
                this.E0 = false;
            }
            this.K0 = k0;
        }
        else {
            this.K0 = (zv0<S>)this;
            this.E0 = true;
        }
    }
    
    public final Runnable E(final wv0<?> wv0) {
        Object o = this.I0;
        synchronized (o) {
            if (((ew0)o).a == 1) {
                ((ew0)o).a = 2;
                monitorexit(o);
                o = this.F0;
                final int a = c5j.a;
                o = ((CopyOnWriteArrayList<wv0.wv0$b>)o).iterator();
                while (((Iterator)o).hasNext()) {
                    ((wv0.wv0$b)((Iterator<zv0$a>)o).next()).a(this);
                }
                o = this.y().iterator();
                while (((Iterator)o).hasNext()) {
                    ((Iterator<zv0$a>)o).next().b();
                }
                try {
                    return this.K0.d((wv0)wv0);
                }
                catch (final InterruptedException ex) {
                    this.H(false);
                    return null;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Mark ACCEPTED. Invalid state: ");
            sb.append(((ew0)o).a);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public wv0<S> F(final wv0.wv0$b<? extends wv0<S>> wv0$b) {
        final CopyOnWriteArrayList f0 = this.F0;
        final int a = c5j.a;
        f0.add(wv0$b);
        return this;
    }
    
    public final <E extends wv0<S>> E G(final qtm<S> qtm) {
        ((List<qtm<S>>)this.J0.a).add(qtm);
        final int a = c5j.a;
        return (E)this;
    }
    
    public final boolean H(final boolean b) {
        if (this.O0) {
            Object o = this.I0;
            synchronized (o) {
                boolean b2;
                if (!((ew0)o).b && ((ew0)o).a != 5) {
                    ((ew0)o).b = true;
                    monitorexit(o);
                    b2 = true;
                }
                else {
                    monitorexit(o);
                    b2 = false;
                }
                if (b2) {
                    o = this.F0;
                    final int a = c5j.a;
                    o = ((CopyOnWriteArrayList<wv0.wv0$b>)o).iterator();
                    while (((Iterator)o).hasNext()) {
                        ((wv0.wv0$b)((Iterator<zv0$a>)o).next()).c(this, b);
                    }
                    o = this.y().iterator();
                    while (((Iterator)o).hasNext()) {
                        ((Iterator<zv0$a>)o).next().c();
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final <E extends wv0<S>> E I() {
        ((List)this.J0.a).clear();
        final int a = c5j.a;
        return (E)this;
    }
    
    public final void J(final atm<S> atm) {
        synchronized (this.I0) {
            ((ril)this.H0).set((Object)atm);
            this.I0.a();
            monitorexit(this.I0);
            this.K0.e((atm)atm);
            wv0.P0.post((Runnable)new wht((Object)this, 9));
        }
    }
    
    public final S K() {
        final ew0 i0 = this.I0;
        synchronized (i0) {
            boolean b;
            if (i0.b) {
                monitorexit(i0);
                b = false;
            }
            else {
                final int a = i0.a;
                if (a != 2 && a != 3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Mark RUNNING. Invalid state: ");
                    sb.append(i0.a);
                    throw new IllegalStateException(sb.toString());
                }
                i0.a = 4;
                b = true;
                monitorexit(i0);
            }
            if (b) {
                try {
                    final z7a a2 = m8a.b().a;
                    return (S)a2.j((Callable)new vv0((Object)this, (Object)a2, 0));
                }
                catch (final Exception i0) {
                    return null;
                }
                catch (final Error i0) {
                    throw i0;
                }
                catch (final RuntimeException i0) {
                    throw i0;
                }
                catch (final InterruptedException i0) {
                    return (S)this.K0.a();
                }
            }
            return (S)this.K0.a();
        }
    }
    
    public final j9j<S> L() {
        if (((FutureTask)this.H0).isDone()) {
            return (j9j<S>)j9j.o((Object)this.M().e());
        }
        final wv0$a wv0$a = new wv0$a(this);
        this.H0.n((n93)new csf((Object)wv0$a, 18));
        return (j9j<S>)wv0$a;
    }
    
    public final atm<S> M() {
        Label_0048: {
            if (!this.O()) {
                break Label_0048;
            }
            final j9j<atm<S>> h0 = this.H0;
            while (true) {
                if (!((FutureTask)h0).isDone() || ((FutureTask)h0).isCancelled()) {
                    break Label_0034;
                }
                try {
                    Object value = ((ril)h0).get();
                    while (true) {
                        final atm atm = (atm)value;
                        jee.l((Object)atm);
                        return atm;
                        value = null;
                        continue;
                    }
                    throw new IllegalStateException("The operation is not complete");
                }
                catch (final InterruptedException | ExecutionException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final boolean N() {
        final ew0 i0 = this.I0;
        synchronized (i0) {
            return i0.b;
        }
    }
    
    public final boolean O() {
        final ew0 i0 = this.I0;
        synchronized (i0) {
            return i0.a == 5;
        }
    }
    
    public final void P(final wv0.wv0$b<? extends wv0<S>> wv0$b) {
        final CopyOnWriteArrayList f0 = this.F0;
        final int a = c5j.a;
        f0.remove(wv0$b);
    }
    
    public final <E extends wv0<S>> E Q(final Object m0) {
        if (m0 != 9) {
            this.M0 = (int)m0;
            final int a = c5j.a;
            return (E)this;
        }
        throw new IllegalArgumentException("Async operations should not run on the main thread.");
    }
    
    public Object a() {
        return null;
    }
    
    public Object b() {
        return null;
    }
    
    public wv0 c() {
        return new wv0((zv0<S>)this);
    }
    
    public Runnable d(final wv0 wv0) {
        return null;
    }
    
    public void e(final atm atm) {
    }
    
    public final void f() {
        if (this.E0) {
            this.N0 = new cw0();
        }
        else {
            this.K0.f();
        }
    }
    
    public final cw0 getMetrics() {
        cw0 cw0;
        if (!this.E0) {
            cw0 = this.K0.getMetrics();
        }
        else {
            cw0 = this.N0;
        }
        return cw0;
    }
    
    public void j(final atm atm) {
    }
    
    public zv0<S> o(final zv0$a<S> zv0$a) {
        if (this.E0) {
            this.G0.add(zv0$a);
        }
        else {
            this.K0.o((zv0$a)zv0$a);
        }
        return (zv0<S>)this;
    }
    
    public UserIdentifier q() {
        UserIdentifier userIdentifier;
        if (!this.E0) {
            userIdentifier = this.K0.q();
        }
        else {
            userIdentifier = UserIdentifier.UNDEFINED;
        }
        return userIdentifier;
    }
    
    public String s() {
        String s;
        if (!this.E0) {
            s = this.K0.s();
        }
        else {
            s = null;
        }
        return s;
    }
    
    public void w() {
    }
    
    public final List<zv0$a<S>> y() {
        List list;
        if (!this.E0) {
            list = this.K0.y();
        }
        else {
            list = this.G0;
        }
        return list;
    }
}
