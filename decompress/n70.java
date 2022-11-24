import android.content.Intent;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n70 implements b6w
{
    public final Context a;
    
    public n70(final Context a) {
        this.a = a;
    }
    
    public final void a(final String s) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }
}
