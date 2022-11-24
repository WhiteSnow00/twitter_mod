import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;
import java.util.Set;
import android.os.ResultReceiver;
import tv.periscope.android.api.Invitee;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import java.util.List;
import android.text.Editable;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.ui.autocomplete.SuggestionEditText$d;
import android.view.View$OnFocusChangeListener;
import com.twitter.ui.widget.TwitterEditText$b;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import android.content.res.Resources;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import com.twitter.subsystem.composer.ComposerCountProgressBarView;
import com.twitter.ui.autocomplete.SuggestionEditText;
import tv.periscope.android.view.WaitingTextView;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "CheckResult" })
public final class auk implements utk
{
    public final uv1<fxl> A;
    public final t5j<kni> B;
    public final t5j<kni> C;
    public int D;
    public int E;
    public boolean F;
    public final TwitterButton a;
    public final ovc b;
    public final UserImageView c;
    public final WaitingTextView d;
    public final SuggestionEditText e;
    public final yaq<ComposerCountProgressBarView> f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final RecyclerView j;
    public final shc k;
    public final ScrollView l;
    public final r3p m;
    public final String n;
    public final Boolean o;
    public final jc3 p;
    public final zrm q;
    public final Resources r;
    public final int s;
    public final cuu t;
    public final t5j<kni> u;
    public final t5j<kni> v;
    public final t5j<kni> w;
    public final t5j<kni> x;
    public final uv1<Locale> y;
    public final uv1<Boolean> z;
    
