// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import java.util.concurrent.Executor;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Objects;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Collection;
import java.util.Collections;
import android.accounts.Account;
import java.lang.reflect.InvocationTargetException;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import android.os.Build$VERSION;
import android.app.Activity;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import android.os.Looper;
import android.content.Context;

public abstract class b<O extends a$d> implements d<O>
{
    public final Context a;
    public final String b;
    public final a<O> c;
    public final O d;
    public final wf0<O> e;
    public final Looper f;
    public final int g;
    @NotOnlyInitialized
    public final d2y h;
    public final pf8 i;
    public final p5c j;
    
    public b(final Activity activity, final a<O> a, final O o, final b.b$a b$a) {
        this((Context)activity, activity, (com.google.android.gms.common.api.a<a$d>)a, o, b$a);
    }
    
    @Deprecated
    public b(final Activity activity, final a<O> a, final O o, final pf8 pf8) {
        final Looper mainLooper = ((Context)activity).getMainLooper();
        xd.u((Object)mainLooper, (Object)"Looper must not be null.");
        this(activity, (com.google.android.gms.common.api.a<a$d>)a, o, new b.b$a(pf8, mainLooper));
    }
    
    public b(final Context context, Activity activity, a<O> h, O o, b.b$a c) {
        xd.u((Object)context, (Object)"Null context is not permitted.");
        xd.u((Object)h, (Object)"Api must not be null.");
        xd.u((Object)c, (Object)"Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        final boolean b = Build$VERSION.SDK_INT >= 30;
        String b2;
        final String s = b2 = null;
        while (true) {
            if (!b) {
                break Label_0087;
            }
            try {
                b2 = (String)Context.class.getMethod("getAttributionTag", (Class<?>[])new Class[0]).invoke(context, new Object[0]);
                this.b = b2;
                this.c = (a<O>)h;
                this.d = o;
                this.f = c.b;
                o = (O)new wf0((a)h, (a$d)o, b2);
                this.e = (wf0<O>)o;
                this.h = new d2y(this);
                h = p5c.h(this.a);
                this.j = h;
                this.g = h.J0.getAndIncrement();
                this.i = c.a;
                if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                    c = (b.b$a)LifecycleCallback.c(new saf(activity));
                    activity = (Activity)((jbf)c).l("ConnectionlessLifecycleHelper", q0y.class);
                    Object o2;
                    if ((o2 = activity) == null) {
                        final int c2 = n5c.c;
                        final n5c e = n5c.e;
                        o2 = new q0y((jbf)c, h);
                    }
                    ((q0y)o2).H0.add((Object)o);
                    h.b((q0y)o2);
                }
                final t4y p = h.P0;
                ((Handler)p).sendMessage(((Handler)p).obtainMessage(7, (Object)this));
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                b2 = s;
                continue;
            }
            break;
        }
    }
    
    public b(final Context context, final a<O> a, final O o, final b.b$a b$a) {
        this(context, null, (com.google.android.gms.common.api.a<a$d>)a, o, b$a);
    }
    
    public final wf0<O> h() {
        return this.e;
    }
    
    public final fh4.a i() {
        final fh4.a a = new fh4.a();
        final a$d d = this.d;
        final boolean b = d instanceof a$d.b;
        Account o = null;
        Label_0089: {
            if (b) {
                final GoogleSignInAccount g = ((a$d.b)d).g();
                if (g != null) {
                    final String f0 = g.F0;
                    if (f0 == null) {
                        break Label_0089;
                    }
                    o = new Account(f0, "com.google");
                    break Label_0089;
                }
            }
            final a$d d2 = this.d;
            if (d2 instanceof a$d.a) {
                o = ((a$d.a)d2).o();
            }
        }
        a.a = o;
        final a$d d3 = this.d;
        Object o2;
        if (d3 instanceof a$d.b) {
            final GoogleSignInAccount g2 = ((a$d.b)d3).g();
            if (g2 == null) {
                o2 = Collections.emptySet();
            }
            else {
                o2 = g2.r();
            }
        }
        else {
            o2 = Collections.emptySet();
        }
        if (a.b == null) {
            a.b = (ft0<Scope>)new ft0(0);
        }
        a.b.addAll((Collection)o2);
        a.d = this.a.getClass().getName();
        a.c = this.a.getPackageName();
        return a;
    }
    
    public final <A extends a$b, T extends com.google.android.gms.common.api.internal.a<? extends xrm, A>> T j(final int n, final T t) {
        t.j();
        final p5c j = this.j;
        Objects.requireNonNull(j);
        final h3y h3y = new h3y(n, (com.google.android.gms.common.api.internal.a)t);
        final t4y p2 = j.P0;
        ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(4, (Object)new u2y((a4y)h3y, j.K0.get(), this)));
        return t;
    }
    
    public final <TResult, A extends a$b> zas<TResult> k(final int n, final dbs<A, TResult> dbs) {
        final ebs ebs = new ebs();
        final p5c j = this.j;
        final pf8 i = this.i;
        Objects.requireNonNull(j);
        final int c = dbs.c;
        if (c != 0) {
            final wf0<O> e = this.e;
            final boolean c2 = j.c();
            Object o = null;
            Label_0259: {
                if (c2) {
                    final wjo a = vjo.a().a;
                    boolean b = true;
                    if (a != null) {
                        if (!a.D0) {
                            break Label_0259;
                        }
                        b = a.E0;
                        final z1y z1y = (z1y)j.L0.get((Object)e);
                        if (z1y != null) {
                            final a.f b2 = z1y.b;
                            if (!(b2 instanceof fm1)) {
                                break Label_0259;
                            }
                            final fm1 fm1 = (fm1)b2;
                            if (fm1.c1 != null && !fm1.g()) {
                                final rh6 a2 = q2y.a(z1y, fm1, c);
                                if (a2 == null) {
                                    break Label_0259;
                                }
                                ++z1y.l;
                                b = a2.E0;
                            }
                        }
                    }
                    long elapsedRealtime = 0L;
                    long currentTimeMillis;
                    if (b) {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    else {
                        currentTimeMillis = 0L;
                    }
                    if (b) {
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    o = new q2y(j, c, (wf0)e, currentTimeMillis, elapsedRealtime);
                }
            }
            if (o != null) {
                final rzz a3 = ebs.a;
                final t4y p2 = j.P0;
                Objects.requireNonNull(p2);
                a3.v((Executor)new t1y((Handler)p2), (ahj)o);
            }
        }
        final o3y o3y = new o3y(n, (dbs)dbs, ebs, i);
        final t4y p3 = j.P0;
        ((Handler)p3).sendMessage(((Handler)p3).obtainMessage(4, (Object)new u2y((a4y)o3y, j.K0.get(), this)));
        return (zas<TResult>)ebs.a;
    }
}
