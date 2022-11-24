import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p18
{
    public static final p18 a;
    public static final kba b;
    public static final jca c;
    public static final dda d;
    public static final dda e;
    public static final dda f;
    public static final dda g;
    public static final jca h;
    public static final dda i;
    public static final dda j;
    public static final dda k;
    public static final dda l;
    public static final dda m;
    public static final dda n;
    public static final dda o;
    public static final dda p;
    public static final dda q;
    
    static {
        a = new p18();
        final iba b2 = iba.Companion.b("messages", "inbox", "search");
        b = (kba)b2;
        final ica.ica$a companion = ica.Companion;
        final ica b3 = companion.b("messages", "inbox", "recent_search", "");
        c = (jca)b3;
        final dda.a companion2 = dda.Companion;
        d = companion2.b(b2, "results", "empty");
        e = companion2.b(b2, "results", "offline_retry");
        f = companion2.b(b2, "results", "load_more");
        g = new dda("messages", "inbox", "recent_search", "", "add");
        h = (jca)companion.a(b2, "");
        i = companion2.b(b2, "", "began_typing");
        j = companion2.b(b2, "results", "compose");
        k = companion2.b(b2, "conversation", "click");
        l = companion2.b(b2, "message", "click");
        m = companion2.c(b3, "clear");
        n = companion2.c(b3, "use_recent_search");
        o = companion2.c(b3, "impression");
        p = companion2.b(b2, "more", "click");
        q = companion2.b(b2, "tab", "click");
    }
    
    public final String a(final u28 u28) {
        e0e.f((Object)u28, "<this>");
        final int ordinal = ((Enum)u28).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s = "messages";
                }
                else {
                    s = "groups";
                }
            }
            else {
                s = "people";
            }
        }
        else {
            s = "all";
        }
        return s;
    }
}
