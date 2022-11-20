import java.util.Iterator;
import android.os.Build$VERSION;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ev8
{
    public static final String a;
    
    static {
        final String g = o9g.g("DiagnosticsWrkr");
        czd.e((Object)g, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = g;
    }
    
    public static final String a(final esx esx, final vsx vsx, final u5s u5s, final List list) {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (Build$VERSION.SDK_INT >= 23) {
            s = "Job Id";
        }
        else {
            s = "Alarm Id";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t ");
        sb2.append(s);
        sb2.append("\t State\t Unique Name\t Tags\t");
        sb.append(sb2.toString());
        for (final rsx rsx : list) {
            final t5s c = u5s.c(rp9.P(rsx));
            Integer value;
            if (c != null) {
                value = c.c;
            }
            else {
                value = null;
            }
            final String m0 = mq4.m0((Iterable)esx.b(rsx.a), (CharSequence)",", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
            final String m2 = mq4.m0((Iterable)vsx.a(rsx.a), (CharSequence)",", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
            final StringBuilder a = ta0.A('\n');
            a.append(rsx.a);
            a.append("\t ");
            a.append(rsx.c);
            a.append("\t ");
            a.append(value);
            a.append("\t ");
            a.append(((Enum)rsx.b).name());
            a.append("\t ");
            a.append(m0);
            a.append("\t ");
            a.append(m2);
            a.append('\t');
            sb.append(a.toString());
        }
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
