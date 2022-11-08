import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xkf
{
    public final Context a;
    public final fw8 b;
    public final rs3 c;
    public final psa d;
    public final rd6 e;
    public b f;
    
    public xkf(final Context a, final p p5, final rs3 c, final UserIdentifier userIdentifier, final ibm ibm) {
        final fw8 b = new fw8(p5, "cover tag");
        final rd6 e = new rd6();
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = psa.d("pinned_list_level_up", userIdentifier);
        ibm.i((rj)new wkf(e, 0));
    }
    
    public final void a(final xbv xbv) {
        if (dta.b().b("home_timeline_spheres_level_up_prompt_enabled", false) && this.d.c()) {
            this.d.b();
            final fw8 b = this.b;
            b.E0 = (ew8)new xkf$a(this, xbv);
            final ybc$a ybc$a = new ybc$a();
            ybc$a.n = (b07)((h4j)new b07$a(2131232517)).e();
            ybc$a.o = 2;
            ybc$a.h = new xwm(this.a.getString(2131954688), (Map)null);
            ybc$a.j = new xwm(this.a.getString(2131954687), (Map)null);
            ybc$a.i = this.a.getString(2131954683);
            ybc$a.k = this.a.getString(2131954685);
            ybc$a.l = true;
            final ybc$b r = ybc.r;
            final Bundle w = zi.w("twitter:id", 1);
            yvj.k(w, "serializer_fragment_arg", (Object)((h4j)ybc$a).e(), (alp)r);
            final int a = w4j.a;
            if (!((BaseBundle)w).containsKey("twitter:id")) {
                throw new Fragment.InstantiationException("Missing fragment id", null);
            }
            final ubc ubc = new ubc();
            ((Fragment)ubc).N1(w);
            b.a((cl1)ubc);
        }
    }
    
    public interface b
    {
        void a();
        
        void b();
    }
}
