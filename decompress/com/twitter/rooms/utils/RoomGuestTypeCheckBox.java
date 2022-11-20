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

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011" }, d2 = { "Lcom/twitter/rooms/utils/RoomGuestTypeCheckBox;", "Landroid/widget/FrameLayout;", "", "value", "G0", "I", "getCheckedGuestType", "()I", "setCheckedGuestType", "(I)V", "checkedGuestType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomGuestTypeCheckBox extends FrameLayout
{
    public static final int H0 = 0;
    public final View D0;
    public final wc6 E0;
    public final List<lvj<Integer, CheckableGuestTypeView>> F0;
    public int G0;
    
    public RoomGuestTypeCheckBox(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set);
        final View inflate = LayoutInflater.from(context).inflate(2131625514, (ViewGroup)this);
        czd.e((Object)inflate, "from(context).inflate(R.\u2026uest_type_checkbox, this)");
        this.D0 = inflate;
        final View viewById = inflate.findViewById(2131431039);
        czd.e((Object)viewById, "root.findViewById(R.id.room_guest_type_listener)");
        final CheckableGuestTypeView checkableGuestTypeView = (CheckableGuestTypeView)viewById;
        final View viewById2 = inflate.findViewById(2131431040);
        czd.e((Object)viewById2, "root.findViewById(R.id.room_guest_type_speaker)");
        final CheckableGuestTypeView checkableGuestTypeView2 = (CheckableGuestTypeView)viewById2;
        this.E0 = new wc6();
        this.F0 = s9i.s(new lvj((Object)0, (Object)checkableGuestTypeView), new lvj((Object)1, (Object)checkableGuestTypeView2));
    }
    
    public final int getCheckedGuestType() {
        return this.G0;
    }
    
    public final void onAttachedToWindow() {
        for (final lvj lvj : this.F0) {
            this.E0.a(aoo.f((View)lvj.E0).subscribe((lj6)new qsq((qsb)new RoomGuestTypeCheckBox$a(this, ((Number)lvj.D0).intValue()), 11)));
        }
        super.onAttachedToWindow();
    }
    
    public final void onDetachedFromWindow() {
        this.E0.e();
        super.onDetachedFromWindow();
    }
    
    public final void setCheckedGuestType(final int g0) {
        this.G0 = g0;
        final Iterator<Object> iterator = this.F0.iterator();
        while (iterator.hasNext()) {
            ((CheckableGuestTypeView)iterator.next().E0).E0.setVisibility(4);
        }
        final CheckableGuestTypeView checkableGuestTypeView = (CheckableGuestTypeView)this.F0.get(g0).E0;
        checkableGuestTypeView.E0.setVisibility(0);
        ((View)checkableGuestTypeView).announceForAccessibility((CharSequence)checkableGuestTypeView.a());
    }
}
