import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.twitter.ui.widget.TwitterEditText;
import android.app.Dialog;
import java.util.HashMap;
import java.util.HashSet;
import androidx.fragment.app.p;
import java.util.Map;
import java.util.Collections;
import android.view.KeyEvent;
import android.widget.TextView;
import android.view.MenuItem$OnActionExpandListener;
import android.view.Menu;
import com.twitter.ui.widget.PopupEditText$a;
import android.widget.Filterable;
import android.widget.ListAdapter;
import java.util.Objects;
import java.util.Collection;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import android.text.Editable;
import android.view.View$OnClickListener;
import android.app.Activity;
import android.view.LayoutInflater;
import android.os.ResultReceiver;
import android.view.View;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import android.view.MenuItem;
import android.widget.ImageView;
import com.twitter.ui.widget.PopupEditText;
import com.twitter.util.user.UserIdentifier;
import java.util.List;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import com.twitter.ui.widget.PopupEditText$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8p implements PopupEditText$c, TextView$OnEditorActionListener, TextWatcher, c8p, a
{
    public final apb C0;
    public final tm3 D0;
    public final j8p E0;
    public final List<lev> F0;
    public final ssl G0;
    public final gob H0;
    public final UserIdentifier I0;
    public final a9p J0;
    public final z8p K0;
    public final g8p$a L0;
    public final dca<List<l8p>> M0;
    public final g N0;
    public final d O0;
    public final ohv P0;
    public final f8p Q0;
    public final iso R0;
    public final f7p S0;
    public final a8p T0;
    public final fxe<k8p> U0;
    public final c5p V0;
    public final grq W0;
    public final v8p X0;
    public final rjq Y0;
    public jev Z0;
    public final fxe<d9p> a1;
    public PopupEditText b1;
    public ImageView c1;
    public String d1;
    public e e1;
    public MenuItem f1;
    public i9p g1;
    public n8p h1;
    public String i1;
    public d8p j1;
    public n5p k1;
    public boolean l1;
    public int m1;
    public boolean n1;
    public String o1;
    public boolean p1;
    
    public g8p(final gob h0, final UserIdentifier i0, final a9p j0, final f7p s0, final tm3 d0, final a8p t0, final n5p k1, final ek8 h2, final ibm ibm, final sso sso, final fxe<d9p> a1, final String s2, final ct3 ct3, final j8p e0, final fxe<k8p> u0, final c5p v0, final grq w0, final v8p x0, final rjq y0) {
        this.F0 = new ArrayList();
        this.G0 = new ssl(new Handler(Looper.getMainLooper()));
        this.L0 = new Runnable() {
            @Override
            public final void run() {
                final PopupEditText b1 = g8p.this.b1;
                pf8.r(b1);
                final PopupEditText popupEditText = b1;
                ((View)b1).requestFocus();
                g8p.this.r(b1);
                tbx.w((Context)g8p.this.H0, (View)b1, true, (ResultReceiver)null);
            }
        };
        this.m1 = 0;
        this.H0 = h0;
        this.I0 = i0;
        this.C0 = (apb)h0.Q();
        this.D0 = d0;
        this.E0 = e0;
        final g n0 = new g();
        this.N0 = n0;
        this.k1 = k1;
        final d o0 = new d();
        this.O0 = o0;
        this.S0 = s0;
        final jev z0 = new jev();
        ((vyo)z0).c("app");
        this.Z0 = z0;
        this.T0 = t0;
        this.V0 = v0;
        this.W0 = w0;
        this.K0 = new z8p((Activity)h0, (View$OnClickListener)n0, (sgj<View, lev>)new h(), o0, (View$OnClickListener)new c(), LayoutInflater.from((Context)h0), this.Z0, ct3, v0, h2);
        this.P0 = new ohv(((Context)h0).getApplicationContext(), i0, s2);
        this.U0 = u0;
        this.Q0 = new f8p(this);
        this.o1 = ((Context)h0).getResources().getString(2131957467);
        this.J0 = j0;
        this.M0 = new tn6((Object)this, 1);
        this.R0 = new iso((Context)h0, i0);
        this.a1 = a1;
        this.X0 = x0;
        this.Y0 = y0;
        this.h1 = h2;
        ibm.i((rj)new zut((Object)this, 23));
        sso.a((vro)new g8p$b(this));
    }
    
    public final boolean a() {
        final MenuItem f1 = this.f1;
        return f1 != null && f1.isActionViewExpanded();
    }
    
    public final void afterTextChanged(final Editable editable) {
        final int length = ((CharSequence)editable).length();
        int visibility = 0;
        final boolean l1 = length > 0;
        if (l1 != this.l1) {
            this.l1 = l1;
            pf8.r(this.c1);
            final ImageView c1 = this.c1;
            if (!this.l1) {
                visibility = 8;
            }
            c1.setVisibility(visibility);
        }
        if (this.a1.get() != null) {
            final String string = editable.toString();
            this.f4(string);
            ((k8p)this.U0.get()).a(string);
        }
    }
    
    public final boolean b() {
        final v8p x0 = this.X0;
        boolean b = true;
        x0.b = true;
        xw0.g(TimeUnit.MILLISECONDS, 300L, (rj)new zut((Object)x0, 24));
        if (!this.p1) {
            final MenuItem f1 = this.f1;
            if (f1 != null && f1.isActionViewExpanded() && this.f1.collapseActionView()) {
                return b;
            }
        }
        b = false;
        return b;
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void c(final CharSequence charSequence) {
        this.q(charSequence, false);
    }
    
    public final boolean d() {
        if (this.a1.get() != null) {
            return ((d9p)this.a1.get()).j;
        }
        final PopupEditText b1 = this.b1;
        return b1 != null && b1.i();
    }
    
    public final void e(final View view) {
        this.T0.clear();
        this.D0.c.a();
        this.J0.c.a();
        final PopupEditText b1 = this.b1;
        pf8.r(b1);
        ((TextView)b1).removeTextChangedListener((TextWatcher)this);
        pf8.r(view);
        view.clearFocus();
        final ssl g0 = this.G0;
        g0.D0 = this.d1;
        g0.C0 = new WeakReference((T)this.b1);
        tbx.w((Context)this.H0, (View)this.b1, false, (ResultReceiver)this.G0);
        if (!this.F0.isEmpty()) {
            final f7p s0 = this.S0;
            final jev z0 = this.Z0;
            final ArrayList f0 = this.F0;
            final zf4 f2 = s0.f(z0, "typeahead", "results");
            f2.j((Collection)f0);
            saw.b((okm)f2);
            this.F0.clear();
        }
        this.n();
        final i9p g2 = this.g1;
        if (g2 != null) {
            g2.J1();
        }
        final v8p x0 = this.X0;
        if (!x0.b) {
            x0.a.onNext((Object)Boolean.FALSE);
        }
    }
    
    public final boolean f() {
        final MenuItem f1 = this.f1;
        return f1 != null && !f1.isActionViewExpanded() && this.f1.expandActionView();
    }
    
    public final void f4(final CharSequence charSequence) {
        if (charSequence != null) {
            this.p(charSequence.toString());
        }
    }
    
    public final void g(final i9p g1) {
        this.g1 = g1;
    }
    
    public final void h(final View view) {
        pf8.r(view);
        final PopupEditText popupEditText = (PopupEditText)view.findViewById(2131430838);
        ((View)popupEditText).setContentDescription((CharSequence)((Context)this.H0).getString(2131952336));
        ((TextView)popupEditText).setHint((CharSequence)this.o1);
        ((TwitterEditText)popupEditText).setTypeface(gmv.b(view.getContext()).a);
        this.b1 = popupEditText;
        final ImageView c1 = (ImageView)view.findViewById(2131428252);
        pf8.r(c1);
        ((View)(this.c1 = c1)).setOnClickListener((View$OnClickListener)new ggk((Object)this, (Object)popupEditText, 19));
        ((TextView)popupEditText).addTextChangedListener((TextWatcher)this);
        ((TextView)popupEditText).setOnEditorActionListener((TextView$OnEditorActionListener)this);
        popupEditText.setPopupEditTextListener((PopupEditText$c)this);
        final c5p v0 = this.V0;
        Objects.requireNonNull(v0);
        if (bfe.w() || bfe.x()) {
            v0.c = (c5p.a)this;
        }
        final d9p d9p = (d9p)this.a1.get();
        if (d9p != null) {
            final z8p k0 = this.K0;
            d9p.g = k0;
            d9p.b.c(((n9q)d9p.d.d).G((fk6)new n92((Object)d9p, (Object)k0, 12), (fk6)jvb.e));
            final m5 n0 = new m5(this, 5);
            final z8p g = d9p.g;
            if (g != null) {
                g.N0 = (z8p.z8p$c)n0;
            }
            final c8f m0 = new c8f((Object)this);
            if (g != null) {
                g.M0 = (z8p.z8p$b)m0;
            }
            final fcn o0 = new fcn((Object)this, 25);
            if (g != null) {
                g.O0 = (z8p.z8p$d)o0;
            }
        }
        else {
            popupEditText.setAdapter((ListAdapter)this.K0);
            final PopupEditText$a r1 = PopupEditText.R1;
            final PopupEditText$a r2 = PopupEditText.R1;
            popupEditText.j((Filterable)brk.C0, (long)hhv.b());
        }
        popupEditText.setOnClickListener((View$OnClickListener)this.N0);
        this.b1 = popupEditText;
        final tm3 d0 = this.D0;
        d0.c.c(((b5j)d0.a).distinctUntilChanged((fw1)cc3.Z0).filter((ptk)qut.S0).subscribe((fk6)new ue3((Object)d0, (Object)this.Z0, 3)));
        final int length = ((CharSequence)((AppCompatEditText)this.b1).getText()).length();
        int visibility = 0;
        this.l1 = (length > 0);
        pf8.r(this.c1);
        final ImageView c2 = this.c1;
        if (!this.l1) {
            visibility = 8;
        }
        c2.setVisibility(visibility);
        ((View)popupEditText).post((Runnable)this.L0);
        final d8p j1 = this.j1;
        long o2;
        if (j1 != null) {
            o2 = j1.o;
        }
        else {
            o2 = 0L;
        }
        final zf4 f = this.S0.f(this.Z0, "", "focus_field");
        if (o2 != 0L) {
            f.C = String.valueOf(o2);
            final int a = w4j.a;
        }
        saw.b((okm)f);
        final i9p g2 = this.g1;
        if (g2 != null) {
            g2.a0();
        }
        this.X0.a.onNext((Object)Boolean.TRUE);
        final a9p j2 = this.J0;
        final tn6 m2 = this.M0;
        final m29 c3 = j2.c;
        final hab e = ((hab)new ibb((hab)j2.a)).e(yvo.c(), 1);
        final y4c b = j2.b;
        Objects.requireNonNull(b);
        final dbb dbb = new dbb(e, (qtb)new yn9(b, 10));
        final y4c b2 = j2.b;
        Objects.requireNonNull(b2);
        final hab d2 = ((hab)new dbb((hab)dbb, (qtb)new m5(b2, 9))).d(h6q.L());
        Objects.requireNonNull(m2);
        final iue iue = new iue((fk6)new jak((Object)m2, 12), (fk6)zi7.I0);
        d2.h((wbb)iue);
        c3.c((j29)iue);
        this.e1 = new e();
        if (!this.Y0.a()) {
            final long n2 = dta.b().f("saved_searches_ttl_hours", 1);
            final iso r3 = this.R0;
            final h8p h8p = new h8p(this);
            final m29 f2 = r3.F0;
            ((omm)r3).S((Object)(n2 * 3600000L)).c((nbq)h8p);
            f2.c((j29)h8p);
        }
        final PopupEditText b3 = this.b1;
        pf8.r(b3);
        this.o(((AppCompatEditText)b3).getText().toString());
        final PopupEditText b4 = this.b1;
        pf8.r(b4);
        this.p(((AppCompatEditText)b4).getText().toString());
    }
    
    public final void i(final n8p h1) {
        this.h1 = h1;
    }
    
    public final void j(final d8p j1) {
        this.j1 = j1;
        this.m1 = j1.c;
        this.n1 = true;
        this.p1 = j1.a;
        final int d = j1.d;
        final String e = j1.e;
        if (d != 0) {
            this.o1 = ((Context)this.H0).getResources().getString(d);
        }
        else if (e != null) {
            this.o1 = e;
        }
        ((vyo<vyo>)this.Z0).c(j1.f);
        ((vyo<vyo>)this.Z0).d(j1.g);
        ((vyo<vyo>)this.Z0).a(j1.h);
        final MenuItem f1 = this.f1;
        if (f1 != null) {
            f1.setVisible(j1.b);
        }
    }
    
    public final void k(final fai fai, final Menu menu, final int n) {
        fai.z(n, menu);
        final MenuItem item = fai.findItem(2131432119);
        if (item != null) {
            item.setOnActionExpandListener((MenuItem$OnActionExpandListener)new i8p(this, fai));
            final d8p j1 = this.j1;
            if (j1 != null) {
                item.setVisible(j1.b);
            }
        }
        this.f1 = item;
    }
    
    public final d8p l() {
        return this.j1;
    }
    
    public final void m() {
        final PopupEditText b1 = this.b1;
        String string;
        if (b1 == null) {
            string = "";
        }
        else {
            string = ((AppCompatEditText)b1).getText().toString();
        }
        this.o(string);
    }
    
    public final void n() {
        if (this.a1.get() != null) {
            final d9p d9p = (d9p)this.a1.get();
            d9p.j = false;
            d9p.a.c(((n9q)d9p.d.d).G((fk6)jj4.K0, (fk6)jvb.e));
        }
    }
    
    public final void o(final String s) {
        if (this.j1 != null && s.isEmpty() && !this.j1.j) {
            this.n();
            return;
        }
        if (this.j1 != null && !s.isEmpty() && !this.j1.i) {
            return;
        }
        this.r(this.b1);
        this.J0.a.onNext((Object)s);
    }
    
    public final boolean onEditorAction(final TextView textView, int n, final KeyEvent keyEvent) {
        if (((View)textView).getId() == 2131430838 && (n == 3 || (keyEvent != null && 66 == keyEvent.getKeyCode() && 1 == keyEvent.getAction()))) {
            final PopupEditText b1 = this.b1;
            pf8.r(b1);
            final PopupEditText popupEditText = b1;
            final String trim = ((AppCompatEditText)b1).getText().toString().trim();
            if (pjr.g((CharSequence)trim) && !"#".equals(trim)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final d8p j1 = this.j1;
                String i = trim;
                if (j1 != null) {
                    i = trim;
                    if (pjr.g((CharSequence)j1.k)) {
                        i = hi.I(new StringBuilder(this.j1.k), " ", trim);
                    }
                }
                final d8p j2 = this.j1;
                String l;
                if (j2 != null && pjr.g((CharSequence)j2.l)) {
                    l = this.j1.l;
                }
                else {
                    l = "typed_query";
                }
                if (this.n1) {
                    if (this.m1 == 1) {
                        n = 2;
                    }
                    else {
                        n = 0;
                    }
                }
                else {
                    n = -1;
                }
                final d8p j3 = this.j1;
                long o;
                if (j3 != null) {
                    o = j3.o;
                }
                else {
                    o = 0L;
                }
                tbx.w((Context)this.H0, (View)this.b1, false, (ResultReceiver)null);
                final d8p j4 = this.j1;
                String m;
                if (j4 != null) {
                    m = j4.m;
                }
                else {
                    m = null;
                }
                Map<String, String> map = null;
                Label_0285: {
                    if (j4 != null) {
                        map = j4.n;
                        if (map != null) {
                            break Label_0285;
                        }
                    }
                    map = Collections.emptyMap();
                }
                ((k8p)this.U0.get()).b(this.f1, this.b1, this.G0, this.h1, this.Z0, i, n, l, o, m, map);
                return true;
            }
        }
        return false;
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void p(final String s) {
        final d8p j1 = this.j1;
        if (j1 != null && !j1.i) {
            return;
        }
        this.P0.b(s, this.m1, (lhv$a)this.Q0);
    }
    
    public final void q(final CharSequence text, final boolean b) {
        final PopupEditText b2 = this.b1;
        if (b2 != null) {
            ((TextView)b2).setText(text);
            this.f4(text);
            if (b && text != null) {
                ((EditText)this.b1).setSelection(text.length());
            }
        }
    }
    
    public final void r(final PopupEditText popupEditText) {
        final d8p j1 = this.j1;
        if (j1 != null && !j1.i && !j1.j) {
            return;
        }
        final d9p d9p = (d9p)this.a1.get();
        final MenuItem f1 = this.f1;
        if (f1 != null) {
            if (f1.isActionViewExpanded() && d9p != null) {
                d9p.a();
            }
            else if (this.f1.isActionViewExpanded()) {
                popupEditText.k();
            }
        }
        else if (d9p != null) {
            d9p.a();
        }
    }
    
    public final void t1(int n) {
        final int h = this.K0.h(n);
        final l8p l8p = (l8p)this.K0.getItem(n);
        if (l8p == null) {
            e9a.d((Throwable)new NullPointerException("SearchSuggestionListItem is null"));
            return;
        }
        if (this.h1 != null) {
            if (this.n1) {
                if (this.m1 == 1) {
                    n = 2;
                }
                else {
                    n = 0;
                }
            }
            else {
                n = -1;
            }
            final d8p j1 = this.j1;
            String m;
            if (j1 != null) {
                m = j1.m;
            }
            else {
                m = null;
            }
            Map<String, String> map = null;
            Label_0122: {
                if (j1 != null) {
                    map = j1.n;
                    if (map != null) {
                        break Label_0122;
                    }
                }
                map = Collections.emptyMap();
            }
            this.h1.c(l8p, h, n, this.d1, this.Z0, m, map);
            ((k8p)this.U0.get()).e();
        }
        this.d1 = l8p.b;
    }
    
    public final class c implements View$OnClickListener
    {
        public final void onClick(final View view) {
            final xil$b xil$b = new xil$b(3);
            ((xil$a)xil$b).H(2131956919);
            ((xil$a)xil$b).A(2131956920);
            ((xil$a)xil$b).F(2131952459);
            ((xil$a)xil$b).C(2131952375);
            final cl1 w = ((dl1$a)xil$b).w();
            final g8p c0 = g8p.this;
            w.T1 = c0.new f(null);
            final int a = w4j.a;
            w.e2((p)c0.C0, "TAG_CLEAR_RECENT_SEARCH_DIALOG");
        }
    }
    
    public final class d
    {
        public final boolean a(final l8p l8p) {
            if (l8p.a == l8p$a.G0) {
                final String f = l8p.f;
                String s;
                if (!pjr.e((CharSequence)f)) {
                    s = ((Context)g8p.this.H0).getString(2131956916, new Object[] { f });
                }
                else {
                    s = ((Context)g8p.this.H0).getString(2131956917);
                }
                g8p.this.i1 = l8p.c;
                int n;
                if (l8p.g != null) {
                    n = 2;
                }
                else if (l8p.h != null) {
                    n = 4;
                }
                else {
                    n = 1;
                }
                final xil$b xil$b = new xil$b(n);
                ((xil$a)xil$b).B((CharSequence)s);
                ((xil$a)xil$b).F(2131952459);
                ((xil$a)xil$b).C(2131952375);
                final cl1 w = ((dl1$a)xil$b).w();
                final g8p a = g8p.this;
                w.T1 = a.new f(a.i1);
                final int a2 = w4j.a;
                w.e2((p)a.C0, "TAG_CLEAR_RECENT_SEARCH_DIALOG");
                return true;
            }
            return false;
        }
    }
    
    public static final class e
    {
        public final Map<String, HashSet<String>> a;
        
        public e() {
            this.a = new HashMap();
        }
    }
    
    public final class f implements mw8
    {
        public String C0;
        
        public f(final String c0) {
            this.C0 = c0;
        }
        
        @Override
        public final void l0(final Dialog dialog, final int n, final int n2) {
            if (n2 != -1) {
                return;
            }
            final hn6 hn6 = new hn6(((Context)g8p.this.H0).getContentResolver());
            if (n == 1 && this.C0 != null) {
                xw0.c((rj)new l6p((Object)this, (Object)hn6, 8));
            }
            if (n == 2 && this.C0 != null) {
                xw0.c((rj)new uys((Object)this, (Object)hn6, 9));
            }
            if (n == 4 && this.C0 != null) {
                xw0.c((rj)new epa(this, hn6, 8));
            }
            if (n == 3) {
                xw0.c((rj)new xg((Object)this, (Object)hn6, 8));
            }
        }
    }
    
    public final class g implements View$OnClickListener
    {
        public final void onClick(final View view) {
            final int id = view.getId();
            if (id == 2131430838) {
                final PopupEditText popupEditText = (PopupEditText)view;
                tbx.w((Context)g8p.this.H0, (View)popupEditText, true, (ResultReceiver)null);
                g8p.this.r(popupEditText);
            }
            else if (id == 2131431903) {
                final StringBuilder sb = new StringBuilder();
                sb.append(view.getTag());
                sb.append(" ");
                g8p.this.q(sb.toString(), true);
            }
        }
    }
    
    public final class h implements sgj<View, lev>
    {
        public final void g(final View view, final Object o, final int n) {
            final lev lev = (lev)o;
            if (lev != null) {
                final g8p c0 = g8p.this;
                final String d1 = c0.d1;
                final e e1 = c0.e1;
                pf8.r(e1);
                final String b = lev.b;
                final HashSet set = e1.a.get(b);
                boolean add;
                if (set != null) {
                    add = set.add(d1);
                }
                else {
                    final HashSet set2 = new HashSet();
                    set2.add(d1);
                    e1.a.put(b, set2);
                    add = true;
                }
                if (add) {
                    lev.w = d1;
                    lev.f = n + 1;
                    g8p.this.F0.add(lev);
                }
            }
        }
    }
}
