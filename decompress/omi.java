import android.text.style.URLSpan;
import android.content.Context;
import android.net.Uri;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omi extends nmi
{
    public omi(final String s) {
        super(s);
    }
    
    public final void onClick(final View view) {
        final Uri parse = Uri.parse(((URLSpan)this).getURL());
        final Context context = view.getContext();
        context.startActivity(bn.a().a(context, (zm)new dmx(parse)));
    }
}
