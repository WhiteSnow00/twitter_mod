import java.util.List;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.topicselector.b;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.twitter.onboarding.ocf.topicselector.a;
import androidx.recyclerview.widget.RecyclerView$r;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypc extends RecyclerView$r
{
    public final zpc a;
    public final a b;
    
    public ypc(final a b, final zpc a) {
        this.b = b;
        this.a = a;
    }
    
    public final void b(final RecyclerView recyclerView, int n, final int n2) {
        final OcfEventReporter h0 = this.b.H0;
        final af4 af4 = new af4(new String[] { "onboarding", "topics_selector", null, "category", "scroll" });
        final b d0 = this.b.D0;
        n = this.a.a - 1;
        Objects.requireNonNull(d0);
        String s;
        if (n >= 0 && n < ((List)d0.d).size()) {
            s = ((List<String>)d0.d).get(n);
        }
        else {
            s = null;
        }
        h0.b(af4, com.twitter.onboarding.ocf.topicselector.b.c(s, this.a.a, (String)null));
    }
}
