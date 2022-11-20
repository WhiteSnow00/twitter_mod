import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.safety.leaveconversation.LeaveConversationPromptViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3f extends e66
{
    public final bym F0;
    public final s3f G0;
    public final xba<of1> H0;
    
    public p3f(final p66 p4, final bym f0, final s3f g0, final xba<of1> h0) {
        czd.f((Object)p4, "composeDependencies");
        czd.f((Object)f0, "richTextProcessor");
        czd.f((Object)g0, "effectHandler");
        czd.f((Object)h0, "backPressedDispatcher");
        super(p4);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final void a(final x66 x66, final int n) {
        final x66 h = x66.h(1687695692);
        final n96$b a = n96.a;
        final LeaveConversationPromptViewModel leaveConversationPromptViewModel = (LeaveConversationPromptViewModel)((g9x)h.m((wd6)mlx.a)).a.c((v9x)new v9x$b(new m9x((Class)LeaveConversationPromptViewModel.class, "")));
        final s3f g0 = this.G0;
        h.x(-2088733469);
        final p3f$b p3f$b = new p3f$b((Object)g0);
        h.x(1941511575);
        h.x(-301010798);
        final Object y = nb0.y(h, 773894976, -492369756);
        Objects.requireNonNull(x66.Companion);
        Object g2 = y;
        if (y == x66$a.b) {
            g2 = mb0.g(npe.C(h), h);
        }
        h.O();
        final cy6 d0 = ((zd6)g2).D0;
        h.O();
        npe.h((Object)leaveConversationPromptViewModel, (Object)d0, (ftb)new p3f$c((MviViewModel)leaveConversationPromptViewModel, d0, blz.U(p3f$b, h), (go6)null), h);
        h.O();
        h.O();
        h.O();
        final h5j v0 = this.H0.v0();
        final w19 w19 = new w19();
        w19.c(v0.subscribe((lj6)new f$s1((qsb)new p3f$a(w19, leaveConversationPromptViewModel))));
        w3f.a(leaveConversationPromptViewModel, this.F0, (nsb<fzv>)new p3f$d(leaveConversationPromptViewModel), (nsb<fzv>)new p3f$e(leaveConversationPromptViewModel), null, h, 72, 16);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new p3f$f(this, n));
        }
    }
}
