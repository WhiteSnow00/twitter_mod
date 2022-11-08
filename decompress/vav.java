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

public final class vav implements eib
{
    public final LayoutInflater a;
    public final ocw b;
    public final n5k c;
    public final r5k d;
    public final i9d e;
    public final qcl f;
    public PsUser g;
    public ocl h;
    public tcl i;
    public final vav$a j;
    
    public vav(final LayoutInflater a, final ocw b, final n5k c, final r5k d, final i9d e, final qcl f) {
        this.j = new jm() {
            public final void b(final km km, final sj sj, final int n) {
                super.b(km, sj, n);
                final ActionSheetItem w0 = km.W0;
                if (vav.this.g == null) {
                    ((RecyclerView$c0)km).C0.setVisibility(8);
                    return;
                }
                ((RecyclerView$c0)km).C0.setVisibility(0);
                final vav b = vav.this;
                final PsUser g = b.g;
                final i9d e = b.e;
                w0.D0.setVisibility(0);
                w0.C0.setVisibility(8);
                dcs.D(((View)w0.D0).getContext(), e, w0.D0, g.getProfileUrlSmall(), g.displayName, 0L);
                w0.b((CharSequence)vav.this.g.displayName, 0);
                w0.setUsernameVisibility(0);
                final PsUser g2 = vav.this.g;
                final String username = g2.username;
                final PsUser$VipBadge fromString = PsUser$VipBadge.fromString(g2.vipBadge);
                w0.H0.setUsername(username);
                if (fromString != null) {
                    w0.H0.setVipStatus(fromString);
                }
                else {
                    w0.H0.setVipStatus(PsUser$VipBadge.NONE);
                }
                w0.H0.setTextColor(((View)w0).getResources().getColor(2131100692));
                w0.setSecondaryIconVisibility(8);
            }
        };
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final RecyclerView$c0 recyclerView$c0) {
        if (recyclerView$c0 instanceof km) {
            this.j.b((km)recyclerView$c0, (sj)this, 0);
        }
        else {
            final ocl h = this.h;
            if (h != null) {
                final vav.vav$b vav$b = (vav.vav$b)recyclerView$c0;
                final TextView x0 = vav$b.X0;
                final String c = h.a.c();
                final String s = "";
                String text;
                if ((text = c) == null) {
                    text = "";
                }
                x0.setText((CharSequence)text);
                final TextView y0 = vav$b.Y0;
                final Resources a1 = vav$b.a1;
                String j0;
                if ((j0 = this.h.a.J0) == null) {
                    j0 = "";
                }
                y0.setText((CharSequence)a1.getString(2131952064, new Object[] { j0 }));
                final UserImageView w0 = vav$b.W0;
                String d0 = this.h.a.D0;
                if (d0 == null) {
                    d0 = s;
                }
                w0.L(d0);
                ((RecyclerView$c0)vav$b).C0.setOnClickListener((View$OnClickListener)new t0p((Object)this, 20));
                if (vav$b.b1 == null) {
                    final Context context = ((RecyclerView$c0)vav$b).C0.getContext();
                    final hfv a2 = this.h.a;
                    final ArrayList<xxp> list = new ArrayList<xxp>(2);
                    final ejb d2 = ejb.d(context, yos.f(this.a, vav$b.Z0, 2131625663));
                    list.add(d2);
                    final a1g d3 = a1g.d(context, mlw.h(this.a, vav$b.Z0, 2131625664), a2, this.b);
                    list.add(d3);
                    d2.c = (ejb.ejb$a)new uav(this, d3, a2, vav$b);
                    d3.c = (a1g.a1g$a)new x39((Object)this);
                    final Iterator<xxp> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        vav$b.Z0.addView(iterator.next().getActionView());
                    }
                    final ncl b1 = new ncl((List<xxp>)list, this.b);
                    vav$b.b1 = b1;
                    vav$b.c1 = new w3c((vxp)b1, this.h);
                }
                vav$b.b1.b0((yxp)this.h);
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
        final PsUser g = this.g;
        if (g == null) {
            return false;
        }
        ((dp1)this.f).w(new wbw(g.id, g.username));
        return false;
    }
    
    public final int f() {
        return 0;
    }
    
    public final int g() {
        return 0;
    }
    
    public final jm i() {
        return null;
    }
    
    public final void l(final PsUser g) {
        this.g = g;
    }
    
    public final RecyclerView$c0 n(final ViewGroup viewGroup) {
        if (this.h != null) {
            final vav.vav$b vav$b = new vav.vav$b(this.a.inflate(2131625133, viewGroup, false));
            this.f.U0.add(new WeakReference(vav$b));
            return (RecyclerView$c0)vav$b;
        }
        return (RecyclerView$c0)new km(this.a.inflate(2131625261, viewGroup, false));
    }
}