    public auk(final WaitingTextView d, final TwitterButton a, final UserImageView c, final SuggestionEditText e, final yaq<ComposerCountProgressBarView> f, final View g, final TextView h, final TextView i, final RecyclerView j, final shc shc, final ScrollView l, final r3p m, final String n, final int s, final ovc b, final cuu t, final ywc ywc, final jc3 p19, final zrm q) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        final Boolean value = ywc.a();
        this.o = value;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = shc;
        this.l = l;
        this.m = m;
        this.n = n;
        this.s = s;
        this.t = t;
        this.p = p19;
        this.q = q;
        this.r = q.b;
        e0e.f((Object)a, "<this>");
        final t5j f2 = too.f((View)a);
        final fkc o0 = fkc.O0;
        this.u = (t5j<kni>)f2.map((rtb)o0);
        e0e.f((Object)h, "<this>");
        this.B = (t5j<kni>)too.f((View)h).map((rtb)o0);
        e0e.f((Object)i, "<this>");
        this.C = (t5j<kni>)too.f((View)i).map((rtb)o0);
        e0e.f((Object)e, "<this>");
        final t5j distinctUntilChanged = ak1.L((TextView)e).share().distinctUntilChanged((rtb)new ydn((stb)soo.F0, 24));
        e0e.e((Object)distinctUntilChanged, "textChanges() // Prevent\u2026uence -> obj.toString() }");
        this.w = (t5j<kni>)distinctUntilChanged.map((rtb)o0);
        this.x = (t5j<kni>)ak1.d((TextView)e).debounce(100L, TimeUnit.MILLISECONDS).map((rtb)o0);
        this.v = (t5j<kni>)t5j.create((t9j)new qre(e)).share();
        final uv1 y = new uv1();
        this.y = (uv1<Locale>)y;
        this.z = (uv1<Boolean>)uv1.e((Object)Boolean.FALSE);
        this.A = (uv1<fxl>)new uv1();
        ((TwitterEditText)e).setOnImeChangeListener((TwitterEditText$b)new vrx((Object)y, 17));
        ((TwitterEditText)e).setOnFocusChangeListener((View$OnFocusChangeListener)new ytk((Object)this, 0));
        e.setSelectionChangeListener((SuggestionEditText$d)new ztk(this));
        j.setAdapter((RecyclerView$e)shc);
        ((View)j).setClickable(true);
        final qof b2 = p19.b;
        if (b2 instanceof qof$d && ((qof$d)b2).c) {
            ((View)e).setVisibility(0);
        }
        else {
            ((View)e).setVisibility(8);
        }
        final qof b3 = p19.b;
        if (b3 instanceof qof$d && ((qof$d)b3).d) {
            ((View)h).setVisibility(0);
        }
        else {
            ((View)h).setVisibility(8);
        }
        final qof b4 = p19.b;
        if (b4 instanceof qof$d && ((qof$d)b4).e) {
            ((View)c).setVisibility(0);
        }
        else {
            ((View)c).setVisibility(8);
        }
        final qof b5 = p19.b;
        if (b5 instanceof qof$d && ((qof$d)b5).f) {
            ((View)b.d).setVisibility(8);
            ((View)b.e).setVisibility(8);
            b.d.setToggledOn(true);
        }
        else {
            final boolean a2 = ywc.a();
            if (value) {
                b.g = a2;
                ((View)b.e).setVisibility(4);
                if (a2) {
                    b.d.setToggledOn(b.a.e("pref_broadcast_hydra_toggle_on", b.b));
                    b.c();
                    b.f.a(vq9.a((View)b.d).subscribe((rk6)new bu1((stb)new pvc(b), 8)));
                }
            }
            else {
                ((View)b.d).setVisibility(8);
                ((View)b.e).setVisibility(8);
            }
        }
    }
    
    public final void A() {
        if (!((qof$d)this.p.b).f) {
            this.b.a();
        }
    }
    
    public final Editable B() {
        return ((AppCompatEditText)this.e).getText();
    }
    
    public final t5j<kni> C() {
        return this.v;
    }
    
    public final void D() {
        if (((View)this.e).isFocused()) {
            ((View)this.e).clearFocus();
        }
    }
    
    public final void E(final List<phc> list) {
        final shc k = this.k;
        final zkf i0 = new zkf((Iterable)list);
        final p4e c = ((h7m)k).C();
        ((h7m)k).I0 = (p4e)i0;
        if (!c.equals(((h7m)k).C())) {
            ((RecyclerView$e)k).f();
        }
    }
    
    public final fxl F() {
        return (fxl)this.A.f();
    }
    
    public final void G() {
        ((View)this.j).setVisibility(0);
        if (((qof$d)this.p.b).d) {
            ((View)this.h).setVisibility(0);
        }
        ((View)this.a).setVisibility(0);
    }
    
    public final void H() {
        this.m.a();
    }
    
    public final void I(final String text) {
        if (llr.a((CharSequence)text)) {
            this.d.b((Runnable)null);
            ((View)this.i).setAlpha(0.0f);
            if (this.b.d.L0) {
                ((View)this.i).setVisibility(0);
            }
            else {
                ((View)this.i).setVisibility(4);
            }
            ((View)this.i).animate().setStartDelay(300L).alpha(1.0f).setDuration(300L).start();
            return;
        }
        if (this.o) {
            ((View)this.i).setAlpha(0.0f);
            this.d.c();
            return;
        }
        ((TextView)this.a).setText((CharSequence)text);
    }
    
    public final void J(final String text) {
        ((TextView)this.e).setText((CharSequence)text);
    }
    
    public final void K(final String text) {
        ((TextView)this.a).setText((CharSequence)text);
    }
    
    public final t5j<Boolean> L() {
        return (t5j<Boolean>)this.z;
    }
    
    public final t5j<phc> M() {
        return (t5j<phc>)((t5j)((ie4)this.k).K0).filter((ouk)jtx.U0).map((rtb)fxf.Q0);
    }
    
    public final void N(final boolean enabled) {
        this.a.setEnabled(enabled);
        final int g = this.q.g(2131100880);
        final int g2 = this.q.g(2131099729);
        final int g3 = this.q.g(2131100884);
        final int d = this.q.d(2130968587);
        if (enabled) {
            jb2.E0((Button)this.a, g, d);
            this.a.setTextColor(g2);
            jb2.F0((Button)this.a);
        }
        else {
            jb2.E0((Button)this.a, g3, d);
            this.a.setTextColor(g);
        }
        final float n = 1.0f;
        float n2;
        if (enabled) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.5f;
        }
        if (((View)this.a).getAlpha() != n2) {
            final ViewPropertyAnimator withLayer = ((View)this.a).animate().withLayer();
            float n3;
            if (enabled) {
                n3 = n;
            }
            else {
                n3 = 0.6f;
            }
            withLayer.alpha(n3);
        }
    }
    
    public final void a() {
        if (this.o) {
            this.b.b(false);
        }
        fc0.f((View)this.a);
        fc0.f(this.g);
        fc0.f((View)this.l);
        fc0.f((View)this.j);
        final r3p m = this.m;
        fc0.f(m.b);
        fc0.f(m.c);
        this.d.b((Runnable)null);
        ((View)this.i).setVisibility(8);
        this.s(false);
    }
    
    public final void b() {
        if (!this.F) {
            this.g.setVisibility(4);
            this.F = true;
        }
        else {
            this.e(null);
        }
    }
    
    public final void c(final fxl fxl) {
        ((EditText)this.e).setSelection(fxl.F0, fxl.G0);
    }
    
    public final t5j<kni> d() {
        return this.C;
    }
    
    public final void e(final List<Invitee> list) {
        this.g.setVisibility(0);
        this.F = false;
        if (list != null) {
            String text;
            if (list.isEmpty()) {
                text = this.r.getString(2131956387);
            }
            else if (list.size() < 2) {
                text = this.r.getString(2131956519, new Object[] { list.size() });
            }
            else {
                text = this.r.getString(2131956525, new Object[] { list.size() });
            }
            this.i.setText((CharSequence)text);
        }
    }
    
    public final t5j<Boolean> f() {
        if (this.o) {
            return (t5j<Boolean>)this.b.c;
        }
        return (t5j<Boolean>)t5j.empty();
    }
    
    public final void g() {
        hdx.w(((View)this.e).getContext(), (View)this.e, false, (ResultReceiver)null);
    }
    
    public final t5j<kni> h() {
        return this.u;
    }
    
    public final String i() {
        return ((AppCompatEditText)this.e).getText().toString();
    }
    
    public final void j() {
        this.D = ((View)this.e).getPaddingTop();
        this.E = ((View)this.e).getPaddingBottom();
        this.t.e((TextView)this.e);
    }
    
    public final void k() {
        ((View)this.j).setVisibility(4);
        ((View)this.h).setVisibility(4);
        ((View)this.a).setVisibility(4);
    }
    
    public final int l() {
        final int[] array = new int[2];
        ((View)this.l).getLocationOnScreen(array);
        return ((View)this.c).getHeight() + array[1] + this.s;
    }
    
    public final t5j<Boolean> m() {
        return (t5j<Boolean>)this.b.c;
    }
    
    public final void n(final qgv qgv) {
        this.c.H(qgv);
    }
    
    public final t5j<kni> o() {
        return this.w;
    }
    
    public final void p(final noj<k7g> noj) {
        String text;
        if (noj.f()) {
            text = ((k7g)noj.c()).a.e;
        }
        else {
            text = this.n;
        }
        this.h.setText((CharSequence)text);
    }
    
    public final t5j<Locale> q() {
        return (t5j<Locale>)this.y;
    }
    
    public final t5j<phc> r() {
        return (t5j<phc>)((t5j)((ie4)this.k).K0).filter((ouk)lpo.Z0).map((rtb)dkc.L0);
    }
    
    public final void s(final boolean b) {
        ((bbq)((kcx)this.f).d).G((rk6)new xtk(b), (rk6)lvb.e);
    }
    
    public final void show() {
        if (this.o) {
            this.b.b(true);
        }
        fc0.c((View)this.a);
        fc0.c(this.g);
        fc0.c((View)this.l);
        fc0.c((View)this.j);
        final r3p m = this.m;
        m.b.setVisibility(0);
        m.c.setVisibility(0);
        m.a();
        ((View)this.i).setVisibility(0);
        ((kcx)this.f).h();
    }
    
    public final t5j<kni> t() {
        return this.B;
    }
    
    public final void u(final int n) {
        ((bbq)((kcx)this.f).d).G((rk6)new wtk(n), (rk6)lvb.e);
    }
    
    public final void v() {
        this.t.c((TextView)this.e, -2, this.D, this.E);
    }
    
    public final void w(final String s, final Locale locale) {
        if (s.isEmpty() && ((kcx)this.f).i()) {
            this.s(false);
        }
        else if (!s.isEmpty()) {
            this.s(true);
        }
        ((bbq)((kcx)this.f).d).G((rk6)new vtk((Object)s, (Object)locale, 0), (rk6)lvb.e);
    }
    
    public final t5j<kni> x() {
        return this.x;
    }
    
    public final void y(final Set<phc> m0) {
        final shc k = this.k;
        k.M0 = m0;
        ((RecyclerView$e)k).f();
    }
    
    public final void z(final boolean b) {
        if (b) {
            ((View)this.i).setVisibility(0);
        }
        else {
            ((View)this.i).setVisibility(4);
        }
    }
}
