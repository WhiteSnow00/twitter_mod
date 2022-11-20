// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notification.push;

import java.util.List;
import androidx.work.c$a$c;
import java.util.Objects;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/twitter/notification/push/PushTokenUpdateWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "subsystem.tfa.notifications.push.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PushTokenUpdateWorker extends Worker
{
    public static final PushTokenUpdateWorker.PushTokenUpdateWorker$a Companion;
    
    static {
        Companion = new PushTokenUpdateWorker.PushTokenUpdateWorker$a();
    }
    
    public PushTokenUpdateWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        final trl o3 = x68.i().o3();
        Objects.requireNonNull(o3);
        cj1.e();
        final qrl c = o3.c;
        Objects.requireNonNull(c);
        qrl.a(new af4(vba.f((ica)c.b, "", "", "started")));
        o3.f.h();
        final kj b = o3.b;
        final List d = b.a.d();
        final jyi b2 = b.b;
        Objects.requireNonNull(b2);
        final mma e = i5e.e((Iterable)d, (xtk)new wag((Object)b2, 2));
        final mrc g = o3.g;
        Objects.requireNonNull(g);
        final h5j fromIterable = h5j.fromIterable((Iterable)i5e.e((Iterable)e, (xtk)new pi7((Object)g, 5)));
        final ot8 d2 = o3.d;
        final eaq b3 = o3.a.b();
        Objects.requireNonNull(d2);
        final h5j flatMap = h5j.combineLatest((taj)b3.P(), (taj)fromIterable, (zv1)nt8.E0).flatMap((psb)new q2((Object)d2, 3));
        final m4s a = hq1.a;
        flatMap.defaultIfEmpty((Object)(System.currentTimeMillis() + 86400000L)).reduce((zv1)mt8.E0).s().blockingSubscribe((ccj)new srl(o3));
        return (c$a)new c$a$c();
    }
}
