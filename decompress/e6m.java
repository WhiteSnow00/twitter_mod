import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import java.io.Closeable;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e6m<I, V extends View> extends RecyclerView$e<a<V>>
{
    public i4e<I> F0;
    
    public final i4e<I> C() {
        Closeable closeable = this.F0;
        if (closeable == null) {
            closeable = i4e.j();
        }
        return (i4e<I>)closeable;
    }
    
    public abstract void D(final V p0, final I p1, final int p2);
    
    public abstract V E(final ViewGroup p0, final int p1);
    
    public final int c() {
        return this.C().getSize();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        this.D(((a)recyclerView$c0).W0, this.C().m(n), n);
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        return new a<Object>(this.E(viewGroup));
    }
    
    public static final class a<U extends View> extends RecyclerView$c0
    {
        public final U W0;
        
        public a(final U w0) {
            super((View)w0);
            this.W0 = w0;
        }
    }
}
