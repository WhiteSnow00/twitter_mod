import android.view.KeyEvent;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ze4 extends gue implements rtb<ype, Boolean>
{
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ Map<ppe, twk> D0;
    public final /* synthetic */ q7r<qfj> E0;
    public final /* synthetic */ yy6 F0;
    public final /* synthetic */ otb<oyv> G0;
    public final /* synthetic */ oth H0;
    
    public ze4(final boolean c0, final Map<ppe, twk> d0, final q7r<qfj> e0, final yy6 f0, final otb<oyv> g0, final oth h0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final KeyEvent a = ((ype)o).a;
        zzd.f((Object)a, "keyEvent");
        final boolean c0 = this.C0;
        boolean b = true;
        Label_0322: {
            if (c0) {
                final int b2 = nf4.b;
                final int n = bqe.n(a);
                Objects.requireNonNull(aqe.Companion);
                if (n == 2 && nf4.b(a)) {
                    if (!this.D0.containsKey(new ppe(x3j.e(a.getKeyCode())))) {
                        final twk twk = new twk(((qfj)this.E0.getValue()).a);
                        this.D0.put(new ppe(x3j.e(a.getKeyCode())), twk);
                        fk7.v0(this.F0, null, 0, (gub)new xe4(this.H0, twk, (ap6)null), 3);
                        return b;
                    }
                    break Label_0322;
                }
            }
            if (this.C0) {
                final int b3 = nf4.b;
                final int n2 = bqe.n(a);
                Objects.requireNonNull(aqe.Companion);
                if (n2 == 1 && nf4.b(a)) {
                    final twk twk2 = this.D0.remove(new ppe(x3j.e(a.getKeyCode())));
                    if (twk2 != null) {
                        fk7.v0(this.F0, null, 0, (gub)new ye4(this.H0, twk2, (ap6)null), 3);
                    }
                    this.G0.invoke();
                    return b;
                }
            }
        }
        b = false;
        return b;
    }
}
