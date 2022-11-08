import java.util.List;
import java.util.regex.Pattern;
import java.util.Iterator;
import android.text.SpannableStringBuilder;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i7a
{
    public final boolean a;
    public final cx9 b;
    public final tj3 c;
    public final ovv d;
    public final boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public Boolean m;
    
    public i7a(final jeu jeu, final boolean a, final tj3 c, final ovv d, final boolean e) {
        this.i = true;
        this.j = true;
        this.a = a;
        Objects.requireNonNull(jeu);
        this.b = new cx9(jeu);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static String c(final String s, final w5w w5w, final boolean b) {
        String s2;
        if (b) {
            s2 = w5w.J0;
        }
        else {
            s2 = w5w.H0;
        }
        return s.replaceAll(yqh.k(s2, " | ", s2, "|", s2), "");
    }
    
    public final jeu a() {
        final pug g = this.b.G0.g;
        dtg dtg = wug.e((Iterable)g);
        if (dtg == null || !wug.v(dtg)) {
            dtg = wug.f((Iterable)g);
        }
        final String string = ((CharSequence)this.b.F0).toString();
        boolean b = false;
        Label_0097: {
            Label_0094: {
                if (this.f) {
                    if (dtg == null) {
                        final tj3 c = this.c;
                        if (c == null || (!c.x() && !this.c.r())) {
                            break Label_0094;
                        }
                    }
                    b = true;
                    break Label_0097;
                }
            }
            b = false;
        }
        boolean b2 = false;
        Label_0141: {
            Label_0138: {
                if (!wug.p((Iterable)g)) {
                    final tj3 c2 = this.c;
                    if (c2 == null || !c2.k()) {
                        break Label_0138;
                    }
                }
                if (dta.b().b("strip_amplify_urls_from_tweet_text_enabled", false)) {
                    b2 = true;
                    break Label_0141;
                }
            }
            b2 = false;
        }
        final boolean b3 = (this.j && (b || b2)) || this.k || this.h;
        String c3 = string;
        Label_1075: {
            if (this.b.G0.h()) {
                String s = string;
                Label_0943: {
                    if (b3) {
                        final w5w w5w = (w5w)hr4.y((Iterable)this.b.G0.b());
                        String substring;
                        if (string.endsWith(Character.toString('\u200e'))) {
                            substring = string.substring(0, string.length() - 1);
                        }
                        else {
                            substring = string;
                        }
                        final boolean b4 = w5w.I0.contains("cards.twitter.com/cards/") || this.l;
                        final tj3 c4 = this.c;
                        final ovv d = this.d;
                        boolean b5 = false;
                        Label_0384: {
                            Label_0381: {
                                if (c4 != null) {
                                    if (!w5w.H0.equals(c4.b)) {
                                        if (!w5w.I0.equals(c4.b)) {
                                            break Label_0381;
                                        }
                                    }
                                }
                                else if (d == null || (!w5w.H0.equals(d.b) && !w5w.I0.equals(d.b))) {
                                    break Label_0381;
                                }
                                b5 = true;
                                break Label_0384;
                            }
                            b5 = false;
                        }
                        final boolean b6 = b5 && (!this.e || b4);
                        final boolean b7 = (dtg != null && w5w.H0.equals(dtg.H0)) || b6;
                        String substring2 = string;
                        if (b7) {
                            String s2;
                            if (this.a) {
                                s2 = w5w.J0;
                            }
                            else {
                                s2 = w5w.H0;
                            }
                            substring2 = string;
                            if (substring.endsWith(s2)) {
                                substring2 = substring.substring(0, this.b.l((d7a)w5w));
                            }
                        }
                        final Object o = null;
                        w5w w5w2 = null;
                        Label_0680: {
                            if (b2) {
                                final tj3 c5 = this.c;
                                final p7a<w5w> a = this.b.G0.a;
                                if (c5 != null && (w4j.a((Object)c5.a, (Object)"amplify") || w4j.a((Object)c5.a, (Object)"video"))) {
                                    for (final w5w w5w2 : a) {
                                        if (w5w2.H0.equals(c5.b)) {
                                            break Label_0680;
                                        }
                                    }
                                }
                            }
                            else {
                                for (final w5w w5w2 : this.b.G0.a) {
                                    if (w5w2.J0.contains("cards.twitter.com/cards/")) {
                                        break Label_0680;
                                    }
                                }
                            }
                            w5w2 = null;
                        }
                        s = substring2;
                        if (w5w2 != null) {
                            if (this.c == null) {
                                s = substring2;
                                if (this.d == null) {
                                    break Label_0943;
                                }
                            }
                            final String s3 = s = c(substring2, w5w2, this.a);
                            if (this.i) {
                                String s4;
                                if (this.a) {
                                    s4 = w5w2.J0;
                                }
                                else {
                                    s4 = w5w2.H0;
                                }
                                final cx9 b8 = this.b;
                                b8.m(b8.l((d7a)w5w2), -(s4.length() + 1));
                                final cx9 b9 = this.b;
                                final kju.a a2 = new kju.a(b9.G0);
                                a2.r(w5w2);
                                ((p7a.a<d7a, p7a, p7a.a>)a2.a).r();
                                ((p7a.a<d7a, p7a, p7a.a>)a2.b).r();
                                ((p7a.a<d7a, p7a, p7a.a>)a2.c).r();
                                ((p7a.a<d7a, p7a, p7a.a>)a2.d).r();
                                ((p7a.a<d7a, p7a, p7a.a>)a2.e).r();
                                ((p7a.a<d7a, p7a, p7a.a>)a2.f).r();
                                b9.G0 = (kju)a2.e();
                                final cx9 b10 = this.b;
                                b10.D0.remove(w5w2);
                                final Iterator<Object> iterator3 = ((List<Object>)b10.C0).iterator();
                                Object o2 = o;
                                while (iterator3.hasNext()) {
                                    final fuh fuh = iterator3.next();
                                    if (fuh.D0.equals(w5w2)) {
                                        o2 = fuh;
                                    }
                                }
                                ((List)b10.C0).remove(o2);
                                s = s3;
                            }
                        }
                    }
                }
                String s5 = s;
                if (this.g) {
                    final Iterator iterator4 = ((n5e)this.b.G0.b()).iterator();
                    while (true) {
                        s5 = s;
                        if (!((p5e)iterator4).hasNext()) {
                            break;
                        }
                        s = c(s, (w5w)((bgz)iterator4).next(), this.a);
                    }
                }
                c3 = s5;
                if (this.b()) {
                    final Iterator iterator5 = ((n5e)this.b.G0.b()).iterator();
                    w5w w5w3;
                    do {
                        c3 = s5;
                        if (!((p5e)iterator5).hasNext()) {
                            break Label_1075;
                        }
                        w5w3 = (w5w)((bgz)iterator5).next();
                    } while (!w5w3.I0.contains("twitter.com/i/shopping/drop"));
                    c3 = c(s5, w5w3, this.a);
                }
            }
        }
        final Pattern a3 = pjr.a;
        zzd.f((Object)c3, "str");
        int n = c3.length() - 1;
        CharSequence subSequence = null;
        Label_1148: {
            if (n >= 0) {
                while (true) {
                    final int n2 = n - 1;
                    if (!tdy.t0(c3.charAt(n))) {
                        subSequence = c3.subSequence(0, n + 1);
                        break Label_1148;
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
        this.b.F0 = new SpannableStringBuilder((CharSequence)s7);
        return new jeu(this.b);
    }
    
    public final boolean b() {
        if (this.m == null) {
            this.m = Boolean.FALSE;
            if (!dta.b().b("unified_cards_component_commerce_drop_details_enabled", false)) {
                final Iterator iterator = ((n5e)this.b.G0.b()).iterator();
                while (iterator.hasNext()) {
                    if (((w5w)iterator.next()).I0.contains("twitter.com/i/shopping/drop")) {
                        this.m = Boolean.TRUE;
                        break;
                    }
                }
            }
        }
        return this.m;
    }
}
