import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fv9 implements pml
{
    public final kcm F0;
    
    public fv9(final kcm f0) {
        this.F0 = f0;
    }
    
    public final Object get() {
        final kcm f0 = this.F0;
        e0e.f((Object)f0, "$releaseCompletable");
        if (lv9.Companion.a().e()) {
            final de6 de6 = new de6();
            final db9 u0 = db9.u0(UserIdentifier.Companion.c());
            Objects.requireNonNull(u0);
            de6.a(bbq.g((ddq)new gf8((Object)u0, 26)).I(jxo.c()).y(iqs.j()).D());
            f0.i((sj)new pbk(de6, 2));
        }
        return vzv.a;
    }
}
