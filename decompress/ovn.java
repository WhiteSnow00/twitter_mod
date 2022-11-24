import java.util.Set;
import android.view.ViewParent;
import java.util.Iterator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import java.util.ArrayList;
import com.twitter.rooms.ui.utils.survey.view.PostSurveyItemView;
import java.util.List;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovn implements xlx<vvn, lvn, jvn>
{
    public static final b Companion;
    public static final Map<Integer, vsk> Z0;
    public final View F0;
    public final Fragment G0;
    public final eko H0;
    public final zfo I0;
    public final ViewGroup J0;
    public final View K0;
    public final View L0;
    public final View M0;
    public final View N0;
    public final View O0;
    public final ViewGroup P0;
    public final View Q0;
    public final View R0;
    public final View S0;
    public final znl<lvn$a> T0;
    public final znl<lvn$b> U0;
    public final v1n V0;
    public final List<PostSurveyItemView> W0;
    public final List<awj<e1s, ViewGroup>> X0;
    public final fih<vvn> Y0;
    
    static {
        Companion = new b();
        Z0 = mlg.S(new awj[] { new awj((Object)2131431545, (Object)vsk.F0), new awj((Object)2131431544, (Object)vsk.G0), new awj((Object)2131431546, (Object)vsk.H0), new awj((Object)2131431550, (Object)vsk.I0), new awj((Object)2131431553, (Object)vsk.J0), new awj((Object)2131431551, (Object)vsk.K0), new awj((Object)2131431548, (Object)vsk.L0), new awj((Object)2131431552, (Object)vsk.M0), new awj((Object)2131431547, (Object)vsk.N0), new awj((Object)2131431549, (Object)vsk.O0) });
    }
    
    public ovn(View f0, final Fragment g0, final eko h0, final zfo i0, final mf1 mf1) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)h0, "utilsViewEventDispatcher");
        e0e.f((Object)i0, "toaster");
        e0e.f((Object)mf1, "navigator");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = (ViewGroup)f0.findViewById(2131431850);
        this.K0 = f0.findViewById(2131428270);
        this.L0 = f0.findViewById(2131431853);
        this.M0 = f0.findViewById(2131431854);
        this.N0 = f0.findViewById(2131431851);
        this.O0 = f0.findViewById(2131431852);
        this.P0 = (ViewGroup)f0.findViewById(2131431842);
        this.Q0 = f0.findViewById(2131429342);
        this.R0 = f0.findViewById(2131431554);
        this.S0 = f0.findViewById(2131431844);
        this.T0 = (znl<lvn$a>)new znl();
        this.U0 = (znl<lvn$b>)new znl();
        this.V0 = new v1n((Object)this, 1);
        final Map<Integer, vsk> z0 = ovn.Z0;
        final ArrayList w0 = new ArrayList<PostSurveyItemView>(z0.size());
        final Iterator iterator = z0.entrySet().iterator();
        while (iterator.hasNext()) {
            w0.add((PostSurveyItemView)this.F0.findViewById(((Map.Entry<Number, V>)iterator.next()).getKey().intValue()));
        }
        this.W0 = w0;
        this.X0 = shw.y0((Object[])new awj[] { new awj((Object)e1s.F0, (Object)this.J0), new awj((Object)e1s.G0, (Object)this.P0) });
        final Iterator<PostSurveyItemView> iterator2 = w0.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().setOnCheckedListener((stb)new ovn$a(this));
        }
        mf1.a((mf1$a)this.V0);
        final ViewParent parent = this.F0.getParent();
        final boolean b = parent instanceof View;
        Object o = null;
        if (b) {
            f0 = (View)parent;
        }
        else {
            f0 = null;
        }
        if (f0 != null) {
            o = f0.findViewById(2131428647);
        }
        if (o != null) {
            BottomSheetBehavior.y((View)o).H(3);
        }
        this.Y0 = (fih<vvn>)ma7.S((stb)new ovn$l(this));
    }
    
    public final void T(final ccx ccx) {
        final vvn vvn = (vvn)ccx;
        e0e.f((Object)vvn, "state");
        this.Y0.b((Object)vvn);
    }
    
    public final void r(final Object o) {
        final jvn jvn = (jvn)o;
        e0e.f((Object)jvn, "effect");
        if (jvn instanceof jvn.a) {
            final jvn.a a = (jvn.a)jvn;
            if (a.b) {
                final String c = a.c;
                if (c != null) {
                    this.H0.a((lnj)new lnj.l(c, a.d, a.e, a.f, a.g, a.h, a.i));
                    return;
                }
            }
            final boolean a2 = a.a;
            bng.h((String)null, (Integer)null, false, 7, this.H0);
            if (a2) {
                final zfo i0 = this.I0;
                final String string = this.F0.getContext().getString(2131958187);
                e0e.e((Object)string, "rootView.context.getStri\u2026tring.space_survey_toast)");
                i0.c(string, Integer.valueOf(2131231799));
            }
        }
    }
    
    public final t5j<lvn> w() {
        final View k0 = this.K0;
        e0e.e((Object)k0, "landingClose");
        final t5j map = vq9.a(k0).map((rtb)new xcn((stb)ovn$d.F0, 20));
        final View l0 = this.L0;
        e0e.e((Object)l0, "positiveImg");
        final t5j map2 = vq9.a(l0).map((rtb)new d3o((stb)ovn$e.F0, 15));
        final View m0 = this.M0;
        e0e.e((Object)m0, "positiveLabel");
        final t5j map3 = vq9.a(m0).map((rtb)new ter((stb)ovn$f.F0, 12));
        final View n0 = this.N0;
        e0e.e((Object)n0, "negativeImg");
        final t5j map4 = vq9.a(n0).map((rtb)new ydn((stb)ovn$g.F0, 5));
        final View o0 = this.O0;
        e0e.e((Object)o0, "negativeLabel");
        final t5j map5 = vq9.a(o0).map((rtb)new t8o((stb)ovn$h.F0, 21));
        final View q0 = this.Q0;
        e0e.e((Object)q0, "detailsBack");
        final t5j map6 = vq9.a(q0).map((rtb)new a4o((stb)ovn$i.F0, 16));
        final View r0 = this.R0;
        e0e.e((Object)r0, "detailsSubmit");
        final t5j map7 = vq9.a(r0).map((rtb)new vyn((stb)ovn$j.F0, 18));
        final View s0 = this.S0;
        e0e.e((Object)s0, "detailsSkip");
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)map, (fbj)map2, (fbj)map3, (fbj)map4, (fbj)map5, (fbj)map6, (fbj)map7, (fbj)vq9.a(s0).map((rtb)new uyn((stb)ovn$k.F0, 21)), (fbj)this.U0, (fbj)this.T0 });
        e0e.e((Object)mergeArray, "mergeArray(\n        land\u2026    selectionEvents\n    )");
        return (t5j<lvn>)mergeArray;
    }
    
    public static final class b
    {
    }
    
    public interface c
    {
        ovn a(final View p0);
    }
}
