import com.google.android.material.tabs.TabLayout;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nia extends jo9
{
    public final nj8 D0;
    public final s0k E0;
    public final HashSet<String> F0;
    
    public nia(final nj8 d0, final s0k e0) {
        zzd.f((Object)d0, "adapter");
        zzd.f((Object)e0, "pctTracker");
        super(d0);
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = new HashSet<String>();
    }
    
    public final void J0(final TabLayout.g g) {
        zzd.f((Object)g, "tab");
        final esj esj = ((fsj)this.D0).M0.get(g.e);
        String g2 = null;
        Label_0055: {
            if (esj != null) {
                final zl1 m = esj.m;
                if (m != null) {
                    g2 = m.g("key_page_title");
                    break Label_0055;
                }
            }
            g2 = null;
        }
        if (g2 != null) {
            int n;
            if (this.F0.isEmpty()) {
                n = 1;
            }
            else if (this.F0.contains(g2)) {
                n = 3;
            }
            else {
                n = 2;
            }
            final int d = nb0.D(n);
            if (d != 0) {
                if (d == 1) {
                    final s0k e0 = this.E0;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("explore-trend-tab-changed-");
                    sb.append(g2);
                    e0.c(sb.toString());
                }
            }
            this.F0.add(g2);
        }
    }
}
