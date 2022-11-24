import android.os.Bundle;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.preference.e;
import android.view.View;
import androidx.recyclerview.widget.e0$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwk extends e0
{
    public final RecyclerView f;
    public final e0$a g;
    public final gwk$a h;
    
    public gwk(final RecyclerView f) {
        super(f);
        this.g = super.e;
        this.h = new wf(this) {
            public final gwk d;
            
            @Override
            public final void d(final View view, final ng ng) {
                this.d.g.d(view, ng);
                final int o = this.d.f.O(view);
                final RecyclerView$e adapter = this.d.f.getAdapter();
                if (!(adapter instanceof e)) {
                    return;
                }
                final Preference e = ((e)adapter).E(o);
                if (e == null) {
                    return;
                }
                e.G(ng);
            }
            
            @Override
            public final boolean g(final View view, final int n, final Bundle bundle) {
                return this.d.g.g(view, n, bundle);
            }
        };
        this.f = f;
    }
    
    public final wf j() {
        return this.h;
    }
}
