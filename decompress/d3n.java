import java.util.Set;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d3n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public d3n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        final l1n d0 = this.D0;
        final boolean b = t6n.B;
        final Set f0 = t6n.f0;
        final boolean q = t6n.q;
        final boolean k = t6n.k;
        Objects.requireNonNull(d0);
        final kov w0 = kov.W0;
        final kov e0 = kov.E0;
        final boolean b2 = f0.isEmpty() ^ true;
        final djo a = djo.a;
        if (asa.b().b("android_audio_mute_unmute", false)) {
            d0.n1.b();
            d0.n1.setPillHeight(2131166685);
            d0.n1.d();
            if (b && b2) {
                if (q) {
                    d0.n1.setText(2131957323);
                    d0.n1.c(w0, e0);
                }
                else {
                    d0.n1.setText(2131957277);
                    d0.n1.c(e0, kov.H0);
                }
                d0.l(d0.n1);
            }
            else if (!b && q && b2 && k) {
                d0.n1.setText(2131957320);
                d0.n1.c(w0, e0);
                d0.l(d0.n1);
            }
            else {
                d0.i(d0.n1);
            }
        }
        return fzv.a;
    }
}
