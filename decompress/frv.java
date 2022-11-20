import com.twitter.ui.widget.timeline.a$a;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineInlinePromptCompactUserFacepileView;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frv extends hrv
{
    public frv(final szs szs, final uzs uzs, final vk3 vk3, final ypa<af4, id6> ypa, final ica ica, final cnb cnb, final UserIdentifier userIdentifier, final efv efv, final x32 x32, final cgv cgv, final qkq qkq) {
        czd.f((Object)szs, "clickListener");
        czd.f((Object)uzs, "timelineMessageImpressionHelper");
        czd.f((Object)vk3, "promptActionsHandler");
        czd.f((Object)ypa, "compositeRichTextProcessorFactory");
        czd.f((Object)ica, "eventSectionPrefix");
        czd.f((Object)userIdentifier, "userIdentifier");
        czd.f((Object)efv, "scribeAssociation");
        czd.f((Object)x32, "bonusFollowsUserViewModel");
        czd.f((Object)qkq, "softUserGate");
        super(szs, uzs, vk3, (ypa)ypa, ica, cnb, userIdentifier, efv, x32, cgv, qkq);
    }
    
    public final /* bridge */ void k(final v7x v7x, final Object o, final xbm xbm) {
        this.n((mrv$a)v7x, (bqv)o, xbm);
    }
    
    public final /* bridge */ v7x l(final ViewGroup viewGroup) {
        return (v7x)this.o(viewGroup);
    }
    
    public final void n(final mrv$a mrv$a, final bqv bqv, final xbm xbm) {
        czd.f((Object)mrv$a, "viewHolder");
        czd.f((Object)bqv, "item");
        super.n(mrv$a, bqv, xbm);
        final View viewById = ((View)mrv$a.F0).findViewById(2131428115);
        viewById.setVisibility(0);
        viewById.setOnClickListener((View$OnClickListener)new yag((Object)this, (Object)mrv$a, 15));
    }
    
    public final mrv$a o(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131624594, viewGroup, false);
        final View viewById = e.findViewById(2131432053);
        czd.e((Object)viewById, "view.findViewById(R.id.t\u2026mpact_user_facepile_view)");
        final TimelineInlinePromptCompactUserFacepileView timelineInlinePromptCompactUserFacepileView = (TimelineInlinePromptCompactUserFacepileView)viewById;
        final mrv$a mrv$a = new mrv$a(e, (com.twitter.ui.widget.timeline.a)timelineInlinePromptCompactUserFacepileView);
        ((com.twitter.ui.widget.timeline.a)timelineInlinePromptCompactUserFacepileView).D0 = (a$a)((mrv)this).d;
        return mrv$a;
    }
    
    public static final class a extends a3e$a<bqv>
    {
        public a(final pwe<frv> pwe) {
            czd.f((Object)pwe, "lazyItemBinder");
            super((Class)bqv.class, (pwe)pwe);
        }
        
        public final boolean a(final Object o) {
            final bqv bqv = (bqv)o;
            czd.f((Object)bqv, "item");
            final orv b = bqv.k.b;
            if (b instanceof erv) {
                czd.d((Object)b, "null cannot be cast to non-null type com.twitter.model.timeline.urt.message.URTTimelineInlinePrompt");
                final c9t i = ((erv)b).i;
                if (i != null && i.g == ipa.F0) {
                    return true;
                }
            }
            return false;
        }
    }
}
