import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.media.ui.fresco.FrescoDraweeView;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.view.ViewGroup$MarginLayoutParams;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8d extends a3e<e8d, h8d>
{
    public g8d() {
        super((Class)e8d.class);
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final h8d h8d = (h8d)v7x;
        final e8d e8d = (e8d)o;
        czd.f((Object)h8d, "viewHolder");
        czd.f((Object)e8d, "item");
        final f8d a = e8d.a;
        czd.f((Object)a, "settingsValue");
        final z6d g = a.g;
        final Integer f = a.f;
        int intValue;
        if (f != null) {
            intValue = f;
        }
        else {
            intValue = 0;
        }
        final String d0 = g.D0;
        final edq e0 = g.E0;
        if (e0.b > 0 && e0.a > 0) {
            if (d0 != null) {
                final Uri parse = Uri.parse(d0);
                final ihc$a companion = ihc.Companion;
                final Resources resources = ((View)h8d.F0).getResources();
                czd.e((Object)resources, "draweeView.resources");
                final float b = companion.b(resources, h8d.E0, g, intValue);
                final Resources resources2 = ((View)h8d.F0).getResources();
                czd.e((Object)resources2, "draweeView.resources");
                final int c = companion.c(resources2, intValue);
                final ViewGroup$LayoutParams layoutParams = ((View)h8d.F0).getLayoutParams();
                czd.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                viewGroup$MarginLayoutParams.setMargins(viewGroup$MarginLayoutParams.leftMargin, c, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
                ((ud9)h8d.F0).setAspectRatio(b);
                ((View)h8d.F0).setVisibility(0);
                final uuo$b a2 = companion.a(intValue);
                final FrescoDraweeView f2 = h8d.F0;
                final lzb lzb = new lzb(((View)f2).getResources());
                lzb.l = a2;
                ((ud9<sd9>)f2).setHierarchy((sd9)lzb.a());
                final FrescoDraweeView f3 = h8d.F0;
                final lfk d2 = sqb.Companion.a().d();
                ((sb)d2).c = new ypb(new x7d(x7d.g(d0)));
                ((sb)d2).d = ImageRequestBuilder.c(parse).a();
                ((sb)d2).i = true;
                ((ud9)f3).setController(((sb)d2).a());
            }
        }
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625061, viewGroup, false);
        czd.e((Object)inflate, "from(parent.context).inf\u2026ings_item, parent, false)");
        return (v7x)new h8d(inflate);
    }
}
