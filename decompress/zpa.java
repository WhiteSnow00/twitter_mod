import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import java.util.Objects;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zpa extends mex
{
    public zpa() {
    }
    
    public zpa(final int n) {
        this.V(n);
    }
    
    @SuppressLint({ "RestrictedApi" })
    public zpa(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, qlr.e);
        this.V(cmv.h(obtainStyledAttributes, (XmlPullParser)set, "fadingMode", 0, super.h1));
        obtainStyledAttributes.recycle();
    }
    
    public final Animator T(final ViewGroup viewGroup, final View view, final l0u l0u, final l0u l0u2) {
        final float n = 0.0f;
        float floatValue = 0.0f;
        Label_0036: {
            if (l0u != null) {
                final Float n2 = l0u.a.get("android:fade:transitionAlpha");
                if (n2 != null) {
                    floatValue = n2;
                    break Label_0036;
                }
            }
            floatValue = 0.0f;
        }
        if (floatValue == 1.0f) {
            floatValue = n;
        }
        return this.W(view, floatValue, 1.0f);
    }
    
    public final Animator U(final ViewGroup viewGroup, final View view, final l0u l0u) {
        Objects.requireNonNull(ncx.a);
        if (l0u != null) {
            final Float n = l0u.a.get("android:fade:transitionAlpha");
            if (n != null) {
                final float floatValue = n;
                return this.W(view, floatValue, 0.0f);
            }
        }
        final float floatValue = 1.0f;
        return this.W(view, floatValue, 0.0f);
    }
    
    public final Animator W(final View view, final float n, final float n2) {
        if (n == n2) {
            return null;
        }
        ncx.c(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, (Property)ncx.b, new float[] { n2 });
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new zpa.zpa$b(view));
        ((nzt)this).a((nzt.e)new h0u(view) {
            public final View D0;
            
            public final void d(final nzt nzt) {
                ncx.c(this.D0, 1.0f);
                Objects.requireNonNull(ncx.a);
                nzt.F((nzt.e)this);
            }
        });
        return (Animator)ofFloat;
    }
    
    public final void k(final l0u l0u) {
        this.R(l0u);
        l0u.a.put("android:fade:transitionAlpha", ncx.a(l0u.b));
    }
}
