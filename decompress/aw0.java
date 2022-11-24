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

public class aw0<S> implements dw0<S>
{
    public static final Handler R0;
    public final String F0;
    public final boolean G0;
    public final List<aw0.aw0$b<aw0<S>>> H0;
    public final List<a<S>> I0;
    public final v9j<ptm<S>> J0;
    public final iw0 K0;
    public final ep3<S> L0;
    public final dw0<S> M0;
    public int N0;
    public int O0;
    public gw0 P0;
    public boolean Q0;
    
    static {
        R0 = new Handler(Looper.getMainLooper());
    }
    
    public aw0(final dw0<S> m0) {
        this.H0 = new CopyOnWriteArrayList();
        this.I0 = new CopyOnWriteArrayList();
        this.J0 = (v9j<ptm<S>>)new v9j();
        this.K0 = new iw0();
        this.L0 = (ep3<S>)new ep3();
        this.O0 = 1;
        this.Q0 = true;
        this.F0 = flr.p(6);
        if (m0 != null) {
            if (m0 instanceof ew0) {
                this.G0 = ((ew0)m0).h((dw0)this);
            }
            else {
                this.G0 = false;
            }
            this.M0 = m0;
        }
        else {
            this.M0 = this;
            this.G0 = true;
        }
    }
    
