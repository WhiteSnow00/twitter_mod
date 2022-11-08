import com.twitter.media.ui.image.c;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.LayoutInflater;
import com.twitter.media.ui.fresco.FrescoDraweeView;
import android.view.MotionEvent;
import com.twitter.ui.widget.touchintercept.TouchInterceptingFrameLayout;
import java.util.List;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.media.ui.fresco.FrescoMediaImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vxb extends twb
{
    public FrescoMediaImageView h;
    public final Context i;
    
    public vxb(final Context i, final ViewGroup viewGroup, final int n, final wxb wxb, final jev jev, final List<FrescoMediaImageView> list) {
        super(i, viewGroup, n, wxb, jev, (List)list);
        this.i = i;
    }
    
    public final void a(final nxb f, final z0s$c z0s$c, final swb$a swb$a) {
        if (!(f instanceof kck)) {
            bl0.B("A photo item is required!");
        }
        super.f = f;
        final TouchInterceptingFrameLayout touchInterceptingFrameLayout = (TouchInterceptingFrameLayout)super.b;
        final t8d$a c = f.c;
        ((vqm$a)c).g = (vqm$b)new txb(this, swb$a);
        final int a = w4j.a;
        c.A = (vqm$b)new uxb(this, swb$a);
        c.C = true;
        ((c)this.h).p(c);
        final FrescoDraweeView imageView = this.h.getImageView();
        ((View)imageView).setContentDescription((CharSequence)this.i.getResources().getString(2131958742, new Object[] { f.d }));
        if (z0s$c != null) {
            final z0s touchInterceptListener = new z0s(this.i, true);
            touchInterceptListener.D0 = (z0s$c)new z0s$c() {
                public final void K3(final ViewGroup viewGroup) {
                    z0s$c.K3(viewGroup);
                }
                
                public final void a2(final ViewGroup viewGroup, final float n) {
                    z0s$c.a2(viewGroup, n);
                }
                
                public final boolean onSingleTapUp(final MotionEvent motionEvent) {
                    return z0s$c.onSingleTapUp(motionEvent);
                }
            };
            touchInterceptListener.K0 = true;
            if (imageView instanceof n2s) {
                touchInterceptListener.E0 = (n2s)imageView;
            }
            touchInterceptingFrameLayout.setTouchInterceptListener((qtt)touchInterceptListener);
        }
    }
    
    public final void b() {
        super.b.removeAllViews();
        super.g.add(this.h);
    }
    
    public final ViewGroup c(final LayoutInflater layoutInflater, final Context context, final ViewGroup viewGroup) {
        final TouchInterceptingFrameLayout touchInterceptingFrameLayout = new TouchInterceptingFrameLayout(context);
        if (super.g.isEmpty()) {
            final FrescoMediaImageView h = (FrescoMediaImageView)layoutInflater.inflate(2131624524, viewGroup, false);
            h.v();
            this.h = h;
        }
        else {
            this.h = super.g.remove(0);
        }
        ((ViewGroup)touchInterceptingFrameLayout).addView((View)this.h);
        return (ViewGroup)touchInterceptingFrameLayout;
    }
    
    public final void d(final boolean b) {
        ((View)super.c.b).setVisibility(8);
    }
    
    public final void e() {
        ((c)this.h).p((t8d$a)null);
    }
    
    public final String f(final FrescoMediaImageView frescoMediaImageView) {
        if (((c)frescoMediaImageView).getImageRequest() != null) {
            final y5w f = ((c)frescoMediaImageView).getImageRequest().l.f;
            if (f != null) {
                return f.a();
            }
        }
        return null;
    }
    
    public final String g(final FrescoMediaImageView frescoMediaImageView) {
        if (((c)frescoMediaImageView).getImageRequest() != null) {
            final y5w e = ((c)frescoMediaImageView).getImageRequest().l.e;
            if (e != null) {
                return e.a();
            }
        }
        return null;
    }
    
    public final boolean h(final FrescoMediaImageView frescoMediaImageView, final String s) {
        final t8d imageRequest = ((c)frescoMediaImageView).getImageRequest();
        return imageRequest != null && imageRequest.d().equals(s);
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    public final void i(final FrescoMediaImageView frescoMediaImageView, final String s, final String s2) {
        if (!this.h(frescoMediaImageView, s)) {
            ((c)frescoMediaImageView).p(new t8d$a(s, (kvg)null));
            saw.b((okm)new zf4(nca.g("gallery", "", "gallery", "photo", s2)));
        }
    }
}
