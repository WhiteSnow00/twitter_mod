// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import androidx.work.c;
import java.util.List;
import androidx.work.impl.WorkDatabase;
import androidx.work.c$a$c;
import java.util.concurrent.TimeUnit;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release" }, k = 1, mv = { 1, 7, 1 })
public final class DiagnosticsWorker extends Worker
{
    public DiagnosticsWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "parameters");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        final zrx i = zrx.i(((c)this).D0);
        czd.e((Object)i, "getInstance(applicationContext)");
        final WorkDatabase c = i.c;
        czd.e((Object)c, "workManager.workDatabase");
        final ssx y = c.y();
        final esx w = c.w();
        final vsx z = c.z();
        final u5s v = c.v();
        final List c2 = y.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        final List t = y.t();
        final List n = y.n();
        if (c2.isEmpty() ^ true) {
            final o9g e = o9g.e();
            final String a = ev8.a;
            e.f(a, "Recently completed work:\n\n");
            o9g.e().f(a, ev8.a(w, z, v, c2));
        }
        if (t.isEmpty() ^ true) {
            final o9g e2 = o9g.e();
            final String a2 = ev8.a;
            e2.f(a2, "Running work:\n\n");
            o9g.e().f(a2, ev8.a(w, z, v, t));
        }
        if (n.isEmpty() ^ true) {
            final o9g e3 = o9g.e();
            final String a3 = ev8.a;
            e3.f(a3, "Enqueued work:\n\n");
            o9g.e().f(a3, ev8.a(w, z, v, n));
        }
        return (c$a)new c$a$c();
    }
}
