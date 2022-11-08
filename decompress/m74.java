import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m74 extends el8
{
    public final TextView D0;
    public final CheckBox E0;
    public CompoundButton$OnCheckedChangeListener F0;
    
    public m74(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2131624563, viewGroup, false);
        super(inflate);
        final TextView d0 = (TextView)inflate.findViewById(2131431313);
        pf8.r(d0);
        final TextView textView = d0;
        this.D0 = d0;
        final CheckBox e0 = (CheckBox)inflate.findViewById(2131431312);
        pf8.r(e0);
        final CheckBox checkBox = e0;
        this.E0 = e0;
    }
}