    public final Runnable E(final aw0<?> aw0) {
        Object o = this.K0;
        synchronized (o) {
            if (((iw0)o).a == 1) {
                ((iw0)o).a = 2;
                monitorexit(o);
                o = this.H0;
                final int a = o5j.a;
                o = ((CopyOnWriteArrayList<aw0.aw0$b>)o).iterator();
                while (((Iterator)o).hasNext()) {
                    ((aw0.aw0$b)((Iterator<a>)o).next()).a(this);
                }
                o = this.y().iterator();
                while (((Iterator)o).hasNext()) {
                    ((Iterator<a>)o).next().b();
                }
                try {
                    return this.M0.d(aw0);
                }
                catch (final InterruptedException ex) {
                    this.H(false);
                    return null;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Mark ACCEPTED. Invalid state: ");
            sb.append(((iw0)o).a);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public aw0<S> F(final aw0.aw0$b<? extends aw0<S>> aw0$b) {
        final CopyOnWriteArrayList h0 = this.H0;
        final int a = o5j.a;
        h0.add(aw0$b);
        return this;
    }
    
    public final <E extends aw0<S>> E G(final fum<S> fum) {
        ((List<fum<S>>)this.L0.a).add(fum);
        final int a = o5j.a;
        return (E)this;
    }
    
    public final boolean H(final boolean b) {
        if (this.Q0) {
            Object o = this.K0;
            synchronized (o) {
                boolean b2;
                if (!((iw0)o).b && ((iw0)o).a != 5) {
                    ((iw0)o).b = true;
                    monitorexit(o);
                    b2 = true;
                }
                else {
                    monitorexit(o);
                    b2 = false;
                }
                if (b2) {
                    o = this.H0;
                    final int a = o5j.a;
                    o = ((CopyOnWriteArrayList<aw0.aw0$b>)o).iterator();
                    while (((Iterator)o).hasNext()) {
                        ((aw0.aw0$b)((Iterator<a>)o).next()).c(this, b);
                    }
                    o = this.y().iterator();
                    while (((Iterator)o).hasNext()) {
                        ((Iterator<a>)o).next().c();
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    public final <E extends aw0<S>> E I() {
        ((List)this.L0.a).clear();
        final int a = o5j.a;
        return (E)this;
    }
    
    public final void J(final ptm<S> ptm) {
        synchronized (this.K0) {
            ((djl)this.J0).set((Object)ptm);
            this.K0.a();
            monitorexit(this.K0);
            this.M0.e(ptm);
            aw0.R0.post((Runnable)new n20((Object)this, 9));
        }
    }
    
    public final S K() {
        final iw0 k0 = this.K0;
        synchronized (k0) {
            boolean b;
            if (k0.b) {
                monitorexit(k0);
                b = false;
            }
            else {
                final int a = k0.a;
                if (a != 2 && a != 3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Mark RUNNING. Invalid state: ");
                    sb.append(k0.a);
                    throw new IllegalStateException(sb.toString());
                }
                k0.a = 4;
                b = true;
                monitorexit(k0);
            }
            if (b) {
                try {
                    final e9a a2 = r9a.b().a;
                    return (S)a2.j((Callable)new zv0((Object)this, (Object)a2, 0));
                }
                catch (final Exception k0) {
                    return null;
                }
                catch (final Error k0) {
                    throw k0;
                }
                catch (final RuntimeException k0) {
                    throw k0;
                }
                catch (final InterruptedException k0) {
                    return this.M0.a();
                }
            }
            return this.M0.a();
        }
    }
    
    public final v9j<S> L() {
        if (((FutureTask)this.J0).isDone()) {
            return (v9j<S>)v9j.o(this.M().e());
        }
        final aw0$a aw0$a = new aw0$a(this);
        this.J0.n((fa3)new es2((Object)aw0$a, 18));
        return (v9j<S>)aw0$a;
    }
    
    public final ptm<S> M() {
        Label_0048: {
            if (!this.O()) {
                break Label_0048;
            }
            final v9j<ptm<S>> j0 = this.J0;
            while (true) {
                if (!((FutureTask)j0).isDone() || ((FutureTask)j0).isCancelled()) {
                    break Label_0034;
                }
                try {
                    Object value = ((djl)j0).get();
                    while (true) {
                        final ptm ptm = (ptm)value;
                        vmw.g((Object)ptm);
                        return (ptm<S>)ptm;
                        throw new IllegalStateException("The operation is not complete");
                        value = null;
                        continue;
                    }
                }
                catch (final InterruptedException | ExecutionException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final boolean N() {
        final iw0 k0 = this.K0;
        synchronized (k0) {
            return k0.b;
        }
    }
    
    public final boolean O() {
        final iw0 k0 = this.K0;
        synchronized (k0) {
            return k0.a == 5;
        }
    }
    
    public final void P(final aw0.aw0$b<? extends aw0<S>> aw0$b) {
        final CopyOnWriteArrayList h0 = this.H0;
        final int a = o5j.a;
        h0.remove(aw0$b);
    }
    
    public final <E extends aw0<S>> E Q(final Object o0) {
        if (o0 != 9) {
            this.O0 = (int)o0;
            final int a = o5j.a;
            return (E)this;
        }
        throw new IllegalArgumentException("Async operations should not run on the main thread.");
    }
    
    @Override
    public Object a() {
        return null;
    }
    
    @Override
    public Object b() {
        return null;
    }
    
    @Override
    public aw0 c() {
        return new aw0(this);
    }
    
    @Override
    public Runnable d(final aw0 aw0) {
        return null;
    }
    
    @Override
    public void e(final ptm ptm) {
    }
    
    @Override
    public final void f() {
        if (this.G0) {
            this.P0 = new gw0();
        }
        else {
            this.M0.f();
        }
    }
    
    @Override
    public final gw0 getMetrics() {
        gw0 gw0;
        if (!this.G0) {
            gw0 = this.M0.getMetrics();
        }
        else {
            gw0 = this.P0;
        }
        return gw0;
    }
    
    @Override
    public void j(final ptm ptm) {
    }
    
    @Override
    public dw0<S> o(final a<S> a) {
        if (this.G0) {
            this.I0.add(a);
        }
        else {
            this.M0.o(a);
        }
        return this;
    }
    
    @Override
    public UserIdentifier r() {
        UserIdentifier userIdentifier;
        if (!this.G0) {
            userIdentifier = this.M0.r();
        }
        else {
            userIdentifier = UserIdentifier.UNDEFINED;
        }
        return userIdentifier;
    }
    
    @Override
    public String s() {
        String s;
        if (!this.G0) {
            s = this.M0.s();
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public final List<a<S>> y() {
        List<a<S>> list;
        if (!this.G0) {
            list = this.M0.y();
        }
        else {
            list = this.I0;
        }
        return list;
    }
}
