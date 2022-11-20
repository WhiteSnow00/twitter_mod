import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zvp extends ste implements qsb<vei, fzv>
{
    public final awp D0;
    public final qo7 E0;
    public final us7 F0;
    public final ftb<tj7, Context, fzv> G0;
    
    public zvp(final awp d0, final qo7 e0, final us7 f0, final ftb<? super tj7, ? super Context, fzv> g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (ftb<tj7, Context, fzv>)g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final vei vei = (vei)o;
        awp.b(this.D0);
        final awp d0 = this.D0;
        final qo7 e0 = this.E0;
        final String e2 = vei.e();
        Objects.requireNonNull(d0);
        qo7 qo7 = e0;
        if (e2 != null) {
            final qo7.a a = new qo7.a(e0);
            a.d = e2;
            qo7 = (qo7)a.e();
        }
        final awp d2 = this.D0;
        awp.a(this.D0, vei.e(), d2.g.b(qo7, this.F0, d2.a), this.G0);
        this.D0.e.b(s9i.r(vei));
        return fzv.a;
    }
}
