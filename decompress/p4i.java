import com.twitter.media.ui.image.RichImageView;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.media.ui.image.AnimatedGifView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnClickListener;
import com.twitter.media.ui.image.AnimatedGifView$b;
import com.twitter.media.ui.image.AnimatedGifView$c;
import androidx.recyclerview.widget.RecyclerView$n;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4i extends b4e<o4i, r4i>
{
    public final znl<o4i> d;
    public final int e;
    
    public p4i(final Context context, final znl<o4i> d) {
        e0e.f((Object)context, "context");
        e0e.f((Object)d, "clickSubject");
        super((Class)o4i.class);
        this.d = d;
        this.e = context.getResources().getDimensionPixelSize(2131166724);
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final r4i r4i = (r4i)n8x;
        final o4i o4i = (o4i)o;
        e0e.f((Object)r4i, "viewHolder");
        e0e.f((Object)o4i, "item");
        final TypefacesTextView z0 = r4i.Z0;
        String text = o4i.a;
        if (text == null) {
            text = mqb.l("#", o4i.d);
        }
        ((TextView)z0).setText((CharSequence)text);
        ((TextView)r4i.a1).setText((CharSequence)o4i.b);
        if (o4i.f == 2) {
            final AnimatedGifView b1 = r4i.b1;
            final int e = this.e;
            ((View)b1).setLayoutParams((ViewGroup$LayoutParams)new ConstraintLayout$a(e, e));
            r4i.F0.setLayoutParams((ViewGroup$LayoutParams)new RecyclerView$n(-2, -2));
            ((View)r4i.a1).setVisibility(8);
        }
        if (o4i.g) {
            r4i.c1.setVisibility(8);
            r4i.b1.setImageUrlProvider((AnimatedGifView$c)new e0h((Object)o4i, 3));
            r4i.b1.setListener((AnimatedGifView$b)new tqb());
        }
        else {
            r4i.c1.setVisibility(0);
            ((RichImageView)r4i.b1).setImageResource(2131100521);
        }
        r4i.getHeldView().setOnClickListener((View$OnClickListener)new a2p((Object)this, (Object)o4i, 13));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131624974, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new r4i(x);
    }
}
