import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aq7 extends LinearLayout
{
    public final TextView D0;
    
    public aq7(final Context context) {
        super(context);
        View.inflate(((View)this).getContext(), 2131624319, (ViewGroup)this);
        this.setOrientation(1);
        final View viewById = ((View)this).findViewById(2131429251);
        czd.e((Object)viewById, "findViewById(R.id.footer_prompt)");
        this.D0 = (TextView)viewById;
        this.setMargins(true);
        ((View)this).setVisibility(0);
    }
    
    private final void setMargins(final boolean b) {
        LinearLayout$LayoutParams layoutParams;
        if (b) {
            layoutParams = new LinearLayout$LayoutParams(-1, -2);
            ((ViewGroup$MarginLayoutParams)layoutParams).setMargins(0, syo.a(((View)this).getContext(), 8), 0, 0);
        }
        else {
            layoutParams = new LinearLayout$LayoutParams(0, 0);
        }
        ((View)this).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setOnClickListener(final View$OnClickListener onClickListener) {
        ((View)this.D0).setOnClickListener(onClickListener);
    }
}
