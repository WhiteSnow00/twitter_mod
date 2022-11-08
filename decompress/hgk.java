import android.view.View$OnClickListener;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hgk
{
    public final Context a;
    public final Button b;
    public final View c;
    
    public hgk(final View c) {
        this.a = c.getContext();
        this.c = c;
        this.b = (Button)c.findViewById(2131430585);
    }
    
    public final void a(final Uri uri) {
        ((View)this.b).setOnClickListener((View$OnClickListener)new ggk((Object)this, (Object)uri, 0));
    }
}
