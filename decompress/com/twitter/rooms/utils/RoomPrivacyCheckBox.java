// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.utils;

import java.util.Iterator;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.View;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n" }, d2 = { "Lcom/twitter/rooms/utils/RoomPrivacyCheckBox;", "Landroid/widget/FrameLayout;", "", "getPrivacyControls", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomPrivacyCheckBox extends FrameLayout
{
    public static final int J0 = 0;
    public final View D0;
    public final CheckableRowView E0;
    public final List<lvj<Integer, CheckableRowView>> F0;
    public int G0;
    public final nnl<Integer> H0;
    public final wc6 I0;
    
    public RoomPrivacyCheckBox(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set);
        final View inflate = LayoutInflater.from(context).inflate(2131625540, (ViewGroup)this);
        czd.e((Object)inflate, "from(context).inflate(R.\u2026m_privacy_checkbox, this)");
        this.D0 = inflate;
        final View viewById = inflate.findViewById(2131430463);
        czd.e((Object)viewById, "root.findViewById(R.id.option1)");
        final CheckableRowView checkableRowView = (CheckableRowView)viewById;
        final View viewById2 = inflate.findViewById(2131430464);
        czd.e((Object)viewById2, "root.findViewById(R.id.option2)");
        final CheckableRowView e0 = (CheckableRowView)viewById2;
        this.E0 = e0;
        final View viewById3 = inflate.findViewById(2131430465);
        czd.e((Object)viewById3, "root.findViewById(R.id.option3)");
        this.F0 = s9i.s(new lvj((Object)0, (Object)viewById3), new lvj((Object)1, (Object)e0), new lvj((Object)2, (Object)checkableRowView));
        this.G0 = 1;
        this.H0 = (nnl<Integer>)new nnl();
        this.I0 = new wc6();
    }
    
    public final int getPrivacyControls() {
        return this.G0;
    }
    
    public final void onAttachedToWindow() {
        this.E0.E0.setVisibility(0);
        for (final lvj lvj : this.F0) {
            this.I0.a(aoo.f((View)lvj.E0).subscribe((lj6)new jdi((qsb)new RoomPrivacyCheckBox$a(this, ((Number)lvj.D0).intValue()), 20)));
        }
        super.onAttachedToWindow();
    }
    
    public final void onDetachedFromWindow() {
        this.I0.e();
        super.onDetachedFromWindow();
    }
}
