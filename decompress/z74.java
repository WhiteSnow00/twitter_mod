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

public final class z74 extends el8
{
    public final CheckBox D0;
    public final View E0;
    public final TextView F0;
    public final TextView G0;
    
    public z74(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2131625044, viewGroup, false);
        super(inflate);
        this.E0 = inflate;
        this.D0 = (CheckBox)inflate.findViewById(2131428229);
        this.F0 = (TextView)inflate.findViewById(2131428241);
        this.G0 = (TextView)inflate.findViewById(2131428240);
        inflate.setOnClickListener((View$OnClickListener)new rzw((Object)this, 18));
    }
    
    public final void l0(final CompoundButton$OnCheckedChangeListener onCheckedChangeListener) {
        ((CompoundButton)this.D0).setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
