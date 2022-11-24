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
        e0e.f((Object)context, "context");
        e0e.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        final esl o3 = o6f.b().o3();
        Objects.requireNonNull(o3);
        fj1.e();
        final bsl c = o3.c;
        Objects.requireNonNull(c);
        bsl.a(new fg4(dda.f((qda)c.b, "", "", "started")));
        o3.f.h();
        final oj b = o3.b;
        final List d = b.a.d();
        final wyi b2 = b.b;
        Objects.requireNonNull(b2);
        final tna e = k6e.e((Iterable)d, (nuk)new k07((Object)b2, 2));
        final msc g = o3.g;
        Objects.requireNonNull(g);
        final t5j fromIterable = t5j.fromIterable((Iterable)k6e.e((Iterable)e, (nuk)new eba((Object)g, 5)));
        final uu8 d2 = o3.d;
        final bbq b3 = o3.a.b();
        Objects.requireNonNull(d2);
        final t5j flatMap = t5j.combineLatest((fbj)b3.P(), (fbj)fromIterable, (hw1)tu8.G0).flatMap((rtb)new wsf(d2, 4));
        final g5s a = nq1.a;
        flatMap.defaultIfEmpty((Object)(System.currentTimeMillis() + 86400000L)).reduce((hw1)su8.G0).r().blockingSubscribe((ocj)new dsl(o3));
        return (c$a)new c$a$c();
    }
}
