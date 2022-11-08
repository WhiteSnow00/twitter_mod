// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import com.twitter.app.dm.widget.b;
import java.util.HashSet;
import android.view.View;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import com.twitter.media.legacy.widget.AttachmentMediaView$c;
import com.twitter.app.dm.widget.DMConversationMessageComposer$b;
import java.util.Objects;
import com.twitter.app.dm.widget.DMConversationMessageComposer;
import java.util.concurrent.Callable;
import java.util.Collection;
import java.util.Set;
import android.net.Uri;

public final class d
{
    public final b a;
    public final a b;
    public final rx0 c;
    public Uri d;
    public Uri e;
    public boolean f;
    public wqg g;
    public final String h;
    public final Set<Uri> i;
    
    public d(final b a, final a b, final rx0 c, final wqg g, final Uri d, final Collection<Uri> collection, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = (iuh$a)iuh.b((Collection)collection);
        this.h = h;
        this.g = g;
        this.d = d;
    }
    
    public final void a(final wqg wqg) {
        final a b = this.b;
        final rx0 c = this.c;
        final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)b;
        dmConversationContentViewProvider$a.c.n0(xw0.e((Callable)new f5d((Object)wqg, 1)).y(h6q.L()).p((qtb)new fo9(dmConversationContentViewProvider$a, dmConversationContentViewProvider$a.b, 1)).G((fk6)new tag((Object)dmConversationContentViewProvider$a, 13), (fk6)uvf.F0));
        dmConversationContentViewProvider$a.c.z2.D0.b(wqg, c);
    }
    
    public final void b() {
        if (this.d()) {
            final Uri d = this.d;
            final a b = this.b;
            final rx0 c = this.c;
            final String h = this.h;
            final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)b;
            dmConversationContentViewProvider$a.c.n0(((n9q)new taq((ubq)xw0.e((Callable)new wj7((Object)dmConversationContentViewProvider$a, (Object)d, h, 0)).y(h6q.L()), (qtb)new vj7((Object)dmConversationContentViewProvider$a, (Object)dmConversationContentViewProvider$a.b, 0))).G((fk6)new shd((Object)dmConversationContentViewProvider$a, 12), (fk6)thd.J0));
            dmConversationContentViewProvider$a.c.z2.D0.f(d, c, h);
        }
    }
    
    public final void c() {
        final wqg g = this.g;
        final boolean b = false;
        if (g != null && g.b.H0.c() && !((com.twitter.media.ui.image.d)((DMConversationMessageComposer)this.a).V0).f1) {
            final wqg g2 = this.g;
            Uri e0;
            if (g2 != null) {
                e0 = g2.b.E0;
            }
            else {
                e0 = null;
            }
            if (e0 != null) {
                int n = b ? 1 : 0;
                if (g2 != null) {
                    n = (b ? 1 : 0);
                    if (g2.a == 1) {
                        n = 1;
                    }
                }
                if (n != 0) {
                    ((HashSet<Uri>)this.i).add(e0);
                }
                ((DMConversationContentViewProvider$a)this.b).c.z2.D0.h(e0);
                this.f(e0);
            }
        }
    }
    
    public final boolean d() {
        return this.d != null;
    }
    
    public final void e() {
        final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)this.b;
        final DMConversationContentViewProvider c = dmConversationContentViewProvider$a.c;
        final cda a3 = DMConversationContentViewProvider.A3;
        c.d1();
        dmConversationContentViewProvider$a.c.z2.D0.b.b();
        this.g = null;
    }
    
    public final void f(final Uri uri) {
        final a b = this.b;
        final rx0 c = this.c;
        final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)b;
        final DMConversationContentViewProvider c2 = dmConversationContentViewProvider$a.c;
        final cda a3 = DMConversationContentViewProvider.A3;
        c2.d1();
        final yqg d0 = dmConversationContentViewProvider$a.c.z2.D0;
        d0.b.a.remove(uri);
        d0.l(c);
    }
    
    public final void g(final wqg wqg) {
        final DMConversationContentViewProvider$a dmConversationContentViewProvider$a = (DMConversationContentViewProvider$a)this.b;
        final DMConversationMessageComposer e0 = dmConversationContentViewProvider$a.c.z2.E0;
        Objects.requireNonNull(e0);
        AttachmentMediaView a;
        if (wqg != null && wqg.b.G0 == l1h.K0) {
            e0.e();
            final boolean m1 = e0.m1;
            final AttachmentMediaView attachmentMediaView = a = null;
            if (m1) {
                ((com.twitter.app.dm.widget.b.a)e0.O0).h(null);
                a = attachmentMediaView;
            }
        }
        else {
            a = e0.T0.a(wqg, hc6.F0);
        }
        if (a != null) {
            a.setOnAttachmentActionListener((AttachmentMediaView$c)new com.twitter.app.dm.a(dmConversationContentViewProvider$a));
        }
        if (wqg != null) {
            ((View)dmConversationContentViewProvider$a.c.z2.E0.U0).setVisibility(0);
        }
    }
    
    public final void h(final wqg wqg) {
        final l1h g0 = wqg.b.G0;
        final l1h k0 = l1h.K0;
        if (g0 != k0) {
            final DMConversationMessageComposer dmConversationMessageComposer = (DMConversationMessageComposer)this.a;
            ((View)dmConversationMessageComposer.T0).setVisibility(0);
            dmConversationMessageComposer.F0.b();
        }
        this.g = wqg;
        final l1h g2 = wqg.b.G0;
        if (g2 == k0) {
            final DMConversationMessageComposer dmConversationMessageComposer2 = (DMConversationMessageComposer)this.a;
            final y4m z0 = dmConversationMessageComposer2.Z0;
            if (z0 != null) {
                if (g2 == k0 && z0.k == null) {
                    z0.k = wqg;
                    final y4m$a j = z0.j;
                    if (j != null) {
                        j.c(wqg);
                    }
                    z0.e(wqg);
                }
                ((zqh)dmConversationMessageComposer2.J0).setProgress(1.0f);
            }
        }
        else if (!((DMConversationMessageComposer)this.a).k()) {
            ((DMConversationMessageComposer)this.a).Q0.setVisibility(8);
            final View r0 = ((DMConversationMessageComposer)this.a).R0;
            if (r0 != null) {
                r0.setVisibility(8);
            }
        }
        this.g(this.g);
    }
    
    public interface a
    {
    }
    
    public interface b
    {
    }
}
