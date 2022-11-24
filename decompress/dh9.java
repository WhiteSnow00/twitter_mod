import com.twitter.weaver.mvi.MviViewModel;
import tv.periscope.android.ui.broadcast.replay.c;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView$b;
import com.twitter.ui.navigation.drawer.implementation.header.DrawerHeaderViewModel;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineHeaderImagePromptView;
import tv.periscope.android.ui.broadcast.replay.d$a;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dh9 implements View$OnClickListener
{
    public final int F0;
    public final Object G0;
    
    public dh9(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final ReplayScrubView$b a1 = ((ReplayScrubView)this.G0).a1;
                if (a1 != null) {
                    final c g0 = ((d$a)a1).a.G0;
                    final float r = g0.r;
                    g0.c(r, r + 50.0f);
                    g0.r += 50.0f;
                }
                return;
            }
            case 4: {
                final sw6 sw6 = (sw6)this.G0;
                sw6.d(true);
                sw6.a(false);
                return;
            }
            case 3: {
                final uk2 uk2 = (uk2)this.G0;
                uk2.O0.h();
                uk2.a();
                return;
            }
            case 2: {
                final ydx$a d = ((ydx)this.G0).d;
                if (d != null) {
                    ((j9f)d).a.b1.T();
                }
                return;
            }
            case 1: {
                final TimelineHeaderImagePromptView timelineHeaderImagePromptView = (TimelineHeaderImagePromptView)this.G0;
                final int p = TimelineHeaderImagePromptView.P0;
                if (((a)timelineHeaderImagePromptView).F0 != null) {
                    final iqv iqv = (iqv)view.getTag();
                    if (iqv != null) {
                        ((a)timelineHeaderImagePromptView).F0.a((a)timelineHeaderImagePromptView, iqv.b, iqv.a, true, iqv.c);
                    }
                }
                return;
            }
            case 0: {
                ((MviViewModel)this.G0).O((sdw)tg9.a);
            }
        }
    }
}
