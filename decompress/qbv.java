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

public final class qbv implements bhb
{
    public final LayoutInflater a;
    public final adw b;
    public final u5k c;
    public final y5k d;
    public final m8d e;
    public final cdl f;
    public final qkq g;
    public PsUser h;
    public adl i;
    public fdl j;
    public final qbv$a k;
    
    public qbv(final LayoutInflater a, final adw b, final u5k c, final y5k d, final m8d e, final cdl f, final qkq g) {
        this.k = new hm(this) {
            public final qbv b;
            
            public final /* bridge */ void a(final RecyclerView$c0 recyclerView$c0, final Object o, final int n) {
                this.b((im)recyclerView$c0, (pj)o, n);
            }
            
            public final void b(final im im, final pj pj, final int n) {
                super.b(im, pj, n);
                final ActionSheetItem x0 = im.X0;
                if (this.b.h == null) {
                    ((RecyclerView$c0)im).D0.setVisibility(8);
                    return;
                }
                ((RecyclerView$c0)im).D0.setVisibility(0);
                final qbv b = this.b;
                final PsUser h = b.h;
                final m8d e = b.e;
                x0.E0.setVisibility(0);
                x0.D0.setVisibility(8);
                xa8.n(((View)x0.E0).getContext(), e, x0.E0, h.getProfileUrlSmall(), h.displayName, 0L);
                x0.b((CharSequence)this.b.h.displayName, 0);
                x0.setUsernameVisibility(0);
                final PsUser h2 = this.b.h;
                final String username = h2.username;
                final PsUser$VipBadge fromString = PsUser$VipBadge.fromString(h2.vipBadge);
                x0.I0.setUsername(username);
                if (fromString != null) {
                    x0.I0.setVipStatus(fromString);
                }
                else {
                    x0.I0.setVipStatus(PsUser$VipBadge.NONE);
                }
                x0.I0.setTextColor(((View)x0).getResources().getColor(2131100692));
                x0.setSecondaryIconVisibility(8);
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
        if (recyclerView$c0 instanceof im) {
            this.k.b((im)recyclerView$c0, (pj)this, 0);
        }
        else {
            final adl i = this.i;
            if (i != null) {
                final b b = (b)recyclerView$c0;
                final TextView y0 = b.Y0;
                final String c = i.a.c();
                final String s = "";
                String text;
                if ((text = c) == null) {
                    text = "";
                }
                y0.setText((CharSequence)text);
                final TextView z0 = b.Z0;
                final Resources b2 = b.b1;
                String k0;
                if ((k0 = this.i.a.K0) == null) {
                    k0 = "";
                }
                z0.setText((CharSequence)b2.getString(2131952064, new Object[] { k0 }));
                final UserImageView x0 = b.X0;
                String e0 = this.i.a.E0;
                if (e0 == null) {
                    e0 = s;
                }
                x0.L(e0);
                b.D0.setOnClickListener((View$OnClickListener)new krf((Object)this, 26));
                if (b.c1 == null) {
                    final Context context = b.D0.getContext();
                    final cgv a = this.i.a;
                    final ArrayList<aib> list = new ArrayList<aib>(2);
                    final aib d = aib.d(context, uoz.w(this.a, b.a1, 2131625665), this.g);
                    list.add(d);
                    final k0g d2 = k0g.d(context, wa2.m(this.a, b.a1, 2131625666), a, this.b, this.g);
                    list.add((aib)d2);
                    d.d = (aib.a)new pbv(this, d2, a, b);
                    d2.d = (k0g.a)new rrx((Object)this, 26);
                    final Iterator<aib> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        b.a1.addView(((nyp)iterator.next()).getActionView());
                    }
                    final zcl c2 = new zcl((List)list, this.b);
                    b.c1 = (lyp<adl>)c2;
                    b.d1 = new mt6((lyp)c2, this.i);
                }
                b.c1.c0((oyp)this.i);
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
        ((zo1)this.f).w(new hcw(h.id, h.username));
        return false;
    }
    
    public final int f() {
        return 0;
    }
    
    public final int g() {
        return 0;
    }
    
    public final hm i() {
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
            this.f.V0.add(new WeakReference(b));
            return b;
        }
        return (RecyclerView$c0)new im(this.a.inflate(2131625263, viewGroup, false));
    }
    
    public static final class b extends RecyclerView$c0 implements fdl
    {
        public final UserImageView X0;
        public final TextView Y0;
        public final TextView Z0;
        public final ViewGroup a1;
        public final Resources b1;
        public lyp<adl> c1;
        public mt6 d1;
        
        public b(final View view) {
            super(view);
            this.X0 = (UserImageView)view.findViewById(2131432470);
            this.Y0 = (TextView)view.findViewById(2131432513);
            this.Z0 = (TextView)view.findViewById(2131428639);
            this.a1 = (ViewGroup)view.findViewById(2131429232);
            this.b1 = view.getResources();
        }
        
        public final void n(final boolean b, final boolean b2) {
            final mt6 d1 = this.d1;
            if (d1 != null) {
                final lyp lyp = (lyp)((WeakReference)d1.D0).get();
                if (lyp != null) {
                    lyp.c0((oyp)d1.E0);
                }
            }
        }
    }
}
