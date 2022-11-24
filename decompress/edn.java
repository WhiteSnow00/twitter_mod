import android.view.View;
import java.util.Objects;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edn extends pue implements stb<jdn, vzv>
{
    public final zcn F0;
    
    public edn(final zcn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jdn jdn = (jdn)o;
        e0e.f((Object)jdn, "$this$distinct");
        if (vjo.q()) {
            final aai e = jdn.e;
            if (e instanceof aai.a) {
                final zcn f0 = this.F0;
                f0.Z0.c(e, true);
                f0.Z0.setOnStickyButtonClickListener((View$OnClickListener)new w5a(f0, 3));
            }
            else {
                Objects.requireNonNull(this.F0);
                if (ita.b().b("super_follow_space_creation_enabled", false)) {
                    zcn.a(this.F0, jdn.e);
                }
            }
        }
        else {
            Objects.requireNonNull(this.F0);
            if (ita.b().b("super_follow_space_creation_enabled", false)) {
                zcn.a(this.F0, jdn.e);
            }
            else {
                ((View)this.F0.Z0).setVisibility(8);
            }
        }
        return vzv.a;
    }
}
