import android.os.LocaleList;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jg6
{
    public static t5g a(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new t5g((w5g)new x5g(a.a(configuration)));
        }
        return t5g.a(new Locale[] { configuration.locale });
    }
    
    public static final class a
    {
        public static LocaleList a(final Configuration configuration) {
            return configuration.getLocales();
        }
    }
}
