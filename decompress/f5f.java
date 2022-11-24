import com.twitter.android.broadcast.di.view.a;
import android.view.View;
import com.twitter.moments.core.ui.AutoPlayableViewHost;
import com.twitter.ui.view.GroupedRowView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5f implements gra
{
    public final int a;
    public final Object b;
    
    public f5f(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                final ggm ggm = (ggm)this.b;
                final ViewGroup viewGroup = (ViewGroup)o;
                final ql3 ql3 = new ql3((Object)r29.j, 0);
                final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
                final GroupedRowView groupedRowView = (GroupedRowView)from.inflate(2131624579, viewGroup, false);
                final AutoPlayableViewHost autoPlayableViewHost = (AutoPlayableViewHost)from.inflate(2131624049, (ViewGroup)groupedRowView, true).findViewById(2131427713);
                return new rl3((kzt)ql3, new rl3$a((View)groupedRowView, (ViewGroup)autoPlayableViewHost, autoPlayableViewHost), ggm);
            }
            case 1: {
                return new bb8((Object)this.b, (Object)o, 2);
            }
            case 0: {
                final mh3 mh3 = (mh3)this.b;
                final ViewGroup viewGroup2 = (ViewGroup)o;
                e0e.f((Object)mh3, "$captionManager");
                e0e.f((Object)viewGroup2, "viewGroup");
                return new u8f((g9f)viewGroup2, (un2)new a(), mh3);
            }
        }
    }
}
