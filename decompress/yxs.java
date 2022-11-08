import java.io.Serializable;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yxs extends RecyclerView$r
{
    public final /* synthetic */ ays a;
    public final /* synthetic */ zrs b;
    public final /* synthetic */ zxs c;
    
    public yxs(final zxs c, final ays a, final zrs b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        Object layoutManager = recyclerView.getLayoutManager();
        i = w4j.a;
        if (!LinearLayoutManager.class.isInstance(layoutManager)) {
            layoutManager = null;
        }
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)layoutManager;
        if (this.a.E0.c()) {
            if (linearLayoutManager != null) {
                final int r1 = linearLayoutManager.r1();
                final zxs c = this.c;
                final i4e f = this.a.E0.f();
                final zrs b = this.b;
                Objects.requireNonNull(c);
                int n = w4j.f((Object)((nws)b).d());
                ips ips;
                Serializable s;
                q7t b2;
                for (i = 0; i <= r1; ++i) {
                    ips = f.m(i);
                    if (ips == null) {
                        s = 0;
                    }
                    else {
                        b2 = ips.k.b;
                        if (b2 == null) {
                            s = null;
                        }
                        else {
                            s = b2.a();
                        }
                    }
                    n = w4j.g((Object)n, (Object)s);
                    c.a.delete(n);
                }
                c.a.put(n, r1);
            }
        }
    }
}
