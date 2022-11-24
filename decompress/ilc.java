import java.util.Objects;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import androidx.fragment.app.p;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ilc extends sjt implements hlc
{
    public static final String[] h;
    public final cxw f;
    public final phh g;
    
    static {
        h = new String[] { "record_video_tooltip", "mute_tooltip" };
    }
    
    public ilc(final Activity activity, final qdw qdw, final p p5, final jc3 jc3, final phh g) {
        super((Context)activity, qdw, p5);
        this.f = jc3.a;
        this.g = g;
    }
    
    public final void a() {
        if (this.n("mute_tooltip")) {
            this.l("mute_tooltip");
        }
    }
    
    public final void b() {
        if (this.n("record_video_tooltip") && this.g == phh.L0) {
            this.l("record_video_tooltip");
        }
    }
    
    public final Map<String, usa> e(final UserIdentifier userIdentifier) {
        final kkg t = kkg.t();
        t.w((Object)"record_video_tooltip", (Object)usa.d("record_video_tooltip", userIdentifier));
        t.w((Object)"mute_tooltip", (Object)usa.d("mute_tooltip", userIdentifier));
        return (Map)((z4j)t).e();
    }
    
    public final njt$b h(final String s) {
        Objects.requireNonNull(s);
        if (s.equals("mute_tooltip")) {
            final Context a = super.a;
            final int n1 = njt.N1;
            final njt$b njt$b = new njt$b(a, 2131430168);
            njt$b.b(2131955256);
            njt$b.c = 2132018862;
            njt$b.h = 2131428057;
            njt$b.d = (njt$c)this;
            njt$b.a(1);
            return njt$b;
        }
        if (s.equals("record_video_tooltip")) {
            final Context a2 = super.a;
            final int n2 = njt.N1;
            final njt$b njt$b2 = new njt$b(a2, 2131428070);
            njt$b2.b(2131956927);
            njt$b2.c = 2132018862;
            njt$b2.h = 2131428054;
            njt$b2.d = (njt$c)this;
            njt$b2.a(0);
            return njt$b2;
        }
        final IllegalStateException ex = new IllegalStateException("Couldn't create tooltip from Tooltip Name");
        r9a.d((Throwable)ex);
        throw ex;
    }
    
    public final String[] i() {
        return ilc.h;
    }
    
    public final boolean n(final String s) {
        return (!"record_video_tooltip".equals(s) || !(this.f instanceof cxw$b)) && this.k(s);
    }
}
