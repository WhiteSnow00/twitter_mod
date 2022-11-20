// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.d$b;
import androidx.lifecycle.g;
import java.util.concurrent.Callable;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.Closeable;

public class MobileVisionBase<DetectionResultT> implements Closeable, waf
{
    public static final i99 H0;
    public final AtomicBoolean D0;
    public final teg<DetectionResultT, wqd> E0;
    public final mcg F0;
    public final Executor G0;
    
    static {
        H0 = new i99("MobileVisionBase", "");
    }
    
    public MobileVisionBase(@RecentlyNonNull final teg<DetectionResultT, wqd> e0, @RecentlyNonNull final Executor g0) {
        this.D0 = new AtomicBoolean(false);
        this.E0 = e0;
        final mcg f0 = new mcg(4);
        this.F0 = f0;
        this.G0 = g0;
        ((qih)e0).b.incrementAndGet();
        ((qih)e0).a(g0, (Callable)ixy.D0, (giy)f0.D0).d((kij)as2.r1);
    }
    
    @g(d$b.ON_DESTROY)
    @Override
    public void close() {
        synchronized (this) {
            final AtomicBoolean d0 = this.D0;
            boolean b = true;
            if (!d0.getAndSet(true)) {
                this.F0.C();
                final teg<DetectionResultT, wqd> e0 = this.E0;
                final Executor g0 = this.G0;
                if (((qih)e0).b.get() <= 0) {
                    b = false;
                }
                eli.s(b);
                ((qih)e0).a.a(g0, (Runnable)new i3y((Object)e0, 3));
            }
        }
    }
}
