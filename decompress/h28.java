import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h28 extends b4e<hy7$d, a>
{
    public final UserIdentifier d;
    public final stb<hy7$d, vzv> e;
    
    public h28(final UserIdentifier d, final stb<? super hy7$d, vzv> e) {
        e0e.f((Object)d, "currentUser");
        e0e.f((Object)e, "conversationClickAction");
        super((Class)hy7$d.class);
        this.d = d;
        this.e = (stb<hy7$d, vzv>)e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final a a = (a)n8x;
        final hy7$d hy7$d = (hy7$d)o;
        e0e.f((Object)a, "viewHolder");
        e0e.f((Object)hy7$d, "item");
        a.l0(hy7$d, this.d, (stb)this.e);
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        return (n8x)new a(viewGroup);
    }
    
    public static final class a extends c08<hy7$d>
    {
        public a(final ViewGroup viewGroup) {
            e0e.f((Object)viewGroup, "parent");
            final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131624353, viewGroup, false);
            e0e.e((Object)inflate, "from(parent.context).inf\u2026text_only, parent, false)");
            super(inflate);
        }
    }
}
