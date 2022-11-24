import android.widget.TextView;
import android.widget.ImageView;
import com.twitter.dm.ui.DMAvatar;
import com.twitter.dm.ui.HighlightedConstraintLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Iterator;
import android.view.View;
import com.twitter.dm.widget.DMSafeEmojiTextView;
import android.view.View$OnLongClickListener;
import android.text.SpannedString;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import java.util.List;
import android.view.View$OnClickListener;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ijd extends b4e<iq7$a, b>
{
    public static final ijd.ijd$a Companion;
    public final Context d;
    public final wp7 e;
    public final okq f;
    public final Resources g;
    public final gra<tp7, String> h;
    public final Map<String, kg6> i;
    public final int j;
    public final int k;
    public final dxg l;
    public final hqj m;
    
    static {
        Companion = new ijd.ijd$a();
    }
    
    public ijd(final Context d, final UserIdentifier userIdentifier, final wp7 e, final okq f) {
        super((Class)iq7$a.class);
        this.d = d;
        this.e = e;
        this.f = f;
        final Resources resources = d.getResources();
        this.g = resources;
        this.i = lr0.c().a();
        this.j = resources.getDimensionPixelSize(2131165932);
        final float dimension = d.getResources().getDimension(2131165931);
        this.k = resources.getDimensionPixelSize(2131165949);
        final dxg e2 = dxg.e();
        e0e.e((Object)e2, "get()");
        this.l = e2;
        this.m = new hqj(dimension, b1b.B(d, 2130969036));
        this.h = new vu6(d, userIdentifier);
        q40.c(d);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final b b = (b)n8x;
        final iq7$a iq7$a = (iq7$a)o;
        e0e.f((Object)b, "viewHolder");
        e0e.f((Object)iq7$a, "conversation");
        final tp7 a = iq7$a.a;
        ((View)b.H0).setOnClickListener((View$OnClickListener)new zgk((Object)a, (Object)this, 4));
        b.H0.setConversation(a);
        b.J0.setText((CharSequence)this.h.a((Object)a));
        final String c = a.c;
        int visibility;
        if (c == null) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)b.L0).setVisibility(visibility);
        b.L0.setText((CharSequence)c);
        b.G0.setHighlighted(a.e);
        final DMSafeEmojiTextView m0 = b.M0;
        final SpannedString spannedString = null;
        m0.a();
        final DMSafeEmojiTextView m2 = b.M0;
        final djd$a djd$a = new djd$a();
        djd$a.a = a;
        djd$a.b = this.g;
        djd$a.c = this.i;
        m2.setText(((djd)((z4j)djd$a).e()).b());
        final View k0 = b.K0;
        int visibility2;
        if (d58.i(a.g, a.h)) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        k0.setVisibility(visibility2);
        ((View)b.I0).setOnClickListener((View$OnClickListener)new z1h(this, a, iq7$a.c));
        final List u = a.u;
        final ArrayList j = lf.J(u, "inboxItem.conversationSocialProof");
        for (final Object next : u) {
            if (next instanceof ru6) {
                j.add(next);
            }
        }
        final ru6 ru6 = (ru6)rr4.E1((List)j);
        final mr6 v = a.v;
        String a2;
        if (v != null) {
            a2 = v.a;
        }
        else {
            a2 = null;
        }
        if (a2 != null && lmi.w()) {
            final Icon f0 = v.b.F0;
            Drawable mutate = null;
            Label_0452: {
                if (!e0e.a((Object)f0, (Object)jpc.a)) {
                    final Drawable f2 = d4j.F(this.d, f0.getDrawableRes());
                    if (f2 != null) {
                        mutate = f2.mutate();
                        if (mutate != null) {
                            mutate.setTint(qo6.b(this.d, 2131099960));
                            final int i = this.k;
                            mutate.setBounds(0, 0, i, i);
                            break Label_0452;
                        }
                    }
                }
                mutate = null;
            }
            b.N0.setText((CharSequence)a2);
            b.N0.setCompoundDrawables(mutate, (Drawable)null, (Drawable)null, (Drawable)null);
            ((View)b.N0).setVisibility(0);
        }
        else {
            Object o2;
            if (ru6 == null || (o2 = ru6.e) == null) {
                o2 = h3a.F0;
            }
            int n;
            if (ru6 != null) {
                n = ru6.c - 2;
            }
            else {
                n = 0;
            }
            final okq f3 = this.f;
            final ArrayList<String> list = new ArrayList<String>();
            final Iterator iterator2 = ((Iterable)o2).iterator();
            while (iterator2.hasNext()) {
                final String c2 = ((qgv)iterator2.next()).c();
                if (c2 != null) {
                    list.add(c2);
                }
            }
            final String a3 = f3.a(list, n);
            if (a3 == null) {
                ((View)b.N0).setVisibility(8);
            }
            else {
                b.N0.setText((CharSequence)new SpannedString((CharSequence)a3));
            }
            final List c3 = shw.C0(glp.K0(glp.B0(glp.I0(glp.C0(rr4.s1((Iterable)o2), (stb)njd.F0), 3), (stb)new ojd(this))));
            final dxg l = this.l;
            e0e.f((Object)l, "mediaManager");
            b.N0.setCompoundDrawables((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
            if (!c3.isEmpty()) {
                final CharSequence text = b.N0.getText();
                SpannedString spannedString2 = spannedString;
                if (text instanceof SpannedString) {
                    spannedString2 = (SpannedString)text;
                }
                if (spannedString2 != null) {
                    kcm.i((sj)new jjd(t5j.fromIterable((Iterable)c3).subscribeOn(jxo.c()).flatMap((rtb)new ula((stb)new kjd(l), 4)).toList().w((rtb)new zj4((stb)new ljd(b, spannedString2), 6)).y(iqs.j()).G((rk6)new zna((stb)new mjd(b), 9), (rk6)lvb.e), 0));
                }
            }
        }
        hdx.v(b.F0, (View$OnLongClickListener)new hjd(this, a, iq7$a));
        b.F0.setOnClickListener((View$OnClickListener)new ajp((Object)this, (Object)iq7$a, 1));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624320, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026_row_view, parent, false)");
        return (n8x)new b(inflate);
    }
    
    public static final class b extends sl8
    {
        public final HighlightedConstraintLayout G0;
        public final DMAvatar H0;
        public final ImageView I0;
        public final TextView J0;
        public final View K0;
        public final TextView L0;
        public final DMSafeEmojiTextView M0;
        public final TextView N0;
        public final int O0;
        public final int P0;
        
        public b(final View view) {
            super(view);
            this.G0 = (HighlightedConstraintLayout)view;
            final View viewById = view.findViewById(2131428729);
            e0e.e((Object)viewById, "itemView.findViewById(co\u2026r.android.R.id.dm_avatar)");
            this.H0 = (DMAvatar)viewById;
            final View viewById2 = view.findViewById(2131429464);
            e0e.e((Object)viewById2, "itemView.findViewById(co\u2026h_quality_inbox_x_button)");
            this.I0 = (ImageView)viewById2;
            final View viewById3 = view.findViewById(2131430191);
            e0e.e((Object)viewById3, "itemView.findViewById(com.twitter.dm.R.id.name)");
            this.J0 = (TextView)viewById3;
            final View viewById4 = view.findViewById(2131428740);
            e0e.e((Object)viewById4, "itemView.findViewById(co\u2026d.dm_inbox_verified_icon)");
            this.K0 = viewById4;
            final View viewById5 = view.findViewById(2131432514);
            e0e.e((Object)viewById5, "itemView.findViewById(R.id.username)");
            this.L0 = (TextView)viewById5;
            final View viewById6 = view.findViewById(2131430678);
            e0e.e((Object)viewById6, "itemView.findViewById(com.twitter.dm.R.id.preview)");
            this.M0 = (DMSafeEmojiTextView)viewById6;
            final View viewById7 = view.findViewById(2131428457);
            e0e.e((Object)viewById7, "itemView.findViewById(co\u2026.dm.R.id.contextual_text)");
            this.N0 = (TextView)viewById7;
            this.O0 = view.getResources().getDimensionPixelSize(2131165932);
            this.P0 = view.getResources().getDimensionPixelSize(2131167439);
        }
    }
}
