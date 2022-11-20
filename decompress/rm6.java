import android.os.Bundle;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rm6
{
    public static final dce$a a;
    
    static {
        a = dce.d;
    }
    
    public static final <T extends ContentViewArgs> T a(final RetainedObjectGraph retainedObjectGraph, final Class<T> clazz) {
        final Bundle b = ((cj8)((co1)retainedObjectGraph).B((Class)cj8.class)).B1().b;
        czd.e((Object)b, "getSubgraph(DefaultRetai\u2026tainedArguments.arguments");
        final ContentViewArgs d = d(b, clazz);
        if (d != null) {
            return (T)d;
        }
        throw new IllegalArgumentException(da8.j("There was an error obtaining ", clazz.getName(), ". Make sure the parameters were correctly sent.").toString());
    }
    
    public static final <T extends qm6> String b(final Class<T> clazz) {
        String s;
        if (bn6.class.isAssignableFrom(clazz)) {
            s = "content_view_result:data";
        }
        else {
            if (!ContentViewArgs.class.isAssignableFrom(clazz)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("No mapping for bundle key name to: ");
                sb.append(clazz);
                throw new IllegalArgumentException(sb.toString());
            }
            s = "content_view_args:data";
        }
        return s;
    }
    
    public static final <T extends qm6> Bundle c(final T t) {
        czd.f((Object)t, "<this>");
        return jse.b((Object)t, b(t.getClass()), (Bundle)null, (dce)rm6.a, 2);
    }
    
    public static final <T extends ContentViewArgs> T d(final Bundle bundle, final Class<T> clazz) {
        return (T)jse.c(bundle, (Class)clazz, b(clazz), (dce)rm6.a);
    }
    
    public static final <T extends ContentViewArgs> T e(final Bundle bundle, final Class<T> clazz, T t) {
        czd.f((Object)t, "defaultValue");
        final ContentViewArgs d = d(bundle, clazz);
        if (d != null) {
            t = (T)d;
        }
        return t;
    }
    
    public static final <T extends bn6> T f(final Bundle bundle, final Class<T> clazz) {
        czd.f((Object)clazz, "clazz");
        return (T)jse.c(bundle, (Class)clazz, b(clazz), (dce)rm6.a);
    }
}
