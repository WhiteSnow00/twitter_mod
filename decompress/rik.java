import java.util.List;
import java.util.Collection;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rik implements a94
{
    public final View D0;
    public w4 E0;
    public Collection<f2> F0;
    
    public rik(View viewById) {
        viewById = viewById.findViewById(2131430595);
        jee.l((Object)viewById);
        final View view = viewById;
        this.D0 = viewById;
    }
    
    public final void g(final w4 e0) {
        this.E0 = e0;
        final List w = rif.w((Object)new fok((fok$a)new fok$a(this, e0) {
            public final w4 D0;
            public final rik E0;
            
            public final void c() {
            }
            
            public final void e(final g3 g3, final t5 t5) {
                ec0.g(this.E0.D0, 100);
            }
            
            public final void g(final g3 g3) {
            }
            
            public final void i() {
            }
            
            public final void v(final g3 g3) {
                if (!this.D0.d()) {
                    ec0.d(this.E0.D0, 100);
                }
            }
            
            public final void w() {
            }
        }), (Object[])new f2[] { (f2)new nnk((nnk$a)new nnk$a(this) {
                public final rik a;
                
                public final void a() {
                }
                
                public final void b(final vsv vsv) {
                    ec0.d(this.a.D0, 100);
                }
            }) });
        this.F0 = w;
        e0.e.l((Collection)w);
    }
    
    public final void h() {
        this.D0.setVisibility(8);
        this.D0.setAlpha(1.0f);
    }
    
    public final void unbind() {
        final w4 e0 = this.E0;
        if (e0 != null) {
            final List f0 = this.F0;
            if (f0 != null) {
                e0.e.Y((Collection)f0);
            }
        }
    }
}
