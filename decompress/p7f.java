import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import java.util.Map;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7f implements krw
{
    public static final a Companion;
    public final Activity a;
    public final h5s b;
    
    static {
        Companion = new a();
    }
    
    public p7f(final p p2, final Activity a) {
        e0e.f((Object)a, "activityContext");
        this.a = a;
        this.b = (h5s)jty.N((ptb)new p7f$b(p2));
    }
    
    public final void a(final vsw vsw, final UserIdentifier userIdentifier) {
        e0e.f((Object)vsw, "verificationType");
        e0e.f((Object)userIdentifier, "userIdentifier");
        final ww8 ww8 = (ww8)this.b.getValue();
        final int a = ie9.a((Context)this.a, 2130969795, 2131232532);
        final int b = b1b.B((Context)this.a, 2130969040);
        final acc$a acc$a = new acc$a();
        final m07$a m07$a = new m07$a(a);
        m07$a.b = b;
        m07$a.c = 2;
        acc$a.n = (m07)((z4j)m07$a).e();
        acc$a.o = 2;
        acc$a.h = new fym(((Context)this.a).getString(2131959513), (Map)m3a.F0, 0);
        final Activity a2 = this.a;
        int n;
        if (e0e.a((Object)vsw, (Object)vsw$b.a)) {
            n = 2131959511;
        }
        else {
            if (!e0e.a((Object)vsw, (Object)vsw$a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            n = 2131959510;
        }
        final String string = ((Context)a2).getString(n);
        e0e.e((Object)string, "activityContext.getStrin\u2026c\n            }\n        )");
        final String string2 = ((Context)this.a).getString(2131959512);
        e0e.e((Object)string2, "activityContext.getStrin\u2026ducation_learn_more_link)");
        final fym b2 = ezm.b(new String[] { string2 }, string);
        final fym.b<Object> b3 = new fym.b<Object>();
        b3.a = b2.F0;
        final int a3 = o5j.a;
        b3.b = b2.G0;
        b3.c = 0;
        acc$a.j = (fym)((z4j)b3).e();
        acc$a.i = ((Context)this.a).getString(2131954239);
        acc$a.p = new cpv("", (cpv$a)new cpv.b(fym.J0), (List)h3a.F0, (b1p)null, 6, dqv.G0);
        acc$a.l = true;
        final acc$b r = acc.r;
        final Bundle t = m58.t("twitter:id", 1024);
        swj.k(t, "serializer_fragment_arg", ((z4j)acc$a).e(), (nmp)r);
        if (((BaseBundle)t).containsKey("twitter:id")) {
            final wbc wbc = new wbc();
            ((Fragment)wbc).N1(t);
            ww8.a((bl1)wbc);
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
    
    public static final class a
    {
    }
}
