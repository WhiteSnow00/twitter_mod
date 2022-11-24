import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class upm extends pue implements stb<akd, fbj<? extends List<? extends iq7$c>>>
{
    public final vpm F0;
    public final dom G0;
    
    public upm(final vpm f0, final dom g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final akd akd = (akd)o;
        e0e.f((Object)akd, "settings");
        final vpm f0 = this.F0;
        final dom g0 = this.G0;
        Objects.requireNonNull(f0);
        e0e.f((Object)g0, "<this>");
        final int ordinal = g0.ordinal();
        boolean b = true;
        jid jid;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            jid = jid.I0;
        }
        else {
            final boolean a = akd.a;
            final boolean b2 = akd.b;
            if (!a || !b2) {
                b = false;
            }
            if (b) {
                jid = jid.H0;
            }
            else {
                jid = jid.G0;
            }
        }
        o = new gjd(jid, lmi.v(), lmi.w(), pdw.d().A().z);
        final t5j map = f0.G0.d((gjd)o).map((rtb)new vma((stb)tpm.F0, 6));
        e0e.e((Object)map, "inboxListItemDataSource.\u2026  .toList()\n            }");
        return map;
    }
}
