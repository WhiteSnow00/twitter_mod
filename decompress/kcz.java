import android.os.Bundle;
import java.io.Serializable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcz extends c1z
{
    public final opz a;
    public Boolean b;
    public String c;
    
    public kcz(final opz a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
        this.c = null;
    }
    
    public final void C1(final sxz sxz) {
        iuk.z(sxz.F0);
        this.V1(sxz.F0, false);
        this.U0((Runnable)new vlz((Object)this, (Object)sxz, 1, (j98)null));
    }
    
    public final void D1(final sxz sxz) {
        Objects.requireNonNull(sxz, "null reference");
        iuk.z(sxz.F0);
        this.V1(sxz.F0, false);
        this.a.Q().K(sxz.G0, sxz.V0);
    }
    
    public final void G0(final sxz sxz) {
        this.D1(sxz);
        this.U0(new raz(this, sxz, 0));
    }
    
    public final void O1(final sxz sxz) {
        this.D1(sxz);
        this.U0((Runnable)new tyz((Object)this, (Object)sxz, 3, (j98)null));
    }
    
    public final List R(String o, final String s, final boolean b, final sxz sxz) {
        this.D1(sxz);
        final String f0 = sxz.F0;
        iuk.C((Object)f0);
        o = (ExecutionException)this.a.a().o((Callable)new aaz(this, f0, (String)o, s));
        try {
            final List list = ((FutureTask)o).get();
            o = (ExecutionException)new ArrayList(list.size());
            for (final cqz cqz : list) {
                if (b || !kqz.V(cqz.c)) {
                    ((ArrayList<xpz>)o).add(new xpz(cqz));
                }
            }
            return (List)o;
        }
        catch (final ExecutionException o) {}
        catch (final InterruptedException ex) {}
        this.a.b().K0.c("Failed to query user properties. appId", o3z.s(sxz.F0), (Object)o);
        return Collections.emptyList();
    }
    
    public final void R0(final rhy rhy, final sxz sxz) {
        Objects.requireNonNull(rhy, "null reference");
        this.D1(sxz);
        this.U0((Runnable)new q9z(this, (Object)rhy, (Object)sxz, 1));
    }
    
    public final void U0(final Runnable runnable) {
        if (this.a.a().s()) {
            runnable.run();
            return;
        }
        this.a.a().q(runnable);
    }
    
    public final void V1(final String c, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)c)) {
            Label_0099: {
                if (!b) {
                    break Label_0099;
                }
                try {
                    if (this.b == null) {
                        this.b = ("com.google.android.gms".equals(this.c) || jtv.a(this.a.Q0.F0, Binder.getCallingUid()) || o6c.a(this.a.Q0.F0).b(Binder.getCallingUid()));
                    }
                    if (!this.b) {
                        if (this.c == null) {
                            final Context f0 = this.a.Q0.F0;
                            final int callingUid = Binder.getCallingUid();
                            final AtomicBoolean a = g6c.a;
                            if (jtv.b(f0, callingUid, c)) {
                                this.c = c;
                            }
                        }
                        if (!c.equals(this.c)) {
                            throw new SecurityException(String.format("Unknown calling package name '%s'.", c));
                        }
                    }
                    return;
                }
                catch (final SecurityException ex) {
                    this.a.b().K0.b("Measurement Service called with invalid calling package. appId", o3z.s(c));
                    throw ex;
                }
            }
        }
        this.a.b().K0.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }
    
    public final void a0(final xpz xpz, final sxz sxz) {
        Objects.requireNonNull(xpz, "null reference");
        this.D1(sxz);
        this.U0((Runnable)new gbz(this, xpz, sxz));
    }
    
    public final List d1(final String s, String o, final String s2, final boolean b) {
        this.V1(s, true);
        o = (ExecutionException)this.a.a().o((Callable)new eaz(this, s, (String)o, s2));
        try {
            final List list = ((FutureTask)o).get();
            o = (ExecutionException)new ArrayList(list.size());
            for (final cqz cqz : list) {
                if (b || !kqz.V(cqz.c)) {
                    ((ArrayList<xpz>)o).add(new xpz(cqz));
                }
            }
            return (List)o;
        }
        catch (final ExecutionException o) {}
        catch (final InterruptedException ex) {}
        this.a.b().K0.c("Failed to get user properties as. appId", o3z.s(s), (Object)o);
        return Collections.emptyList();
    }
    
    public final List e1(String o, final String s, final sxz sxz) {
        this.D1(sxz);
        final String f0 = sxz.F0;
        iuk.C((Object)f0);
        o = (ExecutionException)this.a.a().o((Callable)new iaz(this, f0, (String)o, s));
        try {
            o = (ExecutionException)((FutureTask)o).get();
            return (List)o;
        }
        catch (final ExecutionException o) {}
        catch (final InterruptedException ex) {}
        this.a.b().K0.b("Failed to get conditional user properties", (Object)o);
        return Collections.emptyList();
    }
    
    public final byte[] i0(final rhy rhy, final String s) {
        iuk.z(s);
        Objects.requireNonNull(rhy, "null reference");
        this.V1(s, true);
        this.a.b().R0.b("Log and bundle. event", (Object)this.a.Q0.R0.d(rhy.F0));
        Objects.requireNonNull((r1n)this.a.c());
        final long n = System.nanoTime() / 1000000L;
        Object a = this.a.a();
        final cbz cbz = new cbz(this, rhy, s);
        ((rcz)a).j();
        final u8z u8z = new u8z((c9z)a, (Callable)cbz, true);
        if (Thread.currentThread() == ((c9z)a).H0) {
            ((FutureTask)u8z).run();
        }
        else {
            ((c9z)a).t(u8z);
        }
        try {
            if ((a = ((FutureTask<byte[]>)u8z).get()) == null) {
                this.a.b().K0.b("Log and bundle returned null. appId", o3z.s(s));
                a = new byte[0];
            }
            Objects.requireNonNull((r1n)this.a.c());
            this.a.b().R0.d("Log and bundle processed. event, size, time_ms", (Object)this.a.Q0.R0.d(rhy.F0), (Object)((c9z)a).length, (Object)(System.nanoTime() / 1000000L - n));
            return (byte[])a;
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex) {}
        this.a.b().K0.d("Failed to log and bundle. appId, event, error", o3z.s(s), (Object)this.a.Q0.R0.d(rhy.F0), a);
        return null;
    }
    
    public final void k1(kby kby, final sxz sxz) {
        Objects.requireNonNull(kby, "null reference");
        iuk.C((Object)kby.H0);
        this.D1(sxz);
        kby = new kby(kby);
        kby.F0 = sxz.F0;
        this.U0(new t9z(this, kby, sxz, 0));
    }
    
    public final void n0(final long n, final String s, final String s2, final String s3) {
        this.U0((Runnable)new gcz(this, s2, s3, s, n));
    }
    
    public final List o1(String o, final String s, final String s2) {
        this.V1((String)o, true);
        o = (ExecutionException)this.a.a().o((Callable)new laz(this, (String)o, s, s2));
        try {
            o = (ExecutionException)((FutureTask)o).get();
            return (List)o;
        }
        catch (final ExecutionException o) {}
        catch (final InterruptedException ex) {}
        this.a.b().K0.b("Failed to get conditional user properties as", (Object)o);
        return Collections.emptyList();
    }
    
    public final String t0(sxz sxz) {
        this.D1(sxz);
        final opz a = this.a;
        final Future o = a.a().o((Callable)new bpz(a, sxz));
        Serializable milliseconds = null;
        try {
            milliseconds = TimeUnit.MILLISECONDS;
            milliseconds = (Serializable)(sxz = (sxz)((FutureTask<String>)o).get(30000L, (TimeUnit)milliseconds));
            return (String)sxz;
        }
        catch (final ExecutionException milliseconds) {}
        catch (final InterruptedException milliseconds) {}
        catch (final TimeoutException ex) {}
        a.b().K0.c("Failed to get app instance id. appId", o3z.s(sxz.F0), (Object)milliseconds);
        sxz = null;
        return (String)sxz;
    }
    
    public final void x(final rhy rhy, final sxz sxz) {
        this.a.f();
        this.a.i(rhy, sxz);
    }
    
    public final void x1(final sxz sxz) {
        iuk.z(sxz.F0);
        iuk.C((Object)sxz.a1);
        final e100 e100 = new e100((Object)this, (Object)sxz, 2, (j98)null);
        if (this.a.a().s()) {
            e100.run();
            return;
        }
        this.a.a().r((Runnable)e100);
    }
    
    public final void z0(final Bundle bundle, final sxz sxz) {
        this.D1(sxz);
        final String f0 = sxz.F0;
        iuk.C((Object)f0);
        this.U0((Runnable)new q9z(this, (Object)f0, (Object)bundle, 0));
    }
}
