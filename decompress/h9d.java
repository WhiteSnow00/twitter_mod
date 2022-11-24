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

public final class h9d extends b4e<f9d, i9d>
{
    public h9d() {
        super((Class)f9d.class);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final i9d i9d = (i9d)n8x;
        final f9d f9d = (f9d)o;
        e0e.f((Object)i9d, "viewHolder");
        e0e.f((Object)f9d, "item");
        final g9d a = f9d.a;
        e0e.f((Object)a, "settingsValue");
        final b8d g = a.g;
        final Integer f = a.f;
        int intValue;
        if (f != null) {
            intValue = f;
        }
        else {
            intValue = 0;
        }
        final String f2 = g.F0;
        final beq g2 = g.G0;
        if (g2.b > 0 && g2.a > 0) {
            if (f2 != null) {
                final Uri parse = Uri.parse(f2);
                final lic$a companion = lic.Companion;
                final Resources resources = ((View)i9d.H0).getResources();
                e0e.e((Object)resources, "draweeView.resources");
                final float b = companion.b(resources, i9d.G0, g, intValue);
                final Resources resources2 = ((View)i9d.H0).getResources();
                e0e.e((Object)resources2, "draweeView.resources");
                final int c = companion.c(resources2, intValue);
                final ViewGroup$LayoutParams layoutParams = ((View)i9d.H0).getLayoutParams();
                e0e.d((Object)layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                viewGroup$MarginLayoutParams.setMargins(viewGroup$MarginLayoutParams.leftMargin, c, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
                ((xe9)i9d.H0).setAspectRatio(b);
                ((View)i9d.H0).setVisibility(0);
                final ovo$b a2 = companion.a(intValue);
                final FrescoDraweeView h0 = i9d.H0;
                final m0c m0c = new m0c(((View)h0).getResources());
                m0c.l = a2;
                ((xe9)h0).setHierarchy((ve9)m0c.a());
                final FrescoDraweeView h2 = i9d.H0;
                final yfk d = urb.Companion.a().d();
                ((tb)d).c = new arb(new z8d(z8d.g(f2)));
                ((tb)d).d = (REQUEST)ImageRequestBuilder.c(parse).a();
                ((tb)d).i = true;
                ((xe9)h2).setController((te9)((tb)d).a());
            }
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625061, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026ings_item, parent, false)");
        return (n8x)new i9d(inflate);
    }
}
