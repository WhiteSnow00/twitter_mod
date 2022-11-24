import android.widget.TextView;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.content.Context;
import android.widget.EditText;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import android.view.View$AccessibilityDelegate;
import android.text.SpannableStringBuilder;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class een extends pue implements stb<oen, vzv>
{
    public final zdn F0;
    
    public een(final zdn f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oen oen = (oen)o;
        e0e.f((Object)oen, "$this$distinct");
        final int size = oen.f.size();
        final vjo a = vjo.a;
        Label_0579: {
            if (ita.b().b("android_audio_spaces_enable_dm_invites_search_chips", false) && oen.b == xpn.G0) {
                final k49 h0 = this.F0.H0;
                final Set f = oen.f;
                Objects.requireNonNull(h0);
                e0e.f((Object)f, "inviteSet");
                final ArrayList list = new ArrayList(h0.d);
                final k49.b companion = k49.Companion;
                final List<kpn> d = h0.d;
                Objects.requireNonNull(companion);
                final ArrayList list2 = new ArrayList();
                for (final kpn next : d) {
                    if (f.contains(next)) {
                        list2.add(next);
                    }
                }
                final ArrayList<kpn> list3 = new ArrayList<kpn>();
                for (final Object next2 : f) {
                    if (!list2.contains(next2)) {
                        list3.add((kpn)next2);
                    }
                }
                h0.d = rr4.T1((Collection)list2, (Iterable)list3);
                if (list.size() == h0.d.size()) {
                    final ArrayList list4 = (ArrayList)rr4.q2((Iterable)list, (Iterable)h0.d);
                    boolean b = false;
                    Label_0348: {
                        if (!list4.isEmpty()) {
                            for (final awj awj : list4) {
                                if (e0e.a((Object)awj.F0, (Object)awj.G0) ^ true) {
                                    b = true;
                                    break Label_0348;
                                }
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        break Label_0579;
                    }
                }
                final SpannableStringBuilder text = new SpannableStringBuilder();
                for (final kpn kpn : h0.d) {
                    final EditText a2 = h0.a;
                    if (a2 == null) {
                        e0e.m("editText");
                        throw null;
                    }
                    final Context context = ((View)a2).getContext();
                    e0e.e((Object)context, "editText.context");
                    text.append((CharSequence)"\u200b", (Object)new k49.c(context, kpn), 33);
                }
                text.append((CharSequence)h0.c());
                h0.e.F0 = true;
                final EditText a3 = h0.a;
                if (a3 == null) {
                    e0e.m("editText");
                    throw null;
                }
                ((TextView)a3).setText((CharSequence)text);
                final k49.b companion2 = k49.Companion;
                final EditText a4 = h0.a;
                if (a4 == null) {
                    e0e.m("editText");
                    throw null;
                }
                Objects.requireNonNull(companion2);
                a4.setSelection(((CharSequence)a4.getText()).length());
                final EditText a5 = h0.a;
                if (a5 == null) {
                    e0e.m("editText");
                    throw null;
                }
                ((View)a5).setAccessibilityDelegate((View$AccessibilityDelegate)new l49(h0));
            }
        }
        if (oen.b == xpn.I0) {
            final TypefacesTextView s0 = this.F0.S0;
            final Integer d2 = oen.d;
            String text2 = null;
            Label_0711: {
                if (d2 != null) {
                    if (size == d2) {
                        text2 = this.F0.F0.getResources().getQuantityString(2131820590, (int)oen.d, new Object[] { oen.d });
                        break Label_0711;
                    }
                }
                final Integer d3 = oen.d;
                int n;
                if (d3 == null || (n = d3 - size) < 0) {
                    n = 0;
                }
                text2 = this.F0.F0.getResources().getQuantityString(2131820591, n, new Object[] { n });
            }
            ((TextView)s0).setText((CharSequence)text2);
        }
        return vzv.a;
    }
}
