import java.util.Locale;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public enum pxa implements qxa
{
    public static final enum pxa$a F0;
    public static final enum pxa$b G0;
    public static final enum pxa$c H0;
    public static final enum pxa$d I0;
    public static final enum pxa$e J0;
    public static final enum pxa$f K0;
    public static final enum pxa$g L0;
    public static final pxa[] M0;
    
    static {
        M0 = new pxa[] { F0 = new pxa()
            {
                public final String b(final Field field) {
                    return field.getName();
                }
            }, G0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.f(field.getName());
                }
            }, H0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.f(pxa.e(field.getName(), ' '));
                }
            }, I0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                }
            }, J0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
                }
            }, K0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
                }
            }, L0 = new pxa()
            {
                public final String b(final Field field) {
                    return pxa.e(field.getName(), '.').toLowerCase(Locale.ENGLISH);
                }
            } };
    }
    
    public pxa(final String s, final int n, final pxa$a pxa) {
    }
    
    public static String e(final String s, final char c) {
        final StringBuilder sb = new StringBuilder();
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(char1);
        }
        return sb.toString();
    }
    
    public static String f(final String s) {
        final int length = s.length();
        int i = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            if (Character.isLetter(char1)) {
                if (Character.isUpperCase(char1)) {
                    return s;
                }
                final char upperCase = Character.toUpperCase(char1);
                if (i == 0) {
                    final StringBuilder a = po.A(upperCase);
                    a.append(s.substring(1));
                    return a.toString();
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0, i));
                sb.append(upperCase);
                sb.append(s.substring(i + 1));
                return sb.toString();
            }
            else {
                ++i;
            }
        }
        return s;
    }
}
