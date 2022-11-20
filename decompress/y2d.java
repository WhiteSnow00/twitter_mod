import java.util.Calendar;
import java.io.Serializable;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.ParsePosition;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y2d
{
    public static final TimeZone a;
    
    static {
        a = DesugarTimeZone.getTimeZone("UTC");
    }
    
    public static boolean a(final String s, final int n, final char c) {
        return n < s.length() && s.charAt(n) == c;
    }
    
    public static Date b(String string, final ParsePosition parsePosition) throws ParseException {
        Serializable s = null;
        try {
            final int index = parsePosition.getIndex();
            final int n = index + 4;
            final int c = c(string, index, n);
            int n2 = n;
            if (a(string, n, '-')) {
                n2 = n + 1;
            }
            final int n3 = n2 + 2;
            final int c2 = c(string, n2, n3);
            int n4 = n3;
            if (a(string, n3, '-')) {
                n4 = n3 + 1;
            }
            final int index2 = n4 + 2;
            final int c3 = c(string, n4, index2);
            final boolean a = a(string, index2, 'T');
            if (!a && string.length() <= index2) {
                s = new GregorianCalendar(c, c2 - 1, c3);
                parsePosition.setIndex(index2);
                return ((Calendar)s).getTime();
            }
            int c4 = 0;
            int length = 0;
            int c7 = 0;
            int n13 = 0;
            int n14 = 0;
            Label_0485: {
                int n9;
                int n15;
                int n16;
                if (a) {
                    final int n5 = index2 + 1;
                    final int n6 = n5 + 2;
                    c4 = c(string, n5, n6);
                    int n7 = n6;
                    if (a(string, n6, ':')) {
                        n7 = n6 + 1;
                    }
                    final int n8 = n7 + 2;
                    final int c5 = c(string, n7, n8);
                    n9 = n8;
                    if (a(string, n8, ':')) {
                        n9 = n8 + 1;
                    }
                    if (string.length() > n9) {
                        final char char1 = string.charAt(n9);
                        if (char1 != 'Z' && char1 != '+' && char1 != '-') {
                            length = n9 + 2;
                            int c6;
                            final int n10 = c6 = c(string, n9, length);
                            if (n10 > 59 && (c6 = n10) < 63) {
                                c6 = 59;
                            }
                            if (a(string, length, '.')) {
                                final int n11 = length + 1;
                                int i = n11 + 1;
                                while (true) {
                                    while (i < string.length()) {
                                        final char char2 = string.charAt(i);
                                        length = i;
                                        if (char2 >= '0') {
                                            if (char2 <= '9') {
                                                ++i;
                                                continue;
                                            }
                                            length = i;
                                        }
                                        final int min = Math.min(length, n11 + 3);
                                        c7 = c(string, n11, min);
                                        final int n12 = min - n11;
                                        if (n12 != 1) {
                                            if (n12 == 2) {
                                                c7 *= 10;
                                            }
                                        }
                                        else {
                                            c7 *= 100;
                                        }
                                        n13 = c5;
                                        n14 = c6;
                                        break Label_0485;
                                    }
                                    length = string.length();
                                    continue;
                                }
                            }
                            c7 = 0;
                            n13 = c5;
                            n14 = c6;
                            break Label_0485;
                        }
                    }
                    n15 = c4;
                    n16 = c5;
                }
                else {
                    final int n17 = 0;
                    n16 = 0;
                    n9 = index2;
                    n15 = n17;
                }
                final int n18 = 0;
                n14 = 0;
                final int n19 = n9;
                c7 = n18;
                n13 = n16;
                c4 = n15;
                length = n19;
            }
            if (string.length() > length) {
                final char char3 = string.charAt(length);
                int index3;
                if (char3 == 'Z') {
                    s = y2d.a;
                    index3 = length + 1;
                }
                else {
                    if (char3 != '+' && char3 != '-') {
                        s = new StringBuilder();
                        ((StringBuilder)s).append("Invalid time zone indicator '");
                        ((StringBuilder)s).append(char3);
                        ((StringBuilder)s).append("'");
                        throw new IndexOutOfBoundsException(((StringBuilder)s).toString());
                    }
                    s = string.substring(length);
                    if (((String)s).length() < 5) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append((String)s);
                        sb.append("00");
                        s = sb.toString();
                    }
                    index3 = length + ((String)s).length();
                    if (!"+0000".equals(s) && !"+00:00".equals(s)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("GMT");
                        sb2.append((String)s);
                        final String string2 = sb2.toString();
                        s = DesugarTimeZone.getTimeZone(string2);
                        final String id = ((TimeZone)s).getID();
                        if (!id.equals(string2) && !id.replace(":", "").equals(string2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Mismatching time zone indicator: ");
                            sb3.append(string2);
                            sb3.append(" given, resolves to ");
                            sb3.append(((TimeZone)s).getID());
                            throw new IndexOutOfBoundsException(sb3.toString());
                        }
                    }
                    else {
                        s = y2d.a;
                    }
                }
                final GregorianCalendar gregorianCalendar = new GregorianCalendar((TimeZone)s);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, c);
                gregorianCalendar.set(2, c2 - 1);
                gregorianCalendar.set(5, c3);
                gregorianCalendar.set(11, c4);
                gregorianCalendar.set(12, n13);
                gregorianCalendar.set(13, n14);
                gregorianCalendar.set(14, c7);
                parsePosition.setIndex(index3);
                return gregorianCalendar.getTime();
            }
            s = new IllegalArgumentException("No time zone indicator");
            throw s;
        }
        catch (final IllegalArgumentException s) {}
        catch (final NumberFormatException s) {}
        catch (final IndexOutOfBoundsException ex) {}
        if (string == null) {
            string = null;
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append('\"');
            sb4.append(string);
            sb4.append('\"');
            string = sb4.toString();
        }
        final String message = ((Throwable)s).getMessage();
        String string3 = null;
        Label_1046: {
            if (message != null) {
                string3 = message;
                if (!message.isEmpty()) {
                    break Label_1046;
                }
            }
            final StringBuilder j = fu8.j("(");
            j.append(((IllegalArgumentException)s).getClass().getName());
            j.append(")");
            string3 = j.toString();
        }
        final ParseException ex2 = new ParseException(mw.y("Failed to parse date [", string, "]: ", string3), parsePosition.getIndex());
        ex2.initCause((Throwable)s);
        throw ex2;
    }
    
    public static int c(final String s, final int n, final int n2) throws NumberFormatException {
        if (n >= 0 && n2 <= s.length() && n <= n2) {
            int i;
            int n3;
            if (n < n2) {
                i = n + 1;
                final int digit = Character.digit(s.charAt(n), 10);
                if (digit < 0) {
                    final StringBuilder j = fu8.j("Invalid number: ");
                    j.append(s.substring(n, n2));
                    throw new NumberFormatException(j.toString());
                }
                n3 = -digit;
            }
            else {
                n3 = 0;
                i = n;
            }
            while (i < n2) {
                final int digit2 = Character.digit(s.charAt(i), 10);
                if (digit2 < 0) {
                    final StringBuilder k = fu8.j("Invalid number: ");
                    k.append(s.substring(n, n2));
                    throw new NumberFormatException(k.toString());
                }
                n3 = n3 * 10 - digit2;
                ++i;
            }
            return -n3;
        }
        throw new NumberFormatException(s);
    }
}
