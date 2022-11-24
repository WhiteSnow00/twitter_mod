import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;
import android.widget.CheckBox;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h84 extends sl8
{
    public final CheckBox G0;
    public final View H0;
    public final TextView I0;
    public final TextView J0;
    
    public h84(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2131625046, viewGroup, false);
        super(inflate);
        this.H0 = inflate;
        this.G0 = (CheckBox)inflate.findViewById(2131428229);
        this.I0 = (TextView)inflate.findViewById(2131428241);
        this.J0 = (TextView)inflate.findViewById(2131428240);
        inflate.setOnClickListener((View$OnClickListener)new qsk((Object)this, 23));
    }
    
    public final void l0(final CompoundButton$OnCheckedChangeListener onCheckedChangeListener) {
        ((CompoundButton)this.G0).setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
