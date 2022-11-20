import android.widget.ImageView;
import com.twitter.media.ui.image.c;
import android.graphics.Bitmap;
import android.content.res.ColorStateList;
import com.twitter.media.ui.fresco.FrescoDraweeView;
import android.widget.ImageView$ScaleType;
import android.view.View;
import com.twitter.ui.widget.ToggleImageButton;
import android.widget.Button;
import com.twitter.media.av.autoplay.ui.VideoContainerHost;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import androidx.cardview.widget.CardView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r1r implements jd3
{
    public final Context D0;
    public final CardView E0;
    public final FrescoMediaImageView F0;
    public final VideoContainerHost G0;
    public final Button H0;
    public final String I0;
    public final String J0;
    public final ToggleImageButton K0;
    public final h5j<Boolean> L0;
    public final h5j<tmi> M0;
    public final h5j<tmi> N0;
    public final h5j<tmi> O0;
    public int P0;
    public boolean Q0;
    
    public r1r(final CardView e0, final FrescoMediaImageView f0, final VideoContainerHost g0, final Button button, final Button h0, final String i0, final String j0, final View view, final ToggleImageButton k0) {
        this.D0 = ((View)e0).getContext();
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        final h5j e2 = aoo.e(view);
        final cjc l0 = cjc.L0;
        this.M0 = (h5j<tmi>)e2.map((psb)l0);
        this.N0 = (h5j<tmi>)aoo.e((View)button).map((psb)l0);
        this.O0 = (h5j<tmi>)aoo.e((View)h0).map((psb)l0);
        this.K0 = k0;
        this.L0 = (h5j<Boolean>)aoo.d((View)k0).map((psb)new gy0((Object)this, 3));
    }
    
    public final void D0() {
        ((View)this.G0).setVisibility(8);
        ((View)this.K0).setVisibility(8);
    }
    
    public final void M0() {
        ((View)this.F0).setVisibility(8);
    }
    
    public final VideoContainerHost P0() {
        return this.G0;
    }
    
    public final boolean Q0() {
        return this.Q0;
    }
    
    public final void Z0(final i6d i6d) {
        this.Q0 = true;
        ((c)this.F0).p(new x7d$a(((jvg)i6d).g().toString(), (jvg)null));
        final float h = ((jvg)i6d).b.h();
        final FrescoDraweeView imageView = this.F0.getImageView();
        ImageView$ScaleType scaleType;
        if (ib0.E(jc3.b(this.D0, h)) != 2) {
            scaleType = ImageView$ScaleType.FIT_CENTER;
        }
        else {
            scaleType = ImageView$ScaleType.CENTER_CROP;
        }
        ((ImageView)imageView).setScaleType(scaleType);
        ((View)this.F0).setTranslationY((float)jc3.a(this.D0, h));
    }
    
    public final void a() {
        ((View)this.E0).setVisibility(8);
    }
    
    public final int g0() {
        return this.P0;
    }
    
    public final e81 getAutoPlayableItem() {
        return this.G0.getAutoPlayableItem();
    }
    
    public final void h0() {
        ((View)this.F0).setVisibility(0);
    }
    
    public final h5j<Boolean> j0() {
        return this.L0;
    }
    
    public final void l1() {
        this.E0.setCardBackgroundColor(null);
    }
    
    public final void setBackgroundColor(final int n) {
        this.P0 = n;
        this.E0.setCardBackgroundColor(n);
    }
    
    public final void setMuted(final boolean b) {
        this.K0.setToggledOn(b ^ true);
    }
    
    public final void show() {
        ((View)this.E0).setVisibility(0);
    }
    
    public final void t1(final Bitmap imageBitmap) {
        this.Q0 = true;
        ((ud9)this.F0.getImageView()).setImageBitmap(imageBitmap);
        final FrescoDraweeView imageView = this.F0.getImageView();
        ImageView$ScaleType scaleType;
        if (ib0.E(jc3.b(this.D0, imageBitmap.getWidth() / (float)imageBitmap.getHeight())) != 2) {
            scaleType = ImageView$ScaleType.FIT_CENTER;
        }
        else {
            scaleType = ImageView$ScaleType.CENTER_CROP;
        }
        ((ImageView)imageView).setScaleType(scaleType);
        ((View)this.F0).setTranslationY((float)jc3.a(this.D0, imageBitmap.getWidth() / (float)imageBitmap.getHeight()));
    }
    
    public final boolean u() {
        return this.K0.J0 ^ true;
    }
    
    public final void u0() {
        ((View)this.G0).setVisibility(0);
        ((View)this.K0).setVisibility(0);
    }
}
