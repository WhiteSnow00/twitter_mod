import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import android.os.Bundle;
import android.content.Context;
import android.net.Uri;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.app.dm.widget.DMConversationMessageComposer$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bk7 implements DMConversationMessageComposer$b
{
    public final /* synthetic */ rx0 C0;
    public final /* synthetic */ DMConversationContentViewProvider D0;
    
    public bk7(final DMConversationContentViewProvider d0, final rx0 c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    public final void b() {
        final DMConversationContentViewProvider d0 = this.D0;
        final cda a3 = DMConversationContentViewProvider.A3;
        d0.A1();
    }
    
    public final void c(final Uri uri) {
        this.D0.z2.D0.f(uri, this.C0, (String)null);
    }
    
    public final void g() {
        final DMConversationContentViewProvider d0 = this.D0;
        final cda a3 = DMConversationContentViewProvider.A3;
        final zf4 zf4 = new zf4(d0.F0);
        zf4.q(new String[] { "messages:thread:dm_compose_bar:found_media:click" });
        saw.b((okm)zf4);
        final DMConversationContentViewProvider d2 = this.D0;
        d2.z2.C0.f = true;
        final UserIdentifier f0 = d2.F0;
        final hc6 f2 = hc6.F0;
        amy.I(f0, "dm_composition", "category", "navigate");
        final DMConversationContentViewProvider d3 = this.D0;
        ((Fragment)d3.D0).W1(amy.p((Context)d3.C0, f2, d3.F0), 1, (Bundle)null);
    }
    
    public final void h(final String s) {
        final DMConversationContentViewProvider d0 = this.D0;
        final cda a3 = DMConversationContentViewProvider.A3;
        d0.C1(s, null, null);
    }
    
    public final void k() {
        this.D0.z2.C0.e();
    }
    
    public final void l() {
        if (poa.p0() && this.D0.D0()) {
            final DMConversationContentViewProvider d0 = this.D0;
            final y6k x2 = d0.x2;
            final gob c0 = d0.C0;
            final String[] e3 = DMConversationContentViewProvider.E3;
            if (!x2.a((Context)c0, e3)) {
                this.D0.j3.d(this.D0.B1(2131956925, "voice", e3));
            }
            else {
                this.D0.x1();
            }
        }
    }
    
    public final void m(final wqg wqg) {
        this.D0.z2.C0.a(wqg);
    }
}
