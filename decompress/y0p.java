import android.view.View;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.widget.ToggleButton;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y0p
{
    public final Context a;
    public final ViewGroup b;
    public final RecyclerView c;
    public final Button d;
    public final Button e;
    public final ToggleButton f;
    public final ToggleButton g;
    
    public y0p(final Context a, final ViewGroup b) {
        this.a = a;
        this.b = b;
        (this.c = (RecyclerView)((View)b).findViewById(2131431236)).setLayoutManager((RecyclerView$m)new LinearLayoutManager(a));
        this.d = (Button)((View)b).findViewById(2131428263);
        this.e = (Button)((View)b).findViewById(2131428249);
        this.f = (ToggleButton)((View)b).findViewById(2131428255);
        this.g = (ToggleButton)((View)b).findViewById(2131430787);
    }
    
    public final void a(final Button button, final boolean b) {
        if (button.equals(this.g) && b) {
            this.f.setChecked(false);
        }
        else if (b) {
            this.g.setChecked(false);
        }
    }
}
