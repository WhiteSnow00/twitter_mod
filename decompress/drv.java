import com.twitter.ui.widget.timeline.a$a;
import android.view.View;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineHeaderImagePromptView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drv extends mrv
{
    public drv(final szs szs, final uzs uzs, final vk3 vk3, final ypa<af4, id6> ypa, final ica ica) {
        super(szs, uzs, vk3, (ypa)ypa, ica);
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View h = da8.h(viewGroup, 2131624593, viewGroup, false);
        final TimelineHeaderImagePromptView timelineHeaderImagePromptView = (TimelineHeaderImagePromptView)h.findViewById(2131432052);
        final mrv$a mrv$a = new mrv$a(h, (a)timelineHeaderImagePromptView);
        ((a)timelineHeaderImagePromptView).D0 = (a$a)super.d;
        return (v7x)mrv$a;
    }
}
