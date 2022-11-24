// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.subscriptions.appicon.implementation;

import androidx.work.b;
import androidx.work.c$a$c;
import androidx.work.c$a$a;
import java.util.Objects;
import androidx.work.c$a;
import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/twitter/subscriptions/appicon/implementation/AppIconResetWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "subsystem.tfa.subscriptions.appicon.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class AppIconResetWorker extends Worker
{
    public static final AppIconResetWorker.AppIconResetWorker$a Companion;
    public final WorkerParameters K0;
    
    static {
        Companion = new AppIconResetWorker.AppIconResetWorker$a();
    }
    
    public AppIconResetWorker(final Context context, final WorkerParameters k0) {
        e0e.f((Object)context, "context");
        e0e.f((Object)k0, "workerParams");
        super(context, k0);
        this.K0 = k0;
    }
    
    public final c$a g() {
        Object m = null;
        try {
            Objects.requireNonNull(qm0.Companion);
            final ml0 e5 = ((qm0)dgw.Companion.a().c((Class)qm0.class)).E5();
            final b b = this.K0.b;
            int intValue = -1;
            final Object value = b.a.get("ParamAppIconID");
            if (value instanceof Integer) {
                intValue = (int)value;
            }
            final dl0 a = e5.a();
            Integer value2;
            if (a != null) {
                value2 = a.c();
            }
            else {
                value2 = null;
            }
            if (value2 == null || value2 == intValue) {
                e5.d((gl0)gl0$b.a);
            }
            final vzv a2 = vzv.a;
        }
        finally {
            final Throwable t;
            m = jb2.M(t);
        }
        if (ctm.a(m) != null) {
            return (c$a)new c$a$a();
        }
        return (c$a)new c$a$c();
    }
}
