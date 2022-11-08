import java.util.Objects;
import com.google.android.material.tabs.TabLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grt extends jo9
{
    public final nj8 D0;
    public final gst E0;
    
    public grt(final nj8 d0, final gst e0) {
        zzd.f((Object)d0, "adapter");
        zzd.f((Object)e0, "topicsPctTracker");
        super(d0);
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void J0(final TabLayout.g g) {
        zzd.f((Object)g, "tab");
        final esj esj = ((fsj)this.D0).M0.get(g.e);
        String g2 = null;
        Label_0055: {
            if (esj != null) {
                final zl1 m = esj.m;
                if (m != null) {
                    g2 = m.g("page_title");
                    break Label_0055;
                }
            }
            g2 = null;
        }
        if (g2 != null) {
            final gst e0 = this.E0;
            final StringBuilder sb = new StringBuilder();
            sb.append("topic-management-page-tab-load-");
            sb.append(g2);
            final String string = sb.toString();
            Objects.requireNonNull(e0);
            zzd.f((Object)string, "pctName");
            e0.a(string);
            final u0k c = biw.c(e0.a, una.b(string), (fvt$b)null, 0, 62);
            e0.b.put(string, c);
            if (c != null) {
                c.start();
            }
        }
    }
}
