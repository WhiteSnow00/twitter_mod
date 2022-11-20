import com.twitter.weaver.mvi.MviViewModel;
import android.widget.ImageButton;
import com.twitter.tweetview.core.QuoteView;
import com.twitter.media.ui.image.UserImageView;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.View;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.twitter.rooms.manager.RoomStateManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hm6 extends a3e<vwp, a>
{
    public final RoomStateManager d;
    public final k7o e;
    public final xwp f;
    public final obi<?> g;
    public final b7o h;
    
    public hm6(final RoomStateManager d, final k7o e, final xwp f, final obi<?> g, final b7o h) {
        czd.f((Object)d, "roomStateManager");
        czd.f((Object)e, "roomSharedContentManager");
        czd.f((Object)f, "quoteTweetHandler");
        czd.f((Object)g, "navigator");
        czd.f((Object)h, "eventDispatcher");
        super((Class)vwp.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final /* bridge */ void k(final v7x v7x, final Object o, final xbm xbm) {
        this.n((a)v7x, (vwp)o, xbm);
    }
    
    public final /* bridge */ v7x l(final ViewGroup viewGroup) {
        return (v7x)this.o(viewGroup);
    }
    
    public final void n(final a a, final vwp vwp, final xbm xbm) {
        czd.f((Object)a, "viewHolder");
        czd.f((Object)vwp, "item");
        if (vwp instanceof vwp$b) {
            final vwp$b vwp$b = (vwp$b)vwp;
            a.Y0.a(a.c1, vwp$b.c);
            a.c1.setBorderWidth(0);
            final cgv a2 = vwp$b.b.a();
            if (a2 != null) {
                ((View)a.a1).setVisibility(0);
                ((View)a.b1).setVisibility(0);
                a.a1.H(vwp$b.b.a());
                final TextView b1 = a.b1;
                final Resources z0 = a.Z0;
                final cgv a3 = vwp$b.b.a();
                String c;
                if (a3 != null) {
                    c = a3.c();
                }
                else {
                    c = null;
                }
                b1.setText((CharSequence)z0.getString(2131958404, new Object[] { c }));
                final was was = new was((Object)this, (Object)a2, 14);
                ((View)a.a1).setOnClickListener((View$OnClickListener)was);
                ((View)a.b1).setOnClickListener((View$OnClickListener)was);
                if (this.e.a((vqn)((MviViewModel)this.d).S(), (vwp)vwp$b)) {
                    ((View)a.d1).setVisibility(0);
                    ((View)a.d1).setOnClickListener((View$OnClickListener)new e1p((Object)this, (Object)vwp$b, 13));
                }
                else {
                    ((View)a.d1).setVisibility(8);
                }
            }
            else {
                ((View)a.a1).setVisibility(8);
                ((View)a.b1).setVisibility(8);
            }
            xbm.i((oj)new pvt((Object)a, 24));
        }
        else {
            final boolean b2 = vwp instanceof vwp$a;
        }
    }
    
    public final a o(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625488, viewGroup, false);
        czd.e((Object)inflate, "from(parent.context).inf\u2026tent_item, parent, false)");
        return new a(inflate, this.f);
    }
    
    public static final class a extends RecyclerView$c0 implements v7x
    {
        public final View X0;
        public final xwp Y0;
        public final Resources Z0;
        public final UserImageView a1;
        public final TextView b1;
        public final QuoteView c1;
        public final ImageButton d1;
        
        public a(View viewById, final xwp y0) {
            czd.f((Object)y0, "quoteTweetHandler");
            super(viewById);
            this.X0 = viewById;
            this.Y0 = y0;
            final Resources resources = viewById.getResources();
            czd.e((Object)resources, "rootView.resources");
            this.Z0 = resources;
            final View viewById2 = viewById.findViewById(2131431408);
            czd.e((Object)viewById2, "rootView.findViewById(R.id.shared_by_image)");
            this.a1 = (UserImageView)viewById2;
            final View viewById3 = viewById.findViewById(2131431409);
            czd.e((Object)viewById3, "rootView.findViewById(R.id.shared_by_text)");
            this.b1 = (TextView)viewById3;
            final View viewById4 = viewById.findViewById(2131432322);
            czd.e((Object)viewById4, "rootView.findViewById(co\u2026ew.core.R.id.tweet_quote)");
            final QuoteView c1 = (QuoteView)viewById4;
            this.c1 = c1;
            viewById = viewById.findViewById(2131428633);
            czd.e((Object)viewById, "rootView.findViewById(R.id.delete_tweet)");
            this.d1 = (ImageButton)viewById;
            y0.b(c1);
        }
        
        public final View getHeldView() {
            return this.X0;
        }
    }
}
