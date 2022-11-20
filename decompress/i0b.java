import java.util.Objects;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.media.ui.image.b;
import android.view.View;
import com.twitter.media.ui.image.b$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0b implements b$b, nf$a
{
    public final Object D0;
    public final Object E0;
    public final Object F0;
    
    public i0b(final Object d0, final Object e0, final Object f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void c(final View view, final Object o) {
        final yda yda = (yda)this.D0;
        final qmt qmt = (qmt)this.E0;
        final trt trt = (trt)this.F0;
        final trt trt2 = (trt)o;
        czd.f((Object)yda, "this$0");
        czd.f((Object)trt, "$this_createTopicFollowAction");
        czd.f((Object)view, "<anonymous parameter 0>");
        czd.f((Object)trt2, "<anonymous parameter 1>");
        final ett c = yda.c;
        final String a = qmt.a;
        czd.e((Object)a, "topicInfo.id");
        neg.p(c, a, trt.c ^ true, (cxs)null, 4, (Object)null).r((oj)wda.D0, (lj6)new ub6((qsb)xda.D0, 10));
    }
    
    public final void m(final b b, final b8d b8d) {
        final rjp rjp = (rjp)this.D0;
        final rjp$a rjp$a = (rjp$a)this.E0;
        final fk1 fk1 = (fk1)this.F0;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)b;
        czd.f((Object)rjp, "this$0");
        czd.f((Object)rjp$a, "$viewHolder");
        czd.f((Object)fk1, "$entry");
        czd.f((Object)frescoMediaImageView, "<anonymous parameter 0>");
        czd.f((Object)b8d, "<anonymous parameter 1>");
        final f99 e = rjp.E;
        final g99 s0 = rjp$a.S0;
        final String h = fk1.h();
        Objects.requireNonNull(e);
        czd.f((Object)s0, "viewHolder");
        final c99 g = e.g;
        Objects.requireNonNull(g);
        if (h != null) {
            final r89 r89 = (r89)g.a.remove(h);
            if (r89 != null) {
                r89.c((r89)null);
            }
        }
        s0.D0.setVisibility(8);
    }
}
