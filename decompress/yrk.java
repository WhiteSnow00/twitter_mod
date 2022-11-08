import android.view.View$OnClickListener;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import android.widget.Button;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yrk implements y94
{
    public final k9q<Button> C0;
    public u4 D0;
    public Collection<e2> E0;
    
    public yrk(final ViewGroup viewGroup) {
        final k9q c0 = new k9q((View)viewGroup, 2131430951, 2131430951);
        this.C0 = (k9q<Button>)c0;
        if (!bp7.E()) {
            ((wax)c0).h();
        }
    }
    
    public final void g(final u4 d0) {
        this.D0 = d0;
        if (y6.h(d0.b.b1)) {
            final List w = ijf.w((Object)new vnk((vnk$a)new wrk(this)), (Object[])new e2[] { (e2)new xx0(d0, (xx0$a)new xrk(this, d0)) });
            this.E0 = w;
            d0.e.k((Collection)w);
            ((n9q)((wax)this.C0).d).G((fk6)new jpa((Object)d0, 1), (fk6)jvb.e);
        }
    }
    
    public final void h() {
        final View view = (View)((wax)this.C0).f;
        if (view != null) {
            view.setOnClickListener((View$OnClickListener)null);
            view.setVisibility(8);
        }
    }
    
    public final void unbind() {
        final u4 d0 = this.D0;
        if (d0 != null) {
            final List e0 = this.E0;
            if (e0 != null) {
                d0.e.Z((Collection)e0);
            }
        }
    }
}
