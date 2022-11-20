import android.view.View$OnClickListener;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xgd implements a94
{
    public final rbx<xgd.xgd$b> D0;
    public final w19 E0;
    public final Resources F0;
    public final ka8 G0;
    public g3 H0;
    public y3 I0;
    public w4 J0;
    public Collection<f2> K0;
    
    public xgd(final ViewGroup viewGroup) {
        this.E0 = new w19();
        this.D0 = (rbx<xgd.xgd$b>)new rbx((View)viewGroup, 2131427578, 2131427578, (ypa)si4.c);
        this.F0 = ((View)viewGroup).getResources();
        this.G0 = ka8.a();
    }
    
    public final void g(final w4 j0) {
        this.J0 = j0;
        final List w = rif.w((Object)new f3x((f3x$a)new qqd(this, 8)), (Object[])new f2[] { (f2)new swk((swk$a)new b5w((Object)this)), (f2)new fok((fok$a)new fok$a(this) {
                public final xgd D0;
                
                public final void c() {
                }
                
                public final void e(final g3 g3, final t5 t5) {
                    final xgd d0 = this.D0;
                    if (g63.I(d0.H0)) {
                        d0.D0.h();
                    }
                }
                
                public final void g(final g3 g3) {
                }
                
                public final void i() {
                }
                
                public final void v(final g3 g3) {
                }
                
                public final void w() {
                }
            }), (f2)new xxg((xxg$a)new eu4((Object)this, 9)) });
        this.K0 = w;
        j0.e.l((Collection)w);
    }
    
    public final void h() {
        final xgd.xgd$b xgd$b = (xgd.xgd$b)this.D0.f;
        if (xgd$b != null) {
            xgd$b.a.setVisibility(8);
            xgd$b.a.setOnClickListener((View$OnClickListener)null);
            xgd$b.c.setText((CharSequence)"");
            xgd$b.b.L((String)null);
        }
    }
    
    public final void unbind() {
        final w4 j0 = this.J0;
        if (j0 != null) {
            final List k0 = this.K0;
            if (k0 != null) {
                j0.e.Y((Collection)k0);
            }
        }
        this.E0.a();
    }
}
