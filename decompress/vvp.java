import java.util.Objects;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vvp extends ste implements qsb<List<vei>, fzv>
{
    public final List<qo7> D0;
    public final awp E0;
    public final us7 F0;
    public final ftb<tj7, Context, fzv> G0;
    
    public vvp(final List<? extends qo7> d0, final awp e0, final us7 f0, final ftb<? super tj7, ? super Context, fzv> g0) {
        this.D0 = (List<qo7>)d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (ftb<tj7, Context, fzv>)g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        if (this.D0.size() == 1 && list.size() == 1) {
            final awp e0 = this.E0;
            final qo7 qo7 = (qo7)mq4.g0((List)this.D0);
            final String e2 = ((vei)mq4.g0(list)).e();
            Objects.requireNonNull(e0);
            qo7 qo8 = qo7;
            if (e2 != null) {
                final qo7.a a = new qo7.a(qo7);
                a.d = e2;
                qo8 = (qo7)a.e();
            }
            final awp e3 = this.E0;
            awp.a(this.E0, qo8.a, e3.g.b(qo8, this.F0, e3.a), this.G0);
        }
        else {
            awp.a(this.E0, null, this.E0.g.a(this.F0), this.G0);
        }
        final xul e4 = this.E0.e;
        czd.e((Object)list, "responses");
        e4.b(list);
        return fzv.a;
    }
}
