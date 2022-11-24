import android.view.View;
import android.content.res.Resources;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcv implements eib
{
    public final LayoutInflater a;
    public final qdw b;
    public final h6k<ufv> c;
    public final l6k d;
    public final nlq e;
    public odl f;
    public su6 g;
    public tdl h;
    
    public hcv(final LayoutInflater a, final qdw b, final h6k<ufv> c, final l6k d, final nlq e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final j24 a(final ViewGroup viewGroup, final j24$b j24$b) {
        final Context context = ((View)viewGroup).getContext();
        final a a = new a(this.a.inflate(2131625136, viewGroup, false), j24$b);
        final odl f = this.f;
        if (f != null) {
            final qgv a2 = f.a;
            final ArrayList list = new ArrayList(2);
            final bjb d = bjb.d(context, xd.f0(this.a, a.g1, 2131625665), this.e);
            list.add(d);
            final i1g d2 = i1g.d(context, tpz.w(this.a, a.g1, 2131625666), a2, this.b, this.e);
            list.add(d2);
            d.d = (bjb$a)new lk8((Object)this, (Object)d2, (Object)a2);
            d2.d = (i1g$a)new s6d((Object)this);
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                a.g1.addView(((kzp)iterator.next()).getActionView());
            }
            a.i1 = (izp<odl>)new ndl((List)list, this.b);
        }
        return a;
    }
    
    public final void b(final j24 j24, final f24 f24) {
        final a a = (a)j24;
        a.e1.setText((CharSequence)f24.a.l());
        a.f1.setText((CharSequence)a.h1.getString(2131955672, new Object[] { f24.a.n0() }));
        a.d1.L(f24.a.P());
        final izp<odl> i1 = a.i1;
        if (i1 != null) {
            final odl f25 = this.f;
            if (f25 != null) {
                i1.c0((lzp)f25);
                this.g = new su6((izp)a.i1, this.f);
            }
        }
    }
    
    public static final class a extends j24
    {
        public final UserImageView d1;
        public final TextView e1;
        public final TextView f1;
        public final ViewGroup g1;
        public final Resources h1;
        public izp<odl> i1;
        
        public a(final View view, final j24$b j24$b) {
            super(view, (k24)null, j24$b);
            this.d1 = (UserImageView)view.findViewById(2131432471);
            this.e1 = (TextView)view.findViewById(2131432514);
            this.f1 = (TextView)view.findViewById(2131428639);
            this.g1 = (ViewGroup)view.findViewById(2131429232);
            this.h1 = view.getResources();
        }
    }
}
