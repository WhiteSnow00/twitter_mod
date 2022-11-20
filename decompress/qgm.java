import android.os.BaseBundle;
import java.util.Iterator;
import android.content.res.Resources;
import java.util.Set;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgm implements vpa<Context, cxp, String, Bundle>
{
    public final Set<ena> a;
    
    public qgm(final Set<ena> a) {
        czd.f((Object)a, "shareTargets");
        this.a = a;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3) {
        final Context context = (Context)o;
        final cxp cxp = (cxp)o2;
        final String s = (String)o3;
        czd.f((Object)context, "context");
        czd.f((Object)cxp, "sharedItem");
        czd.f((Object)s, "sessionToken");
        final Bundle bundle = new Bundle();
        final Resources resources = context.getResources();
        czd.e((Object)resources, "context.resources");
        final dxp c = cxp.c(resources);
        for (final ena ena : this.a) {
            final Bundle a = ena.a(c, s);
            if (cxp instanceof byp) {
                ((BaseBundle)a).putLong("tweet_id", ((byp)cxp).E0.D());
            }
            final Iterator iterator2 = ena.b().iterator();
            while (iterator2.hasNext()) {
                bundle.putBundle((String)iterator2.next(), a);
            }
        }
        return bundle;
    }
}
