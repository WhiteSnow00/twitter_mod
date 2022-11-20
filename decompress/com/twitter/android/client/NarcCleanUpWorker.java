// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.client;

import androidx.work.c;
import java.util.Set;
import android.os.Build$VERSION;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import androidx.work.c$a$c;
import java.io.File;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.Worker;

public class NarcCleanUpWorker extends Worker
{
    public NarcCleanUpWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public final c$a g() {
        final Context d0 = ((c)this).D0;
        wk0.b().t();
        cj1.e();
        final File file = new File(n40.o(d0), "narc");
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                listFiles[i].delete();
            }
        }
        cbw.b((elm)new af4(new String[] { "jobs", null, null, "narc", "clean_up" }));
        return (c$a)new c$a$c();
    }
    
    public static final class a
    {
        public a(final urx urx) {
            final lfa e0 = lfa.E0;
            final n3k$a n3k$a = new n3k$a((Class)NarcCleanUpWorker.class, 28800000L, TimeUnit.MILLISECONDS);
            final LinkedHashSet set = new LinkedHashSet();
            Object o;
            if (Build$VERSION.SDK_INT >= 24) {
                o = mq4.R0((Iterable)set);
            }
            else {
                o = p2a.D0;
            }
            ((osx$a)n3k$a).c.j = new qi6(1, true, false, false, false, -1L, -1L, (Set)o);
            urx.e("NarcLogsCleanUpJob", e0, (n3k)((osx$a)n3k$a).b());
        }
    }
}
