// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.utils.survey.view;

import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\tR*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013" }, d2 = { "Lcom/twitter/rooms/ui/utils/survey/view/PostSurveyItemView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lfzv;", "listener", "setOnCheckedListener", "", "text", "setText", "", "resId", "", "value", "H0", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "feature.tfa.rooms.ui.utils.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
@SuppressLint({ "Recycle" })
public final class PostSurveyItemView extends FrameLayout
{
    public static final int I0 = 0;
    public final View D0;
    public final TextView E0;
    public final ImageView F0;
    public qsb<? super PostSurveyItemView, fzv> G0;
    public boolean H0;
    
    public PostSurveyItemView(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
        final View inflate = LayoutInflater.from(context).inflate(2131625752, (ViewGroup)this);
        czd.d((Object)inflate, "null cannot be cast to non-null type android.view.View");
        this.D0 = inflate;
        this.E0 = (TextView)inflate.findViewById(2131431847);
        this.F0 = (ImageView)inflate.findViewById(2131431846);
        inflate.setOnClickListener((View$OnClickListener)new fho((Object)this, 1));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16843087 });
        final CharSequence text = obtainStyledAttributes.getText(0);
        czd.e((Object)text, "getText(0)");
        this.setText(text);
        obtainStyledAttributes.recycle();
    }
    
    public final void setChecked(final boolean h0) {
        if (this.H0 == h0) {
            return;
        }
        this.H0 = h0;
        final ImageView f0 = this.F0;
        int imageResource;
        if (h0) {
            imageResource = 2131231787;
        }
        else {
            imageResource = 2131231788;
        }
        f0.setImageResource(imageResource);
    }
    
    public final void setOnCheckedListener(final qsb<? super PostSurveyItemView, fzv> g0) {
        czd.f((Object)g0, "listener");
        this.G0 = g0;
    }
    
    public final void setText(final int text) {
        this.E0.setText(text);
    }
    
    public final void setText(final CharSequence text) {
        this.E0.setText(text);
    }
}
