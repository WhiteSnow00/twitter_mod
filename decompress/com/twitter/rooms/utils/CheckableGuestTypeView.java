// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.utils;

import androidx.appcompat.widget.AppCompatTextView;
import android.content.res.TypedArray;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/rooms/utils/CheckableGuestTypeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class CheckableGuestTypeView extends FrameLayout
{
    public static final int G0 = 0;
    public final View D0;
    public final View E0;
    public final TypefacesTextView F0;
    
    public CheckableGuestTypeView(Context obtainStyledAttributes, final AttributeSet set) {
        czd.f((Object)obtainStyledAttributes, "context");
        super(obtainStyledAttributes, set);
        final View inflate = LayoutInflater.from(obtainStyledAttributes).inflate(2131624178, (ViewGroup)this);
        czd.d((Object)inflate, "null cannot be cast to non-null type android.view.View");
        this.D0 = inflate;
        final View viewById = inflate.findViewById(2131428203);
        czd.d((Object)viewById, "null cannot be cast to non-null type android.view.View");
        this.E0 = viewById;
        final View viewById2 = inflate.findViewById(2131428205);
        czd.d((Object)viewById2, "null cannot be cast to non-null type com.twitter.ui.components.text.legacy.TypefacesTextView");
        final TypefacesTextView f0 = (TypefacesTextView)viewById2;
        this.F0 = f0;
        final View viewById3 = inflate.findViewById(2131428204);
        czd.d((Object)viewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView)viewById3;
        obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, ii8.H0, 0, 0);
        try {
            ((TextView)f0).setText((CharSequence)((TypedArray)obtainStyledAttributes).getString(1));
            imageView.setImageDrawable(((TypedArray)obtainStyledAttributes).getDrawable(0));
            ((TypedArray)obtainStyledAttributes).recycle();
            j6x.z((View)this, (vf)new CheckableGuestTypeView$a(this));
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final String a() {
        String s;
        if (this.E0.getVisibility() == 0) {
            s = ((View)this).getContext().getString(2131952442);
        }
        else {
            s = ((View)this).getContext().getString(2131955462);
        }
        czd.e((Object)s, "if (check.visibility == \u2026ng.not_checked)\n        }");
        final String string = ((View)this).getContext().getString(2131959445, new Object[] { ((AppCompatTextView)this.F0).getText() });
        czd.e((Object)string, "context.getString(R.stri\u2026as_guest_type, text.text)");
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(", ");
        sb.append(s);
        return sb.toString();
    }
}
