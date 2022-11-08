import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yf1 implements uwo
{
    public static void b(final List<d3j> list, final ijf<String> ijf) {
        for (final d3j d3j : list) {
            final StringBuilder g = w48.g("\u2022 ");
            g.append(d3j.a);
            ijf.p((Object)g.toString());
            final List b = d3j.b;
            if (b != null) {
                for (final String s : b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("\t\u25e6 ");
                    sb.append(s);
                    ijf.p((Object)sb.toString());
                }
            }
        }
    }
    
    public final uwo$a a(final f3j f3j) {
        final e3j g = f3j.g;
        if (g != null) {
            final ijf$a ijf$a = new ijf$a(g.b.size());
            final ijf$a ijf$a2 = new ijf$a(g.a.size());
            b(g.a, (ijf<String>)ijf$a2);
            b(g.b, (ijf<String>)ijf$a);
            final List list = (List)((h4j)ijf$a2).e();
            final List list2 = (List)((h4j)ijf$a).e();
            return new uwo$a(list);
        }
        e9a.d(new Throwable("/oauth/request_token response did not return oAuth permission policy"));
        final ced$b d0 = ced.D0;
        final int a = w4j.a;
        return new uwo$a((List)d0);
    }
}
