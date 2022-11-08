// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import android.os.RemoteException;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.a$c;
import com.google.android.gms.common.api.a$b;

public abstract class a<R extends xrm, A extends a$b> extends BasePendingResult<R> implements nm1<R>
{
    public final a$c<A> o;
    public final com.google.android.gms.common.api.a<?> p;
    
    public a(final com.google.android.gms.common.api.a<?> p2, final c c) {
        xd.u((Object)c, (Object)"GoogleApiClient must not be null");
        super(c);
        xd.u((Object)p2, (Object)"Api must not be null");
        this.o = p2.b;
        this.p = p2;
    }
    
    public abstract void m(final A p0) throws RemoteException;
    
    public final void n(final A a) throws DeadObjectException {
        try {
            this.m(a);
        }
        catch (final RemoteException ex) {
            this.o(new Status(8, ((Throwable)ex).getLocalizedMessage(), null));
        }
        catch (final DeadObjectException ex2) {
            this.o(new Status(8, ((Throwable)ex2).getLocalizedMessage(), null));
            throw ex2;
        }
    }
    
    public final void o(final Status status) {
        xd.l(status.r() ^ true, (Object)"Failed result must not be success");
        this.g(this.d(status));
    }
}
