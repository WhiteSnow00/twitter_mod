import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pal implements View$OnClickListener
{
    public final View D0;
    public a E0;
    
    public pal(final View d0, final sal sal) {
        this.D0 = d0;
        int visibility = 0;
        d0.setEnabled(false);
        d0.setOnClickListener((View$OnClickListener)null);
        d0.setVisibility(0);
        final String title = sal.getTitle();
        final View viewById = d0.findViewById(2131432635);
        final int a = c5j.a;
        v68.P((TextView)viewById, title);
        v68.P((TextView)d0.findViewById(2131432634), sal.b());
        final Button button = (Button)d0.findViewById(2131430694);
        ((TextView)button).setText((CharSequence)sal.c());
        ((View)button).setOnClickListener((View$OnClickListener)this);
        final String d2 = sal.d();
        final Button button2 = (Button)d0.findViewById(2131431294);
        if (d2 == null) {
            visibility = 8;
        }
        ((View)button2).setVisibility(visibility);
        ((TextView)button2).setText((CharSequence)d2);
        ((View)button2).setOnClickListener((View$OnClickListener)this);
    }
    
    public final void onClick(final View view) {
        if (this.E0 != null) {
            if (view.getId() == 2131430694) {
                this.E0.h4();
            }
            else if (view.getId() == 2131431294) {
                this.E0.D1();
            }
        }
    }
    
    public interface a
    {
        void D1();
        
        void h4();
    }
}
