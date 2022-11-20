import androidx.appcompat.widget.AppCompatTextView;
import android.app.Dialog;
import com.facebook.imagepipeline.request.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import android.net.Uri;
import android.content.res.Resources;
import android.view.ViewParent;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Objects;
import android.view.View$OnClickListener;
import android.widget.ImageButton;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.TextView;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwq extends c92
{
    public static final int T0 = 0;
    public final View S0;
    
    public pwq(final Context context) {
        super(context);
        final View inflate = ((Dialog)this).getLayoutInflater().inflate(2131625707, (ViewGroup)null, false);
        czd.e((Object)inflate, "layoutInflater.inflate(\n\u2026layout, null, false\n    )");
        ((com.google.android.material.bottomsheet.a)this).setContentView(this.S0 = inflate);
        ((com.google.android.material.bottomsheet.a)this).l().H = true;
        ((com.google.android.material.bottomsheet.a)this).l().H(3);
        ((com.google.android.material.bottomsheet.a)this).setCanceledOnTouchOutside(false);
        final ViewParent parent = inflate.getParent();
        czd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior.y((View)parent).I = false;
        ((View)inflate).setMinimumHeight(((Dialog)this).getContext().getResources().getDisplayMetrics().heightPixels);
        final dls$a companion = dls.Companion;
        final Resources resources = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources, "context.resources");
        int textColor;
        if (companion.e(resources)) {
            textColor = ((Dialog)this).getContext().getResources().getColor(2131100786);
        }
        else {
            textColor = ((Dialog)this).getContext().getResources().getColor(2131100787);
        }
        final TextView textView = ((ck0)this).findViewById(2131431626);
        if (textView != null) {
            textView.setTextColor(textColor);
        }
        final TextView textView2 = ((ck0)this).findViewById(2131431623);
        if (textView2 != null) {
            textView2.setTextColor(textColor);
        }
        final TextView textView3 = ((ck0)this).findViewById(2131431628);
        if (textView3 != null) {
            textView3.setTextColor(textColor);
        }
        final Resources resources2 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources2, "context.resources");
        if (companion.e(resources2)) {
            final TypefacesTextView typefacesTextView = ((ck0)this).findViewById(2131431630);
            if (typefacesTextView != null) {
                ((AppCompatTextView)typefacesTextView).setBackgroundResource(2131233241);
            }
        }
        ((View)inflate.findViewById(2131431631)).setOnClickListener((View$OnClickListener)new epf((Object)this, 28));
        ((View)inflate.findViewById(2131431630)).setOnClickListener((View$OnClickListener)new mdk((Object)this, 3));
        final kwq$a companion2 = kwq.Companion;
        final Resources resources3 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources3, "context.resources");
        Objects.requireNonNull(companion2);
        final String a = companion2.a("0_ellipse_", resources3);
        final View viewById = inflate.findViewById(2131431620);
        czd.e((Object)viewById, "layout.findViewById(spac\u2026s_tab_ellipse_background)");
        this.o(a, (SimpleDraweeView)viewById);
        final Resources resources4 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources4, "context.resources");
        final String a2 = companion2.a("1_cover_", resources4);
        final View viewById2 = inflate.findViewById(2131431619);
        czd.e((Object)viewById2, "layout.findViewById(spac\u2026ces_tab_cover_background)");
        this.o(a2, (SimpleDraweeView)viewById2);
        final Resources resources5 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources5, "context.resources");
        final String a3 = companion2.a("2_inspace_", resources5);
        final View viewById3 = inflate.findViewById(2131431621);
        czd.e((Object)viewById3, "layout.findViewById(spac\u2026_tab_in_space_background)");
        this.o(a3, (SimpleDraweeView)viewById3);
        final Resources resources6 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources6, "context.resources");
        final String a4 = companion2.a("3_cards_", resources6);
        final View viewById4 = inflate.findViewById(2131431618);
        czd.e((Object)viewById4, "layout.findViewById(spac\u2026ces_tab_cards_background)");
        this.o(a4, (SimpleDraweeView)viewById4);
        final Resources resources7 = ((Dialog)this).getContext().getResources();
        czd.e((Object)resources7, "context.resources");
        final String a5 = companion2.a("4_listen_", resources7);
        final View viewById5 = inflate.findViewById(2131431633);
        czd.e((Object)viewById5, "layout.findViewById(spac\u2026es_tab_listen_background)");
        this.o(a5, (SimpleDraweeView)viewById5);
    }
    
    public final void o(final String s, final SimpleDraweeView simpleDraweeView) {
        final ImageRequestBuilder c = ImageRequestBuilder.c(Uri.parse(s));
        c.d = qqb.a;
        final a a = c.a();
        final ypb c2 = new ypb(new x7d(x7d.g(s)));
        final lfk d = sqb.Companion.a().d();
        ((sb)d).d = a;
        ((sb)d).c = c2;
        ((ud9)simpleDraweeView).setController(((sb)d).a());
    }
}
