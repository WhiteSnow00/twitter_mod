import androidx.appcompat.widget.AppCompatImageButton;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnLongClickListener;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import com.google.android.material.internal.CheckableImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import android.annotation.SuppressLint;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ViewConstructor" })
public final class n8r extends LinearLayout
{
    public final TextInputLayout F0;
    public final AppCompatTextView G0;
    public CharSequence H0;
    public final CheckableImageButton I0;
    public ColorStateList J0;
    public PorterDuff$Mode K0;
    public View$OnLongClickListener L0;
    public boolean M0;
    
    public n8r(final TextInputLayout f0, final gbt gbt) {
        super(((View)f0).getContext());
        this.F0 = f0;
        ((View)this).setVisibility(8);
        this.setOrientation(0);
        ((View)this).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388611));
        final CheckableImageButton i0 = (CheckableImageButton)LayoutInflater.from(((View)this).getContext()).inflate(2131624278, (ViewGroup)this, false);
        this.I0 = i0;
        final Context context = ((View)this).getContext();
        CharSequence h0 = null;
        final AppCompatTextView g0 = new AppCompatTextView(context, (AttributeSet)null);
        this.G0 = g0;
        if (hog.f(((View)this).getContext())) {
            nlg.g((ViewGroup$MarginLayoutParams)((View)i0).getLayoutParams(), 0);
        }
        this.c(null);
        this.d(null);
        if (gbt.o(62)) {
            this.J0 = hog.a(((View)this).getContext(), gbt, 62);
        }
        if (gbt.o(63)) {
            this.K0 = gdx.e(gbt.j(63, -1), (PorterDuff$Mode)null);
        }
        if (gbt.o(61)) {
            this.b(gbt.g(61));
            if (gbt.o(60)) {
                this.a(gbt.n(60));
            }
            i0.setCheckable(gbt.a(59, true));
        }
        ((View)g0).setVisibility(8);
        ((View)g0).setId(2131431995);
        ((View)g0).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
        final WeakHashMap a = b7x.a;
        b7x$g.f((View)g0, 1);
        uks.f((TextView)g0, gbt.l(55, 0));
        if (gbt.o(56)) {
            ((TextView)g0).setTextColor(gbt.c(56));
        }
        final CharSequence n = gbt.n(54);
        if (!TextUtils.isEmpty(n)) {
            h0 = n;
        }
        this.H0 = h0;
        ((TextView)g0).setText(n);
        this.g();
        ((ViewGroup)this).addView((View)i0);
        ((ViewGroup)this).addView((View)g0);
    }
    
    public final void a(final CharSequence contentDescription) {
        if (((View)this.I0).getContentDescription() != contentDescription) {
            ((View)this.I0).setContentDescription(contentDescription);
        }
    }
    
    public final void b(final Drawable imageDrawable) {
        ((AppCompatImageButton)this.I0).setImageDrawable(imageDrawable);
        if (imageDrawable != null) {
            i4d.a(this.F0, this.I0, this.J0, this.K0);
            this.e(true);
            i4d.c(this.F0, this.I0, this.J0);
        }
        else {
            this.e(false);
            this.c(null);
            this.d(null);
            this.a(null);
        }
    }
    
    public final void c(final View$OnClickListener onClickListener) {
        final CheckableImageButton i0 = this.I0;
        final View$OnLongClickListener l0 = this.L0;
        ((View)i0).setOnClickListener(onClickListener);
        i4d.d(i0, l0);
    }
    
    public final void d(final View$OnLongClickListener view$OnLongClickListener) {
        this.L0 = view$OnLongClickListener;
        final CheckableImageButton i0 = this.I0;
        ((View)i0).setOnLongClickListener(view$OnLongClickListener);
        i4d.d(i0, view$OnLongClickListener);
    }
    
    public final void e(final boolean b) {
        final int visibility = ((View)this.I0).getVisibility();
        int visibility2 = 0;
        if (visibility == 0 != b) {
            final CheckableImageButton i0 = this.I0;
            if (!b) {
                visibility2 = 8;
            }
            ((View)i0).setVisibility(visibility2);
            this.f();
            this.g();
        }
    }
    
    public final void f() {
        final EditText j0 = this.F0.J0;
        if (j0 == null) {
            return;
        }
        final int visibility = ((View)this.I0).getVisibility();
        final int n = 0;
        int f;
        if (visibility == 0) {
            f = n;
        }
        else {
            final WeakHashMap a = b7x.a;
            f = b7x$e.f((View)j0);
        }
        final AppCompatTextView g0 = this.G0;
        final int compoundPaddingTop = ((TextView)j0).getCompoundPaddingTop();
        final int dimensionPixelSize = ((View)this).getContext().getResources().getDimensionPixelSize(2131166363);
        final int compoundPaddingBottom = ((TextView)j0).getCompoundPaddingBottom();
        final WeakHashMap a2 = b7x.a;
        b7x$e.k((View)g0, f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }
    
    public final void g() {
        final CharSequence h0 = this.H0;
        int visibility = 8;
        int visibility2;
        if (h0 != null && !this.M0) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        if (((View)this.I0).getVisibility() == 0 || visibility2 == 0) {
            visibility = 0;
        }
        ((View)this).setVisibility(visibility);
        ((View)this.G0).setVisibility(visibility2);
        this.F0.v();
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.f();
    }
}
