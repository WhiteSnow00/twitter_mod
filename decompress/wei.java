import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wei implements CompoundButton$OnCheckedChangeListener
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    
    public wei(final Object g0, final Object h0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean c) {
        switch (this.F0) {
            default: {
                brg.e(this.G0);
                throw null;
            }
            case 0: {
                final zei zei = (zei)this.G0;
                final k6g k6g = (k6g)this.H0;
                e0e.f((Object)zei, "this$0");
                e0e.f((Object)k6g, "$locationDialogController");
                final qv$a qv$a = new qv$a(zei.F0);
                if (c && (!zei.K0.d() || !zei.K0.g())) {
                    zei.J0.i("search_filter_near_me", "geo_request");
                    k6g.b(1);
                }
                else {
                    qv$a.c = c;
                    if (c) {
                        zei.J0.i("search_filter_near_me", "selected");
                    }
                    else {
                        zei.J0.i("search_filter_near_me", "unselected");
                    }
                    zei.F0 = new qv(qv$a);
                }
            }
        }
    }
}
