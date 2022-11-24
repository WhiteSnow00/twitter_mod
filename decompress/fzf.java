import android.view.View;
import com.twitter.ui.navigation.FullTabLayout;
import androidx.viewpager.widget.ViewPager;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzf
{
    public final Resources a;
    public final ViewPager b;
    public final FullTabLayout c;
    public final View d;
    
    public fzf(View viewById, final Resources a) {
        e0e.f((Object)viewById, "contentView");
        e0e.f((Object)a, "resources");
        this.a = a;
        final View viewById2 = viewById.findViewById(2131427548);
        e0e.e((Object)viewById2, "contentView.findViewById\u2026ive_event_timeline_pager)");
        this.b = (ViewPager)viewById2;
        final View viewById3 = viewById.findViewById(2131427549);
        e0e.e((Object)viewById3, "contentView.findViewById\u2026live_event_timeline_tabs)");
        this.c = (FullTabLayout)viewById3;
        viewById = viewById.findViewById(2131427545);
        e0e.e((Object)viewById, "contentView.findViewById\u2026ve_event_section_divider)");
        this.d = viewById;
    }
}
