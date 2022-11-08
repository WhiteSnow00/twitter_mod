import android.net.Uri;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.View$MeasureSpec;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public class me9<DH extends ke9> extends ImageView
{
    public static boolean H0;
    public final lv0 C0;
    public float D0;
    public le9<DH> E0;
    public boolean F0;
    public boolean G0;
    
    public me9(final Context context) {
        super(context);
        this.C0 = new lv0();
        this.D0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.b(context);
    }
    
    public me9(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = new lv0();
        this.D0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.b(context);
    }
    
    public me9(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.C0 = new lv0();
        this.D0 = 0.0f;
        this.F0 = false;
        this.G0 = false;
        this.b(context);
    }
    
    public static void setGlobalLegacyVisibilityHandlingEnabled(final boolean h0) {
        me9.H0 = h0;
    }
    
    public final void b(final Context context) {
        try {
            srb.b();
            if (this.F0) {
                return;
            }
            boolean g0 = true;
            this.F0 = true;
            this.E0 = new le9<DH>(null);
            final ColorStateList imageTintList = this.getImageTintList();
            if (imageTintList == null) {
                return;
            }
            this.setColorFilter(imageTintList.getDefaultColor());
            if (!me9.H0 || context.getApplicationInfo().targetSdkVersion < 24) {
                g0 = false;
            }
            this.G0 = g0;
        }
        finally {
            srb.b();
        }
    }
    
    public final void c() {
        if (this.G0) {
            final Drawable drawable = this.getDrawable();
            if (drawable != null) {
                drawable.setVisible(((View)this).getVisibility() == 0, false);
            }
        }
    }
    
    public float getAspectRatio() {
        return this.D0;
    }
    
    public ie9 getController() {
        return this.E0.e;
    }
    
    public DH getHierarchy() {
        final ke9 d = this.E0.d;
        Objects.requireNonNull(d);
        return (DH)d;
    }
    
    public Drawable getTopLevelDrawable() {
        return this.E0.d();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c();
        final le9<DH> e0 = this.E0;
        e0.f.a(je9.a.Q0);
        e0.b = true;
        e0.b();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
        final le9<DH> e0 = this.E0;
        e0.f.a(je9.a.R0);
        e0.b = false;
        e0.b();
    }
    
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.c();
        final le9<DH> e0 = this.E0;
        e0.f.a(je9.a.Q0);
        e0.b = true;
        e0.b();
    }
    
    public void onMeasure(int a, int b) {
        final lv0 c0 = this.C0;
        c0.a = a;
        c0.b = b;
        final float d0 = this.D0;
        final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
        a = ((View)this).getPaddingLeft();
        final int n = ((View)this).getPaddingRight() + a;
        a = ((View)this).getPaddingTop();
        final int n2 = ((View)this).getPaddingBottom() + a;
        if (d0 > 0.0f) {
            if (layoutParams != null) {
                a = layoutParams.height;
                b = 1;
                if (a != 0 && a != -2) {
                    a = 0;
                }
                else {
                    a = 1;
                }
                if (a != 0) {
                    c0.b = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View$MeasureSpec.getSize(c0.a) - n) / d0 + n2), c0.b), 1073741824);
                }
                else {
                    final int width = layoutParams.width;
                    a = b;
                    if (width != 0) {
                        if (width == -2) {
                            a = b;
                        }
                        else {
                            a = 0;
                        }
                    }
                    if (a != 0) {
                        c0.a = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View$MeasureSpec.getSize(c0.b) - n2) * d0 + n), c0.a), 1073741824);
                    }
                }
            }
        }
        final lv0 c2 = this.C0;
        super.onMeasure(c2.a, c2.b);
    }
    
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.c();
        final le9<DH> e0 = this.E0;
        e0.f.a(je9.a.R0);
        e0.b = false;
        e0.b();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final le9<DH> e0 = this.E0;
        return (e0.e() && e0.e.f(motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        this.c();
    }
    
    public void setAspectRatio(final float d0) {
        if (d0 == this.D0) {
            return;
        }
        this.D0 = d0;
        ((View)this).requestLayout();
    }
    
    public void setController(final ie9 ie9) {
        this.E0.g(ie9);
        super.setImageDrawable(this.E0.d());
    }
    
    public void setHierarchy(final DH dh) {
        this.E0.h(dh);
        super.setImageDrawable(this.E0.d());
    }
    
    @Deprecated
    public void setImageBitmap(final Bitmap imageBitmap) {
        this.b(((View)this).getContext());
        this.E0.g(null);
        super.setImageBitmap(imageBitmap);
    }
    
    @Deprecated
    public void setImageDrawable(final Drawable imageDrawable) {
        this.b(((View)this).getContext());
        this.E0.g(null);
        super.setImageDrawable(imageDrawable);
    }
    
    @Deprecated
    public void setImageResource(final int imageResource) {
        this.b(((View)this).getContext());
        this.E0.g(null);
        super.setImageResource(imageResource);
    }
    
    @Deprecated
    public void setImageURI(final Uri imageURI) {
        this.b(((View)this).getContext());
        this.E0.g(null);
        super.setImageURI(imageURI);
    }
    
    public void setLegacyVisibilityHandlingEnabled(final boolean g0) {
        this.G0 = g0;
    }
    
    public final String toString() {
        final y4j$a b = y4j.b((Object)this);
        final le9<DH> e0 = this.E0;
        String string;
        if (e0 != null) {
            string = e0.toString();
        }
        else {
            string = "<no holder set>";
        }
        b.c("holder", (Object)string);
        return b.toString();
    }
}
