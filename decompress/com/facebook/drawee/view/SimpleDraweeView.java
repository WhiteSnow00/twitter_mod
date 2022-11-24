// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.drawee.view;

import android.content.res.TypedArray;
import android.view.View;
import com.facebook.imagepipeline.request.a;
import android.net.Uri$Builder;
import android.net.Uri;
import android.util.AttributeSet;
import android.content.Context;

public class SimpleDraweeView extends o0c
{
    public static zzr<? extends tb> M0;
    public tb L0;
    
    public SimpleDraweeView(final Context context) {
        super(context);
        this.f(context, null);
    }
    
    public SimpleDraweeView(final Context context, final AttributeSet set) {
        super(context, set);
        this.f(context, set);
    }
    
    public SimpleDraweeView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f(context, set);
    }
    
    public final void f(final Context context, AttributeSet obtainStyledAttributes) {
        try {
            rrb.b();
            if (((View)this).isInEditMode()) {
                this.getTopLevelDrawable().setVisible(true, false);
                this.getTopLevelDrawable().invalidateSelf();
            }
            else {
                xd.K(SimpleDraweeView.M0, "SimpleDraweeView was not initialized!");
                this.L0 = (tb)SimpleDraweeView.M0.get();
            }
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, b1b.X0);
                try {
                    if (((TypedArray)obtainStyledAttributes).hasValue(2)) {
                        this.g(Uri.parse(((TypedArray)obtainStyledAttributes).getString(2)));
                    }
                    else if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                        final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(0, -1);
                        if (resourceId != -1) {
                            if (((View)this).isInEditMode()) {
                                this.setImageResource(resourceId);
                            }
                            else {
                                this.setActualImageResource(resourceId);
                            }
                        }
                    }
                }
                finally {
                    ((TypedArray)obtainStyledAttributes).recycle();
                }
            }
        }
        finally {
            rrb.b();
        }
    }
    
    public final void g(final Uri uri) {
        final tb l0 = this.L0;
        l0.c = null;
        final yfk f = ((yfk)l0).f(uri);
        ((tb)f).j = this.getController();
        this.setController((te9)((tb)f).a());
    }
    
    public tb getControllerBuilder() {
        return this.L0;
    }
    
    public void setActualImageResource(final int n) {
        final Uri a = o6w.a;
        this.g(new Uri$Builder().scheme("res").path(String.valueOf(n)).build());
    }
    
    public void setImageRequest(final a d) {
        final tb l0 = this.L0;
        l0.d = (REQUEST)d;
        l0.j = this.getController();
        this.setController((te9)l0.a());
    }
    
    public void setImageResource(final int imageResource) {
        super.setImageResource(imageResource);
    }
    
    public void setImageURI(final Uri uri) {
        this.g(uri);
    }
    
    public void setImageURI(final String s) {
        Uri parse;
        if (s != null) {
            parse = Uri.parse(s);
        }
        else {
            parse = null;
        }
        this.g(parse);
    }
}
