// 
// Decompiled by Procyon v0.6.0
// 

package androidx.sharetarget;

import android.os.BaseBundle;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Icon;
import java.util.Iterator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import android.service.chooser.ChooserTarget;
import java.util.List;
import android.content.IntentFilter;
import android.content.ComponentName;
import android.service.chooser.ChooserTargetService;

public class ChooserTargetServiceCompat extends ChooserTargetService
{
    public final List<ChooserTarget> onGetChooserTargets(final ComponentName componentName, IntentFilter intentFilter) {
        final Context applicationContext = ((Context)this).getApplicationContext();
        if (b.a == null) {
            synchronized (b.b) {
                if (b.a == null) {
                    b.a = b.c(applicationContext);
                }
            }
        }
        final ArrayList<androidx.sharetarget.a> a = b.a;
        final ArrayList<androidx.sharetarget.a> list = new ArrayList<androidx.sharetarget.a>();
        final Iterator<androidx.sharetarget.a> iterator = a.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final androidx.sharetarget.a a2 = iterator.next();
            if (!a2.b.equals(componentName.getClassName())) {
                continue;
            }
            for (androidx.sharetarget.a.a[] a3 = a2.a; i < a3.length; ++i) {
                if (intentFilter.hasDataType(a3[i].a)) {
                    list.add(a2);
                    break;
                }
            }
        }
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        if (l3q.i == null) {
            synchronized (l3q.h) {
                if (l3q.i == null) {
                    final TimeUnit seconds = TimeUnit.SECONDS;
                    l3q.i = new l3q(applicationContext, (ExecutorService)new ThreadPoolExecutor(0, 1, 20L, seconds, new LinkedBlockingQueue<Runnable>()), (ExecutorService)new ThreadPoolExecutor(0, 1, 20L, seconds, new LinkedBlockingQueue<Runnable>()));
                }
            }
        }
        final l3q j = l3q.i;
        try {
            final List b = j.b();
            if (b != null && !b.isEmpty()) {
                final ArrayList<Comparable> list2 = new ArrayList<Comparable>();
                for (final j3q j3q : b) {
                    for (final androidx.sharetarget.a a4 : list) {
                        if (j3q.k.containsAll(Arrays.asList(a4.c))) {
                            list2.add(new a(j3q, new ComponentName(applicationContext.getPackageName(), a4.b)));
                            break;
                        }
                    }
                }
                Object o;
                if (list2.isEmpty()) {
                    o = new ArrayList<ChooserTarget>();
                }
                else {
                    Collections.sort(list2);
                    intentFilter = (IntentFilter)new ArrayList();
                    int n = list2.get(0).D0.n;
                    final Iterator<a> iterator4 = list2.iterator();
                    float n2 = 1.0f;
                    while (iterator4.hasNext()) {
                        final a a5 = iterator4.next();
                        final j3q d0 = a5.D0;
                        final Icon icon = null;
                        IconCompat g;
                        try {
                            g = j.g(d0.b);
                        }
                        catch (final Exception ex) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", (Throwable)ex);
                            g = null;
                        }
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("android.intent.extra.shortcut.ID", d0.b);
                        final int n3 = d0.n;
                        float n4 = n2;
                        int n5 = n;
                        if (n != n3) {
                            n4 = n2 - 0.01f;
                            n5 = n3;
                        }
                        final CharSequence e = d0.e;
                        Icon m;
                        if (g == null) {
                            m = icon;
                        }
                        else {
                            m = g.m(null);
                        }
                        ((ArrayList<ChooserTarget>)intentFilter).add(new ChooserTarget(e, m, n4, a5.E0, bundle));
                        n2 = n4;
                        n = n5;
                    }
                    o = intentFilter;
                }
                return (List<ChooserTarget>)o;
            }
            return Collections.emptyList();
        }
        catch (final Exception ex2) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", (Throwable)ex2);
            return Collections.emptyList();
        }
    }
    
    public static final class a implements Comparable<a>
    {
        public final j3q D0;
        public final ComponentName E0;
        
        public a(final j3q d0, final ComponentName e0) {
            this.D0 = d0;
            this.E0 = e0;
        }
        
        @Override
        public final int compareTo(final Object o) {
            return this.D0.n - ((a)o).D0.n;
        }
    }
}
