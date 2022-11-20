// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import androidx.work.c;
import androidx.work.c$a$c;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Landroidx/work/impl/workers/CombineContinuationsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release" }, k = 1, mv = { 1, 7, 1 })
public final class CombineContinuationsWorker extends Worker
{
    public CombineContinuationsWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        return (c$a)new c$a$c(((c)this).E0.b);
    }
}
