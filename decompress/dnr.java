import java.util.Arrays;
import android.graphics.Bitmap;
import android.text.Layout$Alignment;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnr extends paq
{
    public static final Pattern o;
    public static final Pattern p;
    public final StringBuilder m;
    public final ArrayList<String> n;
    
    static {
        o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
        p = Pattern.compile("\\{\\\\.*?\\}");
    }
    
    public dnr() {
        this.m = new StringBuilder();
        this.n = new ArrayList<String>();
    }
    
    public static float k(final int n) {
        if (n == 0) {
            return 0.08f;
        }
        if (n == 1) {
            return 0.5f;
        }
        if (n == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
    
    public static long l(final Matcher matcher, final int n) {
        final String group = matcher.group(n + 1);
        long n2;
        if (group != null) {
            n2 = Long.parseLong(group) * 60L * 60L * 1000L;
        }
        else {
            n2 = 0L;
        }
        final String group2 = matcher.group(n + 2);
        Objects.requireNonNull(group2);
        final long long1 = Long.parseLong(group2);
        final String group3 = matcher.group(n + 3);
        Objects.requireNonNull(group3);
        final long n3 = Long.parseLong(group3) * 1000L + (long1 * 60L * 1000L + n2);
        final String group4 = matcher.group(n + 4);
        long n4 = n3;
        if (group4 != null) {
            n4 = n3 + Long.parseLong(group4);
        }
        return n4 * 1000L;
    }
    
    @Override
    public final fur j(byte[] array, int i, final boolean b) {
        final ArrayList list = new ArrayList();
        final byte[] array2 = (Object)new fcg(0, (j98)null);
        final gxj gxj = new gxj(array, i);
        array = array2;
        while (true) {
            Object o = gxj.f();
            if (o == null) {
                break;
            }
            if (((String)o).length() == 0) {
                continue;
            }
            try {
                Integer.parseInt((String)o);
                o = gxj.f();
                if (o == null) {
                    Log.w("SubripDecoder", "Unexpected end");
                    break;
                }
                final Matcher matcher = dnr.o.matcher((CharSequence)o);
                if (matcher.matches()) {
                    ((fcg)(Object)array).a(l(matcher, 1));
                    ((fcg)(Object)array).a(l(matcher, 6));
                    this.m.setLength(0);
                    this.n.clear();
                    for (String s = gxj.f(); !TextUtils.isEmpty((CharSequence)s); s = gxj.f()) {
                        if (this.m.length() > 0) {
                            this.m.append("<br>");
                        }
                        final StringBuilder m = this.m;
                        o = this.n;
                        final String trim = s.trim();
                        final StringBuilder sb = new StringBuilder(trim);
                        final Matcher matcher2 = dnr.p.matcher(trim);
                        i = 0;
                        while (matcher2.find()) {
                            final String group = matcher2.group();
                            ((ArrayList<String>)o).add(group);
                            final int n = matcher2.start() - i;
                            final int length = group.length();
                            sb.replace(n, n + length, "");
                            i += length;
                        }
                        m.append(sb.toString());
                    }
                    o = Html.fromHtml(this.m.toString());
                    while (true) {
                        String s2;
                        v87 v87;
                        int n2;
                        for (i = 0; i < this.n.size(); ++i) {
                            s2 = this.n.get(i);
                            if (s2.matches("\\{\\\\an[1-9]\\}")) {
                                if (s2 == null) {
                                    v87 = new v87((CharSequence)o, (Layout$Alignment)null, (Layout$Alignment)null, (Bitmap)null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                else {
                                    Label_0635: {
                                        switch (s2.hashCode()) {
                                            case -685620462: {
                                                if (s2.equals("{\\an9}")) {
                                                    i = 5;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620493: {
                                                if (s2.equals("{\\an8}")) {
                                                    i = 8;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620524: {
                                                if (s2.equals("{\\an7}")) {
                                                    i = 2;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620555: {
                                                if (s2.equals("{\\an6}")) {
                                                    i = 4;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620586: {
                                                if (s2.equals("{\\an5}")) {
                                                    i = 7;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620617: {
                                                if (s2.equals("{\\an4}")) {
                                                    i = 1;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620648: {
                                                if (s2.equals("{\\an3}")) {
                                                    i = 3;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620679: {
                                                if (s2.equals("{\\an2}")) {
                                                    i = 6;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                            case -685620710: {
                                                if (s2.equals("{\\an1}")) {
                                                    i = 0;
                                                    break Label_0635;
                                                }
                                                break;
                                            }
                                        }
                                        i = -1;
                                    }
                                    if (i != 0 && i != 1 && i != 2) {
                                        if (i != 3 && i != 4 && i != 5) {
                                            n2 = 1;
                                        }
                                        else {
                                            n2 = 2;
                                        }
                                    }
                                    else {
                                        n2 = 0;
                                    }
                                    Label_0911: {
                                        switch (s2.hashCode()) {
                                            case -685620462: {
                                                if (s2.equals("{\\an9}")) {
                                                    i = 5;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620493: {
                                                if (s2.equals("{\\an8}")) {
                                                    i = 4;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620524: {
                                                if (s2.equals("{\\an7}")) {
                                                    i = 3;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620555: {
                                                if (s2.equals("{\\an6}")) {
                                                    i = 8;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620586: {
                                                if (s2.equals("{\\an5}")) {
                                                    i = 7;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620617: {
                                                if (s2.equals("{\\an4}")) {
                                                    i = 6;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620648: {
                                                if (s2.equals("{\\an3}")) {
                                                    i = 2;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620679: {
                                                if (s2.equals("{\\an2}")) {
                                                    i = 1;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                            case -685620710: {
                                                if (s2.equals("{\\an1}")) {
                                                    i = 0;
                                                    break Label_0911;
                                                }
                                                break;
                                            }
                                        }
                                        i = -1;
                                    }
                                    if (i != 0 && i != 1 && i != 2) {
                                        if (i != 3 && i != 4 && i != 5) {
                                            i = 1;
                                        }
                                        else {
                                            i = 0;
                                        }
                                    }
                                    else {
                                        i = 2;
                                    }
                                    v87 = new v87((CharSequence)o, (Layout$Alignment)null, (Layout$Alignment)null, (Bitmap)null, k(i), 0, i, k(n2), n2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                list.add(v87);
                                list.add(v87.W0);
                                continue Label_1100;
                            }
                        }
                        s2 = null;
                        continue;
                    }
                }
                String concat;
                if (((String)o).length() != 0) {
                    concat = "Skipping invalid timing: ".concat((String)o);
                }
                else {
                    concat = new String("Skipping invalid timing: ");
                }
                Log.w("SubripDecoder", concat);
            }
            catch (final NumberFormatException ex) {
                String concat2;
                if (((String)o).length() != 0) {
                    concat2 = "Skipping invalid index: ".concat((String)o);
                }
                else {
                    concat2 = new String("Skipping invalid index: ");
                }
                Log.w("SubripDecoder", concat2);
            }
            Label_1100:;
        }
        return (fur)new enr(list.toArray(new v87[0]), Arrays.copyOf((long[])((fcg)(Object)array).b, ((fcg)(Object)array).a));
    }
}
