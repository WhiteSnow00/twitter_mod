import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.fragment.app.p;
import com.twitter.ui.view.RtlViewPager;
import androidx.viewpager.widget.ViewPager$i;

// 
// Decompiled by Procyon v0.6.0
// 

public class ak8 extends zsj implements ViewPager$i, hlt
{
    public final ctj S0;
    public final znl<zvj<xl1, Integer>> T0;
    public boolean U0;
    
    public ak8(final dob dob, final RtlViewPager rtlViewPager, final ctj s0, final p p4) {
        super(dob, (ViewPager)rtlViewPager, luh.a(0), p4);
        this.T0 = (znl<zvj<xl1, Integer>>)new znl();
        this.S0 = s0;
        super.Q0 = rtlViewPager.getCurrentItem();
        rtlViewPager.c((ViewPager$i)this);
    }
    
    public final void B3(final int n) {
    }
    
    public final void D(final int q0) {
        final ysj c = this.C(q0);
        this.n(this.m());
        this.t(c);
        super.Q0 = q0;
        this.S0.a(c);
    }
    
    public final boolean E() {
        final int l = this.l();
        final int count = this.getCount();
        boolean b = true;
        if (l != count - 1) {
            b = false;
        }
        return b;
    }
    
    public final boolean G() {
        return this.l() == 0;
    }
    
    public final void G2() {
        this.U0 = false;
        this.n(this.x());
    }
    
    public final void U(final xl1 xl1, final int n) {
        if (this.U0 && n == this.l()) {
            this.t(this.C(n));
        }
        this.T0.onNext((Object)new zvj((Object)xl1, (Object)n));
    }
    
    public final boolean X1(final boolean b) {
        final hlt hlt = (hlt)tqb.B((Fragment)this.S(), hlt.class);
        return hlt != null && hlt.X1(b);
    }
    
    public final void h2(final int n, final float n2, final int n3) {
    }
    
    public final boolean n1() {
        final hlt hlt = (hlt)tqb.B((Fragment)this.S(), hlt.class);
        return this.getCount() == 0 || (hlt != null && hlt.n1());
    }
    
    public final void o2() {
        this.U0 = true;
        this.t(this.x());
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
}
