import android.os.BaseBundle;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewStub;
import android.widget.ImageButton;
import com.twitter.ui.components.button.legacy.ToggleTwitterButton;
import com.twitter.ui.tweet.TweetHeaderView;
import com.twitter.media.ui.image.UserImageView;
import android.widget.TextView;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import androidx.fragment.app.Fragment;
import com.twitter.timeline.generic.retained.GenericTimelineRetainedGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q6w extends ue<x6w>
{
    public cgv d;
    public String e;
    public final obi<?> f;
    public final as3 g;
    public final giw h;
    public final sxs i;
    public final vxs j;
    public final uss k;
    public final hkf l;
    public final l2p m;
    public final yaa<kjf> n;
    public final wc6 o;
    public final ifd p;
    public final qkq q;
    public final jkb r;
    
    public q6w(final obi<?> f, final as3 g, final giw h, final sxs i, final vxs j, final l2p m, final uss k, final hkf l, final cnb cnb, final yaa<kjf> n, final ifd p13, final qkq q, final jkb r) {
        this.o = new wc6();
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.q = q;
        final Fragment g2 = cnb.P().G(2131429268);
        if (g2 instanceof umd) {
            final RetainedObjectGraph o = ((umd)g2).o();
            if (o instanceof GenericTimelineRetainedGraph) {
                this.e = ((BaseBundle)((vl1)((GenericTimelineRetainedGraph)o).d()).a).getString("arg_user_id");
            }
        }
        this.m = m;
        this.n = n;
        this.p = p13;
        this.r = r;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final x6w x6w = (x6w)v7x;
        final fsv fsv = (fsv)o;
        ((a3e)this).i((d3e)new te());
        this.d = fsv.k.T0;
        final String e = this.e;
        if (e != null) {
            this.h.b(UserIdentifier.parse(e)).zipWith((taj)this.h.b(UserIdentifier.fromId(fsv.k.L0)), (zv1)o6w.E0).subscribe((ccj)new p6w(x6w, fsv));
        }
        else {
            x6w.a(fsv, fsv.l, null);
            final cgv d = this.d;
            if (d != null && d.D0 == fsv.k.L0) {
                x6w.c(fsv, d, null);
            }
            else {
                this.o.a(this.h.b(UserIdentifier.fromId(fsv.k.L0)).compose((pbj)vnj.D0).subscribe((lj6)new fy0((Object)this, (Object)x6w, (Object)fsv, 2)));
            }
        }
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View h = da8.h(viewGroup, 2131625929, viewGroup, false);
        final obi<?> f = this.f;
        final as3 g = this.g;
        final l2p m = this.m;
        final vxs j = this.j;
        final hkf l = this.l;
        final yaa<kjf> n = this.n;
        final ifd p = this.p;
        final qkq q = this.q;
        final jkb r = this.r;
        final FrescoMediaImageView frescoMediaImageView = (FrescoMediaImageView)h.findViewById(2131428513);
        final TextView textView = (TextView)h.findViewById(2131428174);
        final UserImageView userImageView = (UserImageView)h.findViewById(2131427698);
        final TweetHeaderView tweetHeaderView = (TweetHeaderView)h.findViewById(2131427696);
        final ToggleTwitterButton toggleTwitterButton = (ToggleTwitterButton)h.findViewById(2131429217);
        final TextView textView2 = (TextView)h.findViewById(2131428639);
        final ImageButton imageButton = (ImageButton)h.findViewById(2131430572);
        final View viewById = h.findViewById(2131428116);
        jee.l((Object)viewById);
        final ViewStub viewStub = (ViewStub)h.findViewById(2131428115);
        jee.l((Object)viewStub);
        final View viewById2 = h.findViewById(2131428206);
        jee.l((Object)viewById2);
        final ImageView imageView = (ImageView)h.findViewById(2131430700);
        jee.l((Object)imageView);
        return (v7x)new x6w((r6w)new t6w(h, frescoMediaImageView, textView, userImageView, tweetHeaderView, toggleTwitterButton, textView2, viewById, viewStub, viewById2, imageView, imageButton, r), f, g, m, j, l, n, p, q);
    }
    
    public final void m(final v7x v7x, final Object o) {
        final x6w x6w = (x6w)v7x;
        final fsv fsv = (fsv)o;
        this.i.m((cxs)fsv, this.j);
        this.k.m(fsv, x6w.N0);
    }
    
    public static final class a extends a3e$a<fsv>
    {
        public a(final pwe<q6w> pwe) {
            super((Class)fsv.class, (pwe)pwe);
        }
        
        public final boolean a(final Object o) {
            final int l = ((fsv)o).l;
            boolean b = true;
            if (l == 1) {
                b = false;
            }
            return b;
        }
    }
}
