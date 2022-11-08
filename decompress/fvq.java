import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.twitter.media.ui.image.UserImageView;
import java.util.Objects;
import java.util.List;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fvq
{
    public final View a;
    public final qnq b;
    public final Resources c;
    public final Context d;
    public final u3s e;
    
    public fvq(final View a, final qnq b) {
        zzd.f((Object)a, "rootView");
        zzd.f((Object)b, "spacesCardUtils");
        this.a = a;
        this.b = b;
        final Resources resources = a.getResources();
        zzd.e((Object)resources, "rootView.resources");
        this.c = resources;
        final Context context = a.getContext();
        zzd.e((Object)context, "rootView.context");
        this.d = context;
        this.e = (u3s)rp2.z0((otb)new fvq$a(this));
    }
    
    public final void a(final List<w21> list, int i, final int n, final int n2, final boolean b, final boolean b2) {
        Object c0 = list;
        if (list == null) {
            c0 = v2a.C0;
        }
        final LinearLayout b3 = this.b().b;
        if (b3 != null) {
            int visibility;
            if (((Collection)c0).isEmpty() ^ true) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)b3).setVisibility(visibility);
        }
        final TypefacesTextView a = this.b().a;
        int visibility2;
        if (b2 ? (i >= 5) : (!((Collection)c0).isEmpty())) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)a).setVisibility(visibility2);
        if ((((Collection)c0).isEmpty() ^ true) || b2) {
            final TypefacesTextView a2 = this.b().a;
            String text;
            if (b2) {
                text = this.b.a((List)v2a.C0, i, 2131958232);
            }
            else if (b) {
                final qnq b4 = this.b;
                Objects.requireNonNull(b4);
                text = b4.a((List)c0, n + n2, 2131958229);
            }
            else {
                text = this.b.a((List)c0, i, 2131958230);
            }
            ((TextView)a2).setText((CharSequence)text);
            if (this.b().b != null) {
                final LinearLayout b5 = this.b().b;
                zzd.c((Object)b5);
                if (((ViewGroup)b5).getChildCount() == 0) {
                    UserImageView userImageView;
                    for (i = 0; i < 3; ++i) {
                        userImageView = new UserImageView(((View)b5).getContext());
                        userImageView.setSize(-5);
                        userImageView.setDefaultDrawable((Drawable)this.e.getValue());
                        ((View)userImageView).setElevation((float)(3 - i));
                        if (i > 0) {
                            ((View)userImageView).setLayoutParams((ViewGroup$LayoutParams)gvq.a);
                        }
                        ((ViewGroup)b5).addView((View)userImageView);
                    }
                }
                final Iterator iterator = ((Iterable)c0).iterator();
                i = 0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (i < 0) {
                        tdy.V0();
                        throw null;
                    }
                    final w21 w21 = (w21)next;
                    final UserImageView userImageView2 = (UserImageView)y6x.a((ViewGroup)b5, i);
                    userImageView2.H(w21.e());
                    ((View)userImageView2).setVisibility(0);
                    ++i;
                }
                for (i = ((List)c0).size(); i < 3; ++i) {
                    y6x.a((ViewGroup)b5, i).setVisibility(8);
                }
            }
        }
    }
    
    public abstract cjq b();
}
