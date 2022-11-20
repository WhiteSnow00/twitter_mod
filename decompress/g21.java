import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g21 extends ste implements qsb<n21, fzv>
{
    public final AudioSpaceHeroViewModel D0;
    
    public g21(final AudioSpaceHeroViewModel d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final n21 n21 = (n21)o;
        czd.f((Object)n21, "state");
        final rof a = n21.a;
        if (a != null) {
            if (a.b != null) {
                if (a.b()) {
                    final sof t0 = this.D0.T0;
                    final String b = a.b;
                    czd.c((Object)b);
                    final boolean b2 = n21.b;
                    Objects.requireNonNull(t0);
                    t0.c(vba.Companion.e("live_event_carousel", "", "", "audiospace_reminder_button", "click"), (j0p)t0.b(b, b2 ^ true));
                    final boolean b3 = n21.b;
                    if (b3) {
                        final AudioSpaceHeroViewModel d0 = this.D0;
                        final String b4 = a.b;
                        czd.c((Object)b4);
                        MviViewModel.F((MviViewModel)d0, d0.S0.a(b4), (String)null, (jrx)null, (qsb)new m21(d0, b4, (go6)null), 3, (Object)null);
                    }
                    else if (!b3) {
                        final AudioSpaceHeroViewModel d2 = this.D0;
                        final String b5 = a.b;
                        czd.c((Object)b5);
                        MviViewModel.F((MviViewModel)d2, d2.S0.b(b5), (String)null, (jrx)null, (qsb)new j21(d2, b5, (go6)null), 3, (Object)null);
                    }
                }
                else if (a.a()) {
                    if (!n21.b) {
                        final AudioSpaceHeroViewModel d3 = this.D0;
                        final String b6 = a.b;
                        czd.c((Object)b6);
                        final z11$d z11$d = new z11$d(b6);
                        final coe[] w0 = AudioSpaceHeroViewModel.W0;
                        ((MviViewModel)d3).V((Object)z11$d);
                    }
                }
                else if (!n21.b) {
                    final AudioSpaceHeroViewModel d4 = this.D0;
                    final String b7 = a.b;
                    czd.c((Object)b7);
                    final z11$c z11$c = new z11$c(b7);
                    final coe[] w2 = AudioSpaceHeroViewModel.W0;
                    ((MviViewModel)d4).V((Object)z11$c);
                }
            }
        }
        return fzv.a;
    }
}
