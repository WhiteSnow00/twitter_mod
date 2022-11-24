import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afv
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    
    static {
        final Pattern pattern = a = Pattern.compile("\\w{1,15}");
        final StringBuilder sb = new StringBuilder();
        sb.append("@?");
        sb.append(pattern);
        b = Pattern.compile(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("@");
        sb2.append(pattern);
        Pattern.compile(sb2.toString());
        c = Pattern.compile("^\\d{7,}$");
        d = Pattern.compile("^https?://(?:mobile\\.)?twitter\\.com(/#!)?/(?:\\w+/status(?:es)?|statuses)/\\d+$");
    }
}
