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

public class SimpleDraweeView extends m0c
{
    public static lyr<? extends ub> J0;
    public ub I0;
    
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
            srb.b();
            if (((View)this).isInEditMode()) {
                this.getTopLevelDrawable().setVisible(true, false);
                this.getTopLevelDrawable().invalidateSelf();
            }
            else {
                ri4.s((Object)SimpleDraweeView.J0, (Object)"SimpleDraweeView was not initialized!");
                this.I0 = (ub)SimpleDraweeView.J0.get();
            }
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, vqb.G0);
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
            srb.b();
        }
    }
    
    public final void g(final Uri uri) {
        final ub i0 = this.I0;
        i0.c = null;
        final ffk f = ((ffk)i0).f(uri);
        ((ub)f).j = this.getController();
        this.setController((ie9)((ub)f).a());
    }
    
    public ub getControllerBuilder() {
        return this.I0;
    }
    
    public void setActualImageResource(final int n) {
        final Uri a = o5w.a;
        this.g(new Uri$Builder().scheme("res").path(String.valueOf(n)).build());
    }
    
    public void setImageRequest(final a d) {
        final ub i0 = this.I0;
        i0.d = d;
        i0.j = this.getController();
        this.setController((ie9)i0.a());
    }
    
    @Override
    public void setImageResource(final int imageResource) {
        super.setImageResource(imageResource);
    }
    
    @Override
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
