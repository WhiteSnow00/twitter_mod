import java.util.Iterator;
import okhttp3.HttpUrl$Builder;
import java.util.Map;
import okhttp3.HttpUrl;
import java.util.Objects;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zc4
{
    public static final a Companion;
    public HashMap<uil, yc4> a;
    
    static {
        Companion = new a();
    }
    
    public zc4() {
        this.a = new HashMap<uil, yc4>();
    }
    
    public static final zc4 a() {
        Objects.requireNonNull(zc4.Companion);
        return fdi.Companion.a().Q7();
    }
    
    public final yc4 b(final uil uil) {
        yc4 yc4;
        if (uil != null && uil.l != null) {
            yc4 = this.a.get(uil);
        }
        else {
            yc4 = null;
        }
        return yc4;
    }
    
    public final String c(String string, final hp2 hp2) {
        final String a = string;
        czd.f((Object)a, "url");
        string = a;
        if (hp2 != null) {
            final uil e = hp2.e();
            string = a;
            if (e != null) {
                string = a;
                if (e.l != null) {
                    final uil e2 = hp2.e();
                    czd.c((Object)e2);
                    Objects.requireNonNull(zc4.Companion);
                    Label_0273: {
                        if (asa.b().b("ad_formats_click_id_enabled", false)) {
                            final ad4 l = e2.l;
                            czd.c((Object)l);
                            if (!l.a.isEmpty()) {
                                final HttpUrl parse = HttpUrl.Companion.parse(a);
                                String d;
                                if (parse != null) {
                                    final HttpUrl$Builder builder = parse.newBuilder();
                                    for (final Map.Entry<String, V> entry : l.a.entrySet()) {
                                        builder.setQueryParameter((String)entry.getKey(), (String)entry.getValue());
                                    }
                                    string = builder.build().toString();
                                    d = "success";
                                }
                                else {
                                    string = a;
                                    d = "failure";
                                }
                                final HashMap<uil, yc4> a2 = this.a;
                                final yc4$a yc4$a = new yc4$a((String)null, (String)null, (ad4)null, (String)null, 15, (rf8)null);
                                yc4$a.a = a;
                                yc4$a.b = string;
                                yc4$a.c = l;
                                yc4$a.d = d;
                                a2.put(e2, (yc4)((n4j)yc4$a).e());
                                break Label_0273;
                            }
                        }
                        string = a;
                    }
                    Objects.requireNonNull(zc4.Companion);
                    String j = string;
                    if (asa.b().b("ad_formats_dcm_enabled", false)) {
                        final HttpUrl parse2 = HttpUrl.Companion.parse(string);
                        final ad4 i = e2.l;
                        czd.c((Object)i);
                        final yc4 b = this.b(e2);
                        String d2 = null;
                        Label_0405: {
                            if (parse2 != null) {
                                final String b2 = i.b;
                                if (b2 != null && b2.length() != 0 && czd.a((Object)i.c, (Object)"DCM")) {
                                    d2 = g97.g(b, "success");
                                    j = da8.j(i.b, "?", string);
                                    break Label_0405;
                                }
                            }
                            d2 = g97.g(b, "failure");
                            j = string;
                        }
                        final HashMap<uil, yc4> a3 = this.a;
                        final yc4$a yc4$a2 = new yc4$a((String)null, (String)null, (ad4)null, (String)null, 15, (rf8)null);
                        String a4 = string;
                        if (b != null) {
                            a4 = b.a;
                            if (a4 == null) {
                                a4 = string;
                            }
                        }
                        yc4$a2.o(a4);
                        yc4$a2.b = j;
                        yc4$a2.c = i;
                        yc4$a2.d = d2;
                        a3.put(e2, (yc4)((n4j)yc4$a2).e());
                    }
                    if (j == null) {
                        string = a;
                    }
                    else {
                        string = j;
                    }
                }
            }
        }
        return string;
    }
    
    public static final class a
    {
    }
}
