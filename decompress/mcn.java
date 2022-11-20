import android.view.View;
import java.util.Objects;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcn extends ste implements qsb<rcn, fzv>
{
    public final hcn D0;
    
    public mcn(final hcn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final rcn rcn = (rcn)o;
        czd.f((Object)rcn, "$this$distinct");
        if (djo.q()) {
            final h9i e = rcn.e;
            if (e instanceof h9i$a) {
                final hcn d0 = this.D0;
                d0.X0.c(e, true);
                d0.X0.setOnStickyButtonClickListener((View$OnClickListener)new wop((Object)d0, 2));
            }
            else {
                Objects.requireNonNull(this.D0);
                if (asa.b().b("super_follow_space_creation_enabled", false)) {
                    hcn.a(this.D0, rcn.e);
                }
            }
        }
        else {
            Objects.requireNonNull(this.D0);
            if (asa.b().b("super_follow_space_creation_enabled", false)) {
                hcn.a(this.D0, rcn.e);
            }
            else {
                ((View)this.D0.X0).setVisibility(8);
            }
        }
        return fzv.a;
    }
}
