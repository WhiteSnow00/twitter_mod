import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.android.liveevent.landing.hero.audiospace.AudioSpaceHeroViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f21 extends ste implements qsb<n21, fzv>
{
    public final AudioSpaceHeroViewModel D0;
    
    public f21(final AudioSpaceHeroViewModel d0) {
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
                    final AudioSpaceHeroViewModel d0 = this.D0;
                    final String b = a.b;
                    czd.c((Object)b);
                    final z11$e z11$e = new z11$e(b, n21.b ^ true);
                    final coe[] w0 = AudioSpaceHeroViewModel.W0;
                    ((MviViewModel)d0).V((Object)z11$e);
                }
                else {
                    final AudioSpaceHeroViewModel d2 = this.D0;
                    final coe[] w2 = AudioSpaceHeroViewModel.W0;
                    Objects.requireNonNull(d2);
                    ((MviViewModel)d2).T((qsb)new g21(d2));
                }
            }
        }
        return fzv.a;
    }
}
