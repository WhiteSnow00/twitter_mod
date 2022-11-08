// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.utils;

import android.content.res.TypedArray;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Metadata;
import androidx.constraintlayout.widget.ConstraintLayout;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/rooms/utils/TwoLineSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class TwoLineSwitchView extends ConstraintLayout
{
    public final SwitchCompat U0;
    
    public TwoLineSwitchView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        LayoutInflater.from(context).inflate(2131624694, (ViewGroup)this, true);
        final View viewById = ((View)this).findViewById(2131431981);
        zzd.e((Object)viewById, "findViewById(R.id.text_title)");
        final TextView textView = (TextView)viewById;
        final View viewById2 = ((View)this).findViewById(2131431978);
        zzd.e((Object)viewById2, "findViewById(R.id.text_subtitle)");
        final TextView textView2 = (TextView)viewById2;
        final View viewById3 = ((View)this).findViewById(2131432101);
        zzd.e((Object)viewById3, "findViewById(R.id.toggle)");
        this.U0 = (SwitchCompat)viewById3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, poa.T0, 0, 0);
        zzd.e((Object)obtainStyledAttributes, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)");
        textView.setText((CharSequence)obtainStyledAttributes.getString(1));
        textView2.setText((CharSequence)obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
    }
    
    public final b5j<oyv> A() {
        return (b5j<oyv>)asy.q((View)this.U0);
    }
    
    public final void z(final boolean checked) {
        this.U0.setChecked(checked);
    }
}
