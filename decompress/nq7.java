import android.content.Context;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.widget.FrameLayout;
import android.util.AttributeSet;
import com.twitter.dm.widget.DMInboxRequestsEducation;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nq7 extends v3e<yp7$c$a, el8>
{
    public nq7() {
        super((Class)yp7$c$a.class);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final Context context = ((View)viewGroup).getContext();
        final DMInboxRequestsEducation dmInboxRequestsEducation = new DMInboxRequestsEducation(context, (AttributeSet)null);
        final FrameLayout frameLayout = new FrameLayout(context);
        ((View)frameLayout).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -2));
        ((ViewGroup)frameLayout).addView((View)dmInboxRequestsEducation);
        return (c7x)new el8((View)frameLayout);
    }
}
