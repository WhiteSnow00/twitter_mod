import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oom extends gue implements rtb<yjd, naj<? extends List<? extends yp7$c>>>
{
    public final /* synthetic */ pom C0;
    public final /* synthetic */ ymm D0;
    
    public oom(final pom c0, final ymm d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final yjd yjd = (yjd)o;
        zzd.f((Object)yjd, "settings");
        final pom c0 = this.C0;
        final ymm d0 = this.D0;
        Objects.requireNonNull(c0);
        zzd.f((Object)d0, "<this>");
        final int ordinal = ((Enum)d0).ordinal();
        boolean b = true;
        gid gid;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            gid = gid.F0;
        }
        else {
            final boolean a = yjd.a;
            final boolean b2 = yjd.b;
            if (!a || !b2) {
                b = false;
            }
            if (b) {
                gid = gid.E0;
            }
            else {
                gid = gid.D0;
            }
        }
        o = new djd(gid, poa.f0(), poa.g0(), ncw.d().A().z);
        final b5j map = c0.D0.d((djd)o).map((qtb)new tj4((rtb)nom.C0, 8));
        zzd.e((Object)map, "inboxListItemDataSource.\u2026  .toList()\n            }");
        return map;
    }
}
