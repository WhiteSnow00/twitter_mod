// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class a
{
    public final ExecutorService a;
    public final ExecutorService b;
    public final ksx c;
    public final vrd d;
    public final rdf e;
    public final int f;
    public final int g;
    public final int h;
    
    public a(final a a) {
        this.a = (ExecutorService)this.a(false);
        this.b = (ExecutorService)this.a(true);
        final ksx a2 = a.a;
        if (a2 == null) {
            final String a3 = ksx.a;
            this.c = (ksx)new jsx();
        }
        else {
            this.c = a2;
        }
        this.d = new vrd();
        this.e = new rdf(3);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }
    
    public final Executor a(final boolean b) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), (ThreadFactory)new uf6(b));
    }
    
    public static final class a
    {
        public ksx a;
    }
    
    public interface b
    {
        a a();
    }
}
