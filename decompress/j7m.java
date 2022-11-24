import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j7m extends t5j<i7m>
{
    public final RecyclerView F0;
    
    public j7m(final RecyclerView f0) {
        this.F0 = f0;
    }
    
    public final void subscribeActual(final ocj<? super i7m> ocj) {
        e0e.g((Object)ocj, "observer");
        if (!w9y.h(ocj)) {
            return;
        }
        final a a = new a(this.F0, ocj);
        ocj.onSubscribe((b39)a);
        this.F0.j((RecyclerView$r)a.G0);
    }
    
    public static final class a extends wig
    {
        public final j7m$a$a G0;
        public final RecyclerView H0;
        
        public a(final RecyclerView h0, final ocj<? super i7m> ocj) {
            e0e.g((Object)h0, "recyclerView");
            e0e.g((Object)ocj, "observer");
            this.H0 = h0;
            this.G0 = new j7m$a$a(this, (ocj)ocj);
        }
        
        public final void c() {
            this.H0.p0((RecyclerView$r)this.G0);
        }
    }
}
