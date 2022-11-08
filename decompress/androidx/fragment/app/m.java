// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.animation.Transformation;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.animation.Animator;
import android.view.animation.Animation;
import android.content.res.TypedArray;
import android.content.Context;

public final class m
{
    public static int a(final Context context, int resourceId) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[] { resourceId });
        resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
    
    public static final class a
    {
        public final Animation a;
        public final Animator b;
        
        public a(final Animator b) {
            this.a = null;
            this.b = b;
        }
        
        public a(final Animation a) {
            this.a = a;
            this.b = null;
        }
    }
    
    public static final class b extends AnimationSet implements Runnable
    {
        public final ViewGroup C0;
        public final View D0;
        public boolean E0;
        public boolean F0;
        public boolean G0;
        
        public b(final Animation animation, final ViewGroup c0, final View d0) {
            super(false);
            this.G0 = true;
            this.C0 = c0;
            this.D0 = d0;
            this.addAnimation(animation);
            ((View)c0).post((Runnable)this);
        }
        
        public final boolean getTransformation(final long n, final Transformation transformation) {
            this.G0 = true;
            if (this.E0) {
                return this.F0 ^ true;
            }
            if (!super.getTransformation(n, transformation)) {
                this.E0 = true;
                clj.a((View)this.C0, (Runnable)this);
            }
            return true;
        }
        
        public final boolean getTransformation(final long n, final Transformation transformation, final float n2) {
            this.G0 = true;
            if (this.E0) {
                return this.F0 ^ true;
            }
            if (!super.getTransformation(n, transformation, n2)) {
                this.E0 = true;
                clj.a((View)this.C0, (Runnable)this);
            }
            return true;
        }
        
        public final void run() {
            if (!this.E0 && this.G0) {
                this.G0 = false;
                ((View)this.C0).post((Runnable)this);
            }
            else {
                this.C0.endViewTransition(this.D0);
                this.F0 = true;
            }
        }
    }
}
