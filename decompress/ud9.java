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

public class ud9<DH extends sd9> extends ImageView
{
    public static boolean I0;
    public final ev0 D0;
    public float E0;
    public td9<DH> F0;
    public boolean G0;
    public boolean H0;
    
    public ud9(final Context context) {
        super(context);
        this.D0 = new ev0();
        this.E0 = 0.0f;
        this.G0 = false;
        this.H0 = false;
        this.b(context);
    }
    
    public ud9(final Context context, final AttributeSet set) {
        super(context, set);
        this.D0 = new ev0();
        this.E0 = 0.0f;
        this.G0 = false;
        this.H0 = false;
        this.b(context);
    }
    
    public ud9(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.D0 = new ev0();
        this.E0 = 0.0f;
        this.G0 = false;
        this.H0 = false;
        this.b(context);
    }
    
    public static void setGlobalLegacyVisibilityHandlingEnabled(final boolean i0) {
        ud9.I0 = i0;
    }
    
    public final void b(final Context context) {
        try {
            pqb.b();
            if (this.G0) {
                return;
            }
            boolean h0 = true;
            this.G0 = true;
            this.F0 = (td9<DH>)new td9((sd9)null);
            final ColorStateList imageTintList = this.getImageTintList();
            if (imageTintList == null) {
                return;
            }
            this.setColorFilter(imageTintList.getDefaultColor());
            if (!ud9.I0 || context.getApplicationInfo().targetSdkVersion < 24) {
                h0 = false;
            }
            this.H0 = h0;
        }
        finally {
            pqb.b();
        }
    }
    
    public final void c() {
        if (this.H0) {
            final Drawable drawable = this.getDrawable();
            if (drawable != null) {
                drawable.setVisible(((View)this).getVisibility() == 0, false);
            }
        }
    }
    
    public float getAspectRatio() {
        return this.E0;
    }
    
    public qd9 getController() {
        return this.F0.e;
    }
    
    public DH getHierarchy() {
        final sd9 d = this.F0.d;
        Objects.requireNonNull(d);
        return (DH)d;
    }
    
    public Drawable getTopLevelDrawable() {
        return this.F0.d();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c();
        final td9<DH> f0 = this.F0;
        f0.f.a(rd9.a.R0);
        f0.b = true;
        f0.b();
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
        final td9<DH> f0 = this.F0;
        f0.f.a(rd9.a.S0);
        f0.b = false;
        f0.b();
    }
    
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.c();
        final td9<DH> f0 = this.F0;
        f0.f.a(rd9.a.R0);
        f0.b = true;
        f0.b();
    }
    
    public void onMeasure(int a, int b) {
        final ev0 d0 = this.D0;
        d0.a = a;
        d0.b = b;
        final float e0 = this.E0;
        final ViewGroup$LayoutParams layoutParams = ((View)this).getLayoutParams();
        a = ((View)this).getPaddingLeft();
        final int n = ((View)this).getPaddingRight() + a;
        a = ((View)this).getPaddingTop();
        final int n2 = ((View)this).getPaddingBottom() + a;
        if (e0 > 0.0f) {
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
                    d0.b = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View$MeasureSpec.getSize(d0.a) - n) / e0 + n2), d0.b), 1073741824);
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
                        d0.a = View$MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View$MeasureSpec.getSize(d0.b) - n2) * e0 + n), d0.a), 1073741824);
                    }
                }
            }
        }
        final ev0 d2 = this.D0;
        super.onMeasure(d2.a, d2.b);
    }
    
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.c();
        final td9<DH> f0 = this.F0;
        f0.f.a(rd9.a.S0);
        f0.b = false;
        f0.b();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final td9<DH> f0 = this.F0;
        return (f0.e() && f0.e.k(motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        this.c();
    }
    
    public void setAspectRatio(final float e0) {
        if (e0 == this.E0) {
            return;
        }
        this.E0 = e0;
        ((View)this).requestLayout();
    }
    
    public void setController(final qd9 qd9) {
        this.F0.g(qd9);
        super.setImageDrawable(this.F0.d());
    }
    
    public void setHierarchy(final DH dh) {
        this.F0.h((sd9)dh);
        super.setImageDrawable(this.F0.d());
    }
    
    @Deprecated
    public void setImageBitmap(final Bitmap imageBitmap) {
        this.b(((View)this).getContext());
        this.F0.g((qd9)null);
        super.setImageBitmap(imageBitmap);
    }
    
    @Deprecated
    public void setImageDrawable(final Drawable imageDrawable) {
        this.b(((View)this).getContext());
        this.F0.g((qd9)null);
        super.setImageDrawable(imageDrawable);
    }
    
    @Deprecated
    public void setImageResource(final int imageResource) {
        this.b(((View)this).getContext());
        this.F0.g((qd9)null);
        super.setImageResource(imageResource);
    }
    
    @Deprecated
    public void setImageURI(final Uri imageURI) {
        this.b(((View)this).getContext());
        this.F0.g((qd9)null);
        super.setImageURI(imageURI);
    }
    
    public void setLegacyVisibilityHandlingEnabled(final boolean h0) {
        this.H0 = h0;
    }
    
    public final String toString() {
        final e5j$a b = e5j.b((Object)this);
        final td9<DH> f0 = this.F0;
        String string;
        if (f0 != null) {
            string = f0.toString();
        }
        else {
            string = "<no holder set>";
        }
        b.c("holder", (Object)string);
        return b.toString();
    }
}
