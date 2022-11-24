import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h2s extends t5j<vzv>
{
    public final SwipeRefreshLayout F0;
    
    public h2s(final SwipeRefreshLayout f0) {
        e0e.g((Object)f0, "view");
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super vzv> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a onRefreshListener = new a(this.F0, ocj);
        ocj.onSubscribe((b39)onRefreshListener);
        this.F0.setOnRefreshListener((SwipeRefreshLayout$h)onRefreshListener);
    }
    
    public static final class a extends wig implements SwipeRefreshLayout$h
    {
        public final SwipeRefreshLayout G0;
        public final ocj<? super vzv> H0;
        
        public a(final SwipeRefreshLayout g0, final ocj<? super vzv> h0) {
            e0e.g((Object)g0, "view");
            e0e.g((Object)h0, "observer");
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void a() {
            if (!this.isDisposed()) {
                this.H0.onNext((Object)vzv.a);
            }
        }
        
        public final void c() {
            this.G0.setOnRefreshListener((SwipeRefreshLayout$h)null);
        }
    }
}
