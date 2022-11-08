// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;
import androidx.lifecycle.d;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
import java.util.Collections;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.List;
import android.content.Context;

public class EmojiCompatInitializer implements fnd<Boolean>
{
    @Override
    public final List<Class<? extends fnd<?>>> b() {
        return Collections.singletonList((Class<? extends fnd<?>>)ProcessLifecycleInitializer.class);
    }
    
    public final void c(final Context context) {
        androidx.emoji2.text.c.c((androidx.emoji2.text.c.c)new a(context));
        final en0 c = en0.c(context);
        Objects.requireNonNull(c);
        synchronized (en0.e) {
            Object o;
            if ((o = c.a.get(ProcessLifecycleInitializer.class)) == null) {
                o = c.b((Class)ProcessLifecycleInitializer.class, (Set)new HashSet());
            }
            monitorexit(en0.e);
            final d b = ((lbf)o).b();
            b.a((kbf)new EmojiCompatInitializer$1(this, b));
        }
    }
    
    public static final class a extends c.c
    {
        public a(final Context context) {
            super(new EmojiCompatInitializer.b(context));
            super.c = 1;
        }
    }
    
    public static final class b implements g
    {
        public final Context C0;
        
        public b(final Context context) {
            this.C0 = context.getApplicationContext();
        }
        
        @Override
        public final void b(final h h) {
            final ThreadPoolExecutor a = af6.a("EmojiCompatInitializer");
            a.execute((Runnable)new f1a((Object)this, (Object)h, (Object)a, 0));
        }
    }
    
    public static final class c implements Runnable
    {
        @Override
        public final void run() {
            try {
                final Method b = vut.b;
                vut$a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.d()) {
                    androidx.emoji2.text.c.a().f();
                }
                vut$a.b();
            }
            finally {
                final Method b2 = vut.b;
                vut$a.b();
            }
        }
    }
}
