// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public final class e<T>
{
    public static final b h;
    public final bmf a;
    public final c<T> b;
    public b c;
    public final List<e.e$a<T>> d;
    public List<T> e;
    public List<T> f;
    public int g;
    
    static {
        h = new b();
    }
    
    public e(final bmf a, final c<T> b) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.emptyList();
        this.a = a;
        this.b = b;
        this.c = androidx.recyclerview.widget.e.h;
    }
    
    public final void a(final List<T> list, final Runnable runnable) {
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((e.e$a)iterator.next()).a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
    
    public static final class b implements Executor
    {
        public final Handler D0;
        
        public b() {
            this.D0 = new Handler(Looper.getMainLooper());
        }
        
        @Override
        public final void execute(final Runnable runnable) {
            this.D0.post(runnable);
        }
    }
}
