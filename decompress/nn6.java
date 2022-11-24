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

public final class nn6 extends b4e<sxp, a>
{
    public final RoomStateManager d;
    public final d8o e;
    public final uxp f;
    public final fci<?> g;
    public final u7o h;
    
    public nn6(final RoomStateManager d, final d8o e, final uxp f, final fci<?> g, final u7o h) {
        e0e.f((Object)d, "roomStateManager");
        e0e.f((Object)e, "roomSharedContentManager");
        e0e.f((Object)f, "quoteTweetHandler");
        e0e.f((Object)g, "navigator");
        e0e.f((Object)h, "eventDispatcher");
        super((Class)sxp.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final /* bridge */ void k(final n8x n8x, final Object o, final kcm kcm) {
        this.n((a)n8x, (sxp)o, kcm);
    }
    
    public final /* bridge */ n8x l(final ViewGroup viewGroup) {
        return (n8x)this.o(viewGroup);
    }
    
    public final void n(final a a, final sxp sxp, final kcm kcm) {
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)sxp, "item");
        if (sxp instanceof sxp$b) {
            final sxp$b sxp$b = (sxp$b)sxp;
            a.a1.a(a.e1, sxp$b.c);
            a.e1.setBorderWidth(0);
            final qgv a2 = sxp$b.b.a();
            if (a2 != null) {
                ((View)a.c1).setVisibility(0);
                ((View)a.d1).setVisibility(0);
                a.c1.H(sxp$b.b.a());
                final TextView d1 = a.d1;
                final Resources b1 = a.b1;
                final qgv a3 = sxp$b.b.a();
                String c;
                if (a3 != null) {
                    c = a3.c();
                }
                else {
                    c = null;
                }
                d1.setText((CharSequence)b1.getString(2131958404, new Object[] { c }));
                final v8w v8w = new v8w((Object)this, (Object)a2, 15);
                ((View)a.c1).setOnClickListener((View$OnClickListener)v8w);
                ((View)a.d1).setOnClickListener((View$OnClickListener)v8w);
                if (this.e.a((lrn)((MviViewModel)this.d).S(), (sxp)sxp$b)) {
                    ((View)a.f1).setVisibility(0);
                    ((View)a.f1).setOnClickListener((View$OnClickListener)new npa((Object)this, (Object)sxp$b, 12));
                }
                else {
                    ((View)a.f1).setVisibility(8);
                }
            }
            else {
                ((View)a.c1).setVisibility(8);
                ((View)a.d1).setVisibility(8);
            }
            kcm.i((sj)new yt1((Object)a, 27));
        }
        else {
            final boolean b2 = sxp instanceof sxp$a;
        }
    }
    
    public final a o(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625488, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026tent_item, parent, false)");
        return new a(inflate, this.f);
    }
    
    public static final class a extends RecyclerView$c0 implements n8x
    {
        public final View Z0;
        public final uxp a1;
        public final Resources b1;
        public final UserImageView c1;
        public final TextView d1;
        public final QuoteView e1;
        public final ImageButton f1;
        
        public a(View viewById, final uxp a1) {
            e0e.f((Object)a1, "quoteTweetHandler");
            super(viewById);
            this.Z0 = viewById;
            this.a1 = a1;
            final Resources resources = viewById.getResources();
            e0e.e((Object)resources, "rootView.resources");
            this.b1 = resources;
            final View viewById2 = viewById.findViewById(2131431409);
            e0e.e((Object)viewById2, "rootView.findViewById(R.id.shared_by_image)");
            this.c1 = (UserImageView)viewById2;
            final View viewById3 = viewById.findViewById(2131431410);
            e0e.e((Object)viewById3, "rootView.findViewById(R.id.shared_by_text)");
            this.d1 = (TextView)viewById3;
            final View viewById4 = viewById.findViewById(2131432323);
            e0e.e((Object)viewById4, "rootView.findViewById(co\u2026ew.core.R.id.tweet_quote)");
            final QuoteView e1 = (QuoteView)viewById4;
            this.e1 = e1;
            viewById = viewById.findViewById(2131428633);
            e0e.e((Object)viewById, "rootView.findViewById(R.id.delete_tweet)");
            this.f1 = (ImageButton)viewById;
            a1.b(e1);
        }
        
        public final View getHeldView() {
            return this.Z0;
        }
    }
}
