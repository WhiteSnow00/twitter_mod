import androidx.fragment.app.Fragment;
import java.util.EnumSet;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class s9l extends qas implements mx0, nn
{
    public static final int p2 = 0;
    public yqg o2;
    
    public final boolean L3(final vqg vqg) {
        return true;
    }
    
    public final void d0(final Intent intent, final int n) {
        ((Fragment)this).W1(intent, n, null);
    }
    
    public final void h1(final int n, final int n2, final Intent intent) {
        super.h1(n, n2, intent);
        this.o2.i(n, n2, intent, (mx0)this);
    }
    
    public final void n2(final Dialog dialog, final Bundle bundle) {
        super.n2(dialog, bundle);
        final cnb l0 = ((Fragment)this).L0();
        jee.l((Object)l0);
        final EnumSet n0 = m1h.N0;
        final UserIdentifier current = UserIdentifier.getCurrent();
        final vmd vmd = (vmd)l0;
        this.o2 = new yqg((Context)l0, (nn)this, "profile", n0, current, vmd.i(), ((abx)((co1)vmd.n()).B((Class)abx.class)).j(), 2);
    }
    
    public final void p1(final yx0 yx0) {
        final vqg d = yx0.d();
        if (d == null) {
            return;
        }
        final cnb l0 = ((Fragment)this).L0();
        final int a = d.a;
        if (a != 0 && a != 1) {
            if (l0 != null) {
                m1f.e().c(2131955901, 0);
            }
        }
        else {
            final jw9 a2 = d.a(3);
            if (a2 != null) {
                if (l0 != null) {
                    final y1k$a y1k$a = new y1k$a();
                    y1k$a.a = a2.D0;
                    cgl.a((Context)l0, zcw.d(), (y1k)((n4j)y1k$a).e());
                }
                ((nv8)this).Z1(false, false);
            }
        }
    }
    
    public final void u2() {
        super.n2 = true;
        this.y2(new String[] { "profile::empty_state::dismiss" });
    }
    
    public final void v2() {
        this.y2(new String[] { "profile::empty_state:camera:click" });
        final yqg o2 = this.o2;
        if (o2 != null) {
            o2.j((nww)nww$b.b, true);
        }
    }
    
    public final void w2() {
        this.y2(new String[] { "profile::empty_state:photo:click" });
        final yqg o2 = this.o2;
        if (o2 != null) {
            o2.k();
        }
    }
    
    public final void x2() {
        super.n2 = false;
        pbu.d(UserIdentifier.getCurrent()).i().f("profile_overlay", true).e();
        this.y2(new String[] { "profile::empty_state::impression" });
    }
}
