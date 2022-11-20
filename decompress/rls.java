import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rls extends nk8 implements kls
{
    public final jls E0;
    
    public rls(final LayoutInflater layoutInflater, final jls e0) {
        final View inflate = layoutInflater.inflate(2131625795, (ViewGroup)null);
        super(inflate);
        (this.E0 = e0).b(inflate);
    }
    
    public final void V() {
        final RecyclerView b = this.E0.b;
        if (b != null) {
            jls.a(b);
        }
    }
    
    public final void W(final int n) {
        this.E0.d(n);
    }
    
    public final void d0(final int n) {
        this.E0.c(n);
    }
    
    public final void e0(final ils<? extends ga> adapter) {
        final RecyclerView a = this.E0.a;
        if (a != null) {
            a.setAdapter((RecyclerView$e)adapter);
        }
    }
    
    public final void k0() {
        final RecyclerView a = this.E0.a;
        if (a != null) {
            jls.a(a);
        }
    }
    
    public final void y(final ils<? extends ga> adapter) {
        final RecyclerView b = this.E0.b;
        if (b != null) {
            b.setAdapter((RecyclerView$e)adapter);
        }
    }
}
