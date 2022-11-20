import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kin extends ste implements qsb<vqn, fzv>
{
    public final jin D0;
    
    public kin(final jin d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vqn vqn = (vqn)o;
        czd.f((Object)vqn, "state");
        final jin d0 = this.D0;
        Objects.requireNonNull(d0);
        if (!vqn.m()) {
            d0.a();
        }
        else {
            if (d0.d == null) {
                d0.a.a((m8a$a)d0.g);
            }
            final int ordinal = ((Enum)vqn.d).ordinal();
            String d2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d2 = null;
                    }
                    else {
                        d2 = "Failed";
                    }
                }
                else {
                    d2 = "Connecting";
                }
            }
            else {
                d2 = "Connected";
            }
            d0.d = d2;
            String e;
            if (blz.M(vqn)) {
                e = "Replaying";
            }
            else if (vqn.F == p9w.D0) {
                e = "Cohosting";
            }
            else if (vqn.u == wqn.E0) {
                e = "Hosting";
            }
            else if (vqn.w == z0r.F0) {
                e = "Speaking";
            }
            else {
                e = "Listening";
            }
            d0.e = e;
            d0.c = vqn.b;
        }
        return fzv.a;
    }
}
