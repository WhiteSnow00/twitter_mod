import android.view.View;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import java.util.Iterator;
import android.content.Context;
import com.twitter.media.ui.image.UserImageView;
import android.content.res.Resources;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import tv.periscope.android.view.ActionSheetItem;
import tv.periscope.android.api.PsUser$VipBadge;
import androidx.recyclerview.widget.RecyclerView$c0;
import tv.periscope.android.api.PsUser;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fcv implements cib
{
    public final LayoutInflater a;
    public final qdw b;
    public final h6k c;
    public final l6k d;
    public final n9d e;
    public final qdl f;
    public final nlq g;
    public PsUser h;
    public odl i;
    public tdl j;
    public final fcv$a k;
    
    public fcv(final LayoutInflater a, final qdw b, final h6k c, final l6k d, final n9d e, final qdl f, final nlq g) {
        this.k = new km(this) {
            public final fcv b;
            
            public final /* bridge */ void a(final RecyclerView$c0 recyclerView$c0, final Object o, final int n) {
                this.b((lm)recyclerView$c0, (tj)o, n);
            }
            
            public final void b(final lm lm, final tj tj, final int n) {
                super.b(lm, tj, n);
                final ActionSheetItem z0 = lm.Z0;
                if (this.b.h == null) {
                    ((RecyclerView$c0)lm).F0.setVisibility(8);
                    return;
                }
                ((RecyclerView$c0)lm).F0.setVisibility(0);
                final fcv b = this.b;
                final PsUser h = b.h;
                final n9d e = b.e;
                z0.G0.setVisibility(0);
                z0.F0.setVisibility(8);
                lp7.f0(((View)z0.G0).getContext(), e, z0.G0, h.getProfileUrlSmall(), h.displayName, 0L);
                z0.b((CharSequence)this.b.h.displayName, 0);
                z0.setUsernameVisibility(0);
                final PsUser h2 = this.b.h;
                final String username = h2.username;
                final PsUser$VipBadge fromString = PsUser$VipBadge.fromString(h2.vipBadge);
                z0.K0.setUsername(username);
                if (fromString != null) {
                    z0.K0.setVipStatus(fromString);
                }
                else {
                    z0.K0.setVipStatus(PsUser$VipBadge.NONE);
                }
                z0.K0.setTextColor(((View)z0).getResources().getColor(2131100692));
                z0.setSecondaryIconVisibility(8);
            }
        };
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final RecyclerView$c0 recyclerView$c0) {
        if (recyclerView$c0 instanceof lm) {
            this.k.b((lm)recyclerView$c0, (tj)this, 0);
        }
        else {
            final odl i = this.i;
            if (i != null) {
                final b b = (b)recyclerView$c0;
                final TextView a1 = b.a1;
                final String c = i.a.c();
                final String s = "";
                String text;
                if ((text = c) == null) {
                    text = "";
                }
                a1.setText((CharSequence)text);
                final TextView b2 = b.b1;
                final Resources d1 = b.d1;
                String m0;
                if ((m0 = this.i.a.M0) == null) {
                    m0 = "";
                }
                b2.setText((CharSequence)d1.getString(2131952064, new Object[] { m0 }));
                final UserImageView z0 = b.Z0;
                String g0 = this.i.a.G0;
                if (g0 == null) {
                    g0 = s;
                }
                z0.L(g0);
                b.F0.setOnClickListener((View$OnClickListener)new cqf((Object)this, 29));
                if (b.e1 == null) {
                    final Context context = b.F0.getContext();
                    final qgv a2 = this.i.a;
                    final ArrayList<bjb> list = new ArrayList<bjb>(2);
                    final bjb d2 = bjb.d(context, xd.f0(this.a, b.c1, 2131625665), this.g);
                    list.add(d2);
                    final i1g d3 = i1g.d(context, tpz.w(this.a, b.c1, 2131625666), a2, this.b, this.g);
                    list.add((bjb)d3);
                    d2.d = (bjb$a)new ecv(this, d3, a2, b);
                    d3.d = (i1g$a)new zga((Object)this, 3);
                    final Iterator<bjb> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        b.c1.addView(((kzp)iterator.next()).getActionView());
                    }
                    final ndl e1 = new ndl((List)list, this.b);
                    b.e1 = (izp<odl>)e1;
                    b.f1 = new su6((izp)e1, this.i);
                }
                b.e1.c0((lzp)this.i);
            }
        }
    }
    
    public final boolean b() {
        return false;
    }
    
    public final int c() {
        return 0;
    }
    
    public final String d(final Context context) {
        return null;
    }
    
    public final boolean execute() {
        final PsUser h = this.h;
        if (h == null) {
            return false;
        }
        ((fp1)this.f).w(new xcw(h.id, h.username));
        return false;
    }
    
    public final int f() {
        return 0;
    }
    
    public final int g() {
        return 0;
    }
    
    public final km i() {
        return null;
    }
    
    public final int j() {
        return 2131100686;
    }
    
    public final void l(final PsUser h) {
        this.h = h;
    }
    
    public final String m(final Context context) {
        return null;
    }
    
    public final RecyclerView$c0 n(final ViewGroup viewGroup) {
        if (this.i != null) {
            final b b = new b(this.a.inflate(2131625135, viewGroup, false));
            this.f.X0.add(new WeakReference(b));
            return b;
        }
        return (RecyclerView$c0)new lm(this.a.inflate(2131625263, viewGroup, false));
    }
    
    public static final class b extends RecyclerView$c0 implements tdl
    {
        public final UserImageView Z0;
        public final TextView a1;
        public final TextView b1;
        public final ViewGroup c1;
        public final Resources d1;
        public izp<odl> e1;
        public su6 f1;
        
        public b(final View view) {
            super(view);
            this.Z0 = (UserImageView)view.findViewById(2131432471);
            this.a1 = (TextView)view.findViewById(2131432514);
            this.b1 = (TextView)view.findViewById(2131428639);
            this.c1 = (ViewGroup)view.findViewById(2131429232);
            this.d1 = view.getResources();
        }
        
        public final void m(final boolean b, final boolean b2) {
            final su6 f1 = this.f1;
            if (f1 != null) {
                final izp izp = (izp)((WeakReference)f1.F0).get();
                if (izp != null) {
                    izp.c0((lzp)f1.G0);
                }
            }
        }
    }
}
