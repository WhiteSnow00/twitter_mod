// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.utils;

import android.content.res.TypedArray;
import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/utils/CheckableRowView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class CheckableRowView extends FrameLayout
{
    public final View D0;
    public final View E0;
    
    public CheckableRowView(Context obtainStyledAttributes, final AttributeSet set) {
        czd.f((Object)obtainStyledAttributes, "context");
        super(obtainStyledAttributes, set);
        final View inflate = LayoutInflater.from(obtainStyledAttributes).inflate(2131624180, (ViewGroup)this);
        czd.d((Object)inflate, "null cannot be cast to non-null type android.view.View");
        this.D0 = inflate;
        final View viewById = inflate.findViewById(2131428200);
        czd.d((Object)viewById, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView)viewById;
        final View viewById2 = inflate.findViewById(2131428199);
        czd.d((Object)viewById2, "null cannot be cast to non-null type android.view.View");
        this.E0 = viewById2;
        final View viewById3 = inflate.findViewById(2131428201);
        czd.d((Object)viewById3, "null cannot be cast to non-null type com.twitter.ui.components.text.legacy.TypefacesTextView");
        final TypefacesTextView typefacesTextView = (TypefacesTextView)viewById3;
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, ii8.I0, 0, 0);
        try {
            ((TextView)typefacesTextView).setText((CharSequence)((TypedArray)obtainStyledAttributes).getString(1));
            ((TextView)typefacesTextView).setTextColor(((TypedArray)obtainStyledAttributes).getColor(2, 2130969091));
            imageView.setImageDrawable(((TypedArray)obtainStyledAttributes).getDrawable(0));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
}
