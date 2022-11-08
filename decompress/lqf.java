import android.widget.ImageView;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import android.widget.TextView;
import com.twitter.ui.widget.ToggleImageButton;
import android.widget.ImageButton;
import android.view.View;
import java.util.List;
import tv.periscope.model.b;
import android.view.View$OnClickListener;
import java.util.Collection;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqf extends vx0 implements iqf$a, bzf.a
{
    public final mf2 E0;
    public final bh2 F0;
    public final wsf G0;
    public final a H0;
    public final bzf I0;
    public LiveEventConfiguration J0;
    public u4 K0;
    public Collection<e2> L0;
    public d3 M0;
    
    public lqf(final a h0, final mf2 e0, final bh2 f0, final wsf g0, final bzf i0) {
        this.H0 = h0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = i0;
    }
    
    public final void e() {
        ic0.c(this.H0.D0);
        this.o();
    }
    
    public final void f() {
        ic0.f(this.H0.D0);
        this.o();
    }
    
    public final void h() {
        final a h0 = this.H0;
        h0.n0(null);
        ((View)h0.E0).setVisibility(8);
        ((View)h0.F0).setVisibility(8);
        ((View)h0.G0).setVisibility(0);
        h0.H0.setConcurrentViewerCount(0L);
        h0.H0.c();
        h0.H0.b();
        h0.I0.setText((CharSequence)null);
        ((View)h0.I0).setVisibility(8);
        ((View)h0.J0).setVisibility(8);
    }
    
    @Override
    public final void j(final u4 k0) {
        this.K0 = k0;
        final bzf i0 = this.I0;
        i0.b = (bzf.a)this;
        i0.f();
        final i1 b1 = this.K0.b.b1;
        final int a = w4j.a;
        final b b2 = oof.b(this.E0, (oof)b1);
        if (pjr.g((CharSequence)b2.f0())) {
            this.H0.l0(pjr.l(b2.f0()));
        }
        else if (pjr.g((CharSequence)b2.i0())) {
            this.H0.l0(b2.i0());
        }
        else {
            this.H0.l0(null);
        }
        if (k0.a() != null) {
            this.M0 = k0.a();
        }
        this.F0.a(k0.b.b1).a(k0);
        this.o();
        this.H0.n0((View$OnClickListener)new kuf((Object)this, 3));
        if (!this.G0.b()) {
            this.H0.m0((View$OnClickListener)new t0p((Object)this, 2));
        }
        k0.e.k((Collection)(this.L0 = ijf.w((Object)new kwk((kwk$a)new on3((Object)this, 8)), (Object[])new e2[] { (e2)new iqf((iqf.iqf$a)this), (e2)new vnk((vnk$a)new kqf(this)), (e2)new gnk((gnk$a)new jqf(this)), (e2)new lvf((lvf$a)new l71((Object)this, 16)), (e2)new jtf((jtf$a)new yga((Object)this, 9)) })));
    }
    
    @Override
    public final void k() {
        final u4 k0 = this.K0;
        if (k0 != null) {
            this.F0.a(k0.b.b1).i(this.K0);
        }
        this.K0 = null;
        this.M0 = null;
        this.I0.a();
        this.H0.n0(null);
        this.H0.m0(null);
        this.o();
        this.I0.e();
    }
    
    @Override
    public final void l() {
        this.o();
    }
    
    public final void m() {
        ((View)this.H0.E0).setVisibility(8);
        this.H0.H0.b();
        ((View)this.H0.I0).setVisibility(8);
        ((View)this.H0.G0).setVisibility(8);
        ((View)this.H0.F0).setVisibility(8);
    }
    
    public final void n() {
        final u4 k0 = this.K0;
        if (k0 == null) {
            return;
        }
        final eca d = k0.d;
        final int a = w4j.a;
        final oi2 oi2 = new oi2((wvf)d, this.J0);
        oi2.h = true;
        ((izw)oi2).e = this.K0.b.b1;
        ((izw)oi2).d = true;
        oi2.b(this.H0.C0.getContext());
    }
    
    public final void o() {
        final u4 k0 = this.K0;
        if (k0 != null) {
            if (k0.e()) {
                final a h0 = this.H0;
                ((ImageView)h0.E0).setImageResource(2131232303);
                ((View)h0.E0).setContentDescription((CharSequence)h0.C0.getResources().getString(2131955648));
            }
            else {
                final a h2 = this.H0;
                ((ImageView)h2.E0).setImageResource(2131232357);
                ((View)h2.E0).setContentDescription((CharSequence)h2.C0.getResources().getString(2131955767));
            }
            this.H0.G0.setToggledOn(this.K0.b.l1 ^ true);
        }
        final d3 m0 = this.M0;
        if (m0 == null) {
            this.m();
        }
        else if (rez.u(m0)) {
            this.m();
        }
        else {
            final u4 k2 = this.K0;
            if (k2 != null) {
                pf8.r(k2);
                final i1 b1 = k2.b.b1;
                final int a = w4j.a;
                if (oof.b(this.E0, (oof)b1).F()) {
                    ((View)this.H0.E0).setVisibility(8);
                }
                else {
                    ((View)this.H0.E0).setVisibility(0);
                }
                this.H0.H0.show();
                ((View)this.H0.I0).setVisibility(0);
                ((View)this.H0.G0).setVisibility(0);
                ((View)this.H0.F0).setVisibility(0);
            }
        }
    }
    
    public final void p() {
        this.I0.a();
        final u4 k0 = this.K0;
        boolean b = false;
        if (k0 != null && k0.c()) {
            this.H0.D0.setVisibility(0);
            return;
        }
        if (this.H0.D0.getVisibility() == 0) {
            b = true;
        }
        if (!b) {
            this.I0.b();
        }
        else {
            this.I0.a.a((mht)mht$c.a);
        }
    }
    
    public final void r0() {
        this.H0.D0.setVisibility(8);
    }
    
    public final void show() {
        this.H0.D0.setVisibility(0);
        this.I0.c();
    }
    
    @Override
    public final void unbind() {
        super.unbind();
        final u4 k0 = this.K0;
        if (k0 != null) {
            final List l0 = this.L0;
            if (l0 != null) {
                k0.e.Z((Collection)l0);
            }
        }
    }
    
    public static final class a extends el8
    {
        public final View D0;
        public final ImageButton E0;
        public final ImageButton F0;
        public final ToggleImageButton G0;
        public final v3k H0;
        public final TextView I0;
        public final AutoPlayBadgeView J0;
        
        public a(final View view) {
            super(view);
            this.D0 = view.findViewById(2131427729);
            ((View)(this.E0 = (ImageButton)view.findViewById(2131429821))).requestFocus();
            this.F0 = (ImageButton)view.findViewById(2131429816);
            (this.G0 = (ToggleImageButton)view.findViewById(2131431528)).setToggledOn(true);
            this.H0 = (v3k)view.findViewById(2131430541);
            this.I0 = (TextView)view.findViewById(2131429799);
            ((View)(this.J0 = (AutoPlayBadgeView)view.findViewById(2131432545))).setVisibility(8);
        }
        
        public final void l0(final String text) {
            this.I0.setText((CharSequence)text);
        }
        
        public final void m0(final View$OnClickListener onClickListener) {
            super.C0.setOnClickListener(onClickListener);
        }
        
        public final void n0(final View$OnClickListener onClickListener) {
            ((View)this.E0).setOnClickListener(onClickListener);
            ((View)this.F0).setOnClickListener(onClickListener);
            ((View)this.G0).setOnClickListener(onClickListener);
        }
    }
}
