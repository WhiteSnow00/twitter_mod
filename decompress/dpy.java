import android.os.LocaleList;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Locale;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpy
{
    public final Context a;
    
    public dpy(final Context a) {
        this.a = a;
    }
    
    public static String b(final Locale locale) {
        final String value = String.valueOf(locale.getLanguage());
        String concat;
        if (locale.getCountry().isEmpty()) {
            concat = "";
        }
        else {
            final String value2 = String.valueOf(locale.getCountry());
            if (value2.length() != 0) {
                concat = "_".concat(value2);
            }
            else {
                concat = new String("_");
            }
        }
        final String value3 = String.valueOf(concat);
        String concat2;
        if (value3.length() != 0) {
            concat2 = value.concat(value3);
        }
        else {
            concat2 = new String(value);
        }
        return concat2;
    }
    
    public final List<String> a() {
        final Configuration configuration = this.a.getResources().getConfiguration();
        if (Build$VERSION.SDK_INT >= 24) {
            final LocaleList locales = configuration.getLocales();
            final ArrayList list = new ArrayList<String>(locales.size());
            for (int i = 0; i < locales.size(); ++i) {
                list.add(b(locales.get(i)));
            }
            return (List<String>)list;
        }
        return Collections.singletonList(b(configuration.locale));
    }
}
