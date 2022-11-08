import android.os.BaseBundle;
import java.util.Iterator;
import android.content.res.Resources;
import java.util.Set;
import android.os.Bundle;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agm implements yqa<Context, lwp, String, Bundle>
{
    public final Set<foa> a;
    
    public agm(final Set<foa> a) {
        zzd.f((Object)a, "shareTargets");
        this.a = a;
    }
    
    public final Object a(final Object o, final Object o2, final Object o3) {
        final Context context = (Context)o;
        final lwp lwp = (lwp)o2;
        final String s = (String)o3;
        zzd.f((Object)context, "context");
        zzd.f((Object)lwp, "sharedItem");
        zzd.f((Object)s, "sessionToken");
        final Bundle bundle = new Bundle();
        final Resources resources = context.getResources();
        zzd.e((Object)resources, "context.resources");
        final mwp c = lwp.c(resources);
        for (final foa foa : this.a) {
            final Bundle a = foa.a(c, s);
            if (lwp instanceof kxp) {
                ((BaseBundle)a).putLong("tweet_id", ((kxp)lwp).D0.D());
            }
            final Iterator iterator2 = foa.b().iterator();
            while (iterator2.hasNext()) {
                bundle.putBundle((String)iterator2.next(), a);
            }
        }
        return bundle;
    }
}
