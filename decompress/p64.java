import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p64 extends nk8
{
    public final TextView E0;
    public final CheckBox F0;
    public CompoundButton$OnCheckedChangeListener G0;
    
    public p64(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(2131624563, viewGroup, false);
        super(inflate);
        final TextView e0 = (TextView)inflate.findViewById(2131431315);
        jee.l((Object)e0);
        final TextView textView = e0;
        this.E0 = e0;
        final CheckBox f0 = (CheckBox)inflate.findViewById(2131431314);
        jee.l((Object)f0);
        final CheckBox checkBox = f0;
        this.F0 = f0;
    }
}
