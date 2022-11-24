import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nsy implements quy
{
    public final tuy F0;
    public final String G0;
    public final int H0;
    public final long I0;
    
    public nsy(final tuy f0, final String g0, final int h0, final long i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final Object a() {
        final tuy f0 = this.F0;
        final String g0 = this.G0;
        final int h0 = this.H0;
        final long i0 = this.I0;
        Objects.requireNonNull(f0);
        final guy guy = ((Map)f0.c((quy)new clr(f0, (List)Arrays.asList(g0)))).get(g0);
        if (guy == null || vq9.x(guy.c.d)) {
            tuy.g.j(String.format("Could not find pack %s while trying to complete it", g0), new Object[0]);
        }
        f0.a.c(g0, h0, i0);
        guy.c.d = 4;
        return null;
    }
}
