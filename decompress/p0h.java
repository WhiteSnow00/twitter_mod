import java.util.concurrent.FutureTask;
import android.view.View;
import tv.periscope.model.chat.Message$a;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.j$a;
import com.twitter.app.dm.widget.b$a;
import com.twitter.card.common.preview.b;
import com.twitter.app.dm.DMConversationContentViewProvider;
import java.util.concurrent.Callable;
import tv.periscope.model.chat.a$a;
import tv.periscope.model.chat.c;
import tv.periscope.model.chat.Message;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p0h implements Runnable
{
    public final int F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    
    public p0h(final Object g0, final Object h0, final Object i0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            default: {
                final i5k i5k = (i5k)this.G0;
                final gm2 gm2 = (gm2)this.H0;
                final gp2 gp2 = (gp2)this.I0;
                if (((View)i5k.K0).isAttachedToWindow()) {
                    final mo2 p0 = i5k.P0;
                    final Message$a g = Message.g();
                    g.b(c.i1);
                    final String a = gm2.a();
                    final a$a a$a = (a$a)g;
                    a$a.g = a;
                    a$a.n = i5k.V0.getString(gm2.b());
                    p0.c(a$a.a());
                    ((lm2)((ha)gp2).a).a(gm2.a());
                }
                return;
            }
            case 2: {
                final v9j v9j = (v9j)this.G0;
                final Callable callable = (Callable)this.H0;
                final fa3 fa3 = (fa3)this.I0;
                if (!((FutureTask)v9j).isCancelled()) {
                    Object call = null;
                    try {
                        final Object o = call = callable.call();
                        ((djl)v9j).set(o);
                        call = o;
                    }
                    catch (final Exception exception) {
                        ((djl)v9j).setException((Throwable)exception);
                    }
                    if (((FutureTask)v9j).isCancelled() && fa3 != null) {
                        fa3.a(call);
                    }
                }
                return;
            }
            case 1: {
                final DMConversationContentViewProvider dmConversationContentViewProvider = (DMConversationContentViewProvider)this.G0;
                final qx0 qx0 = (qx0)this.H0;
                dmConversationContentViewProvider.C2.H0.setCardPreviewController((b)this.I0);
                dmConversationContentViewProvider.C2.H0.setAssociation(((idv)dmConversationContentViewProvider).b1);
                ((com.twitter.app.dm.widget.b)dmConversationContentViewProvider.C2.H0).setListener((b$a)new lk7(dmConversationContentViewProvider, qx0));
                ((com.twitter.app.dm.widget.b)dmConversationContentViewProvider.C2.H0).setTypingEventProducer((wnv)new isx((Object)dmConversationContentViewProvider, 12));
                return;
            }
            case 0: {
                final j$a j$a = (j$a)this.G0;
                ((j)this.H0).a(j$a.a, j$a.b, (axg)this.I0);
            }
        }
    }
}
