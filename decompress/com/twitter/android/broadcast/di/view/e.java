// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.broadcast.di.view;

import tv.periscope.model.chat.Message$a;
import android.widget.Toast;
import tv.periscope.model.chat.a$a;
import tv.periscope.model.chat.c;
import tv.periscope.model.chat.c$a;
import tv.periscope.model.chat.Message;

public final class e implements njh
{
    public final /* synthetic */ g44 a;
    
    public e(final g44 a) {
        this.a = a;
    }
    
    public final void a(final Message message) {
        this.a.H(message, c$a.I0);
    }
    
    public final void b(final Message message) {
        final g44 a = this.a;
        final iu3 l1 = a.l1;
        if (l1 != null) {
            final String i = l1.l();
            if (!vjr.a((CharSequence)i)) {
                final String a2 = a.l1.a();
                if (!vjr.a((CharSequence)a2)) {
                    final String o0 = message.o0();
                    if (!vjr.a((CharSequence)o0)) {
                        a.F0.unmuteComment(message, i, a2);
                        a.H0.b(o0);
                        final String string = a.X0.getString(2131956463, new Object[] { message.n0() });
                        final u14 h0 = a.H0;
                        final Message$a g = Message.g();
                        g.b(c.Z0);
                        final a$a a$a = (a$a)g;
                        a$a.n = string;
                        h0.c(a$a.a());
                        Toast.makeText(a.X0, (CharSequence)string, 1).show();
                    }
                }
            }
        }
    }
}
