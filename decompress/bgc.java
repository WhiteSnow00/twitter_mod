// 
// Decompiled by Procyon v0.6.0
// 

public final class bgc implements ypa<String, String>
{
    public static final bgc a;
    
    static {
        a = new bgc();
    }
    
    public final Object a(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "arg");
        return this.f(s);
    }
    
    public final String f(String s) {
        czd.f((Object)s, "hashtagText");
        final boolean b = yvl.B();
        final boolean a = yvl.A();
        if (b && a) {
            if (s.length() > 23) {
                final String substring = s.substring(0, 21);
                czd.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                final StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(substring);
                sb.append("\u2026");
                s = sb.toString();
            }
            else {
                s = hmg.h("#", s);
            }
        }
        else if (b && !a) {
            if (s.length() > 26) {
                final String substring2 = s.substring(0, 24);
                czd.e((Object)substring2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("#");
                sb2.append(substring2);
                sb2.append("\u2026");
                s = sb2.toString();
            }
            else {
                s = hmg.h("#", s);
            }
        }
        else if (!b && a) {
            if (s.length() > 19) {
                s = s.substring(0, 17);
                czd.e((Object)s, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("#");
                sb3.append(s);
                sb3.append("\u2026");
                s = sb3.toString();
            }
            else {
                s = hmg.h("#", s);
            }
        }
        else if (s.length() > 22) {
            final String substring3 = s.substring(0, 20);
            czd.e((Object)substring3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("#");
            sb4.append(substring3);
            sb4.append("\u2026");
            s = sb4.toString();
        }
        else {
            s = hmg.h("#", s);
        }
        return s;
    }
}
