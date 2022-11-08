import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.GradientDrawable;
import com.twitter.util.user.UserIdentifier;
import android.view.View;
import com.twitter.dm.ui.widget.DMGoDownConversationView;
import com.twitter.ui.widget.NewItemBannerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xei
{
    public final long a;
    public final boolean b;
    public final NewItemBannerView c;
    public final DMGoDownConversationView d;
    public final b e;
    
    public xei(final View view, final UserIdentifier userIdentifier, final a a, final b e) {
        this.a = userIdentifier.getId();
        this.e = e;
        final boolean b = dta.b().b("dm_quick_scroll_button_enabled", false);
        this.b = b;
        final Resources resources = view.getContext().getResources();
        final View viewById = view.findViewById(2131427779);
        final int a2 = w4j.a;
        final NewItemBannerView c = (NewItemBannerView)viewById;
        (this.c = c).setText(2131953318);
        c.setAnchorPosition(ww.E0);
        c.setShouldThrottleShowing(false);
        ((GradientDrawable)((LayerDrawable)c.D0.getBackground()).findDrawableByLayerId(2131427754)).setColor(goz.J(((View)c).getContext(), 2130969084));
        c.E0.setTextColor(((View)c).getContext().getResources().getColor(2131100865));
        ((View)c).requestLayout();
        final Drawable drawable = view.getContext().getDrawable(2131231396);
        final int color = resources.getColor(2131100865);
        c.F0.setVisibility(0);
        c.F0.setColorFilter(color, PorterDuff$Mode.SRC_ATOP);
        c.F0.setImageDrawable(drawable);
        c.setOnClickListener((View$OnClickListener)new sy((Object)this, (Object)a, 4));
        final DMGoDownConversationView d = (DMGoDownConversationView)view.findViewById(2131429342);
        this.d = d;
        if (b) {
            ((View)d).setOnClickListener((View$OnClickListener)new ibg(this, a, 3));
        }
        else {
            ((FloatingActionButton)d).setVisibility(8);
        }
    }
    
    public final void a() {
        if (this.b && !((View)this.d).isShown()) {
            if (((View)this.c).isShown()) {
                this.c.a();
            }
            ((FloatingActionButton)this.d).p();
            saw.b((okm)new zf4(y38.e));
        }
    }
    
    public interface a
    {
    }
    
    public interface b
    {
    }
}
