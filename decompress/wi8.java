import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.twitter.ui.view.RtlViewPager;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public class wi8 extends ksj implements i, qkt
{
    public final nsj Q0;
    public final nnl<kvj<sl1, Integer>> R0;
    public boolean S0;
    
    public wi8(final cnb cnb, final RtlViewPager rtlViewPager, final nsj q0, final p p4) {
        super(cnb, (ViewPager)rtlViewPager, vth.a(0), p4);
        this.R0 = (nnl<kvj<sl1, Integer>>)new nnl();
        this.Q0 = q0;
        super.O0 = rtlViewPager.getCurrentItem();
        rtlViewPager.c((i)this);
    }
    
    public final void B3(final int n) {
    }
    
    public final void D(final int o0) {
        final jsj a = this.A(o0);
        this.m(this.l());
        this.s(a);
        super.O0 = o0;
        this.Q0.a(a);
    }
    
    public final boolean E() {
        final int k = this.k();
        final int count = this.getCount();
        boolean b = true;
        if (k != count - 1) {
            b = false;
        }
        return b;
    }
    
    public final boolean G() {
        return this.k() == 0;
    }
    
    public final void G2() {
        this.S0 = false;
        this.m(this.w());
    }
    
    public final void U(final sl1 sl1, final int n) {
        if (this.S0 && n == this.k()) {
            this.s(this.A(n));
        }
        this.R0.onNext((Object)new kvj((Object)sl1, (Object)n));
    }
    
    public final boolean X1(final boolean b) {
        final qkt qkt = (qkt)xjr.h((Fragment)this.S(), (Class)qkt.class);
        return qkt != null && qkt.X1(b);
    }
    
    public final void h2(final int n, final float n2, final int n3) {
    }
    
    public final boolean n1() {
        final qkt qkt = (qkt)xjr.h((Fragment)this.S(), (Class)qkt.class);
        return this.getCount() == 0 || (qkt != null && qkt.n1());
    }
    
    public final void o2() {
        this.S0 = true;
        this.s(this.w());
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
}
