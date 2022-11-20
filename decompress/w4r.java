import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w4r extends y4r
{
    public final long q1;
    public final String r1;
    
    public w4r(final Context context, final UserIdentifier userIdentifier, final jvg jvg, final long q1, final List<d2h> list, final boolean b) {
        super(context, userIdentifier, jvg, list, b);
        this.q1 = q1;
        this.r1 = jvg.e;
    }
    
    public final void o0(final tqc$a tqc$a) {
        final arc$b g0 = arc$b.G0;
        tqc$a.e = g0;
        final int a = c5j.a;
        if (super.n1) {
            tqc$a.d("command", "FINALIZE");
            tqc$a.c("media_id", this.q1);
            tqc$a.f("allow_async", true);
            y1h.a(tqc$a, this.r1);
        }
        else {
            tqc$a.l("X-SessionPhase", "FINALIZE");
            tqc$a.l("X-MediaId", Long.toString(this.q1));
            tqc$a.e = g0;
            final String r1 = this.r1;
            if (r1 != null) {
                tqc$a.l("Original-MD5", r1);
            }
        }
    }
}
