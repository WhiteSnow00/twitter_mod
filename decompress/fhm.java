import android.os.BaseBundle;
import java.util.Iterator;
import android.content.res.Resources;
import java.util.Set;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fhm implements dra<Context, zxp, String, Bundle>
{
    public final Set<moa> a;
    
    public fhm(final Set<moa> a) {
        e0e.f((Object)a, "shareTargets");
        this.a = a;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3) {
        final Context context = (Context)o;
        final zxp zxp = (zxp)o2;
        final String s = (String)o3;
        e0e.f((Object)context, "context");
        e0e.f((Object)zxp, "sharedItem");
        e0e.f((Object)s, "sessionToken");
        final Bundle bundle = new Bundle();
        final Resources resources = context.getResources();
        e0e.e((Object)resources, "context.resources");
        final ayp c = zxp.c(resources);
        for (final moa moa : this.a) {
            final Bundle a = moa.a(c, s);
            if (zxp instanceof yyp) {
                ((BaseBundle)a).putLong("tweet_id", ((yyp)zxp).G0.D());
            }
            final Iterator iterator2 = moa.b().iterator();
            while (iterator2.hasNext()) {
                bundle.putBundle((String)iterator2.next(), a);
            }
        }
        return bundle;
    }
}
