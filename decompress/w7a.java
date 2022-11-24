import java.util.List;
import java.util.regex.Pattern;
import java.util.Iterator;
import android.text.SpannableStringBuilder;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7a
{
    public final boolean a;
    public final px9 b;
    public final ck3 c;
    public final uwv d;
    public final boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public Boolean m;
    
    public w7a(final rfu rfu, final boolean a, final ck3 c, final uwv d, final boolean e) {
        this.i = true;
        this.j = true;
        this.a = a;
        Objects.requireNonNull(rfu);
        this.b = new px9(rfu);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static String c(final String s, final w6w w6w, final boolean b) {
        String s2;
        if (b) {
            s2 = w6w.M0;
        }
        else {
            s2 = w6w.K0;
        }
        return s.replaceAll(dvc.d(s2, " | ", s2, "|", s2), "");
    }
    
    public final rfu a() {
        final jvg g = this.b.J0.g;
        wtg wtg = qvg.e(g);
        if (wtg == null || !qvg.v(wtg)) {
            wtg = qvg.f(g);
        }
        final String string = ((CharSequence)this.b.I0).toString();
        boolean b = false;
        Label_0104: {
            Label_0102: {
                if (this.f) {
                    if (wtg == null) {
                        final ck3 c = this.c;
                        if (c == null || (!c.x() && !this.c.r())) {
                            break Label_0102;
                        }
                    }
                    b = true;
                    break Label_0104;
                }
            }
            b = false;
        }
        boolean b2 = false;
        Label_0150: {
            Label_0148: {
                if (!qvg.p(g)) {
                    final ck3 c2 = this.c;
                    if (c2 == null || !c2.k()) {
                        break Label_0148;
                    }
                }
                if (ita.b().b("strip_amplify_urls_from_tweet_text_enabled", false)) {
                    b2 = true;
                    break Label_0150;
                }
            }
            b2 = false;
        }
        final boolean b3 = (this.j && (b || b2)) || this.k || this.h;
        String c3 = string;
        Label_1142: {
            if (this.b.J0.h()) {
                String s = string;
                Label_0989: {
                    if (b3) {
                        final w6w w6w = (w6w)kr4.y(this.b.J0.b());
                        String substring;
                        if (string.endsWith(Character.toString('\u200e'))) {
                            substring = string.substring(0, string.length() - 1);
                        }
                        else {
                            substring = string;
                        }
                        final boolean b4 = w6w.L0.contains("cards.twitter.com/cards/") || this.l;
                        final ck3 c4 = this.c;
                        final uwv d = this.d;
                        boolean b5 = false;
                        Label_0394: {
                            Label_0392: {
                                if (c4 != null) {
                                    if (!w6w.K0.equals(c4.b)) {
                                        if (!w6w.L0.equals(c4.b)) {
                                            break Label_0392;
                                        }
                                    }
                                }
                                else if (d == null || (!w6w.K0.equals(d.b) && !w6w.L0.equals(d.b))) {
                                    break Label_0392;
                                }
                                b5 = true;
                                break Label_0394;
                            }
                            b5 = false;
                        }
                        final boolean b6 = b5 && (!this.e || b4);
                        final boolean b7 = (wtg != null && w6w.K0.equals(((w6w)wtg).K0)) || b6;
                        String substring2 = string;
                        if (b7) {
                            String s2;
                            if (this.a) {
                                s2 = w6w.M0;
                            }
                            else {
                                s2 = w6w.K0;
                            }
                            substring2 = string;
                            if (substring.endsWith(s2)) {
                                substring2 = substring.substring(0, this.b.k((kgs)w6w));
                            }
                        }
                        final Object o = null;
                        Object o2 = null;
                        Label_0699: {
                            if (b2) {
                                final ck3 c5 = this.c;
                                final d8a a = this.b.J0.a;
                                if (c5 != null && (o5j.a((Object)c5.a, (Object)"amplify") || o5j.a((Object)c5.a, (Object)"video"))) {
                                    for (final Object o2 : a) {
                                        if (((w6w)o2).K0.equals(c5.b)) {
                                            break Label_0699;
                                        }
                                    }
                                }
                            }
                            else {
                                for (final Object o2 : this.b.J0.a) {
                                    if (((w6w)o2).M0.contains("cards.twitter.com/cards/")) {
                                        break Label_0699;
                                    }
                                }
                            }
                            o2 = null;
                        }
                        s = substring2;
                        if (o2 != null) {
                            if (this.c == null) {
                                s = substring2;
                                if (this.d == null) {
                                    break Label_0989;
                                }
                            }
                            final String s3 = s = c(substring2, (w6w)o2, this.a);
                            if (this.i) {
                                String s4;
                                if (this.a) {
                                    s4 = ((w6w)o2).M0;
                                }
                                else {
                                    s4 = ((w6w)o2).K0;
                                }
                                final px9 b8 = this.b;
                                b8.m(b8.k((kgs)o2), -(s4.length() + 1));
                                final px9 b9 = this.b;
                                final qku$a qku$a = new qku$a(b9.J0);
                                qku$a.r((w6w)o2);
                                ((d8a.a<r7a, d8a, d8a.a>)qku$a.a).r();
                                qku$a.b.r();
                                ((d8a.a<r7a, d8a, d8a.a>)qku$a.c).r();
                                ((d8a.a<r7a, d8a, d8a.a>)qku$a.d).r();
                                ((d8a.a<r7a, d8a, d8a.a>)qku$a.e).r();
                                ((d8a.a<r7a, d8a, d8a.a>)qku$a.f).r();
                                b9.J0 = (qku)((z4j)qku$a).e();
                                final px9 b10 = this.b;
                                b10.G0.remove(o2);
                                final Iterator<Object> iterator3 = ((List<Object>)b10.F0).iterator();
                                Object o3 = o;
                                while (iterator3.hasNext()) {
                                    final zuh zuh = iterator3.next();
                                    if (zuh.G0.equals(o2)) {
                                        o3 = zuh;
                                    }
                                }
                                ((List)b10.F0).remove(o3);
                                s = s3;
                            }
                        }
                    }
                }
                String s5 = s;
                if (this.g) {
                    final Iterator iterator4 = ((v5e)this.b.J0.b()).iterator();
                    while (true) {
                        s5 = s;
                        if (!((x5e)iterator4).hasNext()) {
                            break;
                        }
                        s = c(s, (w6w)((ohz)iterator4).next(), this.a);
                    }
                }
                c3 = s5;
                if (this.b()) {
                    final Iterator iterator5 = ((v5e)this.b.J0.b()).iterator();
                    w6w w6w2;
                    do {
                        c3 = s5;
                        if (!((x5e)iterator5).hasNext()) {
                            break Label_1142;
                        }
                        w6w2 = (w6w)((ohz)iterator5).next();
                    } while (!w6w2.L0.contains("twitter.com/i/shopping/drop"));
                    c3 = c(s5, w6w2, this.a);
                }
            }
        }
        final Pattern a2 = flr.a;
        e0e.f((Object)c3, "str");
        int n = c3.length() - 1;
        CharSequence subSequence = null;
        Label_1213: {
            if (n >= 0) {
                while (true) {
                    final int n2 = n - 1;
                    if (!bs4.U(c3.charAt(n))) {
                        subSequence = c3.subSequence(0, n + 1);
                        break Label_1213;
                    }
                    if (n2 < 0) {
                        break;
                    }
                    n = n2;
                }
            }
            subSequence = "";
        }
        String s7;
        final String s6 = s7 = subSequence.toString();
        if (this.g) {
            s7 = s6;
            if (s6.endsWith(":")) {
                s7 = s6.substring(0, s6.length() - 1);
            }
        }
        this.b.I0 = new SpannableStringBuilder((CharSequence)s7);
        return new rfu(this.b);
    }
    
    public final boolean b() {
        if (this.m == null) {
            this.m = Boolean.FALSE;
            if (!ita.b().b("unified_cards_component_commerce_drop_details_enabled", false)) {
                final Iterator iterator = ((v5e)this.b.J0.b()).iterator();
                while (iterator.hasNext()) {
                    if (((w6w)iterator.next()).L0.contains("twitter.com/i/shopping/drop")) {
                        this.m = Boolean.TRUE;
                        break;
                    }
                }
            }
        }
        return this.m;
    }
}
