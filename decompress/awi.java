import android.content.Context;
import android.content.Intent;
import com.twitter.notifications.timeline.GenericActivityWebViewActivity;
import android.net.Uri;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awi extends i9t
{
    public final Activity c;
    
    public awi(final Activity c, final d6w d6w, final fci<?> fci) {
        super(d6w, (fci)fci);
        this.c = c;
    }
    
    public final void a(final c9t c9t) {
        final boolean b = c9t instanceof ief;
        boolean b2 = false;
        Label_0052: {
            if (b) {
                final ief ief = (ief)c9t;
                if (!y5w.a().a(Uri.parse(ief.b)) && GenericActivityWebViewActivity.d0(ief.b)) {
                    b2 = true;
                    break Label_0052;
                }
            }
            b2 = false;
        }
        if (b2 && b) {
            final ief ief2 = (ief)c9t;
            final Activity c = this.c;
            final String b3 = ief2.b;
            if (GenericActivityWebViewActivity.d0(b3)) {
                ((Context)c).startActivity(new Intent((Context)c, (Class)GenericActivityWebViewActivity.class).setData(Uri.parse(b3)));
            }
            return;
        }
        this.b(c9t, (dda)null);
    }
}
