import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlf extends hpv
{
    public final String E1;
    public final String F1;
    public List<cgv> G1;
    public oqv H1;
    
    public jlf(final Context context, final UserIdentifier userIdentifier, final String e1, final String f1, final a83 a83, final int n) {
        super(context, userIdentifier, userIdentifier, 51, n, (yov)a83, null, pqv.c, vav.c2(userIdentifier));
        this.E1 = e1;
        this.F1 = f1;
    }
    
    public final g7c r0() {
        final g7c$a g7c$a = new g7c$a();
        g7c$a.b = new f7c(new String[] { "list", "timeline_response", "timeline" });
        if (this.F1.equalsIgnoreCase("list_creation")) {
            g7c$a.a = "list_create_recommended_users_timeline";
        }
        else {
            g7c$a.a = "list_edit_recommended_users_timeline";
        }
        ((qjg)g7c$a.c).w((Object)"rest_id", (Object)this.E1);
        g7c$a.o("includeTweetVisibilityNudge", (Object)xa8.p());
        return (g7c)((n4j)g7c$a).e();
    }
    
    @Override
    public final void x0(final yrm yrm) {
        super.x0(yrm);
        this.G1 = new ArrayList();
        final Iterator iterator = yrm.c((Class)ir$a.class).iterator();
        while (iterator.hasNext()) {
            for (final zus zus : ((ir$a)iterator.next()).c) {
                if (zus instanceof wov) {
                    this.H1 = ((wov)zus).q;
                }
                else {
                    this.G1.addAll(cec.a(zus));
                }
            }
        }
    }
    
    @Override
    public final boolean y0() {
        return true;
    }
    
    @Override
    public final boolean z0() {
        return true;
    }
}
