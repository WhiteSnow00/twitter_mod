// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm;

import com.twitter.alttext.AltTextActivityContentViewArgs;
import android.graphics.Point;
import java.util.Objects;
import android.net.Uri;
import com.twitter.sensitivemedia.SensitiveMediaActivityContentViewArgs;
import com.twitter.app.dm.conversation.DMConversationComposerHostView;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import com.twitter.media.legacy.widget.AttachmentMediaView$c;

public final class a implements AttachmentMediaView$c
{
    public final DMConversationContentViewProvider.DMConversationContentViewProvider$a a;
    
    public a(final DMConversationContentViewProvider.DMConversationContentViewProvider$a a) {
        this.a = a;
    }
    
    public final void a(jw9 a, final AttachmentMediaView attachmentMediaView) {
        final DMConversationComposerHostView a2 = this.a.c.A2;
        final vqg g = a2.D0.g;
        if (g != null && g.a == 0) {
            final yqg e0 = a2.E0;
            a = g.a(2);
            jee.l((Object)a);
            e0.e(a.f(), this.a.a, (nww)nww$d.h);
        }
    }
    
    public final void b(final jw9 jw9, final AttachmentMediaView attachmentMediaView) {
        this.a(jw9, attachmentMediaView);
    }
    
    public final void c(final jw9 jw9) {
        this.a.c.g3.d((Object)new SensitiveMediaActivityContentViewArgs((jw9<?>)jw9));
    }
    
    public final void d(final Uri uri) {
        final DMConversationContentViewProvider c = this.a.c;
        final kca b3 = DMConversationContentViewProvider.B3;
        Objects.requireNonNull(c);
        final af4 af4 = new af4(((ucv)c).G0);
        ((u0p)af4).q(new String[] { "messages:thread:dm_compose_bar:media:dismiss" });
        cbw.b((elm)af4);
        c.A2.D0.c();
        final vqg g = c.A2.D0.g;
        if (g != null) {
            g.c(null);
        }
        c.F1();
    }
    
    public final void e(final AttachmentMediaView attachmentMediaView, final Point point) {
    }
    
    public final void f(final jw9 jw9) {
        if (jw9 instanceof ew9) {
            final ew9 ew9 = (ew9)jw9;
            this.a.c.h3.d((Object)new AltTextActivityContentViewArgs(ew9, null, ew9.P0));
        }
        else if (jw9 instanceof aw9) {
            final aw9 aw9 = (aw9)jw9;
            this.a.c.h3.d((Object)new AltTextActivityContentViewArgs(null, aw9, aw9.H0));
        }
    }
}
