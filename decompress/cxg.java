import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxg implements fmj$a
{
    public final dxg a;
    
    public cxg(final dxg a) {
        this.a = a;
    }
    
    public final void a(final m9a m9a) {
        final dxg a = this.a;
        final StringBuilder sb = new StringBuilder(512);
        for (final Map.Entry<String, V> entry : ((HashMap)a.e.k()).entrySet()) {
            final String s = entry.getKey();
            final hre i0 = ((orm)entry.getValue()).I0;
            if (i0 != null) {
                final cc8$a cc8$a = new cc8$a();
                i0.c((fa3)cc8$a);
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                final NumberFormat c = flr.c;
                sb.append(s.toUpperCase(Locale.ENGLISH));
                sb.append(": ");
                sb.append(c.format(cc8$a.a));
                sb.append(" bitmaps, ");
                sb.append(c.format(cc8$a.b));
                sb.append(" bytes");
            }
        }
        m9a.b("OomeReporter.fetcher_report", (Object)sb.toString());
    }
}
