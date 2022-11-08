// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import androidx.activity.result.ActivityResultRegistry;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends e
{
    public final /* synthetic */ xub a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ fo c;
    public final /* synthetic */ eo d;
    public final /* synthetic */ Fragment e;
    
    public l(final Fragment e, final xub a, final AtomicReference b, final fo c, final eo d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
        final Fragment e = this.e;
        Objects.requireNonNull(e);
        final StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(e.H0);
        sb.append("_rq#");
        sb.append(e.v1.getAndIncrement());
        this.b.set(this.a.apply(null).e(sb.toString(), (lbf)this.e, this.c, this.d));
    }
}
