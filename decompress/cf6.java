import android.os.LocaleList;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cf6
{
    public static y4g a(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new y4g((b5g)new c5g((Object)a.a(configuration)));
        }
        return y4g.a(configuration.locale);
    }
    
    public static final class a
    {
        public static LocaleList a(final Configuration configuration) {
            return configuration.getLocales();
        }
    }
}
