import android.content.Context;
import android.view.View;
import com.twitter.ui.socialproof.SocialBylineView;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kaw
{
    public final UserImageView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final SocialBylineView h;
    public final TextView i;
    
    public kaw(final View view) {
        this.a = (UserImageView)view.findViewById(2131432467);
        this.b = (TextView)view.findViewById(2131430192);
        this.c = (ImageView)view.findViewById(2131432526);
        this.d = (ImageView)view.findViewById(2131430811);
        this.e = (TextView)view.findViewById(2131431232);
        this.f = (TextView)view.findViewById(2131428083);
        this.g = (ImageView)view.findViewById(2131432503);
        this.h = (SocialBylineView)view.findViewById(2131431496);
        this.i = (TextView)view.findViewById(2131428607);
    }
    
    public final UserImageView a() {
        final UserImageView a = this.a;
        pf8.r(a);
        final UserImageView userImageView = a;
        return a;
    }
    
    public final ImageView b() {
        final ImageView g = this.g;
        pf8.r(g);
        final ImageView imageView = g;
        return g;
    }
    
    public final void c(final int icon, final int n) {
        final SocialBylineView h = this.h;
        if (h != null) {
            final Context context = ((View)h).getContext();
            this.h.setIcon(icon);
            this.h.setLabel((CharSequence)context.getString(n));
            this.h.setRenderRTL(t4s.i);
            this.d(true);
        }
    }
    
    public final void d(final boolean b) {
        final SocialBylineView h = this.h;
        if (h != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)h).setVisibility(visibility);
        }
    }
}
