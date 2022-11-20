import android.graphics.Paint$Join;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x1b
{
    public static final chw a;
    
    static {
        a = new chw();
    }
    
    public static final Paint$Join a(int n) {
        if (n == 0) {
            throw null;
        }
        if (--n == 0) {
            return Paint$Join.MITER;
        }
        if (n == 1) {
            return Paint$Join.ROUND;
        }
        if (n != 2) {
            return null;
        }
        return Paint$Join.BEVEL;
    }
    
    public static rrg b() {
        Object o;
        if (asa.b().b("android_video_transcode_exoplayer_decoder_selection_enabled", false)) {
            o = new iga();
        }
        else {
            o = new jpb();
        }
        return (rrg)o;
    }
    
    public static a8q c() {
        return x68.h().B0();
    }
    
    public static c6m d(final eve eve, final eve eve2, final boolean b, final int n, final Object o) {
        return eve.w(eve2, true);
    }
    
    public static int e(final y1b y1b, final y1b$a y1b$a, final Boolean b) {
        return b.compareTo(Boolean.valueOf(y1b.g(y1b$a)));
    }
    
    public static String f(final int n) {
        if (n == 1) {
            return "SPOTLIGHT";
        }
        if (n == 2) {
            return "COMING_UP";
        }
        if (n == 3) {
            return "UNKNOWN";
        }
        throw null;
    }
    
    public static void g(final qzc qzc, final String s, final suc suc, final Long n, final int n2, final Object o) {
        qzc.n(s, suc, (Long)null);
    }
    
    public static String h(final int n) {
        if (n == 1) {
            return "INFLEXIBLE";
        }
        if (n == 2) {
            return "FLEXIBLE_UPPER_BOUND";
        }
        if (n == 3) {
            return "FLEXIBLE_LOWER_BOUND";
        }
        return "null";
    }
    
    public static String i(final int n) {
        if (n == 1) {
            return "BEGIN_ARRAY";
        }
        if (n == 2) {
            return "END_ARRAY";
        }
        if (n == 3) {
            return "BEGIN_OBJECT";
        }
        if (n == 4) {
            return "END_OBJECT";
        }
        if (n == 5) {
            return "NAME";
        }
        if (n == 6) {
            return "STRING";
        }
        if (n == 7) {
            return "NUMBER";
        }
        if (n == 8) {
            return "BOOLEAN";
        }
        if (n == 9) {
            return "NULL";
        }
        if (n == 10) {
            return "END_DOCUMENT";
        }
        return "null";
    }
    
    public static String j(final int n) {
        if (n == 1) {
            return "RECORDED";
        }
        if (n == 2) {
            return "PLAYING_RECORDED";
        }
        if (n == 3) {
            return "PAUSED_RECORDED";
        }
        if (n == 4) {
            return "ENDED";
        }
        if (n == 5) {
            return "LIVE";
        }
        return "null";
    }
    
    public static String k(final int n) {
        if (n == 1) {
            return "NOT_INTERESTED";
        }
        if (n == 2) {
            return "FOLLOWING";
        }
        if (n == 3) {
            return "NOT_FOLLOWING";
        }
        return "null";
    }
    
    public static String l(final int n) {
        if (n == 1) {
            return "PinToggle";
        }
        if (n == 2) {
            return "DragHandle";
        }
        if (n == 3) {
            return "None";
        }
        return "null";
    }
}
