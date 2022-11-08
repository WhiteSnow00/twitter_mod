import android.widget.BaseAdapter;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.KeyEvent;
import android.widget.TextView;
import java.util.Collection;
import android.text.Editable;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.ui.widget.PopupEditText;
import java.util.List;
import com.twitter.model.json.onboarding.ocf.subtasks.input.JsonFetchTopicsRequestInput;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import com.twitter.ui.widget.PopupEditText$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwd implements PopupEditText$c, TextWatcher, TextView$OnEditorActionListener, lhv$a
{
    public final Context C0;
    public final UserIdentifier D0;
    public final lhv E0;
    public final fbs F0;
    public final daq<JsonFetchTopicsRequestInput, vrm<exa, pav>> G0;
    public final rd6 H0;
    public c I0;
    public seg<String, List<ln3>> J0;
    public a K0;
    public PopupEditText L0;
    public boolean M0;
    public boolean N0;
    
    public cwd(final Context c0, final UserIdentifier d0, final lhv e0, final fbs f0, final lsr lsr, final daq<JsonFetchTopicsRequestInput, vrm<exa, pav>> g0) {
        this.K0 = (a)new b();
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = new rd6();
        final int a = w4j.a;
        this.N0 = ((fwd)lsr).o.equals("topics_fetch");
    }
    
    public final void a(final ffv ffv, final String s) {
        if (!ffv.a()) {
            final List b = ffv.b;
            final ArrayList list = new ArrayList();
            for (final efv efv : b) {
                final mev e = efv.e;
                if (e != null) {
                    String s2;
                    if (e.a.startsWith("#")) {
                        s2 = efv.e.a.substring(1);
                    }
                    else {
                        s2 = efv.e.a;
                    }
                    final mev e2 = efv.e;
                    final ln3 ln3 = new ln3(s2, e2.b, e2.l);
                    if (list.contains(ln3)) {
                        continue;
                    }
                    list.add(ln3);
                }
            }
            this.J0.d((Object)s, (Object)list);
            if (s.equals(this.b())) {
                this.c(list);
            }
        }
    }
    
    public final void afterTextChanged(final Editable editable) {
        this.d(editable.toString());
    }
    
    public final String b() {
        final PopupEditText l0 = this.L0;
        if (l0 != null) {
            return ((AppCompatEditText)l0).getText().toString();
        }
        return null;
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void c(final List<ln3> list) {
        final c i0 = this.I0;
        i0.setNotifyOnChange(false);
        i0.clear();
        i0.addAll((Collection)list);
        if (!((BaseAdapter)i0).isEmpty()) {
            final PopupEditText l0 = this.L0;
            if (!l0.x1) {
                l0.k();
            }
        }
        ((BaseAdapter)i0).notifyDataSetChanged();
    }
    
    public final void d(final String s) {
        final List list = (List)this.J0.c((Object)s);
        if (list != null) {
            this.c(list);
        }
        else if (pjr.g((CharSequence)s)) {
            if (this.N0) {
                final rd6 h0 = this.H0;
                final daq<JsonFetchTopicsRequestInput, vrm<exa, pav>> g0 = this.G0;
                final JsonFetchTopicsRequestInput jsonFetchTopicsRequestInput = new JsonFetchTopicsRequestInput();
                final fbs f0 = this.F0;
                jsonFetchTopicsRequestInput.a = f0.b;
                jsonFetchTopicsRequestInput.b = f0.a.a;
                jsonFetchTopicsRequestInput.d = s;
                jsonFetchTopicsRequestInput.e = false;
                h0.a(g0.S((Object)jsonFetchTopicsRequestInput).G((fk6)new nlp((Object)this, (Object)s, 4), (fk6)jvb.e));
            }
            else {
                this.E0.b(s, 3, (lhv$a)this);
            }
            if (!this.M0) {
                final zf4 zf4 = new zf4(this.D0);
                zf4.q(new String[] { null, "interest_picker", "search", "", "enter" });
                zf4.c = s;
                final int a = w4j.a;
                saw.b((okm)zf4);
                this.M0 = true;
            }
        }
        else {
            final ced$b d0 = ced.D0;
            final int a2 = w4j.a;
            this.c((List<ln3>)d0);
        }
    }
    
    public final void f4(final CharSequence charSequence) {
        final String b = this.b();
        if (((View)this.L0).hasFocus() && b != null) {
            this.d(b);
        }
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (textView == this.L0 && (n == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66))) {
            final String trim = this.b().trim();
            ((TextView)this.L0).setText((CharSequence)"");
            if (pjr.g((CharSequence)trim)) {
                this.K0.b(trim);
                return true;
            }
        }
        return false;
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void t1(final int n) {
        final ln3 ln3 = (ln3)this.I0.getItem(n);
        ((TextView)this.L0).setText((CharSequence)"");
        final a k0 = this.K0;
        pf8.r(ln3);
        final ln3 ln4 = ln3;
        k0.a(ln3);
    }
    
    public interface a
    {
        void a(final ln3 p0);
        
        void b(final String p0);
    }
    
    public static final class b implements a
    {
        @Override
        public final void a(final ln3 ln3) {
        }
        
        @Override
        public final void b(final String s) {
        }
    }
    
    public static final class c extends ArrayAdapter<ln3>
    {
        public c(final Context context) {
            super(context, 2131625742);
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            View b = view;
            if (view == null) {
                b = w30.B(viewGroup, 2131625742, viewGroup, false);
            }
            final TextView textView = (TextView)b.findViewById(2131432073);
            final ln3 ln3 = (ln3)this.getItem(n);
            pf8.r(ln3);
            final ln3 ln4 = ln3;
            textView.setText((CharSequence)ln3.C0);
            b.findViewById(2131431903).setVisibility(8);
            return b;
        }
    }
}
