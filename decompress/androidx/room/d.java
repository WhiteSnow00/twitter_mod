// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

public final class d
{
    public final String a;
    public int b;
    public final c c;
    public final d$e d;
    public b e;
    public final Executor f;
    public final d$a g;
    public final AtomicBoolean h;
    public final d$b i;
    public final d$c j;
    public final d$d k;
    
    public d(Context applicationContext, final String a, final Intent intent, final c c, final Executor f) {
        this.g = new a$a(this) {
            public final d b;
            
            public final void P(final String[] array) {
                this.b.f.execute(new Runnable(this, array) {
                    public final String[] D0;
                    public final d$a E0;
                    
                    @Override
                    public final void run() {
                        final c c = this.E0.b.c;
                        final String[] d0 = this.D0;
                        synchronized (c.j) {
                            final Iterator<Map.Entry<c.c, c.d>> iterator = c.j.iterator();
                            while (true) {
                                final kpo$e kpo$e = (kpo$e)iterator;
                                if (!kpo$e.hasNext()) {
                                    break;
                                }
                                final Map.Entry entry = (Map.Entry)kpo$e.next();
                                final c.c c2 = (c.c)entry.getKey();
                                Objects.requireNonNull(c2);
                                if (c2 instanceof d$e) {
                                    continue;
                                }
                                ((c.d)entry.getValue()).a(d0);
                            }
                        }
                    }
                });
            }
        };
        this.h = new AtomicBoolean(false);
        final ServiceConnection i = (ServiceConnection)new ServiceConnection(this) {
            public final d D0;
            
            public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                final d d0 = this.D0;
                final int a = b$a.a;
                Object e;
                if (binder == null) {
                    e = null;
                }
                else {
                    final IInterface queryLocalInterface = binder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface != null && queryLocalInterface instanceof b) {
                        e = queryLocalInterface;
                    }
                    else {
                        e = new b$a$a(binder);
                    }
                }
                d0.e = (b)e;
                final d d2 = this.D0;
                d2.f.execute(d2.j);
            }
            
            public final void onServiceDisconnected(final ComponentName componentName) {
                final d d0 = this.D0;
                d0.f.execute(d0.k);
                this.D0.e = null;
            }
        };
        this.i = i;
        this.j = new Runnable(this) {
            public final d D0;
            
            @Override
            public final void run() {
                try {
                    final d d0 = this.D0;
                    final b e = d0.e;
                    if (e != null) {
                        d0.b = e.p1((a)d0.g, d0.a);
                        final d d2 = this.D0;
                        d2.c.a((c.c)d2.d);
                    }
                }
                catch (final RemoteException ex) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", (Throwable)ex);
                }
            }
        };
        this.k = new Runnable(this) {
            public final d D0;
            
            @Override
            public final void run() {
                final d d0 = this.D0;
                d0.c.d((c.c)d0.d);
            }
        };
        applicationContext = applicationContext.getApplicationContext();
        this.a = a;
        this.c = c;
        this.f = f;
        this.d = new d$e(this, (String[])c.a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, (ServiceConnection)i, 1);
    }
}
